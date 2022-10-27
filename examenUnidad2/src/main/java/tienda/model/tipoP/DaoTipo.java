package tienda.model.tipoP;

import tienda.model.Repository;
import tienda.model.productos.BeanProductos;

import java.util.Date;
import java.util.List;


public class DaoTipo implements Repository<BeanTipo> {
    @Override
    public List<BeanTipo> findAll(){
        return null;
    }

    @Override
    public BeanTipo findById (Long id){
        return null;
    }

    @Override
    public BeanProductos save(BeanProductos object) {
        return null;
    }

    @Override
    public BeanProductos save2(Long id, String name, Double price, String size, String brand, Integer stock, String cloth_type, Date created_at, Integer status, Integer category_id, Integer clothe_type_id) {
        return null;
    }

    @Override
    public boolean update(BeanTipo object) {
        return false;
    }

    @Override
    public BeanProductos remove(Long id) {
        return null;
    }
}