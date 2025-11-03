package Calculadoras;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Multiplicar 3 * 4 = " + calc.multiplicarSinOperador(3, 4));
        System.out.println("Multiplicar 5 * 0 = " + calc.multiplicarSinOperador(5, 0));

        System.out.println("Dividir 10 / 2 = " + calc.dividirSinOperador(10, 2));
        System.out.println("Dividir 15 / 3 = " + calc.dividirSinOperador(15, 3));
    }
}
