/**
 * 
 */
package h;

/**
 * @author Dhananjay P
 *
 */
public class Car {

	/**
	 * 
	 */
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	int carId;
	
	String carName;

	/**
	 * @return the carId
	 */
	public int getCarId() {
		return carId;
	}

	/**
	 * @param carId the carId to set
	 */
	public void setCarId(int carId) {
		this.carId = carId;
	}

	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}

	/**
	 * @param carName the carName to set
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + "]";
	}

	/**
	 * @param carId
	 * @param carName
	 */
	public Car(int carId, String carName) {
		this.carId = carId;
		this.carName = carName;
	}
	
	

}
