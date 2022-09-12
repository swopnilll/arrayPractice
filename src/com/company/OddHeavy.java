package com.company;

public class OddHeavy {

    public static int isOddHeavy(int[] a){

        boolean hasOneOdd = false;
        boolean isLargest = true;

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0) continue;

            isLargest = true;
            hasOneOdd = true;

            for(int j = 0; j < a.length; j++){

                if(a[j] % 2 != 0) continue;

                if(a[j] > a[i]){
                    isLargest = false;
                    break;
                }
            }

            if(!isLargest){
                return 0;
            }

        }

        return hasOneOdd ? 1 : 0;


    }
}
