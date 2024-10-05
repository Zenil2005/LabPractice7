package mx.unam.fi.poo.g1.p7.Practica7;
import mx.unam.fi.poo.g1.p7.Empleado.Empleado;
import mx.unam.fi.poo.g1.p7.Manager.Manager;
import mx.unam.fi.poo.g1.p7.Desarrollador.Desarrollador;
import mx.unam.fi.poo.g1.p7.Programador.Programador;

/**
 * Clase principal de la Práctica 7
 * @author Grupo 1 de POO
 * @version Octubre de 2024
 */

public class Practica7{

    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[]args){
        Manager e1 = new Manager("Maria", "Alvaro Obregon", 20000);
        Desarrollador e2 = new Desarrollador("Pedro", "Tlalpan", 15000);
        Programador e3 = new Programador("Luis", "Magdalena Contreras", 10000);

        e1.imprimirInfo();
        e1.agregarProyectos("Elaborar una presentación del avance");
        e1.generarReporte("Es una trabajadora resiliente y puntual");
        System.out.println("Debido a su esfuerzo se le otorgará un bono");
        e1.aumentarSalario();
        System.out.println("Los nuevos datos de " + e1.getNombre() + " son: ");
        e1.imprimirInfo();

        e2.imprimirInfo();
        e2.agregarProyectos("Elaborar un videojuego");
        e2.generarReporte("Demuestra competencia para el puesto");
        System.out.println("Debido a su esfuerzo se le otorgará un bono");
        e2.aumentarSalario();
        System.out.println("Los nuevos datos de " + e2.getNombre() + " son: ");
        e2.imprimirInfo();

        e3.imprimirInfo();
        e3.agregarProyectos("Programar las físicas");
        e3.generarReporte("Es un trabajador eficiente");
        System.out.println("Debido a su esfuerzo se le otorgará un bono");
        e3.aumentarSalario();
        System.out.println("Los nuevos datos de " + e3.getNombre() + " son: ");
        e3.imprimirInfo(); 
    }
}