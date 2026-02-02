// Spiral Matrix
// Given an m x n matrix, return all elements of the matrix in spiral order.

class SpriralOrder{
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix.length == 0)  return list;

        int top = 0, bottom = matrix.length -1;
        int left = 0, right = matrix[0].length-1;

        while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int j=top; j<=bottom; j++){
                list.add(matrix[j][right]);
            }
            right--;

            if(top <= bottom){
                for(int k=right; k>=left; k--){
                    list.add(matrix[bottom][k]);
                }
            bottom--;
            }
            if(left <= right){
                for(int l=bottom; l>=top; l--){
                    list.add(matrix[l][left]);
                }
                left++;
            }
        }
        return list;
    }
}
