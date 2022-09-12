package com.company;

public class SquarePairs {

    public static int isPerfectSquare(int n){
        if(n < 1){
            return 0;
        }

        if(n == 1){
            return 1;
        }
        int sum = 0;


       for(int i = 1; i < n; i ++){
           if(sum >= n){
               break;
           }

           sum = i * i;
       }

       return sum == n ? 1 : 0;

    }



    public static int countSquarePairs(int[] a){

        if(a.length < 2){
            return 0;
        }

        int count = 0;

        for(int i = 0; i < a.length; i++){

            if(a[i] <= 0) continue;

            for(int j = 0; j < a.length; j++){
                if(a[i] <= 0) continue;
                if(a[j] <= a[i]){
                    continue;
                }

                if(isPerfectSquare(a[i] + a[j]) == 1){
                    count = count + 1;
                }

            }
        }

        return count;
    }
}
