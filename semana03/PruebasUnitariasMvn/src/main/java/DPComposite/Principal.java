package DPComposite;

public class Principal {
    public static void main(String[] args) {
        // Items de Ensalada
        ComponentItem ensaladaCesar = new LeafPlato("Ensalada César", 129);
        ComponentItem ensaladaCaprese = new LeafPlato("Ensalada Caprese", 119);
        ComponentItem ensaladaCamarones = new LeafPlato("Ensalada de Camarones", 159);
        ComponentItem ensaladaVegetariana = new LeafPlato("Ensalada Vegetariana", 109);

        // Items para Pastas
        ComponentItem pastaAlfredo = new LeafPlato("Pasta Alfredo", 159);
        ComponentItem pastaBolognesa = new LeafPlato("Pasta a la Boloñesa", 149);
        ComponentItem pastaPesto = new LeafPlato("Pasta al Pesto", 139);

        // Items solitarios
        ComponentItem polloParmesano = new LeafPlato("Pollo Parmesano", 189);
        ComponentItem filetePescado = new LeafPlato("Filete de Pescado", 209);
        ComponentItem costillasBBQ = new LeafPlato("Costillas BBQ", 229);


        ComponentItem refresco = new LeafBebida("Refresco", 39);
        ComponentItem agua = new LeafBebida("Agua Natural", 29);
        ComponentItem aguaM = new LeafBebida("Agua Mineral", 39);


        // Subsecciones
        CompositeSeccion ensaladas = new CompositeSeccion("Ensaladas");
        ensaladas.agregarElemento(ensaladaCesar);
        ensaladas.agregarElemento(ensaladaCaprese);
        ensaladas.agregarElemento(ensaladaCamarones);
        ensaladas.agregarElemento(ensaladaVegetariana);

        CompositeSeccion pastas = new CompositeSeccion("Pastas");
        pastas.agregarElemento(pastaAlfredo);
        pastas.agregarElemento(pastaBolognesa);
        pastas.agregarElemento(pastaPesto);

        CompositeSeccion bebidas = new CompositeSeccion("Bebidas");
        bebidas.agregarElemento(refresco);
        bebidas.agregarElemento(agua);
        bebidas.agregarElemento(aguaM);

        CompositeSeccion platosFuertes = new CompositeSeccion("Platos Fuertes");
        platosFuertes.agregarElemento(polloParmesano);
        platosFuertes.agregarElemento(filetePescado);
        platosFuertes.agregarElemento(costillasBBQ);
        platosFuertes.agregarElemento(ensaladas);
        platosFuertes.agregarElemento(pastas);

        CompositeSeccion menuCompleto = new CompositeSeccion("MENU COMPLETO");
        menuCompleto.agregarElemento(platosFuertes);
        menuCompleto.agregarElemento(bebidas);

        System.out.println("\n*----------------------------------------------------------------------+\n");
        System.out.println("Método mostar\n");
        menuCompleto.mostrar();

        System.out.println("\n*----------------------------------------------------------------------+\n");

        int precioTotal = menuCompleto.obtenerPrecio();
        System.out.println("Precio Total del Menú: $" + precioTotal);
    }
}