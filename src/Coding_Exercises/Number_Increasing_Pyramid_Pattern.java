package Coding_Exercises;

import java.util.Scanner;

public class Number_Increasing_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = obj.nextInt();

        //rows
        for (int i=1 ; i<=num ; i++) {

            //cols
            for (int j=1 ; j<=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

// Output
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
