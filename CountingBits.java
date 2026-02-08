// Counting Bits

// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

class CountingBits{
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i=1; i<=n; i++){
            arr[i] = countSets(i);
        }
        return arr;
    }
    static int countSets(int n){
        int count = 0;
        while(n>0){
            count += n&1;
            n = n>>1;
        }
        return count;
    }
}
