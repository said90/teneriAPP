package com.tenerianoe.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author said
 */
@Entity
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProducto;

    @Column(name = "producto")
    private String producto;
    @Column(name = "unidadMedida")
    private String unidadMedida;
    @Column(name = "precioUnitario")
    private double precionUnitario;
    @Column(name = "cantidad")
    private double cantidad;
    @JoinColumn(name = "idCategoria" , nullable = false)
    @ManyToOne
    private Categoria categoria;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getPrecionUnitario() {
        return precionUnitario;
    }

    public void setPrecionUnitario(double precionUnitario) {
        this.precionUnitario = precionUnitario;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
