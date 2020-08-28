package com.tiendacelu.tienda.model;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "idUsuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "nombres", length = 50)
    private String nombres;

    @Column(name = "correo", length = 50)
    private String correo;

    @Column(name = "pass", length = 5)
    private String pass;

    @Column(name = "paterno", length = 50)
    private String paterno;

    @Column(name = "materno", length = 50)
    private String materno;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="idRol", nullable=false)
    private Rol rol;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
