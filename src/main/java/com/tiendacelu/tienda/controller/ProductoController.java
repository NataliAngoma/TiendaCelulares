package com.tiendacelu.tienda.controller;

import com.tiendacelu.tienda.model.Producto;
import com.tiendacelu.tienda.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService service;

    @GetMapping
    public ResponseEntity<List<Producto>> listar () {
        List<Producto> lista = service.listar();
        if (lista == null) lista = new ArrayList<Producto>();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

}
