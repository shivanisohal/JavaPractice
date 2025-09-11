package org.example.functions;

public class function {
    public static void main(String[] args) {

        //withoutParameterwithoutReturnType
        //WithoutParameterwithReturnType
        //WithParameterWithoutReturnType
        //WithParameterWithReturnType
        f1();
        System.out.println(f2());
        f3(3,6);
        System.out.println(f4(10,2));
    }

    //1.withoutParameterwithoutReturnType
    static void f1()
    {
        System.out.println("F1");
    }
    //2.WithoutParameterwithReturnType
    static String f2()
    {

        System.out.println("f2");
        return "hi, how r u?";
    }
    //3.WithParameterWithoutReturnType
    static void f3(int a, int b)
    {
        System.out.println(a+b);
    }

    //4.
    static int f4(int c, int d)
    {
        return c/d;
    }
}
