package singleton.configuracion;

public class Principal {
    public static void main(String[] args) {

        // Una vez iniciado, exite una configuración predeterminada para el grupo
        // Si se requiere hacer cambios los cambios pueden ser generados desde cualquiera
        // Ya que el status es puesto en la clase

        SingletonConfig configuracion1 = SingletonConfig.getInstance();
        SingletonConfig configuracion2 = SingletonConfig.getInstance();
        SingletonConfig configuracion3 = SingletonConfig.getInstance();

        // Se ve el valor de los 3
        System.out.println("Configuración 1 actual: " + configuracion1.getTipo());
        System.out.println("Configuración 2 actual: " + configuracion2.getTipo());
        System.out.println("Configuración 3 actual: " + configuracion3.getTipo());

        // Cambio en la configuracion1
        configuracion1.setTipo("Nueva Configuracion en 1");
        // La nueva configuracion concatenada de hecho ya es desde configuracion2
        System.out.println ("Nueva Configuración" + configuracion2.getTipo());

        // Muestra el cambio en todos
        System.out.println("Configuración 1 actual: " + configuracion1.getTipo());
        System.out.println("Configuración 2 actual: " + configuracion2.getTipo());
        System.out.println("Configuración 3 actual: " + configuracion3.getTipo());

        // Cambio en la configuracion2
        configuracion2.setTipo("Nueva Configuracion en 2");
        // La nueva configuracion concatenada de hecho ya es desde configuracion3
        System.out.println ("Nueva Configuración: " + configuracion3.getTipo());

        // Muestra el cambio en todos
        System.out.println("Configuración 1 actual: " + configuracion1.getTipo());
        System.out.println("Configuración 2 actual: " + configuracion2.getTipo());
        System.out.println("Configuración 3 actual: " + configuracion3.getTipo());

    }
}