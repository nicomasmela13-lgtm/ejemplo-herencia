/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nicom
 */
public class Alquiler {
   
    private int numero;
    private int horas;
    private String cliente;
    private Bicicleta bicicleta;

    public Alquiler() {
    }

    public Alquiler(int numero, int horas, String cliente, Bicicleta bicicleta) {
        this.numero = numero;
        this.horas = horas;
        this.cliente = cliente;
        this.bicicleta = bicicleta;
    }
  

    /**
     * Get the value of bicicleta
     *
     * @return the value of bicicleta
     */
    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    /**
     * Set the value of bicicleta
     *
     * @param bicicleta new value of bicicleta
     */
    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }


    
    /**
     * Get the value of cliente
     *
     * @return the value of cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Set the value of cliente
     *
     * @param cliente new value of cliente
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    /**
     * Get the value of horas
     *
     * @return the value of horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Set the value of horas
     *
     * @param horas new value of horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }


    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Set the value of numero
     *
     * @param numero new value of numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public boolean puedeAlquilar() {
        return bicicleta.isDisponible();
    }

    public double calcularCosto() {
        return horas * bicicleta.getTarifaPorHora();
    }

    public boolean registrarAlquiler() {
        boolean resultado = false;
        if (puedeAlquilar()) {
            bicicleta.marcarNoDisponible();
            resultado = true;
        }
        return resultado;
    }
    
    
    
    @Override
    public String toString() {
        return "Alquiler{" + "numero=" + numero + ", horas=" + horas + ", cliente=" + cliente + ", bicicleta=" + bicicleta + '}';
    }

    
    
    
    
    
}
