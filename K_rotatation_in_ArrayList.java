K rotatation in ArrayList

Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.

import java.util.ArrayList;

public class RotateArray {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k%n;
        rotate(arr, 0,k-1);
        rotate(arr,k,n-1);
        rotate(arr,0,n-1);

        return arr;
    }
    static void rotate(ArrayList<Integer> arr, int start, int end){
        while(start<end){
            int temp = arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
    }
}
