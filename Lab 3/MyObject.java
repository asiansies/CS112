/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Lab 03
 * 
 * Note: Table and Part E included at the end of this file.
 * 
 */

import java.util.*;

public class MyObject {
	static StopWatch SW = new StopWatch();
	static double[] doubles = new double[1000];

	public static void main(String[] args) {
		MyObject[] objects = new MyObject[5000];

		for (int i = 0; i < 5000; i++) {
			objects[i] = new MyObject(i);
		}
	
		// Copy elements of the arrays.
		SW.start();
		for (int i = 0; i < 2499; i++) {
			MyObject temp = new MyObject(0.0);
			temp.CopyData(objects[i]);
			objects[i].CopyData(objects[4999 - i]);
			objects[4999 - i].CopyData(temp);
		}
		SW.stop();
		System.out.println("Elapsed time: " + SW.getElapsedTime() + " milliseconds.");
		
		// Swap pointers of the arrays.
		SW.start();
		for (int i = 0; i < 2499; i++) {
			MyObject temp = objects[i];
			objects[i] = objects[4999 - i];
			objects[4999 - i] = temp;
		}
		SW.stop();
		System.out.println("Elapsed time: " + SW.getElapsedTime() + " milliseconds.");
	}

	// Constructor.
	public MyObject(double value) {
		Arrays.fill(doubles, value);
	}

	// Method to copy data from source array.
	public static void CopyData(MyObject sourceObject) {
		doubles = Arrays.copyOf(sourceObject.doubles, sourceObject.doubles.length);
	}
}


/*
 * --------------------------------------------
 *                 TABLE
 * --------------------------------------------
 *    RUN #  |  COPY ARRAY  |  SWAP POINTERS
 *     1     |     38 ms    |      0 ms
 *     2     |     34 ms    |      0 ms
 *     3     |     38 ms    |      0 ms
 *     4     |     30 ms    |      0 ms
 *     5     |     33 ms    |      0 ms
 * --------------------------------------------
 * AVERAGES:      34.6 ms          0 ms
 * -------------------------------------------- 
 * 
 * Part e.
 * The runtime in (c) is much greater than that of (d). Copying
 * arrays takes time because you need to allocate space in order
 * to continue make temporary arrays and the process of copying
 * over 1000 arrays on its own takes up some time.
 * 
 * When you copy an array, you need to copy each element into the 
 * new array.
 * 
 * When you swap the pointers, you only need to run through
 * half as many iterations.
 * 
 */
