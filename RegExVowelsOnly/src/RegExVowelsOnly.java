import java.util.Scanner;

public class RegExVowelsOnly {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String aString = input.nextLine();
		
		if (aString.matches("[^bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ\\s]+")) {
			
			System.out.println("Vowels only");
		} else {
			
			System.out.println("Not only vowels!");
		}
		
		
		input.close();
	}

}
