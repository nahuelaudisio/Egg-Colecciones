/*

 */
package coo5ejercicio.Servicios;

import coo5ejercicio.Entidades.Pais;
import coo5ejercicio.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import static javafx.scene.input.KeyCode.T;

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
public class ServicioPais {

    // TreeSet<tipo de dato objeto> nombre = new TreeSet();
    private Scanner leer;
    private HashSet<Pais> paises;

    public ServicioPais() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.paises = new HashSet();

    }

    public void agregarPais() {
        System.out.println("Ingrese algun Pais:");
        String pais = leer.next().toUpperCase();

        paises.add(new Pais(pais));
    }

    public void mostrarPaises() {
        System.out.println("Las Peliculas actuales ingresadas son : ");
        for (Pais aux : paises) {
            System.out.println(aux.toString().toUpperCase());

        }
        System.out.println("cantidad = " + paises.size());

        System.out.println("------------------------------------");

    }

    public void eliminarPaisMostrar() {
int contador = 0;
        System.out.println("Ingrese un Pais que quiera eliminar de la lista: ");
        String eliminar = leer.next().toUpperCase();
        /*
           Conjuntos:
HashSet<Integer> numerosSet = new HashSet();
Iterator<Integer> it = numerosSet.iterator();
while (it.hasNext()) {
if (it.next() == 3) { // Borramos si está el numero 3
it.remove();
}
}
         */
        Iterator<Pais> it = paises.iterator();
      while(it.hasNext()){
          if (it.next().getPais().equals(eliminar)) {
              it.remove();//por alguna razon it.remove(); , al parecer, debe ir inmediatamente despues del it.next(); , nose porque.
            System.out.println("el pais \""+eliminar+"\" se ha eliminado."); 
    contador += 1;
      }

    }
        if (contador == 0 ) {
            System.out.println("NO SE ENCONTRO EL "+eliminar+" en la LISTA");
        }
      
        
        
        System.out.println("La LISTA QUEDO ASI: ");
      // Aqui cree una ARRAY LIST DONDE PASE LA LISTA o en este caso CONJUNTO 'paises'
        ArrayList<Pais> paisesLista = new ArrayList(paises);
        
        Collections.sort(paisesLista, Comparadores.ordenarPaisesAlfabeticamente);
             
        for (Pais aux : paisesLista) {
            System.out.println(aux.toString().toUpperCase());

        }
    }
}
