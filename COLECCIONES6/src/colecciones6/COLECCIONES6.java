
package colecciones6;

import colecciones6.servicios.ServicioProducto;
import java.util.Scanner;

public class COLECCIONES6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioProducto sp = new ServicioProducto();
        
        sp.menu();
    }
    
}
