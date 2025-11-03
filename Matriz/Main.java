package Matriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamaño = scanner.nextInt();

        CrearMatriz miMatriz = new CrearMatriz(tamaño);

        System.out.println("\nMatriz Resultante:");
        miMatriz.imprimirMatriz();

        scanner.close();
    }
}
