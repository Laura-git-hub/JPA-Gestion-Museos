package com.example;

import java.util.Arrays;

import com.example.Entidades.Curador;
import com.example.Entidades.Exposicion;
import com.example.Entidades.Sede;

import jakarta.persistence.EntityManager;

public class InsertarDatos {

    public static void insertarDatos(EntityManager em) {
        try {
            //Objeto curador
            Curador curador1 = new Curador("Sara","A10");
            Curador curador2 = new Curador("Amaia","B11");
            Curador curador3 = new Curador("Sam","C15");

            //Objeto sede
            Sede sede1 = new Sede("Madrid", 550);
            sede1.setCuradorAsignado(curador1);
            curador1.setSede(sede1);

            Sede sede2 = new Sede("Madrid", 50);
            sede2.setCuradorAsignado(curador2);
            curador2.setSede(sede2);


            //Obejto Exposicion
            Exposicion expsocion1 = new Exposicion("Dali", "Arte Abstracto");
            expsocion1.setCuradorAsignado(curador1);

            Exposicion exposicion2 = new Exposicion("Picasso", "Arte Surrealista");
            exposicion2.setCuradorAsignado(curador1);

            Exposicion exposicion3 = new Exposicion("Monet", "Arte Contemporáneo y Surrealista");
            exposicion3.setCuradorAsignado(curador1);

            //Este setListaExposiciones es de la listaExposiciones en la entidad Curador.
            curador1.setListaExposiciones(Arrays.asList(expsocion1,exposicion2,exposicion3));

            //Acuerdate  de persistir
            em.persist(curador1);
            em.persist(curador2);
            em.persist(curador3);

            System.out.println("DATOS INSERTADOS CORRECTAMENTE");

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
