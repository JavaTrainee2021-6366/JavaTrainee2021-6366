package com.demo.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        
        StudentEntity stu = new StudentEntity();
        
        stu.setCity("Pune");
        stu.setName("Ram");
        
        Certificate cert = new Certificate("Java", "6 month");
        stu.setCerti(cert);
        
       StudentEntity stu2 = new StudentEntity();
        
        stu2.setCity("Pune");
        stu2.setName("Sham");
        
        Certificate cert1 = new Certificate("Hibernate", "2 month");
        stu2.setCerti(cert1);
        
        Session s = factory.openSession();
        org.hibernate.Transaction tx = s.beginTransaction();
        
        //object save
        s.save(stu);
        s.save(stu2);
        
        tx.commit();
        session.close();
       //factory.close();
	}
}
