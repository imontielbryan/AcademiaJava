package polimorfismo;

public class Caminando extends MedioAbstracto{
    // 1000 metros se recorren aproximadamente en 13 minutos
    public Caminando(double metros){
        super("Caminando \uD83D\uDEB6", 13, metros);
    }

    @Override
    public double CalculaTiempo() {
        //tiempo = (13 * metros) / 1000;
        return tiempo * distancia / 1000;
    }

}
