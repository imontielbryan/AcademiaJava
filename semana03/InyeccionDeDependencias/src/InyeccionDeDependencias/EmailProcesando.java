package InyeccionDeDependencias;

public class EmailProcesando implements ServicioEmail{
    @Override
    public void sendEmail(String to) {
        System.out.println("Enviando correo a: " + to);
        System.out.println("Asunto: Estado del Pedido");
        System.out.println("Su pedido se encuentra en proceso de envío");
    }
}
