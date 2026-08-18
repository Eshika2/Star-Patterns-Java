import java.util.*;

public class Q_Reverse_Number_Triangle_Pattern {
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);

      System.out.print("Enter a Number: ");
      int num = obj.nextInt();

      for (int i=1 ; i<=num ; i++) {
        // spaces
        for (int j=1 ; j<i ; j++) {
          System.out.print(" ");
        }

        // Numbers
        for (int j=i ; j<=num ; j++) {
          System.out.print(j + " ");
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

// Enter a Number: 6
// 1 2 3 4 5 6 
//  2 3 4 5 6 
//   3 4 5 6 
//    4 5 6 
//     5 6 
//      6 
