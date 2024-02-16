import java.util.ArrayList;
import java.util.List;

public abstract class Menu {
    protected List<Producto> productos;

    public Menu() {
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public abstract Double calcularPrecio();
    public String armado() {
        String comoArmarlo ="Armar el menu con";
        for (Producto producto : getProductos()) {
            comoArmarlo += "\n" + producto.getNombre();
        }
        return comoArmarlo;
    }

}
