package com.company;

public class GuthrieSequence {


    //{16,8,7,5,3}

    //{8, 4, 2, 1}
    //{7, 22,11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1}
    public static  int isGuthrieSequence(int[] a){

        if(a[a.length - 1] != 1){
            return 0;
        }

        int n = a[0]; // 11
        int index = 1; // 3

        while(n != 1 &&  index < a.length){
            if(n % 2 == 0){
                if(a[index] != n / 2){
                    return 0;
                }
            }else{
                if(a[index] != 3 * n + 1){
                    return 0;
                }
            }

            n = a[index];
            index ++;

        }

        return 1;
    }
}
