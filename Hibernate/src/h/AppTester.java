/**
 * 
 */
package h;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.erp.employee.ERPEmployee;
import com.erp.employee.ERPRole;

/**
 * @author Dhananjay P
 *
 */
public class AppTester {

	/**
	 * 
	 */
	public AppTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.getTransaction().commit();

		session.close();

	}

	public static void testEmployeeRole(Session session) {
		
		ERPEmployee emp = new ERPEmployee("dhananjay", "pass", true);
		ERPEmployee emp2 = new ERPEmployee("jay", "pass", true);

		ERPEmployee emp3 = new ERPEmployee("Jack", "pass", true);

		ERPRole r = new ERPRole("ROLE_ADMIN");
		ERPRole r2 = new ERPRole("ROLE_USER");

		r2.getEmployeeSet().add(emp3);
		emp3.setRole(r2);

		emp.setRole(r);
		emp2.setRole(r);
		r.getEmployeeSet().add(emp);

		session.save(emp);
		session.save(emp2);
		session.save(emp3);

	}
}
