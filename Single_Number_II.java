// Single Number II

// Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

// You must implement a solution with a linear runtime complexity and use only constant extra space.
  
class SingleNumber {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int one = 0;
        int two = 0;
        for(int i=0; i<n;i++){
            one = (nums[i]^one) & (~two);
            two = (nums[i]^two) & (~one);
        }
        return one;
    }
}
