package com.tiendacelu.tienda.controller;

import com.tiendacelu.tienda.model.Celular;
import com.tiendacelu.tienda.model.Producto;
import com.tiendacelu.tienda.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService service;

   /* @GetMapping(value = "buscar")
    public ResponseEntity<List<Producto>> buscarModeloYPrecio(String modelo,Long precio) {
        List<Producto> lista = service.buscarModeloYPrecio(modelo, precio);
        if (lista == null ) lista = new ArrayList<Producto>();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping(value = "buscarproducto")
    public ResponseEntity<List<Producto>> buscarProducto(Long id) {
        List<Producto> lista = service.buscarProducto(id);
        if (lista == null ) lista = new ArrayList<Producto>();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }*/

    @GetMapping(value = "listarproducto")
    public ResponseEntity<List<Producto>> listarProductos() {
        List<Producto> lista = service.listarProductos();
        if (lista == null ) lista = new ArrayList<Producto>();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }


    @GetMapping(value = "listarcelus")
    public ResponseEntity<List<Celular>> listarCelus() {
        List<Celular> lista = service.listarCelulares();
        if (lista == null ) lista = new ArrayList<Celular>();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }


}
