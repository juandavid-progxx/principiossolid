package co.edu.uniquindio.biblioteca;

public class estudiante extends persona {
    private double notaFinal;

    public estudiante(String nombre, String apellido, int edad, int id, double notaFinal) {

        this.notaFinal=notaFinal;
    }
    public void mostrarDatos(){
        System.out.printf("nombre"+getNombre()+"apellido"+getApellido()+"edad"+getEdad()+"id"+getId()+"nota final"+notaFinal);

    }
}