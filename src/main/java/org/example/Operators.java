package org.example;

public class Operators {
    public static void main(String[] args) {
        String first="shivani";
        String last="sohal";
        int a=10;
        int b=20;

        //Arithmatic op
        System.out.println(a+b+first+last);

        System.out.println(first+last+a+b);
        System.out.println(first+last+(a+b));
        System.out.println(b/a);
        System.out.println(b-a);
        System.out.println(b%a);
        System.out.println("------------------------------");
        //Logical op
        int x = 5;
        boolean flag = false;
        System.out.println(+x);   // + sign, value remains 5
        System.out.println(-x);   // - sign, value becomes -5
        System.out.println(++x);  // Pre-increment: first increase, then use (6)
        System.out.println(x++);  // Post-increment: use then increase (6, then x=7)
        System.out.println(--x);  // Pre-decrement: first decrease, then use (6)
        System.out.println(x--);// Post-decrement: use then decrease (6, then x=5)
        System.out.println(x);
        System.out.println(!flag);
        System.out.println("-------------------------------------------");
        //Assignment op

        int c = 10;
        c += 5;   // a = a + 5 → 15
        c -= 3;   // a = a - 3 → 12
        c *= 2;   // a = a * 2 → 24
        c /= 4;   // a = a / 4 → 6
        c %= 5;   // a = a % 5 → 1

        System.out.println("Final value of c: " + c);

        System.out.println("interview question------------");
        System.out.println(!(10>20));

        char test='a';
        char test1='b';
        System.out.println(test+test1);



    }

}
