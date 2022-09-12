package com.company;

public class NormalNumber {

    public static int isNormalNumber(int n){


        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                if(i % 2 != 0){
                    return 0;
                }
            }
        }

        return 1;
    }
}
