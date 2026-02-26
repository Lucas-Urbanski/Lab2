package exercise3;

import java.util.Random;

/**
 * Driver class for Exercise 3.
 * Generates an array of random integers, displays them, 
 * sorts them using Selection Sort, and displays the result.
 */
public class AppDriver
{
	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 1000;

	public static void main( String[] args )
	{
		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		
		// 1. Generate and display the unsorted data
		System.out.println("	 Unsorted Array");
		for( int i = 0; i < SIZE; i++ )
		{
			nums[i] = rand.nextInt( UPPER_BOUND );
			System.out.print( nums[i] + " " );
			
			// add a newline every 10 numbers for readability
			if ((i + 1) % 10 == 0) System.out.println();
		}
		
		// 2. Execute the Selection Sort algorithm
		SelectionSort.sort(nums);
		
		// 3. Display the sorted results
		System.out.println("\n  Sorted Array (Selection Sort)");
		int count = 0;
		for (int n : nums) {
			System.out.print( n + " ");
			count++;
			if (count % 10 == 0) System.out.println();
		}
	}
}
