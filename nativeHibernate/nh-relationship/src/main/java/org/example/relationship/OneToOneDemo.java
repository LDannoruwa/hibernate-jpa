package org.example.relationship;

import org.example.relationship.entity.Passenger;
import org.example.relationship.entity.Passport;
import org.example.relationship.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class OneToOneDemo {
    public static void main (String[] args){
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session = sessionFactory.openSession();){

            Transaction transaction = session.beginTransaction(); //start transaction
			
			Passenger passenger1 = new Passenger(1, "nimal");
			Passport passport1 = new Passport("11", "2023-08-15", passenger1);
			
			session.persist(passenger1);
			session.persist(passport1);
			
            transaction.commit(); //end transaction
        }
    }
}
