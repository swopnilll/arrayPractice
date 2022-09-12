package com.company;

public class FibocacciCheck {

    public static int isFibonacci(int n){

        if(n == 1){
            return 1;
        }

        int x = 1;
        int y = 1;
        int sum = 0;

        while (sum <= n){
            sum = x + y;
            x = y;
            y = sum;

            if(sum == n){
                return 1;
            }
        }

        return 0;

    }
}
