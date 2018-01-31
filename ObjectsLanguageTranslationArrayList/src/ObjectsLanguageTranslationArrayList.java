import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsLanguageTranslationArrayList {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> wordPairList = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		System.out.print("Enter an English Word: ");
		String englishWord = input.nextLine();

		if (!"ok".equals(englishWord)) {

			do {
				System.out.print("Enter a Finnish word: ");
				String finnishWord = input.nextLine();
				wordPairList.add(new WordPair(englishWord, finnishWord));
				System.out.println("");
				System.out.print("Enter an English Word: ");
				englishWord = input.nextLine();

			} while (!"ok".equals(englishWord));

		}

		System.out.println("");
		System.out.println("=== English-Finnish translation service (quit ends) ===");
		System.out.print("Enter an English Word: ");
		String userInput = input.nextLine();

		boolean isMatch = false;

		while (!"quit".equals(userInput)) {

			for (WordPair wordPairListObject : wordPairList) {

				if (userInput.equals(wordPairListObject.getEnglishWord())) {

					isMatch = true;

				} else {

					isMatch = false;
				}
				if (isMatch) {

					System.out.println(wordPairListObject.getFinnishWord());
					System.out.println("");
					System.out.print("Enter an English word: ");
					userInput = input.nextLine();

				}

			}
			if (!isMatch) {

				System.out.println("Unknown word");
				System.out.println("");
				System.out.print("Enter an English word: ");
				userInput = input.nextLine();
			}

		}
		System.out.println("");
		System.out.print("Bye!");
		
		input.close();
	}

}
