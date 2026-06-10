package Coding_Exercises;

public class H_Rhombus_Pattern {
    public static void main(String[] args) {
        int num = 6;

        for (int i=1 ; i<=num ; i++) {
            // spaces
            for (int j=num ; j>i ; j--) {
                System.out.print(" ");
            }

            // stars
            for (int j=1 ; j<=num ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// Output

//     ******
//    ******
//   ******
//  ******
// ******
//******

//_____******
//____******
//___******
//__******
//_******
//******