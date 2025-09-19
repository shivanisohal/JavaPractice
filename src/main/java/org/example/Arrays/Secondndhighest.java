package org.example.Arrays;

import java.util.Arrays;

public class Secondndhighest {
    public static void main(String[] args) {


        int[] num = {22, 11, 33, 44, 55, 77, 99};

//        Arrays.sort(num);
//        System.out.println(num[num.length-2]);
        int highest = num[0];
        int secondhighest = num[0];

        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] > highest) {
                highest = num[i];
            }
        }

        for(int i = 0; i <= num.length - 1; i++)
        {
            if (num[i] > secondhighest && num[i] != highest)
                secondhighest = num[i];

        }
            System.out.println("highest number= " + highest);
            System.out.println("second highest number= " + secondhighest);
        }
    }

