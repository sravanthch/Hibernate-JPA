package com.srahibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

//Data access object - only job is to talk to database
public class AlienDAO {


    public void createAlien(Alien a1) {
        Session session = HibernateUtil.initializeSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(a1);
        tx.commit();
        session.close();
    }

    public Alien getAlien(int id) {
        Session session = HibernateUtil.initializeSessionFactory().openSession();
        Alien alien = session.find(Alien.class, id);
        HibernateUtil.shutDown();
        return alien;
    }

    public void updateAlien(Alien a1) {
        Session session = HibernateUtil.initializeSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.merge(a1);
        tx.commit();
        session.close();

    }

    public void deleteAlien(int id) {
        Session session = HibernateUtil.initializeSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Alien alien = session.find(Alien.class, id);
        if (alien != null) {
            session.remove(alien);
        }
        tx.commit();
        session.close();
    }
}
