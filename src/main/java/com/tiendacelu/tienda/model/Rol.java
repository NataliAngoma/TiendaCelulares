package com.tiendacelu.tienda.model;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @Column(name = "idRol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(name = "nombre", length = 50)
    private String nombre;

}
