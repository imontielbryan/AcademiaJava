package polimorfismo;

public class Bicicleta extends MedioAbstracto{
    // 1000 metros se recorren aproximadamente en 4 minutos
    public Bicicleta(double distancia){
        super("Bicicleta \uD83D\uDEB4", 4, distancia);
    }

    @Override
    public double CalculaTiempo() {
        return (tiempo * distancia) / 1000;
    }
}
