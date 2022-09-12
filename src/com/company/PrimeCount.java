package com.company;

public class PrimeCount {

    public static boolean isPrime(int n){
        if(n < 2 ) return false;

        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }


    public static int primeCount(int start, int end){

        if(start == end){
            return isPrime(start) ? 1 : 0;
        }

        if(start > end){
            return 0;
        }

        int primeCounts = 0;

        for(int i = start; i <= end; i++){

            if(i < 2){
                continue;
            }

            if(isPrime((i))){
                primeCounts = primeCounts + 1;
            }
        }

        return primeCounts;

    }
}
