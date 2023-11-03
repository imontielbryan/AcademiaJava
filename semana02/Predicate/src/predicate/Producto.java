package predicate;

public class Producto {
    // Es una clase producto simple con los atributos
    // nombreP, precio, marca
    // sus respectvos getters y setters
    // y un ToString que ayudó en la lectura de cada Producto
    private String nombreP;
    private double precio;
    private String marca;

    public Producto(String nombreP, double precio, String marca) {
        this.nombreP = nombreP;
        this.precio = precio;
        this.marca = marca;
    }

    public String getNombreP() {
        return nombreP;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreP='" + nombreP + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
