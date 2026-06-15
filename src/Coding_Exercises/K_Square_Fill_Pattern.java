package Coding_Exercises;

import java.util.Scanner;

public class K_Square_Fill_Pattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = obj.nextInt();

        for (int i=1 ; i<=num ; i++) {
            for (int j=1 ; j<=num ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Output
//******
//******
//******
//******
//******
//******
