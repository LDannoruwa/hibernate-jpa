package org.example.crud;

import org.example.crud.entity.Item;
import org.example.crud.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SaveDemo {
    public static void main (String[] args){
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session = sessionFactory.openSession();){

            Transaction transaction = session.beginTransaction(); //start transaction
            Item item1 = new Item(1, "dhal", 150);
            session.persist(item1);

            transaction.commit(); //end transaction
        }
    }
}
