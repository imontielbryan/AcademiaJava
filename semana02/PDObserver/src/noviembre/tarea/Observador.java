package noviembre.tarea;

public abstract class Observador {
    Sujeto sujeto; // tipo Sujeto utilizado para iniciar un Oservador en lista
    String climaActual;  // Usado para actualizar el clima
    public Observador(Sujeto sujeto){
        this.sujeto = sujeto;
        sujeto.attach(this);
    }
    // El metodo update se llama en un 'for each' dentro de Sujeto
    // para interactuar con los Observadores en la Lista actual
    abstract void update();
}
