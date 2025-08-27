package org.example;

public class variables {
    // 🔹 Instance variables (have default values if not initialized)
    int num;            // default = 0
    boolean flag;       // default = false
    String text;        // default = null

    // 🔹 Static variable (also has a default value if not initialized)
    static double rate; // default = 0.0

    void showValues() {
        // 🔹 Local variable (NO default value → must be initialized)
        int localVar;
        // System.out.println(localVar); ❌ ERROR: local variable not initialized

        // ✅ Correct: explicitly initialize local variable
       localVar = 100;

        // Printing values
        System.out.println("---- Instance Variables (Default Values) ----");
        System.out.println("num (int) = " + num);      // 0 (default)
        System.out.println("flag (boolean) = " + flag); // false (default)
        System.out.println("text (String) = " + text);  // null (default)

        System.out.println("\n---- Static Variable (Default Value) ----");
        System.out.println("rate (double) = " + rate); // 0.0 (default)

        System.out.println("\n---- Local Variable (Initialized Manually) ----");
        System.out.println("localVar (int) = " + localVar); // 100 (user initialized)
    }

    public static void main(String[] args) {
        // Create object
        variables obj = new variables();

        // Call method
        obj.showValues();

        // 🔹 Show effect of explicit initialization
        obj.num = 42;       // initialized explicitly
        obj.flag = true;    // initialized explicitly
        obj.text = "Shivani"; // initialized explicitly
        rate = 9.99;        // static variable initialized explicitly

        System.out.println("\n---- After Explicit Initialization ----");
        System.out.println("num (int) = " + obj.num);        // 42
        System.out.println("flag (boolean) = " + obj.flag);  // true
        System.out.println("text (String) = " + obj.text);   // Shivani
        System.out.println("rate (double) = " + rate);       // 9.99
    }
}
