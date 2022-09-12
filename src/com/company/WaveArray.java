package com.company;

public class WaveArray {

    public static int isWave(int[] a){

        for(int i = 0; i < a.length; i++){
            if(i == 0) {
                continue;
            }

            if(a[i] % 2 == 0 && a[i - 1] % 2 == 0){
                return 0;
            }

            if(a[i] % 2 != 0 && a[i - 1] % 2 != 0){
                return 0;
            }
        }

        return 1;
    }
}
