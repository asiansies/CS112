/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 04
 * 
 * Note: Output included at the end of this file.
 * 
 */

import java.util.*;

public class Problem1b {
	static String[] cardRanks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	// Runs insertion sorting on a random hand of 8 cards.
	public static void main(String[] args) {		
		String[] hand = deal(8);		
		handSort(hand);
	}

	// Uses a random number generator to deal a hand of 
	// a specified number of cards.
	public static String[] deal(int n) {
		Random generator = new Random();
		String[] hand = new String[n];

		for (int i = 0; i < n; i++) {
			hand[i] = cardRanks[generator.nextInt(cardRanks.length)];
		}
		
		return hand;
	}
	
	// Implements insertion sort. Indices are referred to using 
	// zero-based indexing.
	public static void handSort(String[] arr) {
		System.out.println("UNSORTED HAND: " + Arrays.toString(arr));
		
		if (arr.length == 1) {
			System.out.println("Nothing to be sorted!");
		}

		// Sets pivot for comparison.
		for (int i = 1; i < arr.length; i++) {
			int temp = Arrays.asList(cardRanks).indexOf(arr[i]);
			int j;
			
			System.out.println("Pivot is element " + i + "...");
			
			// Compares pivot with previous element in the array.
			for (j = i - 1; j >= 0 && temp < Arrays.asList(cardRanks).indexOf(arr[j]); j--) {
				System.out.println(cardRanks[temp] + " is less than " + arr[j] + "...");
				arr[j + 1] = arr[j];
				System.out.println("Moving " + arr[j] + " to the right of " + cardRanks[temp] + ": " + Arrays.toString(arr));
			}

			// Set temp.
			arr[j + 1] = cardRanks[temp];
		}
		
		System.out.println();
		System.out.println("SORTED HAND: " + Arrays.toString(arr));
		System.out.println("----------------------------------------");
		System.out.println();
	}
}


/* 
 * OUTPUT OF CODE:
 *
 * RUN #1:
 * 
 * UNSORTED HAND: [10, 4, 4, 4, Queen, 5, 8, King]
 * Pivot is element 1...
 * 4 is less than 10...
 * Moving 10 to the right of 4: [10, 10, 4, 4, Queen, 5, 8, King]
 * Pivot is element 2...
 * 4 is less than 10...
 * Moving 10 to the right of 4: [4, 10, 10, 4, Queen, 5, 8, King]
 * Pivot is element 3...
 * 4 is less than 10...
 * Moving 10 to the right of 4: [4, 4, 10, 10, Queen, 5, 8, King]
 * Pivot is element 4...
 * Pivot is element 5...
 * 5 is less than Queen...
 * Moving Queen to the right of 5: [4, 4, 4, 10, Queen, Queen, 8, King]
 * 5 is less than 10...
 * Moving 10 to the right of 5: [4, 4, 4, 10, 10, Queen, 8, King]
 * Pivot is element 6...
 * 8 is less than Queen...
 * Moving Queen to the right of 8: [4, 4, 4, 5, 10, Queen, Queen, King]
 * 8 is less than 10...
 * Moving 10 to the right of 8: [4, 4, 4, 5, 10, 10, Queen, King]
 * Pivot is element 7...
 * 
 * SORTED HAND: [4, 4, 4, 5, 8, 10, Queen, King]
 * ----------------------------------------
 * 
 *
 * RUN 2:
 *  
 * UNSORTED HAND: [10, King, 10, 9, Jack, Jack, Queen, Ace]
 * Pivot is element 1...
 * Pivot is element 2...
 * 10 is less than King...
 * Moving King to the right of 10: [10, King, King, 9, Jack, Jack, Queen, Ace]
 * Pivot is element 3...
 * 9 is less than King...
 * Moving King to the right of 9: [10, 10, King, King, Jack, Jack, Queen, Ace]
 * 9 is less than 10...
 * Moving 10 to the right of 9: [10, 10, 10, King, Jack, Jack, Queen, Ace]
 * 9 is less than 10...
 * Moving 10 to the right of 9: [10, 10, 10, King, Jack, Jack, Queen, Ace]
 * Pivot is element 4...
 * Jack is less than King...
 * Moving King to the right of Jack: [9, 10, 10, King, King, Jack, Queen, Ace]
 * Pivot is element 5...
 * Jack is less than King...
 * Moving King to the right of Jack: [9, 10, 10, Jack, King, King, Queen, Ace]
 * Pivot is element 6...
 * Queen is less than King...
 * Moving King to the right of Queen: [9, 10, 10, Jack, Jack, King, King, Ace]
 * Pivot is element 7...
 * Ace is less than King...
 * Moving King to the right of Ace: [9, 10, 10, Jack, Jack, Queen, King, King]
 * Ace is less than Queen...
 * Moving Queen to the right of Ace: [9, 10, 10, Jack, Jack, Queen, Queen, King]
 * Ace is less than Jack...
 * Moving Jack to the right of Ace: [9, 10, 10, Jack, Jack, Jack, Queen, King]
 * Ace is less than Jack...
 * Moving Jack to the right of Ace: [9, 10, 10, Jack, Jack, Jack, Queen, King]
 * Ace is less than 10...
 * Moving 10 to the right of Ace: [9, 10, 10, 10, Jack, Jack, Queen, King]
 * Ace is less than 10...
 * Moving 10 to the right of Ace: [9, 10, 10, 10, Jack, Jack, Queen, King]
 * Ace is less than 9...
 * Moving 9 to the right of Ace: [9, 9, 10, 10, Jack, Jack, Queen, King]
 * 
 * SORTED HAND: [Ace, 9, 10, 10, Jack, Jack, Queen, King]
 * ----------------------------------------
 * 
 * 
 * RUN 3
 * 
 * UNSORTED HAND: [10, King, 10, 9, Jack, Jack, Queen, Ace]
 * Pivot is element 1...
 * Pivot is element 2...
 * 10 is less than King...
 * Moving King to the right of 10: [10, King, King, 9, Jack, Jack, Queen, Ace]
 * Pivot is element 3...
 * 9 is less than King...
 * Moving King to the right of 9: [10, 10, King, King, Jack, Jack, Queen, Ace]
 * 9 is less than 10...
 * Moving 10 to the right of 9: [10, 10, 10, King, Jack, Jack, Queen, Ace]
 * 9 is less than 10...
 * Moving 10 to the right of 9: [10, 10, 10, King, Jack, Jack, Queen, Ace]
 * Pivot is element 4...
 * Jack is less than King...
 * Moving King to the right of Jack: [9, 10, 10, King, King, Jack, Queen, Ace]
 * Pivot is element 5...
 * Jack is less than King...
 * Moving King to the right of Jack: [9, 10, 10, Jack, King, King, Queen, Ace]
 * Pivot is element 6...
 * Queen is less than King...
 * Moving King to the right of Queen: [9, 10, 10, Jack, Jack, King, King, Ace]
 * Pivot is element 7...
 * Ace is less than King...
 * Moving King to the right of Ace: [9, 10, 10, Jack, Jack, Queen, King, King]
 * Ace is less than Queen...
 * Moving Queen to the right of Ace: [9, 10, 10, Jack, Jack, Queen, Queen, King]
 * Ace is less than Jack...
 * Moving Jack to the right of Ace: [9, 10, 10, Jack, Jack, Jack, Queen, King]
 * Ace is less than Jack...
 * Moving Jack to the right of Ace: [9, 10, 10, Jack, Jack, Jack, Queen, King]
 * Ace is less than 10...
 * Moving 10 to the right of Ace: [9, 10, 10, 10, Jack, Jack, Queen, King]
 * Ace is less than 10...
 * Moving 10 to the right of Ace: [9, 10, 10, 10, Jack, Jack, Queen, King]
 * Ace is less than 9...
 * Moving 9 to the right of Ace: [9, 9, 10, 10, Jack, Jack, Queen, King]
 * 
 * SORTED HAND: [Ace, 9, 10, 10, Jack, Jack, Queen, King]
 * ----------------------------------------
 *
 */