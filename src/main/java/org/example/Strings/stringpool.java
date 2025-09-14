package org.example.Strings;

public class stringpool {
    public static void main(String[] args) {

        String name = "shivani";
        name = name.toUpperCase();
        System.out.println(name);

        String c = "hello";
        c = c.concat("world");
        System.out.println(c);

        String s1 = new String("Selenium");
        String s2 = "Selenium";
        System.out.println(s1 == s2);
        System.out.println(s2.charAt(3));
        System.out.println(s2.length());
        System.out.println(s2.contains("k"));
        System.out.println(s2.indexOf("l"));
        System.out.println(s2.indexOf("z"));

        String s3 = " test";
        // Additional String methods
        System.out.println(s3.toLowerCase());
        System.out.println(s2.substring(2, 6));
        System.out.println(s2.replace('e', 'a'));
        System.out.println(s2.startsWith("Sel"));
        System.out.println(s2.endsWith("ium"));
    }
}
