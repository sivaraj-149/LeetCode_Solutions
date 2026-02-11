// Single Number III
// Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

// You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

class SingleNumber {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor ^= nums[i];
        }
        int rightMost = (xor ^ (xor-1)) & xor;
        int b1 =0;
        int b2 =0;
        for(int i=0; i<nums.length; i++){
            if((nums[i] & rightMost) != 0){
                b1 ^= nums[i];
            }
            else{
                b2 ^=nums[i];
            }
        }
        return new int[] {b1,b2};
    }
}
