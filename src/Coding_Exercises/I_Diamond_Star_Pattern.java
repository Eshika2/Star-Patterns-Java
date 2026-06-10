package Coding_Exercises;

public class I_Diamond_Star_Pattern {
    public static void main(String[] args) {
        int num = 6;

        for (int i=1 ; i<=num ; i++) {
            // spaces
            for (int j=num ; j>i ; j--) {
                System.out.print("_");
            }


            //     *
            //    ***
            //   *****
            //  *******
            // *********
            //***********
            // top half
            for (int j=(i*2)-1 ; j>=1 ; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i=num-1 ; i>=1 ; i--) {
            //spaces
            for (int j=i ; j<num ; j++) {
                System.out.print("_");
            }

            // *********
            //  *******
            //   *****
            //    ***
            //     *
            // Second half
            for (int j=(i*2)-1 ; j>=1 ; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

// Output
//     *       -> first half
//    ***
//   *****
//  *******
// *********
//***********

// *********   -> second half
//  *******
//   *****
//    ***
//     *

//_____*
//____***
//___*****
//__*******
//_*********
//***********
//_*********
//__*******
//___*****
//____***
//_____*