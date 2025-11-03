package Matriz;

public class CrearMatriz {
    int[][] matriz;
    int tamaño;

    public CrearMatriz(int tamaño) {
        this.tamaño = tamaño;
        matriz = new int[tamaño][tamaño];
        llenarMatriz();
    }

    
    public void llenarMatriz() {
        int par = 2;            
        int impar = 1;           
        int fib1 = 0, fib2 = 1; 

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == j) {
                    
                    matriz[i][j] = par;
                    par += 2;
                } else if (j > i) {
                    
                    matriz[i][j] = impar;
                    impar += 2;
                } else {
                    
                    matriz[i][j] = fib1;
                    int siguiente = fib1 + fib2;
                    fib1 = fib2;
                    fib2 = siguiente;
                }
            }
        }
    }

   
    public void imprimirMatriz() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
