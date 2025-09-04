package org.example;

public class ifcondition {
    public static void main(String[] args) {
String age1=args[1];
        int age = Integer.parseInt(age1);
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
