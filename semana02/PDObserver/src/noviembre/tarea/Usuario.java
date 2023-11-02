package noviembre.tarea;

public class Usuario extends Observador{
    String usuario_name;
    public Usuario(String usuario_name, Sujeto sujeto){
        super(sujeto);
        this.usuario_name = usuario_name;
    }

    void MuestraNombre(){
        System.out.println("Nombre de Usuario: " + usuario_name);
        System.out.println("Clima actual: " + climaActual);
    }

    @Override
    void update(){
        this.climaActual = sujeto.obtenerClima();
        MuestraNombre();
    }

}
