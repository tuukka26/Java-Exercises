import java.util.Scanner;

public class ObjectsLanguageTranslationArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		WordPair[] wordPairs = new WordPair[5];
		wordPairs[0] = new WordPair("bird", "lintu");
		wordPairs[1] = new WordPair("bus", "linja-auto");
		wordPairs[2] = new WordPair("car", "auto");
		wordPairs[3] = new WordPair("cat", "kissa");
		wordPairs[4] = new WordPair("dog", "koira");

		System.out.print("Enter an English word: ");
		String englishWord = input.nextLine();

		boolean isMatch = false;

		for (WordPair wordPairsObject : wordPairs) {

			if (englishWord.equals(wordPairsObject.getEnglishWord())) {

				isMatch = true;

			}
			if (isMatch) {

				System.out.println(wordPairsObject.getFinnishWord());
				break;
			}

		}
		if (!isMatch) {

			System.out.println("Unknown word");
		}

		input.close();
	}
}
