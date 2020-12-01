/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12Cliente;

import Cartas.Cartas;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Ejercicio12Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException{
//        Scanner teclado = new Scanner (System.in);
//        char pedirCarta;
//        System.out.println("Quieres pedir una carta?(S/N)");
//        pedirCarta=teclado.next().charAt(0);
//        if (pedirCarta=='S') {
//            /* Se crea el socket cliente */
//            Socket servidor = new Socket ("localhost", 35557);
//            System.out.println ("conectado");
//            do {
//                /* Se crea el socket cliente */
//                servidor = new Socket ("localhost", 35557);
//                /* Se obtiene un stream de lectura para leer objetos */
//                ObjectInputStream bufferObjetos = new ObjectInputStream (servidor.getInputStream());
//
//                 /* Se lee un Datosocket que nos env�a el servidor y se muestra 
//                  * en pantalla */
//                 Cartas carta = (Cartas)bufferObjetos.readObject();
//                 System.out.println(carta.toString());
//                 System.out.println("Quieres pedir otra carta?(S/N)");
//                 pedirCarta=teclado.next().charAt(0);
//            } while (pedirCarta=='S');
//        }else{
//            System.out.println("No has querido una carta");
//        }
//
//         
        Ventana v = new Ventana();
        v.setVisible(true);

    }
    
}
