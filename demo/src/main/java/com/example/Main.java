package com.example;

import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        try {
            //INICIAR TRASACCION
            em.getTransaction().begin();

            //INSERTAR DATOS
            System.out.println("INSERTANDO DATOS...");
            InsertarDatos.insertarDatos(em);

            //CONFIRMAR TRANSACCION
            em.getTransaction().commit();

            //EJECUTAR CONSULTAS
            System.out.println("EJECUTANDO LOS DATOS");
            EjecutarDatos.ejecutarDatos(em);


        } catch (Exception e) {
            if(em.getTransaction().isActive())

            {em.getTransaction().rollback();}

            e.printStackTrace();

        }finally{
            emf.close();
            em.close();
        }
        
    }
}