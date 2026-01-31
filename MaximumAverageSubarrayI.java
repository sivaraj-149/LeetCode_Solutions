// Maximum Average Subarray I
// You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

class FindMaxAverage{
    public double findMaxAverage(int[] nums, int k) {

        double maxAvg = Double.NEGATIVE_INFINITY;
        double windowAvg = 0;
        int wStart = 0;
        for(int wEnd=0; wEnd<nums.length; wEnd++){
            windowAvg +=  nums[wEnd];
            if(wEnd - wStart + 1 == k){
                //windowAvg /= k;
                maxAvg = Math.max(maxAvg, windowAvg/k);
                windowAvg -= nums[wStart];
                wStart++;
            }
        }
        return maxAvg;
    }
}
