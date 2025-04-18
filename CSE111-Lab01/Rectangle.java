import java.util.Scanner;

public class Rectangle {
    
    public static void main(String[] args) {
        
        // takes inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of Columns: ");
        int cols = input.nextInt();
        
        // computes the pattern
        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= cols; ++j)
                System.out.print(j + " ");
            System.out.println();
        }
        
    }
}