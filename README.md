# Java Pattern Programs - Learn How to Print Pattern in Java

### In many Java interviews Star, number, and character patterns are the most asked Java Pattern Programs to check your logical and coding skills. Pattern programs in Java help you to sharpen your looping concepts (especially for loop) and problem-solving skills in Java. If you are looking for a place to get all the Java pattern programs with solutions, stop your search here.

#### Here, we have compiled a top pattern exercises on Java.

#### Prerequisite: Remember that to learn pattern programs, you must know Java Loops (for, while, do-while) and basic syntax.

https://www.geeksforgeeks.org/java/java-pattern-programs/

Java Pattern Programs
Here, you will find the top 25 Java pattern programs with their proper code and explanation. 

All Pattern Programs in Java are mentioned below:


<br><br>
1. Square Hollow Pattern
<br>
This program prints a square where the border is filled with stars (*), and the inside is hollow (filled with spaces).

``` Java
import java.util.*;​
public class Geeks {

    public static void printPattern(int n)
    {
        int i, j;
        
        // outer loop to handle number of rows
        for (i = 0; i < n; i++) {
            
            //  inner loop to handle number of columns
            for (j = 0; j < n; j++) {
                
                // star will print only when  it is in first
                // row or last row or first column or last
                // column
                if (i == 0 || j == 0 || i == n - 1
                    || j == n - 1) {
                    System.out.print("*");
                }
                
                // otherwise print space only
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
```

Output
```
******
*    *
*    *
*    *
*    *
******
```
<br><br>
2. Number Triangle Pattern 
<br>
Prints a right-angled triangle with numbers in increasing row order, aligned to the right.



```Java
import java.util.*;
​
public class Geeks {
    
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            // inner loop to print space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print star
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            
            // print new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
```

Output
```
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6
```
<br><br>
3. Number-Increasing Pyramid Pattern 
<br>
Prints a pyramid where each row contains numbers from 1 to the row number.


```Java
import java.util.*;
​
public class Geeks {
    
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                
                // printing column values 
                // upto the row value
                System.out.print(j + " ");
            }
​
            // print new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
```

Output
```
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6
```

<br><br>
4. Number-Increasing Reverse Pyramid Pattern
<br>
This is a reverse pyramid where each row starts from 1 and ends at the row count, in decreasing number of elements.



```Java
import java.util.*;
​
public class Geeks {
        public static void printPattern(int n)
    {
        int i, j;
        
        // outer loop to handle number of rows
        for (i = n; i >= 1; i--) {
            
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                
                // printing column values 
                // upto the row value
                System.out.print(j + " ");
            }
​
            // print new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
```

Output
```
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1
```
<br><br>
5. Number-Changing Pyramid Pattern
<br>
Prints a pyramid where numbers increase continuously from top to bottom.



```Java
import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                
                // printing value of num in each iteration
                System.out.print(num + " ");
                
                // increasing the value of num
                num++;
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
```

Output
```
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21
```
<br><br>
6. Zero-One Triangle Pattern
<br>
Prints a triangle where each number alternates between 1 and 0 based on the position.



```Java
import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
        
        //outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            //inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                
                // if the sum of (i+j) is even then print 1
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                // otherwise print 0
                else {
                    System.out.print(0 + " ");
                }
            }
​
            //printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
```

Output
```
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1
````

<br><br>
7. Palindrome Triangle Pattern
<br>
Prints a triangle with mirrored numbers forming a palindrome on each row.



```Java
import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
​
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            // inner loop to print the spaces
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
​
            // inner loop to print the first part
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
​
            // inner loop to print the second part
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
```

Output
```
          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6
```

<br><br>
8. Rhombus Pattern
<br>
Prints a rhombus (tilted square) made of stars, shifted by spaces.


```Java
import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
​
            // inner loop to print stars
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }
            
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
```

Output
```
     ******
    ******
   ******
  ******
 ******
******
```

<br><br>

9. Diamond Star Pattern
<br>
Prints a diamond shape made of stars.

```Java
import java.util.*;
​
public class Geeks {
​
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        
        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
​
        // outer loop to handle lower part
        for (i = n-1; i >= 1; i--) {
            
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
```

Output
```
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
```

<br><br>

10. Butterfly Star Pattern
<br>
Prints a butterfly-shaped pattern using stars (*).

```Java
import java.util.*;
​
public class Geeks {
  
    public static void printPattern(int n)
    {
        // Outer loop to handle the upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
              
                // To print spaces
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                }
                
                // To print stars
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
​
        // Outer loop to handle the lower part
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * n; j++) {
              
                // To print spaces
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                }
                
                // To print stars
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String[] args)
    {
        // Number of rows
        int n = 6; 
        printPattern(n);
    }
}
```

Output
```
*          *
**        **
***      ***
****    ****
*****  *****
************
************
*****  *****
****    ****
***      ***
**        **
*          *
```
<br><br>

11. Square Fill Pattern
<br>
This program prints a filled square of stars (*) with n+1 rows and columns.

```Java
import java.util.*;
​
public class Geeks {
​
    public static void printPattern(int n)
    {
        int i, j;
​
        // outer loop to handle rows
        for (i = 0; i < n; i++) {
​
            // inner loop to handle columns
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
```

Output
```
******
******
******
******
******
******
```

<br><br>

12. Right Half Pyramid Pattern
<br>

This creates a right-angled triangle aligned to the left using stars.

```Java
import java.util.*;
​
public class Geeks {

    public static void printPattern(int n)
    {
        int i, j;
​
        // outer loop to handle rows
        for (i = 1; i <= n; i++) {
            ​
            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            ​
            // printing new line for each row
            System.out.println();
        }
    }
    ​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
```


Output
```
*
**
***
****
*****
******
```

<br><br>

13. Reverse Right Half Pyramid Pattern
<br>

This prints a right-aligned triangle but in reverse top to bottom.

```Java
import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
​
        // outer loop to handle rows
        for (i = n; i >= 1; i--) {
​
            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
```

Output
```
******
*****
****
***
**
*
```



