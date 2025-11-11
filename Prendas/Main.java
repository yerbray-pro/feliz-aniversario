package Prendas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Prenda> prendas = new ArrayList<>();

        prendas.add(new Camiseta(50000, "M", "Algodon", "Corta"));
        prendas.add(new Pantalon(80000, "L", "Jeans", "Largo"));
        prendas.add(new Abrigo(60000, "S", "Poliester", "Larga"));

        System.out.println("Listado de prendas con precios finales:");
        for(Prenda prenda : prendas){
            prenda.mostrarInfo();
        }
    }
    
}
