/**
 * 
 */
package yolo;

/**
 * @author Dhananjay P
 *
 */
public class TwoWheeler extends Vehicle {
	
	
	String handle;

	/**
	 * @return the handle
	 */
	public String getHandle() {
		return handle;
	}

	/**
	 * @param handle the handle to set
	 */
	public void setHandle(String handle) {
		this.handle = handle;
	}

	
	/**
	 * @param name
	 * @param handle
	 */
	public TwoWheeler(String name, String handle) {
		super(name);
		this.handle = handle;
	}

	/**
	 * 
	 */
	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public TwoWheeler(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	

}
