package noviembre.tarea;

public class Aplicacion extends Observador{
    String aplicacion_name;
    public Aplicacion(String aplicacion_name, Sujeto sujeto){
        super(sujeto);
        this.aplicacion_name = aplicacion_name;
    }

    void MuestraNombre(){
        System.out.println(aplicacion_name);
        System.out.println("El estado del día de hoy es: "
                + climaActual +
                " por favor tome sus precauciones");
    }

    @Override
    void update(){
        this.climaActual = sujeto.obtenerClima();
        MuestraNombre();
    }
}
