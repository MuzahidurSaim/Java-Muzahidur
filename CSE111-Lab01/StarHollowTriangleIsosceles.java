import java.util.Scanner;

public class StarHollowTriangleIsosceles {

	public static void main(String[] args) {
		
		// take the number of lines
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Lines: ");
		int lines = input.nextInt();

		// compute the pattern
		for(int i = 1; i <= lines; ++i) {
			for(int j = 1; j <= 2*lines - 1; ++j) {
				if(i == lines || j == lines - i + 1 || j == lines + i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}