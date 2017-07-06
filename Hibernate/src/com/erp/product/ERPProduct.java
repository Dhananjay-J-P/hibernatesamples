/**
 * 
 */
package com.erp.product;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dhananjay P
 *
 */
public class ERPProduct {

	/**
	 * 
	 */
	public ERPProduct() {
		// TODO Auto-generated constructor stub
	}

	String id;

	String name;

	String description;

	Double cost;

	String imagePath;
	
	int inventoryCount;
	
	

	/**
	 * @return the inventoryCount
	 */
	public int getInventoryCount() {
		return inventoryCount;
	}



	/**
	 * @param inventoryCount the inventoryCount to set
	 */
	public void setInventoryCount(int inventoryCount) {
		this.inventoryCount = inventoryCount;
	}

	Set<ERPPart> partSet=new HashSet<>();
	
	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param cost
	 * @param imagePath
	 * @param serialNumber
	 * @param requiredPartsMap
	 */
	public ERPProduct( String name, String description, Double cost, String imagePath) {
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.imagePath = imagePath;
	}
	
	

	/**
	 * @return the partSet
	 */
	public Set<ERPPart> getPartSet() {
		return partSet;
	}



	/**
	 * @param partSet the partSet to set
	 */
	public void setPartSet(Set<ERPPart> partSet) {
		this.partSet = partSet;
	}



	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber
	 *            the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	String serialNumber;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the cost
	 */
	public Double getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *            the cost to set
	 */
	public void setCost(Double cost) {
		this.cost = cost;
	}

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath
	 *            the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
