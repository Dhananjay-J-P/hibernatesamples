/**
 * 
 */
package com.erp.payment;

import java.util.Date;

import com.erp.common.ERPTimestamp;

/**
 * @author Dhananjay P
 *
 */
public class ERPPayment extends ERPTimestamp {

	/**
	 * 
	 */
	public ERPPayment() {
		// TODO Auto-generated constructor stub
	}
	
	int paymentId;
	
	String paymentType;
	
	int paymentAcceptedBy;
	
	Date paymentDate;

	/**
	 * @param paymentType
	 * @param paymentAcceptedBy
	 * @param paymentDate
	 */
	public ERPPayment(String paymentType, int paymentAcceptedBy, Date paymentDate) {
		this.paymentType = paymentType;
		this.paymentAcceptedBy = paymentAcceptedBy;
		this.paymentDate = paymentDate;
	}

	/**
	 * @return the paymentId
	 */
	public int getPaymentId() {
		return paymentId;
	}

	/**
	 * @param paymentId the paymentId to set
	 */
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * @return the paymentAcceptedBy
	 */
	public int getPaymentAcceptedBy() {
		return paymentAcceptedBy;
	}

	/**
	 * @param paymentAcceptedBy the paymentAcceptedBy to set
	 */
	public void setPaymentAcceptedBy(int paymentAcceptedBy) {
		this.paymentAcceptedBy = paymentAcceptedBy;
	}

	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ERPPayment [paymentId=" + paymentId + ", paymentType=" + paymentType + ", paymentAcceptedBy="
				+ paymentAcceptedBy + ", paymentDate=" + paymentDate + "]";
	}
	
	
	
	

}
