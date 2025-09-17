package org.example.Strings;

import java.util.Scanner;

public class palindromewithmethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String st= sc.nextLine();
//        String rev= new StringBuilder(st).reverse().toString();
        String rev= new StringBuffer(st).reverse().toString();
        String result= (st.equals(rev)?"palindrome":"Not a palindrome");

        System.out.println(result);
    }
}
