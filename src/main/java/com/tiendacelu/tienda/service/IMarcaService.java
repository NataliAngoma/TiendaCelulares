package com.tiendacelu.tienda.service;


import com.tiendacelu.tienda.model.Marca;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface IMarcaService {

   /* Marca registrar(Marca marca);
    Marca modificar (Marca marca);
    List<Marca>  listar();
    boolean eliminar (Long id);
    Marca buscar (Long id);
    Page<Marca> listarPaginacion (Pageable paginacion);
    */

    List<Marca> buscarNombre( String nombreMarca);

    List<Marca> buscarMarca(Long id);

    List<Marca> listarMarcaProcedure();


}
