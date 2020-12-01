/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cartas;

import java.io.Serializable;

/**
 *
 * @author Andres
 */
public class Cartas implements Serializable{
    private String ruta;
    
    public Cartas(String ruta) {
        this.ruta = ruta;
    }

    public Cartas() {
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
    @Override
    public String toString() {
        return "Cartas{" + "ruta=" + ruta + '}';
    }
    
    
    /*
    private void cambia_carta(){
        String ruta = "Baraja/";
        int aleatorio;
        aleatorio = (int) (Math.random() * 4) + 1;
        switch(aleatorio){
            case 1: ruta = ruta + "oros_"; break;
            case 2: ruta = ruta + "copas_"; break;
            case 3: ruta = ruta + "espadas_"; break;
            case 4: ruta = ruta + "bastos_"; break;
        }
        
        aleatorio = (int) (Math.random() * 12) + 1;
        ruta = ruta + String.valueOf(aleatorio) + ".jpg";
        System.out.println(ruta);
        //ET.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); 
    }
    
    */

    

    

    

    
    
}
