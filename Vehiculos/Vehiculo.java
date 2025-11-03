package Vehiculos;

class Vehiculo {
    private String placa, marca, modelo;
    private int kilometraje;

    
    public Vehiculo() {
        this("", "", "", 0);
    }

  
    public Vehiculo(String placa, String marca, String modelo, int kilometraje) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = Math.max(kilometraje, 0); 
        Flota.totalVehiculos++;
    }

    
    public void setPlaca(String placa) { this.placa = placa; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setKilometraje(int km) { 
        this.kilometraje = Math.max(km, 0); 
    }

    public int getKilometraje() { return kilometraje; }

    
    public void mostrarInformacion() {
        System.out.println("Placa: " + placa + 
                           ", Marca: " + marca + 
                           ", Modelo: " + modelo + 
                           ", Kilometraje: " + kilometraje);
    }
}

class Flota {
    public static int totalVehiculos = 0;
    public static final String EMPRESA = "Logística XYZ";

    public static void mostrarTotalVehiculos() {
        System.out.println("Total de vehículos: " + totalVehiculos);
    }

    public static void mostrarNombreEmpresa() {
        System.out.println("Empresa: " + EMPRESA);
    }
}
