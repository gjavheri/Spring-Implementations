package org.gsssoft.springframework.HibernateImplementation;

import java.util.HashSet;
import java.util.Set;

import org.gsssoft.springframework.HibernateImplementation.entities.ContactNumber;
import org.gsssoft.springframework.HibernateImplementation.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sesfactory=new Configuration().configure().buildSessionFactory();
       Set<ContactNumber> cnumbers=new HashSet<ContactNumber>();
       ContactNumber cn=new ContactNumber(1,"92322392");
       cnumbers.add(cn);
       cn=new ContactNumber(2,"92322392");
       cnumbers.add(cn);
             
       Employee e=new Employee(1,"Gaurav","software engineer",cnumbers);
       Session ses=sesfactory.openSession();
       ses.beginTransaction();
       ses.persist(e);
       ses.getTransaction().commit();
       ses.close();
       
    }
}
