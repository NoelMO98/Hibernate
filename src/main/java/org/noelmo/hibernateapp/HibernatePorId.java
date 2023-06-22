package org.noelmo.hibernateapp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.noelmo.hibernateapp.entity.Cliente;
import org.noelmo.hibernateapp.util.JpaUtil;

public class HibernatePorId {
    public static void main(String[] args) {

        //Primera forma
        /*
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from Cliente c where c.id=?1", Cliente.class);
        query.setParameter(1,1L);

        Cliente c = (Cliente) query.getSingleResult();
        System.out.println("c = " + c);

        em.close();
        */

        //Segunda forma
        EntityManager em = JpaUtil.getEntityManager();
        Cliente c = em.find(Cliente.class,2L);
        System.out.println("c = " + c);

        em.close();

    }
}
