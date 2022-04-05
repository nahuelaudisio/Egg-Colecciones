
package colecciones6.servicios;

import colecciones6.entidades.NombreProducto;
import colecciones6.entidades.PrecioProducto;
import static java.lang.Character.toLowerCase;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ServicioProducto {
        
    Scanner leer;
    HashMap<NombreProducto, PrecioProducto> productos;
    
    public ServicioProducto() {
        
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap();
        
    }
    
    public void menu() {
        
        char decision;
        
        do{
            
            System.out.println("---------------------MENU---------------------");
            System.out.println("OPERACIONES:");
            System.out.println("1 - CARGAR PRODUCTOS.");
            System.out.println("2 - ACTUALIZAR PRECIO DE ACUERDO AL NOMBRE.");
            System.out.println("3 - ELIMINAR PRODUCTO DE ACUERDO AL NOMBRE.");
            System.out.println("4 - MOSTRAR PRODUCTOS DE ACUERDO A PRECIO.");
            
            System.out.println("ingrese opcion:");
            int opcion = leer.nextInt();
            opcion = validaEntero(opcion, 1, 4);
            
            switch (opcion) {
                case 1:
                    fabricaProductos();
                    break;
                case 2:
                    actualizarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductoPrecio();
                default:
                    System.out.println("error.");
                    break;
            }
            
            System.out.println("desea realizar otra operacion? (s/n):");
            decision = leer.next().charAt(0);
            decision = toLowerCase(decision);
            decision = validaCaracter(decision, 's', 'n');
        }while(decision=='s');
        
    }
    
    public int validaEntero(int nro, int li, int ls) {
        
        while(nro<li || nro>ls) {
            
            System.out.println("valor incorrecto, vuelva a ingresar:");
            nro = leer.nextInt();
            
        }
        
        return nro;
        
    }
    
    public void fabricaProductos() {
        
        NombreProducto np;
        PrecioProducto pp;
        
        char decision;
        
        do{
            
            np = crearNombreProducto();
            pp = crearPrecioProducto();
            
            agregarProducto(np, pp);
            
            System.out.println("desea agregar otro producto? (s/n): ");
            decision = leer.next().charAt(0);
            decision = toLowerCase(decision);
            decision = validaCaracter(decision, 's', 'n');
            
        }while(decision =='s');
        
    }
    
    public NombreProducto crearNombreProducto() {
        
        NombreProducto np;
        
        System.out.println("ingrese nombre del producto:");
        String nombreproducto = leer.next();
        
        np = new NombreProducto(nombreproducto);
        
        return np;
        
    }
    
    public PrecioProducto crearPrecioProducto() {
        
        PrecioProducto pp;
        
        System.out.println("ingrese precio del producto: ");
        double precioproducto = leer.nextDouble();
        
        pp = new PrecioProducto(precioproducto);
        
        return pp;
        
    }
    
    public void agregarProducto(NombreProducto np, PrecioProducto pp) {
        
        productos.put(np, pp);
        
    }
    
    public char validaCaracter(char caracter, char l1, char l2) {
        
        while(caracter!=l1 && caracter!=l2) {
            
            System.out.println("valor incorrecto, vuelva a ingresar: ");
            caracter = leer.next().charAt(0);
            caracter = toLowerCase(caracter);
            
        }
        
        return caracter;
        
    }
    
    public void actualizarPrecio() {
        
        char decision;
        
        System.out.println("-------------------ACTUALIZAR PRECIO-------------------");
        
        do{
            
            System.out.println("ingrese el nombre del producto que desea modificar el precio:");
            String nombreproducto = leer.next();
            
            for (Map.Entry<NombreProducto, PrecioProducto> aux : productos.entrySet()) {
                
                if(nombreproducto.equals(aux.getKey().getNombre())) {
                    
                    System.out.println("el precio actual del producto \""+aux.getKey().getNombre()+"\" es: "+aux.getValue().getPrecio());
                    
                    System.out.println("ingrese nuevo precio: ");
                    double nuevoprecio = leer.nextDouble();
                    
                    aux.getValue().setPrecio(nuevoprecio);
                    
                    System.out.println("el precio actualizado del producto \""+aux.getKey().getNombre()+"\" es: "+aux.getValue().getPrecio());
                    
                }   
            }
                    
            System.out.println("desea actualizar otro precio?");   
            decision = leer.next().charAt(0);
            decision = toLowerCase(decision);
            decision = validaCaracter(decision,'s', 'n');
        }while(decision == 's');
        
    }
    
    public void eliminarProducto() {
        
        char decision;
        boolean band = false;
        
        do{
            
            System.out.println("ingrese el nombre del producto que desea eliminar: ");
            String nombreproducto = leer.next();
            
            for (Map.Entry<NombreProducto, PrecioProducto> entry : productos.entrySet()) {
                
                if(entry.getKey().getNombre().equals(nombreproducto)) {
                    
                    System.out.println("el producto \""+entry.getKey()+"\" se ha eliminado.");
                    productos.remove(entry.getKey());
                    
                    band=true;
                    
                    break;//salgo del bucle porque los mapas no tienen elementos duplicados, por lo tanto no tiene sentido seguir iterando
                          //porque no hay otro elemento con el mismo nombre.
                }
            }
            
            if(band=false) {
                
                System.out.println("no se ha encontrado un producto con el nombre \""+nombreproducto+"\".");
                
            }
            
            System.out.println("desea eliminar otro producto? (s/n):");
            decision = leer.next().charAt(0);
            decision = toLowerCase(decision);
            decision = validaCaracter(decision, 's', 'n');
            
        }while(decision=='s');
        
    }
    
    public void mostrarProductoPrecio() {
        
        boolean band=false;
        char decision;
        
        do{
            
            System.out.println("ingresar precio:");
            double precio = leer.nextDouble();
            
            for (Map.Entry<NombreProducto, PrecioProducto> entry : productos.entrySet()) {
                
                if(entry.getValue().equals(precio)) {
                    
                    System.out.println("producto: \""+entry.getKey()+"\"");
                    System.out.println("precio: \""+entry.getValue()+"\"");
                    
                    band=true;
                }
            }
            
            if(band=false) {
                
                System.out.println("no se ha encontrado productos con el precio \""+precio+"\"");
                
            }
            
            System.out.println("desea ingresar otro precio? (s/n):");
            decision = leer.next().charAt(0);
            decision = toLowerCase(decision);
            decision = validaCaracter(decision, 's', 'n');
        
        }while(decision=='s');
        
    }
    
}
