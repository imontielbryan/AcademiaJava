package polimorfismo;

public class Corriendo extends MedioAbstracto{
    // 1000 metros se recorren aproximadamente en 6 minutos
    public Corriendo(double distancia){
        super("Corriendo \uD83C\uDFC3", 6, distancia);
    }

    @Override
    public double CalculaTiempo() {
        return (tiempo * distancia) / 1000;
    }
}
