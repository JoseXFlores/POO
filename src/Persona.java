public class Persona {

    //Atributos (estado/caracteristicas de un objeto)
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    //Metodos (comportamientos ce un objeto)

    public String darNombreCompleto() {
        return apellido + " , " + nombre;
    }

    public String enviarSaludo(String saludado) {

        if(edad > 40) return "Buenos dias, querido " + saludado;
        return "Hola, como ¿como estás " + saludado + "?";
    }

}
