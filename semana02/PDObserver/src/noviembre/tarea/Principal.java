package noviembre.tarea;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello Observer!");

        // 'admin' es nuestra instancia que hereda de Sujeto
        // Se hace una instancia ya que se requiere de un objeto 'Administrador'
        // Para el uso de los Observadores, en uno de sus argumentos.
        Administrador admin = new Administrador();

        // Generacion de instancias de Observadores
        // En este caso es un 'Usuario' y un 'Usuario premiun'
        Usuario user = new Usuario("Usuario 01", admin);
        UsuarioPremium userP = new UsuarioPremium("Usuario Premium 01", admin);

        // Se usa el método para que los observadores puedan mostrar sus cambios
        admin.ReportarClima();

        // Uso del metodo 'detach' que viene del padre 'Sujeto'
        // para que pueda eliminar de la lista de Observadores
        admin.detach(userP);
        admin.detach(user);

        System.out.println("+----------------------------------------------+");

        // Nuevo Observador con respectivo Reporte y método detach posterior
        Aplicacion app = new Aplicacion("App01", admin);
        admin.ReportarClima();
        admin.detach(app);
        System.out.println("+----------------------------------------------+");

        // Nuevo Observador con respectivo Reporte y método detach posterior
        // Estos solo ayudan a mostrar que cada Observador puede hacer distintas cosas
        // con el mismo llamado
        Noticias news = new Noticias("31 Minutos", admin);
        Supervisor sup = new Supervisor(admin);
        admin.ReportarClima();

        System.out.println("+----------------------------------------------+");



    }
}