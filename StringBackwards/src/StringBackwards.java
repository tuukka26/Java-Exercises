import java.util.Scanner;

public class StringBackwards {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String givenString = input.nextLine();
		
		System.out.println(reverse(givenString));
		
		input.close();
	}

	private static String reverse(String inputString){
		
		String reversedString="";
		
	    for (int i = inputString.length() - 1; i >= 0; i--) {
	       
	    	reversedString = reversedString + inputString.charAt(i);
	    	
	    }
	    return reversedString;
	}
}
