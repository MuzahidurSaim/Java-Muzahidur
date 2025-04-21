import java.util.Scanner;

public class HollowRectangle {
    
    public static void main(String[] args) {
        
        // take rows and columns
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of Columns: ");
        int cols = input.nextInt();
        
        // compute the pattern
        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= cols; ++j) {
                if(i == 1 || i == rows)
                    System.out.print(j);
                else if(j == 1 || j == cols) 
                    System.out.print(j);
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}