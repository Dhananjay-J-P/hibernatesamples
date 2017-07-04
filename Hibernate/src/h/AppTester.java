/**
 * 
 */
package h;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

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

		Car c = new Car();
		c.setCarName("Lam");

		session.save(c);

		session.getTransaction().commit();

		session.close();

	}
}
