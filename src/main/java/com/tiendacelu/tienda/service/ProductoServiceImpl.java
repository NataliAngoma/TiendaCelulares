package com.tiendacelu.tienda.service;

import com.tiendacelu.tienda.dao.IProductoDAO;
import com.tiendacelu.tienda.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements  IProductoService{

    @Autowired
    private IProductoDAO productoDAO;

    @Override
    public List<Producto> listar() {
        return productoDAO.findAll();
    }
}
