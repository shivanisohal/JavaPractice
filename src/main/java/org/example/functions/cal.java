package org.example.functions;

import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 values= ");
        int a=0;
        int b=0;
        if(sc.hasNextInt())
        {
            a=sc.nextInt();
            b=sc.nextInt();
        }
        else {
            System.out.println("enter valid input");
            System.exit(0);
        }


        int sum=add(a,b);
        int divi=div(a,b);
        int subt=sub(a,b);

        System.out.println(sum);
        System.out.println(divi);
        System.out.println(subt);
    }
    static int add(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
       return a-b;
    }
    static int div(int a, int b)
    {
        return a/b;
    }



}
