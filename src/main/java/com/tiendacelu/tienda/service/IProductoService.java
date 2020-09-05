package com.tiendacelu.tienda.service;

import com.tiendacelu.tienda.model.Celular;
import com.tiendacelu.tienda.model.Marca;
import com.tiendacelu.tienda.model.Producto;

import java.util.List;

public interface IProductoService {

   /* List<Producto> buscarModeloYPrecio(String modelo, Long precio);

    List<Producto> buscarProducto(Long id);*/

    List<Producto> listarProductoNativo();

    List<Celular> listarCelulares();

    List<Producto> listarProductos();

}
