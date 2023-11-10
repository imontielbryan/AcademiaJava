package InyeccionDeDependencias;

public class EmailError implements ServicioEmail{
    @Override
    public void sendEmail(String to) {
        System.out.println("Enviando correo a: " + to);
        System.out.println("Asunto: Estado del Pedido");
        System.out.println("Su pedido se ha perdido, favor de comunicarse al correo\n" +
                "olakase@example.com");
    }
}
