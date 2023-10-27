package polimorfismo;

public class Auto extends MedioAbstracto{
    // 1000 metros se recorren aproximadamente en 2 minutos
    public Auto(double distancia){
        super("Auto \uD83D\uDE97", 2, distancia);
    }

    @Override
    public double CalculaTiempo() {
        return (tiempo * distancia) / 1000;
    }
}
