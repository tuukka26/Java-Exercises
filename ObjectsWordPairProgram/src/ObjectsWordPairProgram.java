
public class ObjectsWordPairProgram {

	public static void main(String[] args) {

		WordPair firstWordPair = new WordPair("class", "luokka");
		WordPair secondWordPair = new WordPair("object", "olio");
		WordPair thirdWordPair = new WordPair("variable", "muuttuja");
		
		System.out.println(firstWordPair.getEnglishWord() + " = " + firstWordPair.getFinnishWord());
		System.out.println(secondWordPair.getEnglishWord() + " = " + secondWordPair.getFinnishWord());
		System.out.println(thirdWordPair.getEnglishWord() + " = " + thirdWordPair.getFinnishWord());
	}

}
