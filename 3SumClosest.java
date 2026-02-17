// 3Sum Closest

// Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

class ThreeSumClosest{
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int closeSum = nums[0] + nums[1] + nums[2];
        for(int i=0; i<n-1; i++){
            int j = i+1;
            int k = n;
            while(j<k){
                int currentSum = nums[i] + nums[j] + nums[k];
                if(Math.abs(currentSum - target) < Math.abs(closeSum - target)){
                    closeSum = currentSum;
                }
                if(currentSum < target){
                    j++;
                }
                else if(currentSum > target){
                    k--;
                }
                else{
                    return currentSum;
                }
            }
        }
        return closeSum;
    }
}
