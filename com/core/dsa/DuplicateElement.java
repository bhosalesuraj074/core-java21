package com.core.dsa;
/*
Find duplicates in O(n) time and O(n) extra space
Last Updated : 24 Dec, 2024
Given an array arr[] of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times. The task is to find the repeating numbers.

Note: The repeating element should be printed only once.

Example:

Input: n = 7, arr[] = [1, 2, 3, 6, 3, 6, 1]
Output: 1, 3, 6
Explanation: The numbers 1 , 3 and 6 appears more than once in the array.


Input : n = 5, arr[] = [1, 2, 3, 4 ,3]
Output: 3
Explanation: The number 3 appears more than once in the array.
* */
public class DuplicateElement {
    public void findDuplicate(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.print(arr[j]+ " ");
            }
        }
    }
    public static void main(String[] args) {
        DuplicateElement de = new DuplicateElement();
        de.findDuplicate(new int[] {1, 2, 3, 6, 3, 6, 1} );
        de.findDuplicate(new int[] {1, 2, 3, 4 ,3} );

    }
}
