package com.tiendacelu.tienda.service;

import com.tiendacelu.tienda.dao.IMarcaDAO;
import com.tiendacelu.tienda.model.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImpl implements IMarcaService{
    @Autowired
    private IMarcaDAO marcaDAO;

    @Override
    public List<Marca> listar() {
        return marcaDAO.findAll();
    }
}
