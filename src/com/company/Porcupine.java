package com.company;

public class Porcupine {
    public static int isPrime(int n){
        if(n < 2){
            return 0;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return 0;
            }
        }

        return 1;
    }

    public static int findPorcupineNumber(int n){
        int count = n + 1;
        boolean isPorFound = false;
        int nextNumber = 0;
        int anotherCount = 0;

        while(!isPorFound){

            if(isPrime(count) == 0 || count % 10 != 9){
                count++;
                continue;
            }

            anotherCount = count + 1;

            while (isPrime(anotherCount) == 0){
                anotherCount++;
            }

            if(anotherCount % 10 == 9){
                isPorFound = true;
                nextNumber = count;
                continue;
            }

            count++;
        }

        return nextNumber;
    }
}
