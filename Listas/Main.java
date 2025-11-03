package Listas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] lista = {2, 2, 2, 4, 6, 6, 8, 8, 8, 8};

        List<String> reporte = Lista.Frecuencia(lista);

        System.out.println("Reporte de frecuencias:");
        for (String linea : reporte) {
            System.out.println(linea);
        }
    }
}
