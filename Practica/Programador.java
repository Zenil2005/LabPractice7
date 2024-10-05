package mx.unam.fi.poo.g1.p7.Programador;
import mx.unam.fi.poo.g1.p7.Empleado.Empleado;
import java.util.ArrayList;

/**
 * Clase Programador derivada de Empleado.
 */
public class Programador extends Empleado {
    private String nombreDeTrabajo = "Programador";

    /**
     * Constructor de Programador.
     * 
     * @param nombre -> El nombre del programador.
     * @param direccion -> La dirección del programador.
     * @param salario -> El salario del programador.
     */
    public Programador(String nombre, String direccion, double salario) {
        super(nombre, direccion, salario);
    }

    /**
     * Método set.
     * Para cambiar el nombre de trabajo del programador.
     * 
     * @param nombreDeTrabajo -> El nuevo nombre de trabajo.
     */
    public void setNombreDeTrabajo(String nombreDeTrabajo) {
        this.nombreDeTrabajo = nombreDeTrabajo;
    }

    /**
     * Método get.
     * Para obtener el nombre de trabajo del programador.
     * 
     * @return El nombre de trabajo del programador.
     */
    public String getNombreDeTrabajo() {
        return this.nombreDeTrabajo;
    }

    /**
     * Método print.
     * Imprime la información básica del programador en consola.
     */
    public void imprimirInfo() {
        System.out.println("\nProgramador: " + getNombre());
        System.out.println("La dirección de " + getNombre() + " es: " + getDireccion());
        System.out.println("El salario de " + getNombre() + " es: " + getSalario());

        if (this.getProyectos().isEmpty()) {
            System.out.println("El programador por el momento no tiene proyectos asignados");
        } else {
            System.out.println("Proyectos actuales: ");
            consultarProyectos();
        }

        if (this.getReporte().isEmpty()) {
            System.out.println("El programador por el momento no tiene reportes de desempeño");
        } else {
            System.out.println("Reportes actuales: ");
            consultarReportes();
        }
    }

    /**
     * Método aumentarSalario.
     * Sobrescribe el método en Empleado para aplicar un aumento de salario específico para el programador.
     */
    @Override
    public void aumentarSalario() {
        this.setSalario(this.getSalario() + this.getSalario() * 0.10);
    }

    /**
     * Método generarReporte.
     * Sobrescribe el método en Empleado para agregar un reporte de desempeño.
     * 
     * @param reporte -> El reporte de desempeño que se va a agregar.
     */
    @Override
    public void generarReporte(String reporte) {
        System.out.println("\nEl programador " + this.getNombre() + " recibió el siguiente reporte: " + reporte);
        this.getReporte().add(reporte);
    }

    /**
     * Método agregarProyectos.
     * Sobrescribe el método en Empleado para agregar un proyecto al programador.
     * 
     * @param proyecto -> El proyecto que se va a agregar.
     */
    @Override
    public void agregarProyectos(String proyecto) {
        System.out.println("\nEl programador " + this.getNombre() + " recibió el proyecto: " + proyecto);
        this.getProyectos().add(proyecto);
    }
}
