package com.tiendacelu.tienda.service;

import com.tiendacelu.tienda.model.Producto;

import java.util.List;

public interface IProductoService {

    List<Producto> listar();

    Producto registrar(Producto producto);

    Producto actualizar(Producto producto);

    Producto buscar(Long id);

    boolean eliminar(Long id);

}
