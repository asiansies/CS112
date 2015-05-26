/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Lab 01
 * 
 */

public class Lab01Code {
	
	// Initializes the array.
	static String[] wordArray = {"bin", "binal", "binaries", "binary", "binate", "binately","binaural",
	        "bind", "bindable", "binder", ""};
	
	// Method to find a word.
	public static void find(String wordToFind, int first, int upto) {
		System.out.printf("Searching from " + first + " to " + upto + "...\n");
		
		int mid = (first + upto) / 2;
		
		int compareResult = wordToFind.compareToIgnoreCase(wordArray[mid]);
		
		if (compareResult == 0) {
			System.out.printf("Found " + wordToFind + " at position " + mid + "\n");
		} else if (compareResult < 0) {
			find(wordToFind, first, mid - 1);
		} else {
			find(wordToFind, mid + 1, upto);
		}
	}
	
	// Method to return length of array.
	public static int length(String[] array) {
		return array.length;
	}
	
	public static void main(String[] args) {
		find("binary", 0, wordArray.length - 1);
	}
}
