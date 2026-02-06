Subset Using Bit Manipulation

import java.util.*;
class SubsetUsingBitManipulation {
    public static void main(String[] args) {
        List<List<Integer>> outer = new ArrayList<>();
        int[] arr = {1,2,3};
        int subset = 1<<arr.length;
        
        for(int i = 0; i < subset; i++){
            List<Integer> inner = new ArrayList<>();
            for(int j = 0; j < arr.length; j++){
                if((i&(1<<j)) > 0){
                    inner.add(arr[j]);
                }
            }
            outer.add(inner);
        }
        System.out.println(outer);
    }
}
