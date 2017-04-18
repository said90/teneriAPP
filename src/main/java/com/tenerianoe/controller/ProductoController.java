
package com.tenerianoe.controller;

import com.tenerianoe.ejb.ProductoFacadeLocal;
import com.tenerianoe.model.Categoria;
import com.tenerianoe.model.Producto;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author davsa
 */

@Named
@ViewScoped
public class ProductoController implements Serializable{
   
    @EJB
    private ProductoFacadeLocal productoEJB;
    
    private Producto producto;
    private List<Producto> productos;
    private Categoria categoria;

    @PostConstruct
    public void init(){
    producto=new Producto();
    productos= productoEJB.findAll();
    }   

    public void registrar(){
        try {
            producto.setCategoria(categoria);
            productoEJB.create(producto);
        } catch (Exception e) {
        }
        
        
    
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
    
}
