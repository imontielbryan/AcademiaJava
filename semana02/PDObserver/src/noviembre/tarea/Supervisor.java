package noviembre.tarea;

public class Supervisor extends Observador{
    String supervisor_name;
    public Supervisor(Sujeto sujeto){
        super(sujeto);
    }

    void MuestraNombre(){
        System.out.println("Cuenta de Supervisor");
        System.out.println("Clima actual: " + climaActual);
    }

    @Override
    void update(){
        this.climaActual = sujeto.obtenerClima();
        MuestraNombre();
    }
}
