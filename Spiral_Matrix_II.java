// Spiral Matrix II
// Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

class GenerateMatrix{
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int num = 1;
        int left =0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;

        while(left <= right && top <= bottom){

            for(int  i=left; i<=right; i++){
                arr[top][i] = num++;
            }
            top++;

            for(int i=top; i<=bottom; i++){
                arr[i][right] = num++;
            }
            right--;

            for(int i=right; i>=left; i--){
                arr[bottom][i] = num++;
            }
            bottom--;
            
            for(int i=bottom; i>=top; i--){
                arr[left][i] = num++;
            }
            left++;
        }
        return arr;
    }

}
