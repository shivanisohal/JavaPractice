package org.example.Strings;

public class StringBuild {
    public static void main(String[] args) {

        StringBuilder stringbuilder= new StringBuilder("Shivani");
        stringbuilder.append(" sohal");
        System.out.println(stringbuilder);
        System.out.println(stringbuilder.reverse());
        System.out.println(stringbuilder.delete(3,6));
    }
}
