package com.io.hibernatemaven;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();

		UserDetails user=new UserDetails();
		user.setUserName("first user");

		Vehicle vehicle1=new Vehicle();
		vehicle1.setVehicleName("car");

		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehicleName("bus");

		user.getVehicles_list().add(vehicle1);
		user.getVehicles_list().add(vehicle2);

		session.save(user);
		session.save(vehicle1);
		session.save(vehicle2);
		session.getTransaction().commit();

		session.close();
	}

}
