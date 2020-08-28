package com.tiendacelu.tienda.model;

import javax.persistence.*;

@Entity
@Table(name="producto")
public class Producto {

    @Id
    @Column(name = "idCelular")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCelular;

    @Column(name = "modelo", length = 50)
    private String modelo;

    @Column(name = "precio")
    private double precio;

    @Column(name = "stock")
    private int stock;

    @Column(name = "stockMinimo")
    private int stockMinimo;

    @Column(name = "eliminado")
    private boolean eliminado;

    @Column(name = "fechaDeRegistro", length = 50)
    private String fechaDeRegistro;

    @Column(name = "destacado")
    private boolean destacado;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="idMarca", nullable=false)
    private Marca marca;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="idUsuario", nullable=false)
    private Usuario usuario;

    public Producto() { }

    public Long getIdCelular() {
        return idCelular;
    }

    public void setIdCelular(Long idCelular) {
        this.idCelular = idCelular;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(String fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public boolean isDestacado() {
        return destacado;
    }

    public void setDestacado(boolean destacado) {
        this.destacado = destacado;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
