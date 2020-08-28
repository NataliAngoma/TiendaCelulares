package com.tiendacelu.tienda.controller;

import com.tiendacelu.tienda.model.Marca;
import com.tiendacelu.tienda.service.IMarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    @GetMapping(value= "listar/{id}")
    public ResponseEntity<Marca> buscar (@PathVariable("id") Long id){
        Marca marca =service.buscar(id);
        if (marca==null) marca= new Marca();
        return new ResponseEntity<Marca>(marca, HttpStatus.OK);
    }

    @GetMapping(value = "paginar")
    public ResponseEntity<Page<Marca>> listarPagina(Pageable paginacion) {
        Page<Marca> marcas = service.listarPaginacion(paginacion);
        return new ResponseEntity<Page<Marca>>(marcas, HttpStatus.OK);
    }

    /*@PostMapping(value = "crear")
    public ResponseEntity<Marca> crear(@RequestBody Marca marca) {
        marca.setNombreMarca(marca.getNombreMarca() + " - Modificado");
        return  new ResponseEntity<>(marca, HttpStatus.OK);}*/

    @PostMapping(value = "crear")
    public ResponseEntity<Marca>guardar(Marca marca){
        Marca mar = service.registrar(marca);
        if(mar==null) return  new ResponseEntity<Marca>(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<Marca>(mar, HttpStatus.OK);
    }
    @PostMapping(value="modificar")
    public ResponseEntity<Marca>modificar(@RequestBody Marca marca){
        Marca mar =service.modificar(marca);
        if (mar==null) return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(mar, HttpStatus.OK);
    }

    @DeleteMapping(value = "eliminar/{id}")
    public boolean eliminar(@PathVariable("id") Long id) {
        return service.eliminar(id);
    }

}
