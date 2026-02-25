package exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class AppDriver
{

	public static void main( String[] args )
	{

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

		// Unsorted list
		System.out.println("\nUnsorted List:");
		System.out.println( studs );
		
		// Sort by name
		Collections.sort( studs );
		System.out.println("\nSorted by Name:");
		System.out.println( studs );
		
		// Sort by age
		Collections.sort( studs, new StudentComparator() );
		System.out.println("\nSorted by Age:");
		System.out.println( studs );
	}

}
