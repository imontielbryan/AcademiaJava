package DPComposite;

import java.util.ArrayList;
import java.util.List;

public class CompositeSeccion implements ComponentItem{
    // Lista de ComponentItem
    private List<ComponentItem> elementos = new ArrayList<>();
    private String nombre;

    public CompositeSeccion(String nombre) {
        this.nombre = nombre;
    }

    public void agregarElemento(ComponentItem elemento) {
        elementos.add(elemento);
    }
    @Override
    public void mostrar() {
        System.out.println("Sección del Menú: " + nombre);
        for (ComponentItem elemento : elementos) {
            if (elemento instanceof CompositeSeccion) {
                System.out.print("  "); // Añadir dos espacios de sangría para las secciones
            }
            elemento.mostrar();
        }
    }

    @Override
    public int obtenerPrecio() {
        int precioTotal = 0;
        for (ComponentItem elemento : elementos) {
            precioTotal += elemento.obtenerPrecio();
        }
        //return Math.round(precioTotal * 100) / 100;
        return precioTotal;
    }

}
