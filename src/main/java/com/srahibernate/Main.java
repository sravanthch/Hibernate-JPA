package com.srahibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Alien a1 = new Alien();
        a1.setAid(103);
        a1.setAname("Harsh");
        a1.setTech("Gen AI");

//        Configuration config = new Configuration();
//        config.configure("hibernate.cfg.xml");
//        config.addAnnotatedClass(Alien.class);

        SessionFactory factory = new Configuration().
                                 addAnnotatedClass(Alien.class).
                                 configure(). //if XML file name is different use it as argument
                                 buildSessionFactory();
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        transaction.commit();

        session.close();
        factory.close();
    }
}
