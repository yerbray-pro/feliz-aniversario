package Estudiantes;
public class Main {
    public static void main(String[] args) {

        
        Estudiante estudiante1 = new Estudiante("Fernanda", 20);
        estudiante1.matricular("Ingeniería de Sistemas");
        estudiante1.actualizarPromedio(3.8);
        estudiante1.mostrarInfo();

        System.out.println();

        Estudiante estudiante2 = new Estudiante("Yerbray", 23);
        estudiante2.matricular("Administración");
        estudiante2.actualizarPromedio(4.1);
        estudiante2.mostrarInfo();
    }
}
