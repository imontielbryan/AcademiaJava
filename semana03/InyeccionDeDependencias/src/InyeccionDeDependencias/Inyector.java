package InyeccionDeDependencias;

public class Inyector {
    static Orden inyectarEmail(String numeroOrden, String nombre, String email,char c) {
        if (c=='C')
            return new Orden(numeroOrden,nombre, email, new Pago(), new EmailCorrecto());
        else if (c=='E')
            return new Orden(numeroOrden,nombre, email, new Pago(), new EmailError());
        else
            return new Orden(numeroOrden,nombre, email, new Pago(), new EmailProcesando());
    }
}
