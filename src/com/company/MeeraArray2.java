package com.company;

public class MeeraArray2 {

    public static int isMeera(int n){

        int count = 0;

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                count++;
            }
        }

        if(count == 0){
            return 0;
        }

        System.out.println(count);

        if(n % count == 0){
            return 1;
        }

        return 0;
    }
}
