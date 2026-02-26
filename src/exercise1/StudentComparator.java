package exercise1;

import java.util.Comparator;

/**
 * Custom comparator for Student objects.
 * Orders students primarily by age (ascending), and then 
 * lexicographically by name if ages are identical.
 */
public class StudentComparator implements Comparator<Student> {
	
	/**
	 * Compares two students for order.
	 * @param s1 the first student to be compared.
	 * @param s2 the second student to be compared.
	 * @return a negative integer, zero, or a positive integer as the
	 * first student is less than, equal to, or greater than the second.
	 */
	@Override
	public int compare(Student s1, Student s2) {
		// Primary sort: Age
		int ageCompare = Integer.compare(s1.getAge(), s2.getAge());
		
		// Secondary sort: Name (used when ages are equal)
		if (ageCompare == 0) {
			return s1.getName().compareTo(s2.getName());
		}
		
		return ageCompare;
	}
}