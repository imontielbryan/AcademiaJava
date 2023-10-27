package polimorfismo;

public class Principal {
    // puesta aqui para usarla en ambos metodos
    static double distancia1 = 31416;

    public static void main(String[] args) {
        // La idea de este es comparar cuanto tardarías usando un transporte distinto
        // para cada cierta distancia
        // similar a lo que muestra Google Maps en el tipo de recorrido


        // Creacion de las instancias hijas en array
        Medio[] arraymedios = {
                new Caminando(distancia1),
                new Corriendo(distancia1),
                new Bicicleta(distancia1),
                new Moto(distancia1),
                new Auto(distancia1)
        };

        // Medio prueba = new Caminando(1000);
        // System.out.println(prueba.CalculaTiempo());

        tiempoRecorrido(arraymedios);

    }

    private static void tiempoRecorrido(Medio[] arraymedios){
        System.out.println("Para la distancia "+ (int)distancia1 + " metros");
        for (Medio medio: arraymedios){
            System.out.println(medio);
            System.out.println("Tardarías: " + (int)medio.CalculaTiempo() + " minutos");
        }
    }
}