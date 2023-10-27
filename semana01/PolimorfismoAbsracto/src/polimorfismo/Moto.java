package polimorfismo;

public class Moto extends MedioAbstracto{
    // 1000 metros se recorren aproximadamente en 1.5 minutos
    public Moto(double distancia){
        super("Moto \uD83C\uDFCD\uFE0F", 1.5, distancia);
    }

    @Override
    public double CalculaTiempo() {
        //tiempo = (13 * metros) / 1000;
        return (tiempo * distancia) / 1000;
    }
}
