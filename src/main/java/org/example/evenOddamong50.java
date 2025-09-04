package org.example;

public class evenOddamong50 {
    public static void main(String[] args) {

        int evencount=0;
        int oddcount=0;
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
            {
             evencount++;
                System.out.println("Even number="+i);
            }
            else
            {
              oddcount++;
                System.out.println("Odd number="+i);
            }
        }
        System.out.println("Even count="+evencount);
        System.out.println("Odd count="+oddcount);
    }
}
