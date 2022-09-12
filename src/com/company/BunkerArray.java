package com.company;

public class BunkerArray {

    public static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static int isBunkerArray(int[] a){
        boolean oneExist = false;
        boolean primeExist = false;

        for(int i = 0; i < a.length; i++){


            if(!oneExist && a[i] == 1){
                oneExist = true;
            }

            if(!primeExist && isPrime(a[i])){
                primeExist = true;
            }

            if(oneExist && primeExist){
                return 1;
            }

        }

        return 0;
    }
}
