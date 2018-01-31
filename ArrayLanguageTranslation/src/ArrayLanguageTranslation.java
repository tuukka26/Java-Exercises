import java.util.Scanner;

public class ArrayLanguageTranslation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] englishWords = { "bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher" };
		String[] finnishWords = { "lintu", "linja-auto", "auto", "kissa", "koira", "koulu", "kiitos", "juna",
				"opettaja" };

		System.out.print("Enter an English word: ");
		String givenWord = input.nextLine();

		boolean isMatch = false;

		for (int i = 0; i < englishWords.length; i++) {

			if (givenWord.equals(englishWords[i])) {

				isMatch = true;
			}

			if (isMatch) {

				System.out.print(finnishWords[i]);
				break;

			}

		}

		if (!isMatch) {
			System.out.print("Unknown word");
		}
		input.close();
	}

}
