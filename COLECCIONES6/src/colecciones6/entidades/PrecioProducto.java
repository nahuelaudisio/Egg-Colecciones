
package colecciones6.entidades;

public class PrecioProducto {
    
    private double precio;

    public PrecioProducto() {
    }

    public PrecioProducto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "PrecioProducto{" + "precio=" + precio + '}';
    }
    
}
