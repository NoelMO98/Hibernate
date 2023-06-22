package org.noelmo.hibernateapp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.noelmo.hibernateapp.entity.Cliente;
import org.noelmo.hibernateapp.util.JpaUtil;

public class HibernateListarWhere {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from Cliente c where c.formaPago=?1", Cliente.class);
        query.setParameter(1,"debito");

        Cliente c = (Cliente) query.getSingleResult();
        System.out.println("c = " + c);

        em.close();

    }
}
