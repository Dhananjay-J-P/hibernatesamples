/**
 * 
 */
package com.erp.common;

import java.util.Date;

/**
 * @author Dhananjay P
 *
 */
public interface ERPTimestampIfc {

	public Date getRecordCreatedTime();

	public void setRecordCreatedTime(Date recordCreatedTime);

	public Date getRecordModifiedTime();

	public void setRecordModifiedTime(Date recordModifiedTime);
}
