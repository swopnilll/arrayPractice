package com.company;

public class NUpCount {
    public static int nUpCount(int[] a, int n){
        int sum = 0;
        int upCount = 0;
        int previousSum = 0;

        for(int i = 0; i < a.length; i++){
            previousSum = sum;
            sum = sum + a[i];

            if(previousSum <= n && sum > n ){
                upCount = upCount + 1;
            }
        }

        return upCount;
    }
}
