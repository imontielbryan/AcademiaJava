package DPComposite;

public class LeafPlato implements ComponentItem{
    private String nombre;
    private int precio;

    public LeafPlato(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void mostrar(){
        System.out.println("Plato: " + nombre + " - $" + precio);
    }

    @Override
    public int obtenerPrecio(){
        return precio;
    }
}
