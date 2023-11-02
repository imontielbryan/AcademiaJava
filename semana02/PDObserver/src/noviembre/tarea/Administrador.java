package noviembre.tarea;

public class Administrador extends Sujeto{
    //private List<String> climasPosibles = Arrays.asList("Soleado ☀\uFE0F", "Nublado ☁\uFE0F", "Lluvioso \uD83C\uDF27\uFE0F", "Nevado ❄\uFE0F");
    void ReportarClima(){
        //Random random = new Random();
        //String climaAleatorio = climasPosibles.get(random.nextInt(climasPosibles.size()));
        //System.out.println("Clima reportado: " + climaAleatorio);
        notifica();
    }
}
