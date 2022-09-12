package com.company;

public class StantonMeasure {

    // {1, 4, 3, 2, 1, 2, 3,2}
    public static int stantonMeasure(int[] a){

        int count = 0;
        int stantonCount = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] == 1){
                count++;
            }
        }

        for(int i = 0; i < a.length; i++){
            if(a[i] == count){
                stantonCount++;
            }
        }

        return stantonCount;

    }
}
