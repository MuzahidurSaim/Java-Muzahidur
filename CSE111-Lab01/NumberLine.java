import java.util.Scanner;

public class NumberLine {

	public static void main(String[] args) {

		System.out.print("Enter the number of lines: ");

		Scanner input = new Scanner(System.in);

		int lines = input.nextInt();

		for (int i = 1; i <= lines; i++)

			System.out.print(i + " ");
	}
}
