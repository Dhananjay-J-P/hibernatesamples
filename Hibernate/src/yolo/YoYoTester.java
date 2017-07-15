/**
 * 
 */
package yolo;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 * @author Dhananjay P
 *
 */
public class YoYoTester {

	/**
	 * 
	 */
	public YoYoTester() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		Vehicle v = new Vehicle("Scorpio");
		TwoWheeler t = new TwoWheeler("HONDA", "MOJO");
		CarWheeler c = new CarWheeler("HUNDRI", "JACKSPARRO");

		session.save(v);
		session.save(t);
		session.save(c);

		Criteria cri = session.createCriteria(Vehicle.class);
		cri.add(Example.create(v));
		System.out.println(cri.list());

		session.getTransaction().commit();

		session.close();
		factory.close();

	}

	public void main2(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		Degree d1 = new Degree("BTech");
		Degree d2 = new Degree("BE");
		Degree d3 = new Degree("HSC");
		Degree d4 = new Degree("SSC");

		Address a = new Address("abc");
		Address b = new Address("xyz");

		Person p = new Person("ted", 27, a);
		Person p1 = new Person("robin", 27, b);
		Person p2 = new Person("barney", 27, a);

		p.getDegreeSet().add(d4);
		p.getDegreeSet().add(d3);
		p.getDegreeSet().add(d2);

		d2.getPersons().add(p);
		d3.getPersons().add(p);
		d4.getPersons().add(p);

		p1.getDegreeSet().add(d4);
		p1.getDegreeSet().add(d3);
		p1.getDegreeSet().add(d1);

		d4.getPersons().add(p1);
		d3.getPersons().add(p1);
		d1.getPersons().add(p1);

		a.getPersons().add(p);
		a.getPersons().add(p2);
		b.getPersons().add(p1);

		session.save(p);
		session.save(p1);
		session.save(p2);

		session.getTransaction().commit();

		session.close();

		session = factory.openSession();

		System.out.println(session.get(Address.class, 1));

	}

}
