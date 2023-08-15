package org.example.crud;

import org.example.crud.entity.Item;
import org.example.crud.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateDemoTwo {
    public static void main (String[] args){
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session = sessionFactory.openSession();){

            Transaction transaction = session.beginTransaction(); //start transaction
			
			Item item1 = new Item(5, "Rice", 1040);
			Item updatedItem = session.merge(item1);
			System.out.println("Updated item: " +updatedItem);
            transaction.commit(); //end transaction
        }
    }
}
