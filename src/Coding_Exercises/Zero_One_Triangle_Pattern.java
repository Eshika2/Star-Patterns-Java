package Coding_Exercises;

import java.util.Scanner;

public class Zero_One_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("How many rows : ");
        int num = obj.nextInt();

        for (int i=1 ; i<=num ; i++) {
            for (int j=1 ; j<=i ; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}


//Output
//How many rows : 6
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1
//0 1 0 1 0 1