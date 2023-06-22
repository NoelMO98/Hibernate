package org.noelmo.hibernateapp;

import jakarta.persistence.EntityManager;
import org.noelmo.hibernateapp.entity.Cliente;
import org.noelmo.hibernateapp.util.JpaUtil;

import java.util.List;

public class HibernateListar {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();
        List<Cliente> clientes = em.createQuery("select objeto from Cliente objeto", Cliente.class).getResultList();
        //clientes.forEach(c -> System.out.println(c));
        clientes.forEach(System.out::println);
        em.close();



    }
}
