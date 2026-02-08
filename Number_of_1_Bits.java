//  Number of 1 Bits

// Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

class HammingWeight{
    public int hammingWeight(int n) {
        int count = 0;
        while(n>0){
            count += n&1;
            n = n>>1;
        }
        return count;
    }
}
