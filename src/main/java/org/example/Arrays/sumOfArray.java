package org.example.Arrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[]num1={1,2,3,1,1};
       int sum=0;
       for(int i=0;i<=num1.length-1;i++)
       {
           sum=sum+num1[i];
       }
        System.out.println(sum);

    }
}
