package org.example;

public class staticV {

        static int x;
        public void test()
        {
            int a=10;
            System.out.println("local variable="+a);
            System.out.println("static variable="+x);

        }

    public static void main(String[] args) {
           staticV obj= new staticV();
           obj.test();

           //change value of static variable

        x=20;
        System.out.println("static value after change="+x);


    }
}
