package noviembre.tarea;

import java.util.*;

public abstract class Sujeto {
    private List<Observador> listaObservadores = new ArrayList<>(); // Lista de Observadores
    private String climaActual;  // Usado para mandar un clima al Observador en ejecución
    private final List<String> climasPosibles = Arrays.asList("Soleado ☀\uFE0F", "Nublado ☁\uFE0F", "Lluvioso \uD83C\uDF27\uFE0F", "Nevado ❄\uFE0F");
    // Lista para obtener un clima


    // Método 'attach' para añadir 'Observadores' en la lista
    void attach(Observador obs){
        listaObservadores.add(obs);
    }

    // Metodo 'detach' para quitar 'Observadores' de la lista
    void detach(Observador obs){
        listaObservadores.remove(obs);
    }

    // Metodo 'notifica' para llamar al método 'update' de cada
    // Observador en la lista actual ('listaobservadores')
    void notifica(){
        for (Observador obs: listaObservadores){
            obs.update();
        }
    }

    // Metodo 'obtenerClima', utiliza la lista de climas posibles
    // para regresar un String con el 'climaActual'
    // Depende de cada clase Observador mandarlo al padre para inicializar el valor
    // Puede ser utilizado varias veces
    public String obtenerClima() {
        Random random = new Random();
        climaActual = climasPosibles.get(random.nextInt(climasPosibles.size()));
        return climaActual;
    }
}
