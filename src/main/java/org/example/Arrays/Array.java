package org.example.Arrays;

public class Array {
    public static void main(String[] args) {
        int i[]={91,20,80,70,91,72,32};
        int[] num={1,2,1,2,3,6};
        System.out.println(num.length);
        System.out.println(i.length);
        System.out.println(i[0]);
        System.out.println(i[2]);
        //System.out.println(i[-1]);
       // System.out.println(i[10]);

        for (int j : num) {
            System.out.println(j);
        }
    }
}
