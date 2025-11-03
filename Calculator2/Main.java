package Calculator2;
// Interfaz común
interface Mensaje {
    String getTexto();
}

// Implementación básica
class MensajeSimple implements Mensaje {
    public String getTexto() {
        return "Hola mundo";
    }
}

// Decorador base
abstract class MensajeDecorador implements Mensaje {
    protected Mensaje mensaje;

    public MensajeDecorador(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public String getTexto() {
        return mensaje.getTexto();
    }
}

// Decorador que añade signo de exclamación
class ExclamacionDecorador extends MensajeDecorador {
    public ExclamacionDecorador(Mensaje mensaje) {
        super(mensaje);
    }

    public String getTexto() {
        return mensaje.getTexto() + "!";
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        Mensaje mensaje = new MensajeSimple();                   
        Mensaje decorado = new ExclamacionDecorador(mensaje);    

        System.out.println("Mensaje simple: " + mensaje.getTexto());
        System.out.println("Mensaje decorado: " + decorado.getTexto());
    }
}
