package com.tiendacelu.tienda.service;

import com.tiendacelu.tienda.dao.IMarcaDAO;
import com.tiendacelu.tienda.model.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements IMarcaService{
    @Autowired
    private IMarcaDAO marcaDAO;

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

}
