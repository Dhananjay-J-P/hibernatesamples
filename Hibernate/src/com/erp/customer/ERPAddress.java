package com.erp.customer;

import com.erp.common.ERPTimestamp;

public class ERPAddress extends ERPTimestamp{
	
	int addressId;
	
	String mainAddress;

	String state;
	
	int pincode;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ERPAddress [addressId=" + addressId + ", mainAddress=" + mainAddress + ", state=" + state + ", pincode="
				+ pincode + "]";
	}

	
	ERPCustomer customer;
	
	
	/**
	 * @return the customer
	 */
	public ERPCustomer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(ERPCustomer customer) {
		this.customer = customer;
	}

	/**
	 * @param addressId
	 * @param mainAddress
	 * @param state
	 * @param pincode
	 */
	public ERPAddress(String mainAddress, String state, int pincode) {
		
		this.mainAddress = mainAddress;
		this.state = state;
		this.pincode = pincode;
	}

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
	 * @return the mainAddress
	 */
	public String getMainAddress() {
		return mainAddress;
	}

	/**
	 * @param mainAddress the mainAddress to set
	 */
	public void setMainAddress(String mainAddress) {
		this.mainAddress = mainAddress;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	
}
