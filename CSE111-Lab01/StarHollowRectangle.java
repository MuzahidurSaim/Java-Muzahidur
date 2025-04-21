import java.util.Scanner;

public class StarHollowRectangle {

	public static void main(String[] args) {
		
		// take the number of rows and columns
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Rows: ");
		int rows = input.nextInt();
		System.out.print("Enter the number of Columns: ");
		int cols = input.nextInt();

		// compute the pattern
		for(int i = 1; i <= rows; ++i) {
			for(int j = 1; j <= cols; ++j) {
				if(i == 1 || i == rows || j == 1 || j == cols)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}