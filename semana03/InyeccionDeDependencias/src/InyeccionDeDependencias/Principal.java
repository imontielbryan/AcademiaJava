package InyeccionDeDependencias;

public class Principal {
    public static void main(String[] args) {

        Orden o00 = Inyector.inyectarEmail("982323", "Ariel Doritos",
                "cliente00@example.com",'g');
        Orden o01 = new Orden("567222", "David Montecinos",
                "cliente01@example.com", new Pago(), new EmailCorrecto());
        Orden o02 = Inyector.inyectarEmail("826661", "Miroslava Tlapale",
                "cliente02@example.com",'E');

        o00.processOrder();
        System.out.println("\n+-------------------------------------------------------------+\n");
        o01.processOrder();
        System.out.println("\n+-------------------------------------------------------------+\n");
        o02.processOrder();
    }
}
