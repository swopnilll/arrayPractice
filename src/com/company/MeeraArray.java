package com.company;

public class MeeraArray {

    public static boolean isPrime(int n){
        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;

            // Check if number is 2
        else if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    public static int isMeeraArray(int[] arr){

        boolean containsPrime = false;
        boolean containsZero = false;

        for(int i = 0; i < arr.length; i++){
            if(!containsPrime){
                containsPrime = isPrime(arr[i]);
            }

            if(!containsZero){
                containsZero = (arr[i] == 0);
            }

            if(containsPrime && containsZero){
                return 1;
            }
        }
        return 0;
    }
}
