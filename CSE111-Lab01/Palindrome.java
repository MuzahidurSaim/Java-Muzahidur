import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        
        // take the value of limit
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Limit: ");
        int limit = input.nextInt();
        
        // compute the pattern
        for(int i = 1; i <= limit; ++i)
            System.out.print(i);
        for(int i = limit - 1; i >= 1; --i)
            System.out.print(i);
    }
}