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
public class Address {

	/**
	 * 
	 */
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param detail
	 */
	public Address(String detail) {
		this.detail = detail;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", detail=" + detail + "]";
	}

	Set<Person> persons=new HashSet<>();
	
	

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

	int addressId;
	
	String detail;

	/**
	 * @return the addressId
	 */
	public int getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	

}
