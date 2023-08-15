package org.example.nh;

import org.example.nh.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AppInitializer {
    public static void main (String[] args){
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session = sessionFactory.openSession();){
            System.out.println("--------------------------");
            System.out.println("Session" + session);
        }
        /*
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        System.out.println("--------------------------");
        System.out.println("Session" + session);

        session.close();
        sessionFactory.close();*/
    }
}
