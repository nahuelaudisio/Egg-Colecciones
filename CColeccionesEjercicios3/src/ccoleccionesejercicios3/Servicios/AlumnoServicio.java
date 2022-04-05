/*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
package ccoleccionesejercicios3.Servicios;

import ccoleccionesejercicios3.Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class AlumnoServicio {

    private Scanner leer;
    private ArrayList<Alumno> alumnos;

    public AlumnoServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList();
    }

    public void crearAlumno() {
        ArrayList<Integer> notas = new ArrayList<>();
        String nombre;
        
        System.out.println("Ingrese el nombre del Alumno: ");
        nombre = leer.next();
        
        for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota numero "+(i+1));
            notas.add(leer.nextInt());
        }
        alumnos.add( new Alumno(nombre, notas));

        
    }
    
       public void mostrarAlumnos() {
        System.out.println("Los Alumnos actuales de las listas son : ");
        for (Alumno aux : alumnos) {
            System.out.println(aux.toString());

        }
        System.out.println("cantidad = " + alumnos.size());

    }
       
       public void notaFinal(){
           System.out.println("Ingrese el Nombre del alumno que quiera su promedio FINAL: ");
           
           String nombre = leer.next();
           
           for (Alumno alumno : alumnos) {
               if (alumno.getNombre().equals(nombre)) {
                   int suma = sumaNotas(alumno.getNotas());
                   
                   float notaFinal = suma/alumno.getNotas().size();
                   
                   System.out.println("La Nota final del Alumno "+alumno.getNombre()+" es : "+notaFinal);
               }
           }
       }
       
       public int sumaNotas (ArrayList<Integer> notas){
           int acumulador = 0;
           
           for (Integer nota : notas) {
            acumulador += nota;   
           }
           return acumulador;
       }

}
