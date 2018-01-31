import java.util.Scanner;

public class MethodsSecond {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());

		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());

		System.out.println("");

		printRectangle(width, height);

		input.close();
	}

	private static void printRectangle(int width, int height) {

		for (int i = 1; i <= height; i++) {
			
			for (int j = 1; j <= width; j++) {
				System.out.print("x");
			}
			
			System.out.println();
		}

	}
}
