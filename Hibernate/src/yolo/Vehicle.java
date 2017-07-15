/**
 * 
 */
package yolo;

/**
 * @author Dhananjay P
 *
 */
public class Vehicle {

	int id;

	String name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	

	/**
	 * @param name
	 */
	public Vehicle(String name) {
		this.name = name;
	}



	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + "]";
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 */
	public Vehicle() {
	}

}
