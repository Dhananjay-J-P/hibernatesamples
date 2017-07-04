/**
 * 
 */
package com.erp.employee;

/**
 * @author Dhananjay P
 *
 */
public class ERPEmployee {

	/**
	 * 
	 */
	public ERPEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	int employeeId;
	
	String username;
	
	String password;
	
	boolean enabled;
	
	ERPRole role;

	/**
	 * @param username
	 * @param password
	 * @param enabled
	 */
	public ERPEmployee(String username, String password, boolean enabled) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	
	
	/**
	 * @return the role
	 */
	public ERPRole getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(ERPRole role) {
		this.role = role;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ERPEmployee [employeeId=" + employeeId + ", username=" + username + ", password=" + password
				+ ", enabled=" + enabled + "]";
	}

	
	
}
