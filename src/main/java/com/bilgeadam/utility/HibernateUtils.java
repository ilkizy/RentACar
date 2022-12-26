package com.bilgeadam.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bilgeadam.entity.Address;
import com.bilgeadam.entity.Car;
import com.bilgeadam.entity.Customer;
import com.bilgeadam.entity.Department;
import com.bilgeadam.entity.Employee;
import com.bilgeadam.entity.Rent;

public class HibernateUtils {

	private static final SessionFactory FACTORY = sessionFactoryHibernate();

	private static SessionFactory sessionFactoryHibernate() {
		try {
			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(Address.class);
			configuration.addAnnotatedClass(Car.class);
			configuration.addAnnotatedClass(Customer.class);
			configuration.addAnnotatedClass(Department.class);
			configuration.addAnnotatedClass(Employee.class);
			configuration.addAnnotatedClass(Rent.class);

			SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();

			return factory;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static SessionFactory getFactory() {
		return FACTORY;
	}

}
