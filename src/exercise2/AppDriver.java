package exercise2;

import java.util.Random;
import java.util.Scanner;

/**
 * Driver class to demonstrate Binary Search.
 * Generates a sorted array of integers and allows the user to search for a target value.
 */
public class AppDriver
{
	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 10;

	public static void main( String[] args )
	{
		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		
		// Initialize the first element
		int randnum = rand.nextInt( UPPER_BOUND );
		nums[0] = randnum;

		// Populate the array with increasing values to ensure it is sorted
		for( int i = 1; i < SIZE; i++ )
		{
			randnum = rand.nextInt( UPPER_BOUND );
			nums[i] = nums[i - 1] + randnum;
			System.out.println( "Index " + i + ": " + nums[i] );
		}

		// Set up Scanner for user input
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter a number to search for: ");
		int target = scanner.nextInt();
		
		// Perform binary search and output the result
		int result = binarySearch(nums, target);
		
		if(result == -1) {
			System.out.println("Target not found in the array.");
		}
		else {
			System.out.println("Target found at index: " + result);
		}
		
		scanner.close();
	} 
	
	/**
	 * Performs a binary search on a sorted array of Integers.
	 * * @param list The sorted array to search through.
	 * @param target The value to find.
	 * @return The index of the target if found; otherwise -1.
	 */
	public static int binarySearch(Integer[] list, int target)
	{
		int low = 0;
		int high = list.length - 1;
		
		
		
		while (low <= high)
		{
			// Calculate midpoint; using this formula avoids potential integer overflow
			int mid = low + (high - low) / 2;
			int midValue = list[mid];
			
			if (midValue == target)
			{
				return mid; // Target found
			}
			else if (midValue < target)
			{
				low = mid + 1; // Search the right half
			}
			else
			{
				high = mid - 1; // Search the left half
			}
		}
		return -1; // Target not found
	}
}