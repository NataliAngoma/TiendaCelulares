package com.tiendacelu.tienda.dao;

import com.tiendacelu.tienda.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMarcaDAO extends JpaRepository<Marca, Long> {

    /*List<Marca> findByNombre( String nombreMarca);

    @Query(value = "from Marca m where m.idMarca =:id_marca")
    List<Marca> buscarMarca(@Param("id_marca") long id);*/

    @Query(value = "select idMarca, nombreMarca FROM marca", nativeQuery = true)
    List<Object[]> listarMarcaProcedure();

   /* @Query(value = "exec dbo.sp_buscarpersona ?1", nativeQuery = true)
    List<Object[]> buscarPersonaProcedure(Long id);*/

}
