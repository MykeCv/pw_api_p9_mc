package uce.edu.ec.application.domain;

import java.time.LocalDate;

import io.vertx.codegen.annotations.DataObject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@DataObject
public class Vehiculo {
    
    @Id
    @GeneratedValue
    private Long id;
    private String marca;
    private String modelo;

    @Column(unique = true)
    private Integer chasis;
    private LocalDate fechaMatricula;
    private LocalDate fechaFabricacion;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getChasis() {
        return chasis;
    }
    public void setChasis(Integer chasis) {
        this.chasis = chasis;
    }
    public LocalDate getFechaMatricula() {
        return fechaMatricula;
    }
    public void setFechaMatricula(LocalDate fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }
    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }
    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    

}

