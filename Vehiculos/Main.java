package Vehiculos;

public class Main {
    public static void main(String[] args) {
       
        Vehiculo v1 = new Vehiculo();
        v1.setPlaca("ABC123");
        v1.setMarca("Toyota");
        v1.setModelo("Corolla");
        v1.setKilometraje(15000);

      
        Vehiculo v2 = new Vehiculo("XYZ789", "Nissan", "Sentra", 20000);

     
        v1.setKilometraje(-1000);

        
        System.out.println("Kilometraje de v2: " + v2.getKilometraje());

        
        System.out.println("\n--- Información de Vehículos ---");
        System.out.print("Vehículo 1: ");
        v1.mostrarInformacion();
        System.out.print("Vehículo 2: ");
        v2.mostrarInformacion();

        
        System.out.println("\n--- Estadísticas de la Flota ---");
        Flota.mostrarNombreEmpresa();
        Flota.mostrarTotalVehiculos();
    }
}
