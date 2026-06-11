package Coding_Exercises;

public class J_Butterfly_Star_Pattern {
    public static void main(String[] args) {
        int num = 6;

        // 1st 2nd
        for (int i=1 ; i<=num ; i++) {
            // 1st Part
            for (int j=1 ; j<=i ; j++) {
                System.out.print("*");
            }

            // spaces
            for (int k=1 ; k<=(num-i)*2 ; k++) {
                System.out.print("_");
            }

            // 2nd Part
            for (int l=1 ; l<=i ; l++) {
                System.out.print("*");
            }

            System.out.println();

        }

        // 3rd and 4th
        for (int i=num ; i>=1 ; i--) {
            // 3rd Part
            for (int j=1 ; j<=i ; j++) {
                System.out.print("*");
            }

            // spaces
            for (int k=1 ; k<=(num-i)*2 ; k++) {
                System.out.print("_");
            }

            //4th Part
            for (int l=1 ; l<=i ; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// Output
//*          *
//**        **
//***      ***
//****    ****
//*****  *****
//************
//************
//*****  *****
//****    ****
//***      ***
//**        **
//*          *

//*__________*
//**________**
//***______***
//****____****
//*****__*****
//************
//************
//*****__*****
//****____****
//***______***
//**________**
//*__________*