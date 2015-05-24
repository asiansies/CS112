/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 03
 * 
 */

import java.util.*;

public class Problem5c {
	
	// Create a random number generator.
	static Random generator = new Random();

	public static void main(String[] args) {
		
		// Initialize an array of 20 words. (This quote is from John 
		// Steinbeck's "Of Mice and Men").
		String[] wordArray = {"I", "remember", "about", "the", "rabbits", "George", "The", "hell", "with", "the", "rabbits", "That's", "all", "you", "can", "ever", "remember", "is", "them", "rabbits"};
		System.out.println(randomWord(wordArray));
	}

	// Randomly selects a word out of an array of 20 words.
	public static String randomWord(String[] arr) {
		String randomWord = arr[generator.nextInt(20)];
		return randomWord;
	}

}
