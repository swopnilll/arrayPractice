package com.company;

public class SumIsPower {

    public static boolean sumIsPower(int[] arr){
        if(arr == null){
            return false;
        }
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        if(sum == 1 || sum == 2){
            return true;
        }

        int calculatedSum = 2;

        while( calculatedSum <= sum) {
            calculatedSum = calculatedSum * 2;

            if(calculatedSum == sum){
                return true;
            }

        }

        return false;
    }
}
