package com.tiendacelu.tienda.service;

import com.tiendacelu.tienda.dao.IProductoDAO;
import com.tiendacelu.tienda.model.Celular;
import com.tiendacelu.tienda.model.Marca;
import com.tiendacelu.tienda.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements  IProductoService{

    @Autowired
    private IProductoDAO productoDAO;

   /* @Override
    public List<Producto> buscarModeloYPrecio(String modelo, Double precio) {
        return productoDAO.findByModeloAndPrecio(modelo,precio);
    }

    @Override
    public List<Producto> buscarProducto(Long id) {

        return productoDAO.buscarProducto(id);
    }*/

    @Override
    public List<Producto> listarProductoNativo() {
        List<Producto> productoList = new ArrayList<Producto>();
        List<Object[]> list = productoDAO.listarProductoNativo();
        return getProducto(productoList, list);
    }

    @Override
    public List<Celular> listarCelulares() {
        List<Celular> productoList = new ArrayList<Celular>();
        List<Object[]> list = productoDAO.listarProductoNativo();
        for(Object[] obj : list) {
            Celular producto = new Celular();
            producto.setId(Integer.valueOf(obj[0].toString())); //1
            producto.setModelo(obj[1].toString()); //natali
            producto.setPrecio(Double.parseDouble(obj[2].toString()));
            producto.setMarca(obj[3].toString());
            productoList.add(producto);
        }
        return productoList;
    }

    private List<Producto> getProducto(List<Producto> productoList, List<Object[]> list) {
        for(Object[] obj : list) {
            Producto producto = new Producto();
            producto.setIdCelular(Long.valueOf(obj[0].toString())); //1
            producto.setModelo(obj[1].toString()); //natali
            producto.setPrecio(Double.parseDouble(obj[2].toString()));
            /*//TODO para revisar
            Marca marca = new Marca();
            marca.setNombreMarca(obj[3].toString());
            producto.setMarca(marca);*/
            productoList.add(producto);
        }
        return productoList ;
    }

    @Override
    public List<Producto> listarProductos()
    {
        return null;
    }


}
