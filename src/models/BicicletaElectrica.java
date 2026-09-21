/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nicom
 */
public class BicicletaElectrica extends Bicicleta {

    private int nivelBateria;
    private double autonomia;

    public BicicletaElectrica() {
    }

    public BicicletaElectrica(int nivelBateria, double autonomia, String codigo, String tipo, boolean disponible, double tarifaPorHora) {
        super(codigo, tipo, disponible, tarifaPorHora);
        this.nivelBateria = nivelBateria;
        this.autonomia = autonomia;
    }
    

    /**
     * Get the value of autonomia
     *
     * @return the value of autonomia
     */
    public double getAutonomia() {
        return autonomia;
    }

    /**
     * Set the value of autonomia
     *
     * @param autonomia new value of autonomia
     */
    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    /**
     * Get the value of nivelBateria
     *
     * @return the value of nivelBateria
     */
    public int getNivelBateria() {
        return nivelBateria;
    }

    /**
     * Set the value of nivelBateria
     *
     * @param nivelBateria new value of nivelBateria
     */
    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    @Override
    public String toString() {
        return super.toString()+"BicicletaElectrica{" + "nivelBateria=" + nivelBateria + ", autonomia=" + autonomia + '}';
    }

    
    
    
}
