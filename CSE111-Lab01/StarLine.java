import java.util.Scanner;

public class StarLine {
    
    public static void main(String[] args) {
        
        // take the number of stars
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Stars: ");
        int stars = input.nextInt();
        
        // compute the pattern
        for(int i = 1; i <= stars; ++i)
            System.out.print('*');
    }
}