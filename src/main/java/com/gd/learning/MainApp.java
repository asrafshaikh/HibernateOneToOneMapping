package com.gd.learning;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gd.learning.domain.Transaction;
import com.gd.learning.domain.User;
import com.gd.learning.util.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();

		session.beginTransaction();

		User user = new User();
		Transaction tx = new Transaction();
		tx.setTotal(123.89);
		tx.setDate(new Date());
		user.setUsername("Asraf");
		user.setCreatedBy("DMART");
		user.setEmail("ashrafshaikh785@gmail.com");
		user.setCreatedDate(new Date());
		tx.setuser(user);
		user.setTransaction(tx);
		session.save(user);
		session.getTransaction().commit();
	}

}
