
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
/**
 *
 * @author nahue
 */
public class Ejercicio1YEjercicio2 {

    public static void main(String[] args) {
        ArrayList<String> razaDePerros = new ArrayList();
        boolean condition = true;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("----BIENVENIDO----");

        do {
            System.out.println("Ingrese una raza de perro conocida: ");
            razaDePerros.add(leer.next());

            System.out.println("Quieres agregar otra raza de Perro (S/N)");
            String valor = leer.next().toUpperCase();
            //    valor.toUpperCase();
            if (valor.equals("N")) {
                condition = false;
            }

        } while (condition == true);
        System.out.println("La Lista de las razas de perros es: ");
        for (String aux : razaDePerros) {
            System.out.print(aux + " | ");
        }
        System.out.println();
        /*
            2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
         */
        System.out.println("AHORA! Ingrese una raza de PErro que desea eliminar de la lista: ");
        String razaEliminar = leer.next();
        int cont = 0;
        for (int i = 0; i < razaDePerros.size(); i++) {
            String m = razaDePerros.get(i);
            if (m.equals(razaEliminar)) {
                razaDePerros.remove(m);
                cont += 1;
            }

        }
        if (cont == 0) {
            Collections.sort(razaDePerros);

            System.out.println("No se encontro la raza de perro a eliminar. La lista de razas quedo asi:");
           
            
            for (String aux : razaDePerros) {
                System.out.print(aux + " | ");
            }
            System.out.println();

        }else
        {
                 Collections.sort(razaDePerros);
            System.out.println("Si se encontro la RAZA y se elimino de la lista. \n "
                    + "La lista quedo asi:");
            
                        for (String aux : razaDePerros) {
                System.out.print(aux + " | ");
            }
            System.out.println();
            
        }
        
        System.out.println("FIN DEL PROGRAMA. HASTA LUEGO!");
    }

}
