package com.Duoc.HuertoHogar.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity 
@Data 
@Table (name = "usuario")
public class Usuario {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(nullable = false)
    private int rutUsuario;

    @Column(nullable = false)
    private String nombreUsuario, apellidosUsuario, correo, region, comuna, direccion;

    @ManyToOne
    @JoinColumn(name = "idTipoUsario", nullable = false)
    private TipoUsuario tipoUsuario;

    
}
