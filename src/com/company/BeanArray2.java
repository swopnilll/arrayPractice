package com.company;

public class BeanArray2 {

    public static int isBean(int[] a){
        boolean containsNine = false;
        boolean containsThirteen = false;
        boolean containsSeven = false;
        boolean containsSixteen = false;

        for(int i = 0; i < a.length; i++){
            switch (a[i]){
                case 9:
                    containsNine = true;
                    continue;

                case 13:
                    containsThirteen = true;
                    continue;

                case 7:
                    containsSeven = true;
                    continue;

                case 16:
                    containsSixteen = true;
                    continue;

                default:
                    continue;
            }
        }

        if(containsNine && !containsThirteen){
            return 0;
        }

        if(containsSeven && containsSixteen){
            return 0;
        }

        return 1;
    }
}
