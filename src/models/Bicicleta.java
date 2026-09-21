/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nicom
 */
public class Bicicleta {
    
    private String codigo;
    private String tipo;
    private boolean disponible;
    private double tarifaPorHora;

    public Bicicleta() {
    }

    public Bicicleta(String codigo, String tipo, boolean disponible, double tarifaPorHora) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.disponible = disponible;
        this.tarifaPorHora = tarifaPorHora;
    }
    
    public boolean estaDiaponible(){
        return disponible;                 
    }
    
    public boolean marcarNoDisponible(){
        disponible = false;
        return false;
    }
        
   
          
     
    /**
     * Get the value of tarifaPorHora
     *
     * @return the value of tarifaPorHora
     */
    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    /**
     * Set the value of tarifaPorHora
     *
     * @param tarifaPorHora new value of tarifaPorHora
     */
    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }


    /**
     * Get the value of disponible
     *
     * @return the value of disponible
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * Set the value of disponible
     *
     * @param disponible new value of disponible
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    /**
     * Get the value of tipo
     *
     * @return the value of tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Set the value of tipo
     *
     * @param tipo new value of tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    /**
     * Get the value of codigo
     *
     * @return the value of codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Set the value of codigo
     *
     * @param codigo new value of codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "codigo=" + codigo + ", tipo=" + tipo + ", disponible=" + disponible + ", tarifaPorHora=" + tarifaPorHora + '}';
    }

    
    
    
}
