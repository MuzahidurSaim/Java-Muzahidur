import java.util.Scanner;

public class StarRhombus {
    
    public static void main(String[] args) {
        
        // take the number of lines
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Lines: ");
        int lines = input.nextInt();
        
        // compute the pattern
        for(int i = 1; i <= lines; ++i) {
            for(int j = 1; j <= lines - i; ++j)
                System.out.print(" ");
            for(int j = 1; j <= 2*i - 1; ++j)
                System.out.print("*");
            System.out.println();
        }
        for(int i = lines - 1; i >= 1; --i) {
            for(int j = 1; j <= lines - i; ++j)
                System.out.print(" ");
            for(int j = 1; j <= 2*i - 1; ++j)
                System.out.print("*");
            System.out.println();
        }
    }
}