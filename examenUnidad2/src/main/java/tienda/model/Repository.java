package tienda.model;

import tienda.model.productos.BeanProductos;
import tienda.model.tipoP.BeanTipo;

import java.util.Date;
import java.util.List;

public interface Repository <T>{

    List <T> findAll();

    T findById(Long id);


    BeanProductos save(BeanProductos object);

    BeanProductos save2(Long id, String name, Double price, String size, String brand, Integer stock, String cloth_type, Date created_at, Integer status, Integer category_id, Integer clothe_type_id);

    boolean update(T Object);

    BeanProductos update2(Long id, String name, Double price, String size, String brand, Integer stock, String cloth_type, Date created_at, Integer status, Integer category_id, Integer clothe_type_id);

    BeanProductos remove(Long id);
}
