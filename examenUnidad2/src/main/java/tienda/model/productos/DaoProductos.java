package tienda.model.productos;

import tienda.model.Repository;
import tienda.util.ConnectionMySQL;

import java.lang.ref.PhantomReference;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoProductos  implements Repository<BeanProductos> {

    ConnectionMySQL client =new ConnectionMySQL();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;


    @Override
    public List<BeanProductos> findAll() {
        List<BeanProductos> listaProduct = new ArrayList<>();
        BeanProductos product = null;
        /*BeanTipo tipoP = null;
        BeanCategoria categoriaP = null;*/
        try {
            con = client.getConnection();
            ps = con.prepareStatement("SELECT * FROM clothes;");
            rs = ps.executeQuery();
            while (rs.next()){
                product = new BeanProductos();
                product.setId(rs.getLong("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setSize(rs.getString("size"));
                product.setBrand(rs.getString("brand"));
                product.setStock(rs.getInt("stock"));
                product.setCloth_type(rs.getString("cloth_type"));
                product.setStatus(rs.getInt("status"));
                product.setCategory_id(rs.getInt("category_id"));
                product.setClothe_type_id(rs.getInt("clothe_type_id"));
                listaProduct.add(product);
            }
        } catch (SQLException e){
            Logger.getLogger(DaoProductos.class.getName()).log(Level.SEVERE,"Error -> "+e.getMessage());
        }finally {
            client.close(con,ps,rs);
        }
        return listaProduct;
    }

    @Override
    public BeanProductos findById(Long id) {
        List<BeanProductos> lista = new ArrayList<>();
        BeanProductos beanP = new BeanProductos();
        try {
            con = client.getConnection();
            ps = con.prepareStatement("SELECT * FROM clothes WHERE id = ?;");
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                beanP.setId(rs.getLong("id"));
                beanP.setName(rs.getString("name"));
                beanP.setPrice(rs.getDouble("prince"));
                beanP.setSize(rs.getString("size"));
                beanP.setBrand(rs.getString("brand"));
                beanP.setStock(rs.getInt("stock"));
                beanP.setCloth_type(rs.getString("cloth_type"));
                beanP.setStatus(rs.getInt("status"));
                beanP.setCategory_id(rs.getInt("category_id"));
                beanP.setClothe_type_id(rs.getInt("clothe_type_id"));
                lista.add(beanP);
            }
        } catch (SQLException e){
            Logger.getLogger(DaoProductos.class.getName()).log(Level.SEVERE,"Error -> "+e.getMessage());
        }finally {
            client.close(con,ps,rs);
        }
        return beanP;
    }

    @Override
    public BeanProductos save(BeanProductos object) {
        return null;
    }

    @Override
    public BeanProductos save2(Long id, String name, Double price, String size, String brand, Integer stock, String cloth_type, Date created_at, Integer status, Integer category_id, Integer clothe_type_id) {
        BeanProductos saveProd = new BeanProductos();
        try {
            con = client.getConnection();
            ps = con.prepareStatement("INSERT INTO `clothes`(`id`, `name`, `price`, `size`, `brand`, `stock`, `cloth_type`, `created_at`, `status`, `category_id`, `clothe_type_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?);");
            ps.setLong(1,id);
            ps.setString(2,name);
            ps.setString(3, size);
            ps.setDouble(4, price);
            ps.setString(5, brand);
            ps.setInt(6, stock);
            ps.setString(7, cloth_type);
            ps.setDate(8, (java.sql.Date) created_at);
            ps.setInt(9, status);
            ps.setInt(10, category_id);
            ps.setInt(11, clothe_type_id);
            rs = ps.executeQuery();
            if (rs.next()){
                saveProd.setId(id);
                saveProd.setName(name);
                saveProd.setPrice(price);
                saveProd.setSize(size);
                saveProd.setBrand(brand);
                saveProd.setStock(stock);
                saveProd.setCloth_type(cloth_type);
                saveProd.setCreated_at(created_at);
                saveProd.setStatus(status);
                saveProd.setCategory_id(category_id);
                saveProd.setClothe_type_id(clothe_type_id);
            }else{
                saveProd = null;
            }
        }catch (SQLException e){
            Logger.getLogger(DaoProductos.class.getName()).log(Level.SEVERE,"Error -> "+e.getMessage());
        }finally {
            client.close(con,ps,rs);
        }
        return saveProd;
    }

    @Override
    public boolean update(BeanProductos Object) {
        return false;
    }

    @Override
        public BeanProductos update2(Long id, String name, Double price, String size, String brand, Integer stock, String cloth_type, Date created_at, Integer status, Integer category_id, Integer clothe_type_id) {
            BeanProductos updateProduc = new BeanProductos();


        return updateProduc;
    }

    @Override
    public BeanProductos remove(Long id) {
        BeanProductos deleteProd = new BeanProductos();
        try {
            con = client.getConnection();
            ps = con.prepareStatement("DELETE FROM clothes WHERE id = ?;");
            ps.setLong(1, id);
            rs = ps.executeQuery();
        }catch (SQLException e){
            Logger.getLogger(DaoProductos.class.getName()).log(Level.SEVERE,"Error -> "+e.getMessage());
        }finally {
            client.close(con,ps,rs);
        }
        return deleteProd;
    }
}
