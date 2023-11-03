package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Principal {
    public static void main(String[] args) {
        // Genera lista de 'Productos' de 'int n' cantidad
        List<Producto> productos = RandomList(20);
        //System.out.println(productos);

        // Valores de filtros
        double precioFiltro = 500;
        String articuloFiltro = "Camiseta";
        String marcaFiltro = "H&M";

        // Definición de lambda para 1 precio
        Predicate<Producto> precioDef = producto -> producto.getPrecio() < precioFiltro;
        // Ejecucion de lambda para 1 precio
        boolean res = precioDef.test(productos.get(0));
        if (res)
            System.out.println("El producto '" + productos.get(0).getNombreP() +
                    " " + productos.get(0).getMarca() +
                    "' tiene un precio de $" + productos.get(0).getPrecio());
        else
            System.out.println("El producto '" + productos.get(0).getNombreP() +
                    " " + productos.get(0).getMarca() +
                    "' tiene un precio mayor de $" + precioFiltro);

        System.out.println("\n+------------------------------------------------------------+\n");

        // Definicion de Lambda por método de clase
        // Aqui se mostrará el filtro de 'articuloFiltro'
        // Al ser 'String' puede comparar el 'valor'
        muestra(productos, producto -> producto.getNombreP().equals(articuloFiltro));

        System.out.println("\n+------------------------------------------------------------+\n");

        // Definición de Lambda para remover de modo Declarativo(?)
        // Para saber los articulos con la 'marcaFiltro' (not equals)
        productos.removeIf(x -> !x.getMarca().equals(marcaFiltro));

        System.out.println("Productos en la marca '" + marcaFiltro + "'");
        for(Producto prod : productos) {
            System.out.println("Articulo: '" + prod.getNombreP() + "' y con el precio de $" + prod.getPrecio());
        }
    }



    public static List<Producto> RandomList(int cantidad){
        List<Producto> listaItems = new ArrayList<>();
        Random random = new Random();

        // Strings con tipo de articulos y String con marcas
        String[] articulo = {"Camiseta", "Pantalón", "Zapatos", "Vestido", "Sombrero", "Calcetines"};
        String[] marca = {"Nike", "Adidas", "Puma", "Reebok", "H&M", "Zara"};

        for (int i = 0; i < cantidad; i++){
            String articulofor = articulo[random.nextInt(articulo.length)];
            // Precios aleatorios desde 10 a 1000, redondeados ( por  Math.round() ) y con 2 decimales (con la multiplicacion y división 100.0)
            double preciofor = (double) Math.round((10 + random.nextDouble() * 990) * 100) / 100.0; // precios aleatorios
            String marcafor = marca[random.nextInt(marca.length)];

            // Asigna los valores para crear un producto
            Producto item = new Producto(articulofor, preciofor, marcafor);
            // Añade los productos a la lista temporal
            listaItems.add(item);
        }
        // Regresa la lista generada
        return listaItems;
    }

    public static void muestra(List<Producto> listaProductos, Predicate<Producto> item){
        boolean titulo = true;

        for(Producto prod : listaProductos){
            // Ejecución de Lambda para filtro
            if(item.test(prod)) {
                if (titulo) {
                    System.out.println("Los articulos: '" + prod.getNombreP() + "' se encuentran como:");
                    titulo = false;
                }
                System.out.println("Marca: '" + prod.getMarca() + "' y con el precio de $" + prod.getPrecio());
            }
        }
    }
}