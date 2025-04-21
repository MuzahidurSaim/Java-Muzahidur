import java.util.Scanner;

public class HollowTriangleLeftJust {
    
    public static void main(String[] args) {
        
        // take line numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Lines: ");
        int lines = input.nextInt();
        
        // compute the pattern
        for(int i = 1; i <= lines; ++i) {
            for(int j = 1; j <= lines; ++j) {
                if (i == lines)
                    System.out.print(j);
                else if(j == 1 || j == i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}