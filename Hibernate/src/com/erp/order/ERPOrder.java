/**
 * 
 */
package com.erp.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.erp.common.ERPTimestamp;
import com.erp.customer.ERPCustomer;
import com.erp.payment.ERPPayment;
import com.erp.product.ERPSaleItem;

/**
 * @author Dhananjay P
 *
 */
public class ERPOrder extends ERPTimestamp{

	/**
	 * 
	 */
	public ERPOrder() {
		// TODO Auto-generated constructor stub

	}

	String orderId;

	Date orderDate;

	Date orderCompletedDate;

	int status;

	ERPCustomer customer;

	List<ERPSaleItem> productList = new ArrayList<>();

	// Id of employee who placed order
	String employeeId;

	List<ERPPayment> tenderList = new ArrayList<>();

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the orderCompletedDate
	 */
	public Date getOrderCompletedDate() {
		return orderCompletedDate;
	}

	/**
	 * @param orderCompletedDate the orderCompletedDate to set
	 */
	public void setOrderCompletedDate(Date orderCompletedDate) {
		this.orderCompletedDate = orderCompletedDate;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

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
	 * @return the productList
	 */
	public List<ERPSaleItem> getProductList() {
		return productList;
	}

	/**
	 * @param productList the productList to set
	 */
	public void setProductList(List<ERPSaleItem> productList) {
		this.productList = productList;
	}

	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the tenderList
	 */
	public List<ERPPayment> getTenderList() {
		return tenderList;
	}

	/**
	 * @param tenderList the tenderList to set
	 */
	public void setTenderList(List<ERPPayment> tenderList) {
		this.tenderList = tenderList;
	}

	/**
	 * @param orderDate
	 * @param status
	 * @param customer
	 * @param employeeId
	 */
	public ERPOrder(Date orderDate, int status, ERPCustomer customer, String employeeId) {
		this.orderDate = orderDate;
		this.status = status;
		this.customer = customer;
		this.employeeId = employeeId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ERPOrder [orderId=" + orderId + ", orderDate=" + orderDate + ", orderCompletedDate="
				+ orderCompletedDate + ", status=" + status + ", customer=" + customer + ", employeeId=" + employeeId
				+ "]";
	}

	
	
	
}
