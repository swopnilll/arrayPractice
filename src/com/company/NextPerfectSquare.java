package com.company;

public class NextPerfectSquare {

    public static int nextPerfectSquare(int n){
        if(n <= 0){
            return 1;
        }

        int i = 1;

        while((i * i) <= n ){
            i = i + 1;
        }

        return i * i;
    }
}
