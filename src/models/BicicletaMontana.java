/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nicom
 */
public class BicicletaMontana extends Bicicleta {
    
    private int numeroCambios;
    private double tamanioRueda;

    public BicicletaMontana() {
    }

    public BicicletaMontana(int numeroCambios, double tamanioRueda, String codigo, String tipo, boolean disponible, double tarifaPorHora) {
        super(codigo, tipo, disponible, tarifaPorHora);
        this.numeroCambios = numeroCambios;
        this.tamanioRueda = tamanioRueda;
    }

    
    
    /**
     * Get the value of tamanioRueda
     *
     * @return the value of tamanioRueda
     */
    public double getTamanioRueda() {
        return tamanioRueda;
    }

    /**
     * Set the value of tamanioRueda
     *
     * @param tamanioRueda new value of tamanioRueda
     */
    public void setTamanioRueda(double tamanioRueda) {
        this.tamanioRueda = tamanioRueda;
    }


    /**
     * Get the value of numeroCambios
     *
     * @return the value of numeroCambios
     */
    public int getNumeroCambios() {
        return numeroCambios;
    }

    /**
     * Set the value of numeroCambios
     *
     * @param numeroCambios new value of numeroCambios
     */
    public void setNumeroCambios(int numeroCambios) {
        this.numeroCambios = numeroCambios;
    }

    @Override
    public String toString() {
        return super.toString()+"BicicletaMontana{" + "numeroCambios=" + numeroCambios + ", tamanioRueda=" + tamanioRueda + '}';
    }

    
    
    
    
}
