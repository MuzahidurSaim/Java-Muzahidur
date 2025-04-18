import java.util.Scanner;

public class TriangleRightJust {
    
    public static void main(String[] args) {
        
        // takes input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Lines: ");
        int lines = input.nextInt();
        
        // computes the pattern
        for(int i = 1; i <= lines; ++i) {
            for(int j = 1; j <= lines-i; ++j) {
                System.out.print(" ");
            }
            for(int k = lines - i + 1; k <= lines; ++k) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}