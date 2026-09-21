/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package views;

import models.Alquiler;
import models.BicicletaElectrica;
import models.BicicletaMontana;

/**
 *
 * @author nicom
 */
public class MainEjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Alquiler [] arregloAlquileres=new Alquiler[2];
        BicicletaElectrica objElectrica;
        BicicletaMontana objMontana;
        
        
        objElectrica = new BicicletaElectrica(100, 50.0, "E1", "Electrica", true, 5000.0);
        objMontana = new BicicletaMontana(21, 29.0, "M1", "Montana", true, 4000.0);
        
        
        Alquiler alq1 = new Alquiler(1, 2, "Carlos", objElectrica);
        alq1.registrarAlquiler();
        arregloAlquileres[0] = alq1;
        
       
        Alquiler alq2 = new Alquiler(2, 4, "Maria", objMontana);
        alq2.registrarAlquiler();
        arregloAlquileres[1] = alq2;
        
       
        System.out.println("Cliente: " + arregloAlquileres[0].getCliente());
        System.out.println("Costo Total: $" + arregloAlquileres[0].calcularCosto());
        
        System.out.println("Cliente: " + arregloAlquileres[1].getCliente());
        System.out.println("Costo Total: $" + arregloAlquileres[1].calcularCosto());
                
                
        
        
        
        
        
    }
    
}
