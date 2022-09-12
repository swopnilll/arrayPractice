package com.company;

public class Balanced {

    public static int isBalanced(int[] a){

        for(int i = 0; i < a.length; i++){

            if(i % 2 == 0){
                if(a[i] % 2 != 0){
                    return 0;
                }
                continue;
            }
            if(a[i] % 2 == 0){
                return 0;
            }
        }
        return 1;
    }
}
