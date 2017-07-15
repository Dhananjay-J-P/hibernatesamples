/**
 * 
 */
package yolo;

/**
 * @author Dhananjay P
 *
 */
public class CarWheeler extends Vehicle {

	String steering;

	/**
	 * @return the steering
	 */
	public String getSteering() {
		return steering;
	}

	/**
	 * @param steering the steering to set
	 */
	public void setSteering(String steering) {
		this.steering = steering;
	}

	/**
	 * @param name
	 * @param steering
	 */
	public CarWheeler(String name, String steering) {
		super(name);
		this.steering = steering;
	}

	/**
	 * 
	 */
	public CarWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public CarWheeler(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
