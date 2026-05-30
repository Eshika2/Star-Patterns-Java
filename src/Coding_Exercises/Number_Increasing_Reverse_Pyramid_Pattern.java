package Coding_Exercises;

public class Number_Increasing_Reverse_Pyramid_Pattern {
    public static void main(String[] args) {
        int num = 6;

        //rows
        for (int i=num ; i>=1 ; i--) {

            //cols
            for (int j=1 ; j<=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Output
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1