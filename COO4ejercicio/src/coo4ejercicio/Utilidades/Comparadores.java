/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coo4ejercicio.Utilidades;

import coo4ejercicio.Entidades.Pelicula;
import java.util.Comparator;

/*
4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:
---------------------------------------------
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/
/**
 *
 * @author nahue
 */
public class Comparadores {
    public static Comparator<Pelicula>ordenarPorDuracion = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    
    
   public static Comparator<Pelicula>orderPorDuracion = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
                
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
           
           public static Comparator<Pelicula>ordenPorDiccionario = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          
            
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
           public static Comparator<Pelicula>ordenPorDirector = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          
            
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
