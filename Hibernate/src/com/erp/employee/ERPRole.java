/**
 * 
 */
package com.erp.employee;

import java.util.HashSet;
import java.util.Set;

import com.erp.common.ERPTimestamp;

/**
 * @author Dhananjay P
 *
 */
public class ERPRole extends ERPTimestamp{

	/**
	 * 
	 */
	public ERPRole() {
		// TODO Auto-generated constructor stub
	}
	
	int roleId;
	
	String roleDesc;
	
	Set<ERPEmployee> employeeSet=new HashSet<>();

	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the roleDesc
	 */
	public String getRoleDesc() {
		return roleDesc;
	}

	/**
	 * @param roleDesc the roleDesc to set
	 */
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	/**
	 * @return the employeeSet
	 */
	public Set<ERPEmployee> getEmployeeSet() {
		return employeeSet;
	}

	/**
	 * @param employeeSet the employeeSet to set
	 */
	public void setEmployeeSet(Set<ERPEmployee> employeeSet) {
		this.employeeSet = employeeSet;
	}

	/**
	 * @param roleDesc
	 * @param employeeSet
	 */
	public ERPRole(String roleDesc) {
		this.roleDesc = roleDesc;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ERPRole [roleId=" + roleId + ", roleDesc=" + roleDesc + "]";
	}
	
	
	

}
