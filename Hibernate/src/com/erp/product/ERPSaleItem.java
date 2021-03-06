/**
 * 
 */
package com.erp.product;

import com.erp.common.ERPTimestamp;

/**
 * @author Dhananjay P
 *
 */
public class ERPSaleItem extends ERPTimestamp{

	/**
	 * 
	 */
	public ERPSaleItem() {
		// TODO Auto-generated constructor stub
	}
	
	int id;
	
	ERPProduct item;
	
	int quantity;
	
	double total;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the item
	 */
	public ERPProduct getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(ERPProduct item) {
		this.item = item;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @param item
	 * @param quantity
	 * @param total
	 */
	public ERPSaleItem(ERPProduct item, int quantity, double total) {
		this.item = item;
		this.quantity = quantity;
		this.total = total;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ERPSaleItem [id=" + id + ", item=" + item + ", quantity=" + quantity + ", total=" + total + "]";
	}
	
	

}
