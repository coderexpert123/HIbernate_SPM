package com.tut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SecureCacheResponse;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
       Configuration configuration=new Configuration();
       configuration.configure("hibernate.cfg.xml");
       SessionFactory sessionFactory=configuration.buildSessionFactory();
       System.out.println(sessionFactory.isClosed());
        		
		    Student student=new Student();
		    student.setId(64);
		    student.setName("Suresh Bhagwat ");
		    student.setCity("GAYA ");
    
    
    //Address class
		    Address address=new Address();
		    
		    //id auto increment
		    address.setCity("Patna");
		    address.setStreet("kakkerbag area");
		    address.setOpena(true);
		    address.setAddeddateDate(new Date(0));
		    address.setX(123.34);
		   			 
		    
    
 
    
    Session currentSession = sessionFactory.openSession();
    
    //Transection Start
    
    Transaction beginTransaction = currentSession.beginTransaction();
    currentSession.save(student);
    currentSession.save(address);
    

    
   beginTransaction.commit();
   System.out.println("Congrats ! Data is insert Succesfully : )");
   currentSession.close();

    
    }
}
