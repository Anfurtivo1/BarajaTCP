/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12servidor;

import Cartas.Cartas;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Andres
 */
public class Ejercicio12Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
            // Se crea un socket servidor atendiendo a un determinado puerto.
            // Por ejemplo, el 35557.
            ServerSocket socket = new ServerSocket (35557);
            Socket cliente = null;
            boolean salir=false;
            Hilo hilo;
            
            
            while(!salir){
                // Se acepata una conexion con un cliente. Esta llamada se queda
                // bloqueada hasta que se arranque el cliente.
                    System.out.println ("Esperando cliente");
                    cliente = socket.accept();
                    hilo = new Hilo(cliente);
                    hilo.start();
                
                
            }
            // Se cierra el socket con el cliente.
            // La llamada anterior a setSoLinger() hará
            // que estos cierres esperen a que el cliente retire los datos.
            cliente.close();
            
            // Se cierra el socket encargado de aceptar clientes. Ya no
            // queremos más.
            socket.close();
  }
    
}
