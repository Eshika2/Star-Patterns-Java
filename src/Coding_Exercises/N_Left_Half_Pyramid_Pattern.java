package Coding_Exercises;

import java.util.Scanner;

public class N_Left_Half_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Number : ");
        int num = obj.nextInt();

        for (int i=1 ; i<=num ; i++) {
            //spaces
            for (int j=i ; j<=num ; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j=1 ; j<=i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// Output
//Number : 6
//______*
//_____**
//____***
//___****
//__*****
//_******