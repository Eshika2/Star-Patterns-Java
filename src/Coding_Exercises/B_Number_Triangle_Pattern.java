package Coding_Exercises;

import java.util.Scanner;

public class B_Number_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = obj.nextInt();

        for (int i=1 ; i<=num ; i++) {
            //spaces
            for (int j=num ; j>i ; j--) {
                System.out.print(" ");
            }

//            for (int j=1 ; j<=i ; j++) {
//                System.out.print("*" + " ");
//            }

            for (int j=1 ; j<=i ; j++) {
                System.out.print(i + " ");
            }

            System.out.println();

        }

    }
}

// Output


// Enter the number : 5
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5