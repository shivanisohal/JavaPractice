package org.example.Strings;

public class functionscommon {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Hi shivani");
        sb.append(" sohal");
        System.out.println(sb);

        sb.replace(3,5,"0");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.insert(3,"2");
        System.out.println(sb);

        StringBuffer str= new StringBuffer();
        System.out.println(str.capacity());

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.length());

        System.out.println(sb.substring(2,6));

    }
}
