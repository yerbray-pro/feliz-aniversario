package DispositivosElectronico;

public class Main {
    public static void main(String[] args) {
        
        DispositivoElectronico smartphone = new DispositivoElectronico("Samsung", "Galaxy A10", 80);

        
        DispositivoElectronico laptop = new DispositivoElectronico("HP", "Pavilion", 60);

       
        System.out.println("== Smartphone ==");
        smartphone.encender();
        smartphone.usar(30);     
        smartphone.cargar(50);   
        smartphone.apagar();

        System.out.println();

    
        System.out.println("== Laptop ==");
        laptop.encender();
        laptop.usar(30);        
        laptop.cargar(50);       
        laptop.apagar();
    }
}
