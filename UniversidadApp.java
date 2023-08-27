// Interfaz para definir el comportamiento de una persona
interface IPersona {
    void mostrarInformacion();
}

// Clase base para representar a una persona
class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

// Clase para representar a un estudiante
class Estudiante extends Persona implements IPersona {
    private int numeroMatricula;

    public Estudiante(String nombre, int edad, int numeroMatricula) {
        super(nombre, edad);
        this.numeroMatricula = numeroMatricula;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de matrícula: " + numeroMatricula);
    }

    // Sobrecarga de método para mostrar información de un estudiante con un mensaje adicional
    public void mostrarInformacion(String mensaje) {
        mostrarInformacion();
        System.out.println(mensaje);
    }
}

// Clase para representar a un profesor
class Profesor extends Persona implements IPersona {
    private String departamento;

    public Profesor(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }
}

// Clase principal que contiene el método main
public class UniversidadApp {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 20, 12345);
        Profesor profesor = new Profesor("María", 35, "Informática");

        System.out.println("Información del estudiante:");
        estudiante.mostrarInformacion();

        System.out.println("\nInformación del profesor:");
        profesor.mostrarInformacion();

        System.out.println("\nInformación del estudiante con mensaje adicional:");
        estudiante.mostrarInformacion("¡Hola!");

        // También podemos usar la interfaz para mostrar información
        IPersona persona = new Estudiante("Carlos", 22, 54321);
        System.out.println("\nInformación de la persona (estudiante):");
        persona.mostrarInformacion();
    }
}
