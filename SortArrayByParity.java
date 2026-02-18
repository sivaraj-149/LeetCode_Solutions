// Sort Array By Parity
// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

// Return any array that satisfies this condition.

class SortArrayByParity{
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length -1;
        while(i<j){
            while ((i < j) && (nums[i]&1) == 0)
                i++;

            while ((i < j) && (nums[j]&1 )> 0)
                j--;

            if (i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums; 
    }
}
