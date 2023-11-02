package noviembre.tarea;

public class Noticias extends Observador{
    String noticias_name;
    public Noticias(String noticias_name, Sujeto sujeto){
        super(sujeto);
        this.noticias_name = noticias_name;
    }

    void MuestraNombre(){
        System.out.println("Buenos días Mundo! Hoy en "
                + noticias_name +
                " presentamos que el estado del clima es: ");
        System.out.println(climaActual);
    }

    //@Override
    void update(){
        this.climaActual = sujeto.obtenerClima();
        MuestraNombre();
    }
}
