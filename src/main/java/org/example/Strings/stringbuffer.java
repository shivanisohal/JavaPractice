package org.example.Strings;

public class stringbuffer {
    public static void main(String[] args) {


        String name= "Shivani";
        name.concat(" sohal");
        System.out.println(name);

        StringBuffer strinfbuff= new StringBuffer("shivani");
        strinfbuff.append(" sohal");
        System.out.println(strinfbuff);
        System.out.println(strinfbuff.reverse());
    }
}
