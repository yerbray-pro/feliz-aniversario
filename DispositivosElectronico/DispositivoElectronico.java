package DispositivosElectronico;

public class DispositivoElectronico {
    
    String marca;
    String modelo;
    int bateria; 

   
    public DispositivoElectronico(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    
    public void encender() {
        System.out.println("El dispositivo " + marca + " - " + modelo + " se ha encendido.");
    }

    public void apagar() {
        System.out.println("El dispositivo se ha apagado.");
    }

    public void cargar(int porcentaje) {
        bateria = bateria + porcentaje;
        if (bateria > 100) {
            bateria = 100;
        }
        System.out.println("Cargando... Batería actual: " + bateria + "%");
    }

    public void usar(int minutos) {
        bateria = bateria - minutos;
        if (bateria < 0) {
            bateria = 0;
        }
        System.out.println("Usando el dispositivo por " + minutos + " minutos. Batería restante: " + bateria + "%");
    }
}
