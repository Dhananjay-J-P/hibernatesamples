/**
 * 
 */
package com.erp.product;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.id.IdentifierGenerator;

/**
 * @author Dhananjay P
 *
 */
public class ERPProductIdGenerator implements IdentifierGenerator {

	/**
	 * 
	 */
	public ERPProductIdGenerator() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.id.IdentifierGenerator#generate(org.hibernate.engine.
	 * SessionImplementor, java.lang.Object)
	 */
	
	/*public Serializable generate(SessionImplementor session, Object object) throws HibernateException {

		String prefix = "P";

		Connection connection = session.connection();

		try {
			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("VALUES NEXT VALUE FOR product_seq");

			if (rs.next()) {
				int id = rs.getInt(1);
				String generatedId = prefix + new Integer(id).toString();
				System.out.println("Generated Id: " + generatedId);
				return generatedId;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
*/
	/* (non-Javadoc)
	 * @see org.hibernate.id.IdentifierGenerator#generate(org.hibernate.engine.spi.SessionImplementor, java.lang.Object)
	 */
	
	public Serializable generate(org.hibernate.engine.spi.SessionImplementor session, Object arg1)
			throws HibernateException {
		// TODO Auto-generated method stub
		String prefix = "P";

		Connection connection = session.connection();

		try {
			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("VALUES NEXT VALUE FOR product_seq");

			if (rs.next()) {
				int id = rs.getInt(1);
				String generatedId = prefix + new Integer(id).toString();
				System.out.println("Generated Id: " + generatedId);
				return generatedId;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
