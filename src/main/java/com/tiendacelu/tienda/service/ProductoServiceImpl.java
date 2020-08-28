package com.tiendacelu.tienda.service;

import com.tiendacelu.tienda.dao.IProductoDAO;
import com.tiendacelu.tienda.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements  IProductoService{

    @Autowired
    private IProductoDAO productoDAO;

    @Override
    public List<Producto> listar() {
        return productoDAO.findAll();
    }

    @Override
    public Producto registrar(Producto producto) {
        return productoDAO.save(producto);
    }

    @Override
    public Producto actualizar(Producto producto) {
        return productoDAO.save(producto);
    }

    @Override
    public Producto buscar(Long id) {
        return productoDAO.findById(id).get();
    }

    @Override
    public boolean eliminar(Long id) {
        Optional<Producto> producto = productoDAO.findById(id);
        if(producto.isPresent()) {
            productoDAO.delete(producto.get());
            return true;
        }
        return false;
    }
}
