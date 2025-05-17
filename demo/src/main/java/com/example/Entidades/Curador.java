package com.example.Entidades;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="curadores")

public class Curador {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String numeroEmpleado;
    
    @OneToOne (mappedBy = "curadorAsignado", cascade = CascadeType.ALL)
    private Sede sede;

    @OneToMany(mappedBy = "curadorAsignado", cascade = CascadeType.ALL)
    private List<Exposicion> listaExposiciones;

    //Constructores
    public Curador(String nombre, String numeroEmpleado) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
    }

    public Curador() {
    }

    //Getter and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public List<Exposicion> getListaExposiciones() {
        return listaExposiciones;
    }

    public void setListaExposiciones(List<Exposicion> listaExposiciones) {
        this.listaExposiciones = listaExposiciones;
    }

    
    
    
    


}
