package org.example.relationship;

import org.example.relationship.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AppInitializer {
    public static void main (String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session = sessionFactory.openSession();) {
            System.out.println("--------------------------");
            System.out.println("Session" + session);
        }
    }
}
