import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ObjectsWordList {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<WordList> wordsList = new ArrayList<WordList>();

		System.out.print("Enter a word (quit ends): ");
		String userInput = input.nextLine();



			do {
				wordsList.add(new WordList(userInput));
				System.out.print("Enter a word (quit ends): ");
				userInput = input.nextLine();

			} while (!"quit".equals(userInput));

			Collections.sort(wordsList);
			
			System.out.println("");

			for (WordList wordListObject : wordsList) {

				System.out.println(wordListObject.getInputWord());
			}

		
		input.close();
	}

}
