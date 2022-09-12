package com.company;

public class FillArray {
    public static int[] fill(int[] arr, int k, int n){
        if(k <= 0 || n <= 0){
            return null;
        }

        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++){
            if(i < k){
                arr2[i] = arr[i];
            }else{
                arr2[i] = arr[i % k];
            }
        }

       return arr2;
    }
}