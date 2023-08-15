package org.example.relationship;

import org.example.relationship.entity.Employee;
import org.example.relationship.entity.embeddable.Name;
import org.example.relationship.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PersistDemo {
    public static void main (String[] args){
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session = sessionFactory.openSession();){

            Transaction transaction = session.beginTransaction(); //start transaction

            //Create name object to use Embeddable
            Name name1 = new Name("supun", "chandana","perera");

            Employee employee1 = new Employee(1, name1,"No 8, Kandy Rd, Colombo");

            session.persist(employee1);

            transaction.commit(); //end transaction
        }
    }
}
