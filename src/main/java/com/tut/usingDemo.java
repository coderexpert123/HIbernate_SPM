package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class usingDemo {
	
	public static void main(String[] args) {
		
		  Configuration configuration=new Configuration();
	      configuration.configure("hibernate.cfg.xml");
	      SessionFactory sessionFactory=configuration.buildSessionFactory();   
	      
	      Student student2=new Student();
	      student2.setId(100);
	      student2.setName("Kushi");
	      student2.setCity("Kunauli");
	      
	      Certificate certificate=new Certificate();
	      certificate.setCourse(11);
	      certificate.setDuration(10);
	      
	      student2.setCertificate(certificate);
	      Session openSession = sessionFactory.openSession();

	      Transaction beginTransaction = openSession.beginTransaction();
	      
	      openSession.save(student2);
	      
	      beginTransaction.commit();
	      openSession.close();
	      sessionFactory.close();
	      
	}
	

}
