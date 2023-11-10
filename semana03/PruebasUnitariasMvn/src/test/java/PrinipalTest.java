import DPComposite.ComponentItem;
import DPComposite.CompositeSeccion;
import DPComposite.LeafBebida;
import DPComposite.LeafPlato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrinipalTest {

    // Básico de comprobación del obtenerPrecio() en un elemento
    @Test
    public void test01(){
        String nombrePlato = "Comida01";
        int precio = 100;
        ComponentItem c1 = new LeafPlato(nombrePlato, precio);
        assertEquals(precio, c1.obtenerPrecio());
    }


    // Precio de 1 seccion con 2 secciones con elementos cada una
    @Test
    public void test02(){
        String nombrePlato01 = "Comida01";
        String nombrePlato02 = "Comida02";
        String nombrePlato03 = "Comida03";
        String nombreBebida01 = "Comida04";
        String nombreBebida02 = "Comida05";
        int precio01 = 200;
        int precio02 = 100;

        ComponentItem c1 = new LeafPlato(nombrePlato01, precio01);
        ComponentItem c2 = new LeafPlato(nombrePlato02, precio01);
        ComponentItem c3 = new LeafPlato(nombrePlato03, precio01);
        ComponentItem c4 = new LeafBebida(nombreBebida01, precio02);
        ComponentItem c5 = new LeafBebida(nombreBebida02, precio02);
        CompositeSeccion cs1 = new CompositeSeccion("Seccion01");
        cs1.agregarElemento(c1);
        cs1.agregarElemento(c2);
        cs1.agregarElemento(c3);
        CompositeSeccion cs2 = new CompositeSeccion("Seccion02");
        cs2.agregarElemento(c4);
        cs2.agregarElemento(c5);
        CompositeSeccion cs3 = new CompositeSeccion("SeccionGeneral");
        cs3.agregarElemento(cs1);
        cs3.agregarElemento(cs2);

        assertEquals(precio01 * 3, cs1.obtenerPrecio());
        assertEquals(precio02 * 2, cs2.obtenerPrecio());
        assertEquals(precio01 * 3 + precio02 * 2, cs3.obtenerPrecio());
    }

    // Caso ceros, inciial vacio
    @Test
    public void test03(){
        String nombrePlato01 = "Comida01";
        String nombrePlato02 = "Comida02";
        String nombrePlato03 = "";
        int precio01 = 100;
        int precio02 = 200;
        int precio03 = 0;

        ComponentItem c1 = new LeafPlato(nombrePlato01, precio01);
        ComponentItem c2 = new LeafPlato(nombrePlato02, precio02);
        ComponentItem c3 = new LeafPlato(nombrePlato03, precio03);

        CompositeSeccion cs1 = new CompositeSeccion("Seccion01");
        cs1.agregarElemento(c1);
        cs1.agregarElemento(c2);
        cs1.agregarElemento(c3);


        CompositeSeccion cs2 = new CompositeSeccion("Seccion01");

        cs1.agregarElemento(cs2);

        assertEquals(0, cs2.obtenerPrecio());
        assertEquals(precio01 + precio02, cs1.obtenerPrecio());

    }
}
