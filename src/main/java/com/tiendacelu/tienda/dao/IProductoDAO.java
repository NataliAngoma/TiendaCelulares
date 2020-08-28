package com.tiendacelu.tienda.dao;

import com.tiendacelu.tienda.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoDAO extends JpaRepository<Producto, Long> {
}
