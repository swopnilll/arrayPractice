package com.company;

public class BeanArray {
    public  static int isBeanArray(int[] arr){
        boolean containsDigit;
        for(int i = 0; i < arr.length; i++){
            containsDigit = false;
            for (int j = 0; j < arr.length; j++){
                if((arr[j] == (arr[i] - 1)) || (arr[j] == (arr[i] + 1)))
                {
                    containsDigit = true;
                    break;
                }
            }
            if(!containsDigit){
                return 0;
            }
        }
        return 1;
    }
}

