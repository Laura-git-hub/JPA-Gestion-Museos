package com.example.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sedes")
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String direccion;
    private int capacidad;

    @OneToOne
    @JoinColumn(name="curador_id")
    private Curador curadorAsignado;

  //Constructores
    public Sede() {
    }
    public Sede(String direccion, int capacidad) {
        this.direccion = direccion;
        this.capacidad = capacidad;
    }

    //Getter and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public Curador getCuradorAsignado() {
        return curadorAsignado;
    }
    public void setCuradorAsignado(Curador curadorAsignado) {
        this.curadorAsignado = curadorAsignado;
    } 

}
