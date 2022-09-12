package com.company;

public class NiceArray {

    public static int isNice(int[] a){
        boolean niceExist = false;


        for(int i = 0; i < a.length; i++){
            niceExist = false;

            for (int j = 0; j < a.length; j++){
                if((a[j] - 1) == a[i] || (a[j] + 1) == a[i]){
                    niceExist = true;
                    break;
                }
            }

            if(!niceExist){
                return 0;
            }
        }

        return 1;
    }
}
