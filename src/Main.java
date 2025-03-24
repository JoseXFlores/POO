//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.nombre = "Jose";
        persona1.apellido = "Perez";
        persona1.edad = 41;

        Carrera carrera1 = new Carrera();
        carrera1.nombre = "Ingenieria en Computacion";
        carrera1.duracion = 15;
        carrera1.estaEncurso = false;

        persona1.carrera = carrera1;

        Persona persona2 = new Persona();
        persona2.nombre = "Clara";
        persona2.apellido = "Guzman";
        persona2.edad = 32;

        Carrera carrera2 = new Carrera();
        carrera2.nombre = "Medicina";
        carrera2.duracion = 6;
        carrera2.estaEncurso = true;

        persona2.carrera = carrera2;

        //System.out.println(persona1.nombre + " " + persona1.apellido + " tiene " + persona1.edad + " años.");
        //System.out.println(persona2.nombre + " " + persona2.apellido + " tiene " + persona2.edad + " años.");

        String saludado = "jose code";

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años y esta recibido de " + persona1.carrera.nombre );
        System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.edad + " años y esta recibido de " + persona2.carrera.nombre );

        System.out.println(persona1.enviarSaludo(saludado));
        System.out.println(persona2.enviarSaludo("Pedro"));




    }
}