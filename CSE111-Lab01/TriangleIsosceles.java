import java.util.Scanner;

public class TriangleIsosceles {
    
    public static void main(String[] args) {
        
        // take line numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Lines: ");
        int lines = input.nextInt();
        
        // compute the pattern
        for(int i = 1; i <= lines; ++i) {
            for(int j = 1; j <= lines - i; ++j) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i - 1; ++k) {
                System.out.print(k);
            }
            for(int j = 1; j <= lines - i; ++j) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}