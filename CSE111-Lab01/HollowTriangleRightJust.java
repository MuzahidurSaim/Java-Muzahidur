import java.util.Scanner;

public class HollowTriangleRightJust {
    
    public static void main(String[] args) {
        
        // take line numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Lines: ");
        int lines = input.nextInt();
        
        // compute the pattern
        for(int i = lines; i >= 1; --i) {
            for(int j = 1; j <= lines; ++j) {
                if(j == i || j == 5 || i == 1)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}