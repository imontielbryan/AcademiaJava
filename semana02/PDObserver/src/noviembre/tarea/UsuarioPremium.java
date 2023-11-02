package noviembre.tarea;

public class UsuarioPremium extends Observador{
    String usuraiop_name;
    public UsuarioPremium(String usuraiop_name, Sujeto sujeto){
        super(sujeto);
        this.usuraiop_name = usuraiop_name;
    }

    void MuestraNombre(){
        System.out.println("Nombre de Usuario Premium: " + usuraiop_name);
        System.out.println("Clima actual: " + climaActual);
        System.out.println("Existe la posibilidad de que el clima cambie a:");
        this.climaActual = sujeto.obtenerClima();
        System.out.println(climaActual);

    }

    @Override
    void update(){
        this.climaActual = sujeto.obtenerClima();
        MuestraNombre();
    }
}
