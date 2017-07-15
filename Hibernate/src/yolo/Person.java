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
public class Person {

	/**
	 * 
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}

	Set<Degree> degreeSet=new HashSet<>();
	
	

	/**
	 * @return the degreeSet
	 */
	public Set<Degree> getDegreeSet() {
		return degreeSet;
	}



	/**
	 * @param degreeSet the degreeSet to set
	 */
	public void setDegreeSet(Set<Degree> degreeSet) {
		this.degreeSet = degreeSet;
	}

	int personId;

	String name;

	int age;
	
	
	Address address;
	
	
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the personId
	 */


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}



	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * @param string
	 * @param i
	 * @param a
	 */
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address=address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	/**
	 * @param personId
	 */
	public Person(int personId) {
		this.personId = personId;
	}
	
	

}
