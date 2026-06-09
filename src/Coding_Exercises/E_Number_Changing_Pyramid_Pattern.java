package Coding_Exercises;

import java.util.Scanner;

public class E_Number_Changing_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = obj.nextInt();

        int n = 1;

        for (int i=1 ; i<=num ; i++) {
            for (int j=1 ; j<=i ; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}


//    Output

//    1
//    2 3
//    4 5 6
//    7 8 9 10
//    11 12 13 14 15
//    16 17 18 19 20 21