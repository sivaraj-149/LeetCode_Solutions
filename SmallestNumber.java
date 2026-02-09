// Smallest Number With All Set Bits
// You are given a positive number n.

// Return the smallest number x greater than or equal to n, such that the binary representation of x contains only set bits

 

class SmallestNumber {
    public int smallestNumber(int n) {
        int temp = n;
        int bits = 0;
        while(temp>0){
            bits++;
            temp >>=1;
        }
        return (1<<bits)-1;
    }
}
