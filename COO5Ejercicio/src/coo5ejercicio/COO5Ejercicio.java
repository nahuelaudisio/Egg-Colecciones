/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coo5ejercicio;

import coo5ejercicio.Servicios.ServicioPais;
import java.util.Scanner;

/*
5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario.
*/
/**
 *
 * @author nahue
 */
public class COO5Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPais nPais = new ServicioPais(); 
                boolean condicion = true;
        System.out.println("----------BIENVENIDO--------------");
        
        
        do {        

            nPais.agregarPais();
            System.out.println("Quiere Ingresar un PAIS (S/N): ");
            String validor = leer.next().toUpperCase();
            
            if (validor.equals("N")) {
                condicion = false;
            }
            
            
        } while (condicion == true);
        System.out.println("-----------------------------------------");
        nPais.mostrarPaises(); // los muestra en orden inverso al afabetico 
        
        nPais.eliminarPaisMostrar();
    }
    
}
