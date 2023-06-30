package com.company;
import java.util.Scanner;
public class Main {
    // --------------------------------------------------
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    // --------------------------------------------------
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(ANSI_BLUE +  "What would you like?");
        System.out.println("1 - Operation with Numbers");

        String Question = input.nextLine();

        switch (Question)
        {
            case "1":
                System.out.println("Input number for operations here");
                System.out.println("---------------------------------------------");
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println("---------------------------------------------");
                int r = a + b;
                int r1 = a - b;
                int r2 = a * b;
                int r3 = a / b;
                int r4 = a % b;
                System.out.println(ANSI_GREEN + "Result Add" + " = " + r + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Result Minus" + " = " + r1 + ANSI_RESET);
                System.out.println(ANSI_CYAN + "Result Multi" + " = " + r2 + ANSI_RESET);
                System.out.println(ANSI_RED + "Result Division" + " = " + r3 + ANSI_RESET);
                System.out.println(ANSI_PURPLE + "Result Division with more" + " = " + r4 + ANSI_RESET);
                System.out.println( ANSI_BLUE +  "---------------------------------------------");
        }




    }
}
