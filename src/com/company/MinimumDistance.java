package com.company;

public class MinimumDistance {

    public static int minDistance(int n){

        if(n % 2 == 0){
            return 1;
        }

        boolean isPrime = true;

        int factor1 = 0;
        int difference = 0;

        for(int i = 1; i < n/2; i ++){
            if(n % i == 0){
                isPrime = false;
                if(difference == 0 && factor1 == 0){
                    factor1 = i;
                    continue;
                }
                if(difference == 0 && factor1 > 0){
                    difference = i - factor1;
                    factor1 = i;
                    continue;
                }
                if(difference > 0 && factor1 > 0){
                    difference = difference < i - factor1
                                 ? difference
                                 : i - factor1;
                    factor1 = i;
                }
            }
        }

        return isPrime
                ? n - 1
                : difference;
    }
}
