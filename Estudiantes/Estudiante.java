package Estudiantes;
public class Estudiante {
    
    String nombre;
    int edad;
    String carrera;
    double promedio;

    
    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = "No asignada";
        this.promedio = 0.0;
    }

    
    public void matricular(String carrera) {
        this.carrera = carrera;
        System.out.println(nombre + " se ha matriculado en la carrera: " + carrera);
    }

    
    public void actualizarPromedio(double nuevoPromedio) {
        this.promedio = nuevoPromedio;
        System.out.println("Promedio actualizado a: " + promedio);
    }

   
    public void mostrarInfo() {
        System.out.println("== Información del Estudiante ==");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    
    }
}
