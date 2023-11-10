package InyeccionDeDependencias;

public class Pago implements PagoServicio{

    @Override
    public void procesoPago(){
        System.out.println("Procesando el pago ...");
    }
}
