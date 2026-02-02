Reverse Array Using Recursion

import java.util.*;
class ReverseArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        Swap(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int[] arr, int start){
        int n = arr.length-1;
        if(start >= n/2)    return;
        int temp = arr[start];
        arr[start] = arr[n-start];
        arr[n-start] = temp;
        Swap(arr,start+1);
    }
}
