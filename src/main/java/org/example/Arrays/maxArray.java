package org.example.Arrays;

public class maxArray {
    public static void main(String[] args) {
        int arry[] = {22, 51, 44, 76, 44, 99, 12, 43};

        int maxoutput = maxarray(arry);
        System.out.println("The maximum value in the array is: " + maxoutput);

        int minoutput= minarray(arry);
        System.out.println("The minimum value in the array is: " + minoutput);


    }

    public static int minarray(int[] arry) {
        int min = arry[0];
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] < min) {
                min = arry[i];

            }
        }
        return min;
    }




    public static int maxarray(int arry[]) {

        int max = arry[0];
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];

            }

        }
       return max;


    }
}
