package Coding_Exercises;

import java.util.Scanner;

public class A_Square_Hollow_Pattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = obj.nextInt();

        for (int i=1 ; i<=num ; i++) {
            for (int j=1 ; j<=num ; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


// Output
//Enter a number : 5
//        * * * * *
//        *       *
//        *       *
//        *       *
//        * * * * *