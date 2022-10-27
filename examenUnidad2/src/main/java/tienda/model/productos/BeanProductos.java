package tienda.model.productos;

import java.util.Date;

public class BeanProductos {
    Long id;
    String name;
    Double price;
    String size;
    String brand;
    Integer stock;
    String cloth_type;
    Date created_at;
    Integer status;
    Integer category_id;
    Integer clothe_type_id;

    public BeanProductos(){

    }

    public BeanProductos(Long id, String name, Double price, String size, String brand, Integer stock, String cloth_type,
                         Date created_at, Integer status, Integer category_id, Integer clothe_type_id){
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.brand = brand;
        this.stock = stock;
        this.cloth_type = cloth_type;
        this.created_at = created_at;
        this.status = status;
        this.category_id = category_id;
        this.clothe_type_id = clothe_type_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCloth_type() {
        return cloth_type;
    }

    public void setCloth_type(String cloth_type) {
        this.cloth_type = cloth_type;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getClothe_type_id() {
        return clothe_type_id;
    }

    public void setClothe_type_id(Integer clothe_type_id) {
        this.clothe_type_id = clothe_type_id;
    }
}
