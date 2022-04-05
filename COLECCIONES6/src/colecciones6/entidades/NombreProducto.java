
package colecciones6.entidades;

import java.util.Objects;

public class NombreProducto {
    
    private String nombre;

    public NombreProducto() {
    }

    public NombreProducto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nombre);
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
        final NombreProducto other = (NombreProducto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "NombreProducto{" + "nombre=" + nombre + '}';
    }
    
}
