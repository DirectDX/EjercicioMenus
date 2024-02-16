import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    public void testJuguete() {
        // Crear juguetes
        Juguete juguete1 = new Juguete("Juguete 1", 0.0);
        Juguete juguete2 = new Juguete("Juguete 2", 0.0);

        MenuInfantil menu = new MenuInfantil();
        menu.agregarProducto(juguete1);
        menu.agregarProducto(juguete2);

        Double precio = menu.calcularPrecio();
        assertEquals(precio,6.0);

    }
@Test
    public void armarMenu(){

        Juguete juguete1 = new Juguete("Juguete 1", 0.0);
        Juguete juguete2 = new Juguete("Juguete 2", 0.0);

        MenuInfantil menu = new MenuInfantil();
        menu.agregarProducto(juguete1);
        menu.agregarProducto(juguete2);
        String armado = menu.armado();
        assertEquals(armado,"Armar el menu con\nJuguete 1\nJuguete 2");
    }
}