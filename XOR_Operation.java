// XOR Operation in an Array

// You are given an integer n and an integer start.

// Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

// Return the bitwise XOR of all elements of nums.


class XorOperation{
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int ans = 0;
        for(int i=0; i<n; i++){
            arr[i] = start+2*i;
            ans ^=arr[i];
        }
        return ans;
    }
}
