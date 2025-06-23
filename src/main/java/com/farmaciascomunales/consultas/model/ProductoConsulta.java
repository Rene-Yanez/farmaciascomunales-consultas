package com.farmaciascomunales.consultas.model;

public class ProductoConsulta {

    private Long idProducto;
    private String nombre;
    private String tipo;
    private int precio;
    private int stockDisponible;
    private String bodega;

    // Getters y setters
    public Long getIdProducto() { return idProducto; }

    public void setIdProducto(Long idProducto) { this.idProducto = idProducto; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getPrecio() { return precio; }

    public void setPrecio(int precio) { this.precio = precio; }

    public int getStockDisponible() { return stockDisponible; }

    public void setStockDisponible(int stockDisponible) { this.stockDisponible = stockDisponible; }

    public String getBodega() { return bodega; }

    public void setBodega(String bodega) { this.bodega = bodega; }
}