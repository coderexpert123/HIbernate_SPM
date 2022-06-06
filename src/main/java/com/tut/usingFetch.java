package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class usingFetch {
public static void main(String[] args) {
	
	  Configuration configuration=new Configuration();
      configuration.configure("hibernate.cfg.xml");
      SessionFactory sessionFactory=configuration.buildSessionFactory();   
      Session openSession = sessionFactory.openSession();
      
      //get method impl
      Student student = (Student)openSession.get(Student.class,64);
      
      System.out.println(student);
      
      
      openSession.load(Student.class, 64);
      System.out.println("Loading : "+student);
      openSession.close();
      sessionFactory.close();
 

}
     
}
