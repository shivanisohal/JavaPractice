package org.example;

import java.util.Scanner;

public class scannerclass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age for user=");
        int age= scanner.nextInt();
        System.out.println("your age is="+age);
        if(age>18)
        {
            System.out.println(" you can go");
        }
        else
        {
            System.out.println("do not go");
        }


    }
}
