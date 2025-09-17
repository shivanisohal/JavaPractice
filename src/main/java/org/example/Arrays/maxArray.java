package org.example.Arrays;

public class maxArray {
    public static void main(String[] args) {

        int arr[] = {22, 51, 44, 76, 44, 99, 12, 43};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.println(max);

    }
}