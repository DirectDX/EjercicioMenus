import java.util.List;

public class MenuVegetariano extends Menu {
    public MenuVegetariano(List<Producto> productos) {

    }

    @Override
    public Double calcularPrecio() {
        Double precio = 0.0;
        for (Producto producto : getProductos()) {
            if (producto instanceof SalsaVegetariana) {

                precio = precio + producto.getPrecio() + 2;
            } else if (producto instanceof Especia) {
                precio = precio * 1.01;
            } else {
                precio = precio + producto.getPrecio();
            }

        }
        return precio;
    }
}