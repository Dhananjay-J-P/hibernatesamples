package com.erp.customer;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ERPCustomerIdGenerator implements IdentifierGenerator
{

	/* (non-Javadoc)
	 * @see org.hibernate.id.IdentifierGenerator#generate(org.hibernate.engine.SessionImplementor, java.lang.Object)
	 */
	@Override
	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		
		String prefix="C";
		
		Connection connection = session.connection();
		
		
		
		 try {
	            Statement statement=connection.createStatement();

	            ResultSet rs=statement.executeQuery("VALUES NEXT VALUE FOR customers_seq");

	            if(rs.next())
	            {
	                int id=rs.getInt(1);
	                prefix+=new SimpleDateFormat("yyMMdd").format(new Date());
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
