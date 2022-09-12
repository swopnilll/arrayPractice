package com.company;

public class Inertial {

//    {1, 2, 3, 4}

    public static int isInertial(int[] a){
        boolean atLeastOneOdd = false;
        int maxVal = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] > maxVal){
                maxVal = a[i];
            }

            if(a[i] % 2 != 0){
                atLeastOneOdd = true;
            }
        }

        if(maxVal % 2 != 0 || !atLeastOneOdd){
            return 0;
        }

        for(int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                continue;
            }

            for (int j = 0; j < a.length; j++) {
                if (a[j] % 2 != 0 || a[j] == maxVal) {
                    continue;
                }

                if (a[j] > a[i]) {
                    return 0;
                }
            }

        }
            return 1;
    }
}
