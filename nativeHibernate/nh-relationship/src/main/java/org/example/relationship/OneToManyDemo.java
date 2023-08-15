package org.example.relationship;

import org.example.relationship.entity.Owner;
import org.example.relationship.entity.Pet;
import org.example.relationship.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class OneToManyDemo {
    public static void main (String[] args){
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session = sessionFactory.openSession();){

            Transaction transaction = session.beginTransaction(); //start transaction
			
			Owner owner1 = new Owner(1, "saman");
			Pet pet1 = new Pet(1, "Dog", owner1 );
			Pet pet2 = new Pet(2, "Cat", owner1 );
			
			owner1.getPetList().add(pet1);
			owner1.getPetList().add(pet2);
			
			session.persist(owner1);
			
			session.persist(pet1);
			session.persist(pet2);
			
            transaction.commit(); //end transaction
        }
    }
}
