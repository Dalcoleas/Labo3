/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Filtro {
    private int id;
    private String codigo;
    private String marca;
    private int stock;
    private boolean existencia;
    private boolean propiedad;
    
    public Filtro(){
        
    }

    public boolean isPropiedad() {
        return propiedad;
    }

    public void setPropiedad(boolean propiedad) {
        this.propiedad = propiedad;
    }
    
    

    public Filtro(int id, String codigo, String marca, int stock, boolean existencia, boolean propiedad) {
        this.id = id;
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
        this.propiedad = propiedad;
    }

    public Filtro(String codigo, String marca, int stock, boolean existencia, boolean propiedad) {
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
        this.propiedad = propiedad;
    }

    public Filtro(String marca, int stock, boolean existencia, boolean propiedad) {
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
        this.propiedad = propiedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }
    
    
    
    
}