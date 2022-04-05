/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coo4ejercicio.Servicios;

import coo4ejercicio.Entidades.Pelicula;
import coo4ejercicio.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
public class PeliculaServicio {

    private Scanner leer;
    private ArrayList<Pelicula> peliculas;

    public PeliculaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList();
    }

    public void crearPelicula() {
        System.out.println("BIENVENIDO al CATALOGO DE PELICULAS VISTAS POR EL USUARIO 'x'");

        System.out.println("Ingrese el titulo de la pelicula:");
        String titulo = leer.next().toUpperCase();

        System.out.println("Ingrese el director de la pelicula: ");
        String director = leer.next();

        System.out.println("Ingrese la duracion minima en  horas de la pelicula:");
        Integer duracion = leer.nextInt();

        peliculas.add(new Pelicula(titulo, director, duracion));

    }

    public void mostrarPeliculas() {
        System.out.println("Las Peliculas actuales ingresadas son : ");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());

        }
        System.out.println("cantidad = " + peliculas.size());
        
        
        System.out.println("------------------------------------");

    }

    public void mostrarPeliculasMasUnaHora() {

        System.out.println("Las peliculas que duran mas de una HORA de DURACION SON:");
        int contador = 0;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.toString());
                contador += 1;
            }

        }
        System.out.println("Cantidad  de peliculas que duran mas de una hora son = " + contador);
        
        
        System.out.println("------------------------------------");
    }

    public void mostrarPeliculasXDuracion() {
        System.out.println("Las sigientes PELICULAS ESTAN ORDENADAS de MAYOR a MENOR DURACION de Horas");
        // aplico la colecctions con el COMPARADOR

        Collections.sort(peliculas, Comparadores.ordenarPorDuracion);
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());

        }
        
        System.out.println("------------------------------------");
    }
    
        public void mostrarPeliculasDuracion() {
        System.out.println("Las sigientes PELICULAS ESTAN ORDENADAS de menor a MAYOR DURACION de Horas");
        // aplico la colecctions con el COMPARADOR

        Collections.sort(peliculas, Comparadores.orderPorDuracion);
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());

        }
        
            System.out.println("------------------------------------");
    }
        
        
                public void mostrarPeliculasXTitulo() {
        System.out.println("Las sigientes PELICULAS ESTAN ORDENADAS por orden alfabetico por el titulo ");
        // aplico la colecctions con el COMPARADOR

        Collections.sort(peliculas, Comparadores.ordenPorDiccionario);
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());

        }
        
            System.out.println("------------------------------------");
    }
           public void mostrarPeliculasDIRECTOR() {
        System.out.println("Las sigientes PELICULAS ESTAN ORDEnadas por director ");
        // aplico la colecctions con el COMPARADOR

        Collections.sort(peliculas, Comparadores.ordenPorDirector);
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());

        }
        
            System.out.println("------------------------------------");
}
}
