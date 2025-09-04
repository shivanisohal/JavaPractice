package org.example;

public class newWayofSwitch {
    public static void main(String[] args) {

        int item=1100;
        switch (item) {
            case 1100 -> System.out.println("matched");
            case 1200 -> System.out.println("not matched");
            default -> System.out.println("default");
        }
    }
}
