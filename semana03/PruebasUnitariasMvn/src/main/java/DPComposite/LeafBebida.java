package DPComposite;

public class LeafBebida implements ComponentItem{
    private String nombre;
    private int precio;

    public LeafBebida(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void mostrar() {
        System.out.println("Bebida: " + nombre + " - $" + precio);
    }

    @Override
    public int obtenerPrecio() {
        return precio;
    }
}
