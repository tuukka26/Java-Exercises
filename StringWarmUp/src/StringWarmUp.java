import java.util.Scanner;

public class StringWarmUp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String givenString = input.nextLine();		
		
		System.out.println(givenString.length() + " characters");
		System.out.println(givenString.toUpperCase());
		System.out.println(givenString.toLowerCase());
		
		input.close();
	}

}
