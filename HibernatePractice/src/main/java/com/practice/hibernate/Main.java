package com.practice.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsName("Hime");
        s1.setRollNo(103);
        s1.setsAge(26);

        Configuration cfg = new Configuration().addAnnotatedClass(com.practice.hibernate.Student.class).configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();
        System.out.println(s1);
        session.close();
        sf.close();
    }
}
