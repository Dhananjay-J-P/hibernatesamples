/**
 * 
 */
package com.erp.common;

import java.util.Date;

/**
 * @author Dhananjay P
 *
 */

public class ERPTimestamp implements ERPTimestampIfc{

	/**
	 * 
	 */
	public ERPTimestamp() {
		// TODO Auto-generated constructor stub
	}
	
	Date recordCreatedTime;
	
	Date recordModifiedTime;
	
	

	/**
	 * @return the recordCreatedTime
	 */
	public Date getRecordCreatedTime() {
		return new Date();
	}

	/**
	 * @param recordCreatedTime the recordCreatedTime to set
	 */
	public void setRecordCreatedTime(Date recordCreatedTime) {
		this.recordCreatedTime = recordCreatedTime;
	}

	/**
	 * @return the recordModifiedTime
	 */
	public Date getRecordModifiedTime() {
		return new Date();
	}

	/**
	 * @param recordModifiedTime the recordModifiedTime to set
	 */
	public void setRecordModifiedTime(Date recordModifiedTime) {
		this.recordModifiedTime = recordModifiedTime;
	}
	
	

}
