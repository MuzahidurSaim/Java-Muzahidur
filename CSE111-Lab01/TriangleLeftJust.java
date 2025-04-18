import java.util.Scanner;

public class TriangleLeftJust {
    
    public static void main(String[] args) {
        
        // takes inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Lines: ");
        int lines = input.nextInt();
        
        // computes the pattern
        for(int i = 1; i <= lines; ++i) {
            for(int j = 1; j <= i; ++j)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}