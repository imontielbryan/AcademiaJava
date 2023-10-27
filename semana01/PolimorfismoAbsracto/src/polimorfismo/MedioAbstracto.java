package polimorfismo;

public abstract class MedioAbstracto implements Medio {
    String nombreMedio;
    double tiempo, distancia;

    public MedioAbstracto(String nombreMedio,double tiempo, double distancia){
        this.nombreMedio = nombreMedio;
        this.tiempo = tiempo;
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "El medio es "+nombreMedio;
    }
}
