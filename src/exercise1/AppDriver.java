package exercise1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Driver class to demonstrate sorting functionality for Student objects.
 * This class tests both the Comparable interface (Natural Order) 
 * and the StudentComparator class (Custom Order).
 */
public class AppDriver
{
	public static void main( String[] args )
	{
		// Initialize the list with sample student data
		ArrayList<Student> studs = new ArrayList<>();
		studs.add( new Student( "Smith", 34 ) );
		studs.add( new Student( "Johnson", 21 ) );
		studs.add( new Student( "Williams", 67 ) );
		studs.add( new Student( "Brown", 53 ) );
		studs.add( new Student( "Jones", 48 ) );
		studs.add( new Student( "Miller", 36 ) );
		studs.add( new Student( "Davis", 44 ) );
		studs.add( new Student( "Wilson", 52 ) );
		studs.add( new Student( "Anderson", 34 ) );
		studs.add( new Student( "Moore", 33 ) );

		// 1. Display the Unsorted list
		System.out.println("\nUnsorted List:");
		System.out.println( studs );
		
		// 2. Sort by name 
		// Uses the Student class's compareTo() method (Natural Ordering)
		Collections.sort( studs );
		System.out.println("\nSorted by Name (Natural Order):");
		System.out.println( studs );
		
		// 3. Sort by age
		// Uses the StudentComparator's compare() method (Primary: Age, Secondary: Name)
		Collections.sort( studs, new StudentComparator() );
		System.out.println("\nSorted by Age (Custom Comparator):");
		System.out.println( studs );
	}
}