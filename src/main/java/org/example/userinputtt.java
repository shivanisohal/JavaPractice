package org.example;

public class userinputtt {
    public static void main(String[] args) {

        String age = args[0];
        String num1=args[1];
        String num2=args[2];

        System.out.println(age);
        System.out.println(num1);
        System.out.println(num2);
        //int age1= Integer.parseInt(age);

        int a=10;
        System.out.println(a);
        int b=a++;
        System.out.println(b);
        int c=++b;
        System.out.println(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        int d=10;
        System.out.println(++d + ++d);
        System.out.println(d);

    }
}
