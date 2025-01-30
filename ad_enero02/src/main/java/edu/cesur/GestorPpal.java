package edu.cesur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GestorPpal {
    // atributos
    protected static EntityManagerFactory emf;
    protected static EntityManager entityManager;

    // constructor
    public GestorPpal() {
        emf = null;
        entityManager = null;
    }

    // metodos
    protected void iniciar() {
        emf = Persistence.createEntityManagerFactory("clientesPU");
        entityManager = emf.createEntityManager();
        
    }

    public void salir() {
        if (entityManager != null) entityManager.close();
        if (emf != null) emf.close();
        
    }
}
