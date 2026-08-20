import java.util.*;

public class R_Mirror_Image_Triangle_Pattern {
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);

      System.out.print("Enter the number : ");
      int num = obj.nextInt();

    // int num = 6;

      for (int i=1 ; i<=num ; i++) {
        for (int j=1 ; j<i ; j++) {
            System.out.print("_");
        }

        for (int j=i ; j<=num ; j++) {
            System.out.print(j + "_");
        }

        System.out.println();
      }

      for (int i=num ; i>=1 ; i--) {
        for (int j=1 ; j<i ; j++) {
            System.out.print("_");
        }

        for (int j=i ; j<=num ; j++) {
            System.out.print(j + "_");
        }

        System.out.println();
      }
    }
}

// Output
// 1 2 3 4 5 6 
//  2 3 4 5 6 
//   3 4 5 6 
//    4 5 6 
//     5 6 
//      6 
//     5 6 
//    4 5 6 
//   3 4 5 6 
//  2 3 4 5 6 
// 1 2 3 4 5 6 


// Enter the number : 6
// 1_2_3_4_5_6_
// _2_3_4_5_6_
// __3_4_5_6_
// ___4_5_6_
// ____5_6_
// _____6_
// _____6_
// ____5_6_
// ___4_5_6_
// __3_4_5_6_
// _2_3_4_5_6_
// 1_2_3_4_5_6_
