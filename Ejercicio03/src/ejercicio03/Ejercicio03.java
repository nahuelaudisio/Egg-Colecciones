/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
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
Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.
 */
package ejercicio03;

import entidades.Alumno;
import java.util.Scanner;
import servicios.AlumnoServicio;

/**
 *
 * @author Hernan
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        AlumnoServicio as = new AlumnoServicio();
        
        
        do {            
            as.crearAlumno();
            System.out.println("quiere crear otro registro de alumno");
            if(leer.next().equals("no"))
                break;           
        } while (true);
        
        
        for (Alumno alumno : as.getAlumnos()) {
            System.out.println(alumno.toString());
        }
        
        System.out.println("Ingrese un alumno");
        String nombre = leer.next(); // pepe
        
        for (Alumno alumno : as.getAlumnos()) {
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(as.notaFinal(alumno.getNotas()));
            }    
        }
         
    }
    
    
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
