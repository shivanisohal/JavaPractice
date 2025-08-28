package org.example;

public class typecasting {
    public static void main(String[] args) {

        //widening
        //Implicit
        byte a=120;
        byte b=20;
       // byte c= a+b;
        int c=a+b;
        System.out.println(c);
        //Explicit
        int d=(int)a;
        System.out.println(d);


        //narraowing
         double m=10.88;
         int n=(int)m;
        System.out.println(n);

        // -----------------------------
        // 1. Widening - Implicit
        // -----------------------------
        int s = 100;
        double ss = a;   // int → double (automatic widening)
        System.out.println("1) Widening - Implicit:");
        System.out.println("int value: " + s);
        System.out.println("double value: " + ss);


        // -----------------------------
        // 2. Widening - Explicit (redundant)
        // -----------------------------
        int cv = 200;
        double v = (double) cv;  // int → double (forced, but same as implicit)
        System.out.println("\n2) Widening - Explicit:");
        System.out.println("int value: " + cv);
        System.out.println("double value: " + v);


        // -----------------------------
        // 3. Narrowing - Explicit (required)
        // -----------------------------
        double e = 99.99;
        int f = (int) e;   // double → int (decimal part lost)
        System.out.println("\n3) Narrowing - Explicit:");
        System.out.println("double value: " + e);
        System.out.println("int value: " + f);


        // -----------------------------
        // 4. Narrowing - Implicit (Not Allowed)
        // -----------------------------
        double g = 50.75;
        // int h = g;   // ❌ Compile-time error: incompatible types
        System.out.println("\n4) Narrowing - Implicit:");
        System.out.println("double value: " + g);
        System.out.println("int value: ERROR (cannot assign double to int without casting)");


    }
}
