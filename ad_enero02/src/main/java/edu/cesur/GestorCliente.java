package edu.cesur;

import java.util.Date;
import java.util.List;

public class GestorCliente {
    // CRUD

    public void create(String nombre, String apellido1, String apellido2, String comercialPrincipal, int idEmpresa) {

        Cliente nuevoCliente = new Cliente(nombre, apellido1, apellido2, comercialPrincipal, idEmpresa);

        GestorPpal.entityManager.getTransaction().begin();

        GestorPpal.entityManager.persist(nuevoCliente);

        GestorPpal.entityManager.getTransaction().commit();
    }

    public Cliente read(Long id){
        return GestorPpal.entityManager.find(Cliente.class, id);
        
    }

    public void update(Long id,String nombre, String apellido1, String apellido2, String comercialPrincipal, Integer idEmpresa, Date visita){
        Cliente miCliente = GestorPpal.entityManager.find(Cliente.class, id);

        if (nombre != null) miCliente.setNombre(nombre);
        if (apellido1 != null) miCliente.setApellido1(apellido1);
        if (apellido2 != null) miCliente.setApellido2(apellido2);
        if (comercialPrincipal != null) miCliente.setComercialPrincipal(comercialPrincipal);
        if (idEmpresa != null) miCliente.setIdEmpresa(idEmpresa);
        if (visita != null) miCliente.insertarVisita(visita);

        GestorPpal.entityManager.getTransaction().begin();
        GestorPpal.entityManager.merge(miCliente);
        GestorPpal.entityManager.getTransaction().commit();
    }

    public void delete(Long id){
        GestorPpal.entityManager.getTransaction().begin();
        GestorPpal.entityManager.remove(GestorPpal.entityManager.find(Cliente.class, id));
        GestorPpal.entityManager.getTransaction().commit();
    }

    public List<Cliente> readAll(){
        return GestorPpal.entityManager.createQuery("SELECT c FROM Cliente c", 
        Cliente.class).getResultList();
    }

}
