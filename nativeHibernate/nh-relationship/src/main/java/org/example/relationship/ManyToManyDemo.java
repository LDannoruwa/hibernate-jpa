package org.example.relationship;

import org.example.relationship.entity.Lecturer;
import org.example.relationship.entity.Module;
import org.example.relationship.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ManyToManyDemo {
    public static void main (String[] args){
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session = sessionFactory.openSession();){

            Transaction transaction = session.beginTransaction(); //start transaction

			Lecturer lecturer1 = new Lecturer(3, "Ajantha");   //prf, orm
			Lecturer lecturer2 = new Lecturer(4, "Perera");       //dbm, orm

			Module module1 = new Module("ITS-004", "Programming Fundamentals");
			Module module2 = new Module("ITS-005", "Database Management Systems");
			Module module3 = new Module("ITS-006", "Object Relational Mapping");

			//-----
			lecturer1.getModuleList().add(module1);
			lecturer1.getModuleList().add(module3);

			lecturer2.getModuleList().add(module2);
			lecturer2.getModuleList().add(module3);
			//-----

			//-----
			module1.getLecturerList().add(lecturer1);
			module2.getLecturerList().add(lecturer2);
			module3.getLecturerList().add(lecturer1);
			module3.getLecturerList().add(lecturer2);
			//-----

			session.persist(lecturer1);
			session.persist(lecturer2);

			session.persist(module1);
			session.persist(module2);
			session.persist(module3);

			transaction.commit(); //end transaction
        }
    }
}
