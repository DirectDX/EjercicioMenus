import java.sql.SQLOutput;
import java.util.List;

public class MenuClasico extends Menu {
    public MenuClasico(List<Producto> productos) {

    }

    @Override
    public Double calcularPrecio() {
        Double precio = 0.0;
        for (Producto producto : getProductos()) {
            precio = precio + producto.getPrecio();
        }
        return precio;
    }


}

