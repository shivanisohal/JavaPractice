package org.example.Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        StringBuilder rev= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev.append(str.charAt(i));

        }
        if(str.equals(rev.toString()))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palidrome");
        }
    }
}
