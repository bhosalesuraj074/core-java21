package com.core.Arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = {234,345,3,5,63,6,3,6,8,64};
        System.out.println("Before sorting");
        for(int i : arr){
            System.out.print(i+" ");
        }
        
        System.out.println("\nAfter sorting");
        
        // 1. sorting the array by sort() method
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
        
        // 2. sorting the array by parallelSort() by passing fromIndex & toIndex
        /*Arrays.parallelSort(arr, 4, arr.length-1);
        for(int i : arr){
            System.out.print(i+" ");
        }*/
        
        /* 3. searching the element from the array by using Binary search, it accepts two values first array and search
        element as key i.e (array, key), then it will return the index of occurrence*/

        System.out.println("\nFinding the element: " + Arrays.binarySearch(arr, 234));


    }
}
