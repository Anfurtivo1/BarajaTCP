/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12servidor;

import Cartas.Cartas;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Andres
 */
public class Hilo extends Thread{
    private Socket cliente;
    private int puntos;

    public Hilo(Socket cliente) {
        this.cliente = cliente;
    }
    
    public void run(){
        
        
        String ruta;
        System.out.println ("Conectado con cliente de " + cliente.getInetAddress());
            // setSoLinger() a true hace que el cierre del socket espere a que
            // el cliente lea los datos, hasta un máximo de 10 segundos de espera.
            // Si no ponemos esto, el socket se cierra inmediatamente y si el 
            // cliente no ha tenido tiempo de leerlos, los datos se pierden.
            //cliente.setSoLinger (true, 10);
            try{
                // Se prepara un flujo de salida para objetos y un objeto para enviar*/
                ruta=generarCartaAleatoria();
                Cartas carta = new Cartas(ruta);
                ObjectOutputStream bufferObjetos = new ObjectOutputStream (cliente.getOutputStream());

                // Se envia el objeto 
                bufferObjetos.writeObject(carta);
                System.out.println ("Enviado '" + carta.toString()+"'"); 
                
            }catch(Exception e){
                System.out.println("Error en "+e);
            }
    }
    
    public String generarCartaAleatoria(){
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
            puntos=puntos+aleatorio;
            ruta = ruta + String.valueOf(aleatorio) + ".jpg";
            System.out.println(ruta);
            return ruta;
    }
    
}
