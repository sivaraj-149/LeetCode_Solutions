// Substrings of Size Three with Distinct Characters

// A string is good if there are no repeated characters.

// Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

// Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

// A substring is a contiguous sequence of characters in a string.


class CountGoodSubstrings{
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i=0; i<=s.length()-3;i++){
            if(s.charAt(i) != s.charAt(i+1) &&
               s.charAt(i) != s.charAt(i+2) &&
               s.charAt(i+1) != s.charAt(i+2)){
                count++;
               }
        }
        return count;
    }
}
