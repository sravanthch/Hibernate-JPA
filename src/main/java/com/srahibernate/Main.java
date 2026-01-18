package com.srahibernate;

public class Main {

    public static void main(String[] args) {

        AlienDAO dao = new AlienDAO();

        // CREATE
        Alien a1 = new Alien();
        a1.setAid(104);
        a1.setAname("Sai");
        a1.setTech("Databases");
        dao.createAlien(a1);

        // READ
        Alien alien = dao.getAlien(104);
        System.out.println(alien);

        // UPDATE
        alien.setTech("Spring Boot");
        dao.updateAlien(alien);

        // DELETE
        dao.deleteAlien(104);

        HibernateUtil.shutDown();
    }
}
