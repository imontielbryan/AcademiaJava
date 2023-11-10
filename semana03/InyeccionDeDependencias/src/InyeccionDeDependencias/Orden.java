package InyeccionDeDependencias;

public class Orden {
    private String numeroOrden;
    private String nombre;
    private String email;
    private PagoServicio pagoS;
    private ServicioEmail emailS;

    // inyeccion de Dependencias por constructor
    public Orden(String numeroOrden, String nombre, String email, PagoServicio pagoS, ServicioEmail emailS) {
        this.numeroOrden = numeroOrden;
        this.nombre = nombre;
        this.email = email;
        this.pagoS = pagoS;
        this.emailS = emailS;
    }

    public void processOrder() {
        System.out.println("#" + numeroOrden);
        System.out.println("A nombre de: " + nombre);

        // Acción para el proceso de la orden
        System.out.println("\nProcesando la orden...\n");

        // Procesar el pago
        pagoS.procesoPago();
        System.out.println();
        // Enviar confirmación por correo electrónico
        emailS.sendEmail(email);
    }
}
