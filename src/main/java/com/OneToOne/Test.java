package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Project Started.........");
		
		Configuration cfg=new Configuration();
		cfg.configure("OneToOne.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		
		//Creating questions Object
		Questions q=new Questions();
		
		q.setQuetionId(12121);
		q.setQuestion("What is java?");

		//Creating Answer Object
		Answer a=new Answer();
		
		a.setAnswerId(323);
		a.setAnswer("Java is programming language.");
		q.setAnswer(a);
		
	    Questions q1=new Questions();

		q1.setQuetionId(2658);
		q1.setQuestion("What is collection framework?");
		
		Answer a1=new Answer();
		
		a1.setAnswerId(134);
		a1.setAnswer("its an API to work with Group of objects.");
		q1.setAnswer(a1);
		
		session.save(q);
		session.save(q1);
		session.save(a);
		session.save(a1);
		
		
		tr.commit();
		session.close();
		sessionFactory.close();
		
		System.out.println("Data inserted successfully..............");
	}

}
