/**
 * 
 */
package com.erp.constants;

/**
 * @author Dhananjay P
 *
 */
public enum ORDER_STATUS {

	STATUS_PLACED(1), STATUS_STARTED(2), STATUS_CONSTRUCTION(3),

	STATUS_COMPLETED(4), STATUS_PACKAGE(5),

	STATUS_DELIVERED(6);

	private final int status;

	/**
	 * @param text
	 */
	private ORDER_STATUS(final int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return ""+status;
	}

	public int value()
	{
		return status;
	}
}
