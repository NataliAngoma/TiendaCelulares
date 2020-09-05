package com.tiendacelu.tienda.dao;


import com.tiendacelu.tienda.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductoDAO extends JpaRepository<Producto, Long> {

   /* List<Producto> findByModeloAndPrecio(String modelo, Double precio);

    @Query(value = "from Producto p where p.idCelular =:id_celular")
    List<Producto> buscarProducto(@Param("id_producto") long id);*/

    @Query(value = "call usp_ListarProducto();", nativeQuery = true)
    List<Object[]> listarProductoNativo();

  /*  @Query(value = "select p.modelo, m.nombreMarca from Producto p join p.marca m")
    List<Producto> findAllByModelo();*/
}
