// Hollow Rectangle
/*
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Print the full sequence on the first and last rows.
                if (i == 1 || i == rows) {
                    System.out.print(j);
                } else {
                    // For other rows, print the number at the beginning and the end.
                    if (j == 1 || j == cols) {
                        System.out.print(j);
                    } else {
                        // Print a space for the inner area.
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
*/

// Hollow Triangle - Left Justified
/*
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == h || j == 1 || j == i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/

// Hollow Triangle - Right Justified
/*
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        // Top part (rows 1 to h-1)
        for (int i = 1; i < h; i++) {
            int left = h - i + 1; // the left boundary digit for the current row
            for (int j = 1; j <= h; j++) {
                if (j == left) {
                    System.out.print(left);
                } else if (j == h) {
                    System.out.print(h);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Last row: print consecutive numbers from 1 to h
        for (int j = 1; j <= h; j++) {
            System.out.print(j);
        }
    }
}
*/

// Hollow Triangle – Isosceles
/*
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int width = 2 * h - 1;
        // For rows 1 to h-1, print only the boundary digits
        for (int i = 1; i < h; i++) {
            int left = h - i + 1;    // left boundary column
            int right = h + i - 1;   // right boundary column
            for (int j = 1; j <= width; j++) {
                if (j == left || j == right) {
                    // Compute digit relative to left boundary:
                    // For row 2 and j==2 -> (2-2+1)=1, and for j==4 -> (4-2+1)=3, etc.
                    System.out.print(j - left + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // For the last row, print all digits from 1 to width
        for (int j = 1; j <= width; j++) {
            System.out.print(j);
        }
    }
}
*/

// Hollow Rhombus
/*
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 2 * n - 1;
        for (int i = 1; i <= total; i++) {
            // For the top half (i<=n) let r = i.
            // For the bottom half (i>n) let r = 2*n - i.
            int r = i <= n ? i : 2 * n - i;
            // Compute left and right boundaries for the digits in this row.
            int leftBound = n - r + 1;
            int rightBound = n + r - 1;
            for (int j = 1; j <= total; j++) {
                if (j == leftBound) {
                    // The left boundary always prints 1.
                    System.out.print("1");
                } else if (j == rightBound) {
                    // The right boundary prints the digit (2*r - 1).
                    System.out.print(2 * r - 1);
                } else {
                    // Otherwise, print a space.
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/

// Palindrome
/*
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Print ascending numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        // Print descending numbers from n-1 down to 1
        for (int i = n - 1; i >= 1; i--) {
            System.out.print(i);
        }
    }
}
*/

// Palindromic Triangle
/*
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Print leading spaces: (n - i) spaces
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            // Print increasing numbers from 1 to i
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            // Print decreasing numbers from i-1 to 1
            for (int j = i - 1; j >= 1; j--)
                System.out.print(j);
            System.out.println();
        }
    }
}
*/

/*
Star Line
Rectangle using Star Line
Triangle - Left Justified
Triangle - Right Justified
Triangle - Isosceles
Rhombus using
Hollow Rectangle
Hollow Triangle - Left Justified
Hollow Triangle - Right Justified
Hollow Triangle – Isosceles
Hollow Rhombus
*/
