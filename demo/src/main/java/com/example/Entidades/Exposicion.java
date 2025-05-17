package com.example.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="exposiciones")
public class Exposicion {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String titulo;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="curador_id")
    private Curador curadorAsignado;

    //Constructores
    public Exposicion() {
    }


    public Exposicion(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }


    //Getter and Setters
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Curador getCuradorAsignado() {
        return curadorAsignado;
    }


    public void setCuradorAsignado(Curador curadorAsignado) {
        this.curadorAsignado = curadorAsignado;
    }


}


