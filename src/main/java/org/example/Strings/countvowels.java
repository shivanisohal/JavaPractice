package org.example.Strings;

public class countvowels {
    public static void main(String[] args) {
        String str="test vowels";
        int vowel=0;
        int consonents=0;
        str= str.toLowerCase();
         for(int i=0;i<=str.length()-1;i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
vowel++;
                System.out.println("vowels= "+ch);
            }
            else {
                consonents++;
                System.out.println("consonents= "+ch);
            }

        }
        System.out.println("vowel count= "+vowel);
        System.out.println("consonents count= "+consonents);
    }
}
