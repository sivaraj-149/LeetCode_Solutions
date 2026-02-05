// GCD of Odd and Even Sums

// You are given an integer n. Your task is to compute the GCD (greatest common divisor) of two values:

// sumOdd: the sum of the smallest n positive odd numbers.

// sumEven: the sum of the smallest n positive even numbers.

// Return the GCD of sumOdd and sumEven.

class GcdOfOddEvenSums {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        for(int i=1; i<= n*2; i++){
            if(i%2 == 0)    sumEven += i;
            else sumOdd += i;
        }
        return Gcd(sumOdd, );
    }
    
    static int Gcd(int a, int b){
        if(b == 0) return a;
        return Gcd(b, a%b);
    }

    }
}
