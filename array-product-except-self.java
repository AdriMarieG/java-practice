/*
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
*/

import java.util.Arrays;

public class ArrayProduct{

public int[] productExceptSelf(int[] nums){

    //determine length of array
    int n = nums.length;

    //establish two arrays for product of integers on the left and right of self
    int[] leftProduct = new int[n];
    int[] rightProduct = new int[n];

    //establish the final array for the outputs
    int[] output = new int[n];

    leftProduct[0] = 1;
    rightProduct[n-1] = 1;

    for(int i = 1; i < n; i++){
        leftProduct[i] = nums[i-1] * leftProduct[i-1];
    }

    for(int i = 1; i > 1; i--){
        rightProduct[i] = nums[i+1] * rightProduct[i+1];
    }

    for(int i = 0; i < n; i++){
        output[i] = leftProduct[i] * rightProduct[i];
    }

    return output;
}

    public static void main(String[] args){
        
    }
}
