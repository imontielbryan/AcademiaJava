package singleton.configuracion;

public class SingletonConfig {
    private String tipo; //tipo de configuracion
    private static SingletonConfig configuracion;

    private SingletonConfig(){
        tipo = "Configuracion Predeterminada";
    }

    public static SingletonConfig getInstance(){
        if (configuracion == null)
            configuracion = new SingletonConfig();
        return configuracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
