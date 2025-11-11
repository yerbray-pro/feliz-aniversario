package Prendas;

public class Prenda {
    protected double precio;
    protected String talla;
    protected String material;

    public Prenda(double precio, String talla, String material) {
        this.precio = precio;
        this.talla = talla;
        this.material = material;
    }

    public double calcularDescuento(){
        return 0;
    }

    public double precioFinal(){
        return precio - calcularDescuento();
    }

    public void mostrarInfo(){
        System.out.println("Prenda general: $" + precioFinal());
    }
}

class Camiseta extends Prenda {
    private String tipoManga; // corta o larga

    public Camiseta(double precio, String talla, String material, String tipoManga) {
        super(precio, talla, material);
        this.tipoManga = tipoManga;
    }

    @Override
    public double calcularDescuento() {
        return precio * 0.10; // 10% de descuento en camisetas
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Camiseta (" + tipoManga + ") - precio final $" + precioFinal());
    }
}
class Pantalon extends Prenda {
    private String tipoPantalon;
    
    public Pantalon(double precio, String talla, String material, String tipoPantalon) {
        super(precio, talla, material);
        this.tipoPantalon = tipoPantalon;
    }
    @Override
    public double calcularDescuento() {
        return precio * 0.15; // 15% de descuento en pantalones
    }
    @Override
    public void mostrarInfo(){
        System.out.println("pantalon (" + tipoPantalon + ") - precio final $" + precioFinal());
    }
}
class Abrigo extends Prenda {
    private String tipoAbrigo; // invierno o verano

    public Abrigo(double precio, String talla, String material, String tipoAbrigo) {
        super(precio, talla, material);
        this.tipoAbrigo = tipoAbrigo;
    }

    @Override
    public double calcularDescuento() {
        return precio * 0.20; // 20% de descuento en abrigos
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Abrigo (" + tipoAbrigo + ") - precio final $" + precioFinal());
    }
}
