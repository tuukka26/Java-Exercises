import java.util.Scanner;

public class StringLettersAndDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String givenString = input.nextLine();	
		
		int letterCount = 0;
		int digitCount = 0;
		
		for (int i = 0; i < givenString.length(); i++) {
		
			if (Character.isLetter(givenString.charAt(i))) {
				letterCount ++;
		}
		}
		
		for (int i = 0; i < givenString.length(); i++) {
			
			if (Character.isDigit(givenString.charAt(i))) {
				digitCount ++;
		}
		}
		
		System.out.println(letterCount + " letter(s)");
		System.out.println(digitCount + " digit(s)");
		
		input.close();

	}

}
