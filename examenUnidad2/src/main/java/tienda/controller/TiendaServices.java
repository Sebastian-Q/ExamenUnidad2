package tienda.controller;

import tienda.model.productos.BeanProductos;
import tienda.model.productos.DaoProductos;

import javax.ws.rs.*;
import java.util.List;

@Path("/api/productos")
public class TiendaServices {
    @GET
    @Path("/")
    @Produces(value = {"application/json"})
    public List<BeanProductos> getAll(){ return  new DaoProductos().findAll();}

    @GET
    @Path("/{id}")
    @Produces(value = {"application/json"})
    public List<BeanProductos> getOne(@PathParam("id") Long id){ return (List<BeanProductos>) new DaoProductos().findById(id);}

    /*@POST
    @Path("/{id}/{name}/{price}/{size}/{brand}/{stock}/{cloth_type}/{created_at}/{status}/{category_id }/{clothe_type_id }")

    */
    @DELETE
    @Path("/{id}")
    @Produces(value = {"application/json"})
    public BeanProductos Delete(@PathParam("id") Long id){return new DaoProductos().remove(id);}
}
