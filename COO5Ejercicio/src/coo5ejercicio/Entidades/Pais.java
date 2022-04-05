/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coo5ejercicio.Entidades;

import java.util.Objects;

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
public class Pais {
    // ATRIBUTOS
    private String pais;
    
    //CONSTRUCTOR por defecto

    public Pais() {
    }
    
    // CONSTRUCTOR POR PARAMETROS COMPLETOS

    public Pais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Pelicula{" + "pais=" + pais + '}';
    }

    //@Override
   // public int compareTo(Pais t) {
  // return t.getPais().compareTo(this.pais);

// [return t.getPais().compareTo(this.pais)]; -> asi se supone que se ordena la lista
    //de mayor a MENOR.
    }
    
    
    

