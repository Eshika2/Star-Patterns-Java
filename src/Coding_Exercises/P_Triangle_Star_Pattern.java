package Coding_Exercises;

import java.util.Scanner;

public class P_Triangle_Star_Pattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Number : ");
        int num = obj.nextInt();

        for (int i=1 ; i<=num ; i++) {
            // spaces
            for (int j=i ; j<num ; j++) {
                System.out.print("_");
            }

            // stars
            for (int j=1 ; j<=i ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

// Output
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *

//Number : 6
//_____*
//____* *
//___* * *
//__* * * *
//_* * * * *
//* * * * * *