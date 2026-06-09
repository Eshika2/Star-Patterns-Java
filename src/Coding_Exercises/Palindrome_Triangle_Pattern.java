package Coding_Exercises;

import java.util.Scanner;

public class Palindrome_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("How many rows : ");
        int num = obj.nextInt();

        for (int i=1 ; i<=num ; i++) {
            // Spaces
            for (int j=num ; j>i ; j--) {
                System.out.print("__");
            }

            // 1st half
            for (int j=i ; j>=1 ; j--) {
                System.out.print(j + " ");
            }

            // 2nd half
            for (int j=2 ; j<=i ; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

// Output
//          1
//        2 1 2
//      3 2 1 2 3
//    4 3 2 1 2 3 4
//  5 4 3 2 1 2 3 4 5
//6 5 4 3 2 1 2 3 4 5 6


//How many rows : 6
//__________1
//________2 1 2
//______3 2 1 2 3
//____4 3 2 1 2 3 4
//__5 4 3 2 1 2 3 4 5
//6 5 4 3 2 1 2 3 4 5 6