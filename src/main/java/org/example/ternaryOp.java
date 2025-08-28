package org.example;

public class ternaryOp {
    public static void main(String[] args) {
        int a=100; int b=20; int d=80;
        boolean c= (a<b)?true:false;
        System.out.println(c);

        String s=(a%2==0)?"even":"odd";
        System.out.println(s);

        String res=(a>b)?
                ((a>d)?"A is greater":"D is greater")
                :((b>d)?"B is greater":"d is greater");
        System.out.println(res);



    }
}
