package com.demo.HibernateProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project started!" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();  
        Session session = factory.getCurrentSession();
        System.out.println(factory.isClosed());
        
        //creating students
        
      // StudentEntity st = new StudentEntity("shweta","karad");
      // System.out.println(st);
      // session.beginTransaction();
      // session.save(st);
      // session.getTransaction().commit();
      // session.close();
        
        
        //Reading Image
        // FileInputStream fis = new FileInputStream("src/main/java/logo.png");
        //byte[] data = new byte [fis.available()];
        //fis.read(data);


        //creating class of Address
         Address add = new Address();
         //add.setImage(data);
         add.setCity("Vijaynager");
         add.setHouseNo(23.33);
         add.setOpen(true);
         add.setStreet("SB Nager");
         add.setAdd_date(new Date());
         session.beginTransaction();
         session.save(add);
     }
}
