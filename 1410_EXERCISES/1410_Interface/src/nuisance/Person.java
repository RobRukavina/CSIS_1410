package nuisance;

import java.util.Objects;

/**
 * Represents a Person object
 *
 * @author Rob R.
 */
public class Person {
	private String name;
	private int age;
	/**
	 * Constructs a Person object
	 * 
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		if(age < 1 || age > 150) {
			throw new IllegalArgumentException("Age must be between 1 and 150");
		}
		
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
}
