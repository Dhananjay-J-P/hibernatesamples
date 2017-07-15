/**
 * 
 */
package yolo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dhananjay P
 *
 */
public class Degree {
	
	public Degree()
	{
		
	}

	int degreeId;
	
	String name;
	
	Set<Person> persons=new HashSet<>();

	/**
	 * @param name
	 */
	public Degree(String name) {
		this.name = name;
	}

	/**
	 * @return the degreeId
	 */
	public int getDegreeId() {
		return degreeId;
	}

	/**
	 * @param degreeId the degreeId to set
	 */
	public void setDegreeId(int degreeId) {
		this.degreeId = degreeId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the persons
	 */
	public Set<Person> getPersons() {
		return persons;
	}

	/**
	 * @param persons the persons to set
	 */
	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}

	/**
	 * @param name
	 * @param persons
	 */
	public Degree(String name, Set<Person> persons) {
		this.name = name;
		this.persons = persons;
	}
	
	
	
}
