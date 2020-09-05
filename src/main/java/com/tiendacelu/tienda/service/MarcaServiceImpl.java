package com.tiendacelu.tienda.service;

import com.tiendacelu.tienda.dao.IMarcaDAO;
import com.tiendacelu.tienda.model.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements IMarcaService{


    @Autowired
    private IMarcaDAO marcaDAO;

/*
    @Override
    public Marca registrar(Marca marca) {
        return marcaDAO.save(marca);
    }

    @Override
    public Marca modificar(Marca marca) {
        return marcaDAO.save(marca);
    }

    @Override
    public List<Marca> listar() {
        return marcaDAO.findAll();
    }

    @Override
    public boolean eliminar(Long id) {
        Optional<Marca> marca =marcaDAO.findById(id);
        if(marca.isPresent()){
            marcaDAO.delete(marca.get());
            return true;
        }
        return false;
    }

    @Override
    public Marca buscar(Long id) {
        return marcaDAO.findById(id).get();
    }

    @Override
    public Page<Marca> listarPaginacion(Pageable paginacion) {
        return marcaDAO.findAll(paginacion);
    }

    */

    @Override
    public List<Marca> buscarNombre(String nombre) {
        //return marcaDAO.findByNombre(nombre);
        return null;
    }

    @Override
    public List<Marca> buscarMarca(Long id) {
       // return marcaDAO.buscarMarca(id);
        return null;
    }


    @Override
    public List<Marca> listarMarcaProcedure() {
        List<Marca> marcaList = new ArrayList<Marca>();
        List<Object[]> list = marcaDAO.listarMarcaProcedure();
        return getMarca(marcaList, list);
    }

    private List<Marca> getMarca(List<Marca> marcaList, List<Object[]> list) {
        for(Object[] obj : list) {
            Marca marca = new Marca();
            marca.setIdMarca(Long.valueOf(obj[0].toString())); //1
            marca.setNombreMarca(obj[1].toString()); //natali
            marcaList.add(marca);
        }
        return marcaList ;
    }

   /* @Override
    public List<Marca> buscarMarcaProcedure(Long id) {
        List<Marca> marcaList = new ArrayList<Marca>();
        List<Object[]> list = marcaDAO.buscarMarcaProcedure(id);
        return getMarca(marcaList, list);
    }*/
}
