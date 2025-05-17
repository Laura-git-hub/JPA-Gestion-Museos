package com.example;

import java.util.List;
import com.example.Entidades.Curador;
import com.example.Entidades.Exposicion;
import com.example.Entidades.Sede;

import jakarta.persistence.EntityManager;

public class EjecutarDatos {

    public static void ejecutarDatos(EntityManager em) {

        //1. Mostrar el nombre de todos los curadores que no tienen exposiciones asignadas.//
        List<Curador>queryListaCurador = em.createQuery("SELECT c FROM Curador c WHERE c.listaExposiciones IS EMPTY", Curador.class).getResultList();       
            System.out.println("DATOS DE LOS CURADORES SIN EXPOSICIONES");
            for (Curador cur : queryListaCurador) {
                System.out.println("NOMBRE DEL CURADOR: " + cur.getNombre());
            } 

            

        //2. Mostrar el título y la descripción de todas las exposiciones organizadas por curadores cuya sede tenga capacidad mayor a 500.
        List<Exposicion>queryExposicionesLista = em.createQuery("SELECT e FROM Exposicion e WHERE e.curadorAsignado.sede.capacidad > 500", Exposicion.class).getResultList(); 
            System.out.println("DATOS DE LAS EXPOSICIONES ORGANIZADAS POR CURADORES CUYA SEDE TENGA CAPACIDAD > 500:");
            for (Exposicion i : queryExposicionesLista) {
                System.out.println("TITULO: " + i.getTitulo() +
                "\nDESCRIPCION: " + i.getDescripcion());
            }

            /*  List<Exposicion>exposicionesLista = em.createQuery("SELECT e FROM Exposicion e JOIN e.curadorAsignado c JOIN c.sede s WHERE s.capacidad > 500", Exposicion.class).getResultList(); 
            System.out.println("DATOS DE LAS EXPOSICIONES ORGANIZADAS POR CURADORES CUYA SEDE TENGA CAPACIDAD > 500:");
            for (Exposicion i : exposicionesLista) {
                System.out.println("TITULO: " + i.getTitulo() +
                "\nDESCRIPCION: " + i.getDescripcion());
            } */


        //3. Mostrar el nombre del curador y la dirección de su sede si la capacidad de la sede es menor a 100.//
        List<Curador>queryCuradorSede = em.createQuery(
            "SELECT c FROM Curador c WHERE c.sede.capacidad < 100", Curador.class).getResultList();
            System.out.println("DATOS DEL CURADOR Y LA DIRECCION DE SU SEDE SI ES < A 100");
            for (Curador curadorSede : queryCuradorSede) {
                System.out.println("NOMBRE DEL CURADOR: " + curadorSede.getNombre() +
                "\nDIRECCION DE SU SEDE: " + curadorSede.getSede().getCapacidad());
            
            /*List<Curador>queryCuradorSede = em.createQuery(
            "SELECT c FROM Curador c JOIN c.sede s WHERE s.capacidad < 100", Curador.class).getResultList();
                System.out.println("DATOS DEL CURADOR Y LA DIRECCION DE SU SEDE SI ES < A 100");
                for (Curador cura : queryCuradorSede) {
                    System.out.println("NOMBRE DEL CURADOR: " + cura.getNombreCurador());
                }*/
                    
                }
            }

    }

