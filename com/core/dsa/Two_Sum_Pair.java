package com.core.dsa;
/*
Given an array arr[] of n integers and a target value, the task is to find whether there is a pair of elements in the array
whose sum is equal to target. This problem is a variation of 2Sum problem.

Examples:
Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.


Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: There is no pair with sum equals to given target.

 */
public class Two_Sum_Pair {
    public  boolean towSumPair(int arr[], int target){
        for (int i=0; i<arr.length ;i++){
            for(int j=i+1; j<arr.length;j++){
               if (arr[i] + arr[j] == target)
                   return true;
            }
        }
        return  false;

    }

    public static void main(String[] args) {
        Two_Sum_Pair tsp = new Two_Sum_Pair();
        System.out.println( tsp.towSumPair(new int[]{0, -1, 2, -3, 1}, -2));
        System.out.println( tsp.towSumPair(new int[]{1, -2, 1, 0, 5}, 0));

    }
}
