package com.tiendacelu.tienda.controller;

import com.tiendacelu.tienda.model.Marca;
import com.tiendacelu.tienda.service.IMarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private IMarcaService service;

    @GetMapping
    public ResponseEntity<List<Marca>> listar() {
        List<Marca> lista = service.listar();
        if (lista==null) lista=new ArrayList<Marca>();
                return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping(value = "crear")
    public ResponseEntity<Marca> crear(@RequestBody Marca marca) {
        marca.setNombreMarca(marca.getNombreMarca() + " - Modificado");
        return  new ResponseEntity<>(marca, HttpStatus.OK);
    }

}
