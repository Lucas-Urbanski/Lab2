package exercise2;
import java.util.Random;
import java.util.Scanner;

public class AppDriver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 10;

	public static void main( String[] args )
	{

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		int randnum = rand.nextInt( UPPER_BOUND );
		nums[0] = randnum;

		for( int i = 1; i < SIZE; i++ )
		{
			randnum = rand.nextInt( UPPER_BOUND );
			nums[i] = nums[i - 1] + randnum;
			System.out.println( nums[i] );
		}
		//Scanner is a tool that reads inputs while system.in tells java what inputs you are making
		//I created a scanner object to read inputs from the keyboard
		//A prompt that asks the user to enter a number for search
		//then i store the entered value in target to use in binary search
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to search for: ");
		int target = scanner.nextInt();
		
		//This calls the binary search I added
		//It checks if the index is found
		int result = binarySearch(nums,target);
		System.out.println("Index found:" + result);

	} 
	
	//this method is used to perform a binary search on a sorted array to find a target number and returns it to index
	//if number is not found it'll put a -1
	public static int binarySearch(Integer[] list, int target)
	{
		int low = 0;
		int high = list.length -1;
		
		while (low <= high)
		{
			int mid = low + (high - low) / 2;
			int midValue = list[mid];
			
			if (midValue == target)
			{
				return mid;
			}
			else if (midValue < target)
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		return -1;
	}
	
	

}
