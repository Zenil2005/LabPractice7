package mx.unam.fi.poo.g1.p7.Manager;
import mx.unam.fi.poo.g1.p7.Empleado.Empleado;
import java.util.ArrayList;

/**
 * Clase Manager derivada de Empleado.
 */
public class Manager extends Empleado {
    private String nombreDeTrabajo = "Manager";

    /**
     * Constructor de Manager.
     *
     * @param nombre -> El nombre del manager.
     * @param direccion -> La dirección del manager.
     * @param salario -> El salario del manager.
     */
    public Manager(String nombre, String direccion, double salario) {
        super(nombre, direccion, salario);
    }

    /**
     * Método set.
     * Para cambiar el nombre de trabajo del manager.
     * 
     * @param nombreDeTrabajo -> El nuevo nombre de trabajo.
     */
    public void setNombreDeTrabajo(String nombreDeTrabajo) {
        this.nombreDeTrabajo = nombreDeTrabajo;
    }

    /**
     * Método get.
     * Para obtener el nombre de trabajo del manager.
     * 
     * @return El nombre de trabajo del manager.
     */
    public String getNombreDeTrabajo() {
        return this.nombreDeTrabajo;
    }

    /**
     * Método aumentarSalario.
     * Sobrescribe el método en Empleado para aplicar un aumento de salario específico al manager.
     */
    @Override
    public void aumentarSalario() {
        this.setSalario(this.getSalario() + this.getSalario() * 0.40);
    }

    /**
     * Método generarReporte.
     * Sobrescribe el método en Empleado para agregar un reporte de desempeño al manager.
     *
     * @param reporte -> El reporte de desempeño que se va a agregar.
     */
    @Override
    public void generarReporte(String reporte) {
        System.out.println("\nEl manager " + this.getNombre() + " recibió el siguiente reporte: " + reporte);
        this.getReporte().add(reporte);
    }

    /**
     * Método agregarProyectos.
     * Sobrescribe el método en Empleado para agregar un proyecto al manager.
     *
     * @param proyecto -> El proyecto que se va a agregar.
     */
    @Override
    public void agregarProyectos(String proyecto) {
        System.out.println("\nEl manager " + this.getNombre() + " y su equipo recibieron el proyecto: " + proyecto);
        this.getProyectos().add(proyecto);
    }

    /**
     * Método print.
     * Sobrescribe el método en Empleado para imprimir la información básica del manager y su estado actual.
     */
    @Override
    public void imprimirInfo() {
        System.out.println("\nManager: " + getNombre());
        System.out.println("La dirección del manager " + getNombre() + " es: " + getDireccion());
        System.out.println("El salario del manager " + getNombre() + " es: " + getSalario());

        if (this.getProyectos().isEmpty()) {
            System.out.println("El manager por el momento no tiene proyectos asignados");
        } else {
            System.out.println("Proyectos actuales: ");
            consultarProyectos();
        }

        if (this.getReporte().isEmpty()) {
            System.out.println("El manager por el momento no tiene reportes de desempeño");
        } else {
            System.out.println("Reportes actuales: ");
            consultarReportes();
        }
    }
}
