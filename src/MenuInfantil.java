import java.util.List;

public class MenuInfantil extends Menu{
    public MenuInfantil() {

    }
    @Override
        public Double calcularPrecio() {
            Double precio = 0.0;
            for (Producto producto : getProductos()) {
                if (producto instanceof Juguete) {

                    precio = precio + producto.getPrecio() + 3;
                } else {
                    precio = precio + producto.getPrecio();
                }
            }
            return precio;
        }


}
