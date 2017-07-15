/**
 * 
 */
package h;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.erp.customer.ERPAddress;
import com.erp.customer.ERPCustomer;
import com.erp.employee.ERPEmployee;
import com.erp.employee.ERPRole;
import com.erp.product.ERPPart;
import com.erp.product.ERPProduct;

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

	
		Criteria criteria= session.createCriteria(ERPProduct.class);
		criteria.setProjection(Projections.avg("cost"));
		
		
		List<Double> list= criteria.list();
	
		list.forEach(s-> System.out.println(s));
		
		
		session.close();
		
		
		
		

		
	}

	public static void testProductParts(Session session) {
		ERPPart part = new ERPPart("Motor", 1000.00, "");

		ERPProduct product = new ERPProduct("Electric pump 2x gen", "240 pump second generation", 10000.00, "/images-");

		product.getPartSet().add(part);
		part.getProductsSet().add(product);

		session.save(product);
	}

	public static void testCustomer(Session session) {

		ERPAddress ad = new ERPAddress("VartakNagar", "maharastra", 400606);
		ERPCustomer c = new ERPCustomer("Dhananjay", "Patade", ad, 99300, 45555);

		session.save(c);
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
