package org.example.crud;

import org.example.crud.entity.Item;
import org.example.crud.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteDemo {
    public static void main (String[] args){
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session = sessionFactory.openSession();){

            Transaction transaction = session.beginTransaction(); //start transaction
			
			Item findItem1 = session.find(Item.class, 5);
		    session.remove(findItem1);

            transaction.commit(); //end transaction
        }
    }
}
