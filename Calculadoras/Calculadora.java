package Calculadoras;

public class Calculadora {

    
    public int multiplicarSinOperador(int a, int b) {
        int resultado = 0;

        for (int i = 0; i < b; i++) {
            resultado += a;
        }

        return resultado;
    }

    
    public int dividirSinOperador(int a, int b) {
        int cociente = 0;
        int acumulado = a;

        while (acumulado >= b) {
            acumulado -= b;
            cociente++;
        }

        return cociente;
    }
}
