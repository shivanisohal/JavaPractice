package org.example;

public class userinput {
    public static void main(String[] args) {
        String age = args[0];
        System.out.println(age);
         int age1= Integer.parseInt(age);


         String result = (age1<18)?"minor":
                 (age1>60)?"senior": "adult";
        System.out.println(result);

    }
}
