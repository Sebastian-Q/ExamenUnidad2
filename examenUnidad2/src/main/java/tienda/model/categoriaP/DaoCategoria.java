package tienda.model.categoriaP;

import tienda.model.Repository;
import tienda.model.productos.BeanProductos;
import tienda.model.tipoP.BeanTipo;

import java.util.Date;
import java.util.List;

public class DaoCategoria implements Repository<BeanCategoria> {
    @Override
    public List<BeanCategoria> findAll() {
        return null;
    }

    @Override
    public BeanCategoria findById(Long id) {
        return null;
    }

    @Override
    public BeanProductos save(BeanProductos object) {
        return null;
    }

    @Override
    public BeanProductos save2(Long id, String name, Double price, String size,String brand, Integer stock, String cloth_type, Date created_at, Integer status, Integer category_id, Integer clothe_type_id) {
        return null;
    }

    @Override
    public boolean update(BeanCategoria Object) {
        return false;
    }

    @Override
    public BeanProductos remove(Long id) {
        return null;
    }
}
