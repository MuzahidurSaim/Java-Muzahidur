import java.util.Scanner;

public class TriangleRightJust2 {
    
    public static void main(String[] args) {
        
        // take line numbers
        System.out.print("Enter the number of Lines: ");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        
        // compute the pattern
        for(int i = 1; i<= lines; ++i) {
            for(int j = 1; j <= lines - i; ++j) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; ++k) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}