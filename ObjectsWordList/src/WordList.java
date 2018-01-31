
public class WordList implements Comparable<WordList>{

	private String inputWord;
	
	public WordList(String inputWord) {
		
		this.inputWord = inputWord;
	}
	
	public String getInputWord() {
		
		return inputWord;
	}
	
	public int compareTo (WordList anotherWordList) {
		
		 return inputWord.compareTo(anotherWordList.inputWord);
		} 

}

