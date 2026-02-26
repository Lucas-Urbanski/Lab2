package exercise1;

/**
 * Represents a Student with a name and age.
 * Implements Comparable to allow for sorting based on name.
 */
public class Student implements Comparable<Student>
{
	private String name;
	private int age;
	
	/**
	 * Initializes a new Student instance.
	 * @param name The student's full name
	 * @param age The student's age in years
	 */
	public Student( String name, int age )
	{
		this.name = name;
		this.age = age;
	}
	
	// Getters
	public String getName() { return name; }
	public int getAge() { return age; }
	
	/**
	 * Compares this student to another student lexicographically by name.
	 * @param other The student object to be compared.
	 * @return A negative integer, zero, or a positive integer as this 
	 * student's name is less than, equal to, or greater than the specified student.
	 */
	@Override
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
	}
	
	/**
	 * Returns a string representation of the student.
	 */
	@Override
	public String toString() {
		return name + " " + age;
	}
}
