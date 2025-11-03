package Listas;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static List<String> Frecuencia(int[] numeros) {
        List<String> resultado = new ArrayList<>();

        if (numeros.length == 0) {
            return resultado; 
        }

        int actual = numeros[0]; 
        int conteo = 1;         

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == actual) {
                conteo++; 
            } else {
               
                resultado.add(actual + " aparece " + conteo + " veces");
                actual = numeros[i]; 
                conteo = 1;          
            }
        }

        
        resultado.add(actual + " aparece " + conteo + " veces");

        return resultado;
    }
}
