package com.company;


//[1,2,3 0, 0 , 0, 0, 5,6,7]

public class HollowCheck {

    public static boolean isHollow(int[] array){
        if(array[array.length/2] != 0){
            return false;
        }

        int zeroStartingIndex = 0;
        int zeroCount = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                zeroStartingIndex = i;
                break;
            }
        }

        if(((zeroStartingIndex * 2) + 3) > array.length ){
            return false;
        }

        for(int i = zeroStartingIndex; i < array.length; i++){
            if(array[i] != 0){
                zeroCount = i % zeroStartingIndex + 1;
            }
        }

        if(zeroCount < 3){
            return false;
        }

        if((zeroCount + (2 * zeroStartingIndex)) == array.length){
            return true;
        }

        return false;
    }
}
