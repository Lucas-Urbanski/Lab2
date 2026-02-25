package exercise1;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	
	@Override
	public int compare(Student s1, Student s2) {
		int ageCompare = Integer.compare(s1.getAge(), s2.getAge());
		
		// sort by name when the ages are equle
		if (ageCompare == 0) {
			return s1.getName().compareTo(s2.getName());
		}
		
		return ageCompare;
	}
}
