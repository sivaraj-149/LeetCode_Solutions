// Trapping Rain Water
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

class Trap {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length -1;
        int leftmax = 0;
        int rightmax = 0;

        int totalWater = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftmax){
                    leftmax = height[left];
                }
                else{
                    totalWater += leftmax-height[left];
                }
                left++;
            }
            else{
                if(height[right] >= rightmax){
                    rightmax = height[right];
                }
                else{
                    totalWater += rightmax-height[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}
