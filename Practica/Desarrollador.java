package mx.unam.fi.poo.g1.p7.Desarrollador;
import mx.unam.fi.poo.g1.p7.Empleado.Empleado;
import java.util.ArrayList;

/**
 * Clase Desarrollador derivada de Empleado.
 */
public class Desarrollador extends Empleado {
    private String nombreDeTrabajo = "Desarrollador";

    /**
     * Constructor de Desarrollador.
     * 
     * @param nombre -> El nombre del desarrollador.
     * @param direccion -> La dirección del desarrollador.
     * @param salario -> El salario del desarrollador.
     */
    public Desarrollador(String nombre, String direccion, double salario) {
        super(nombre, direccion, salario);
    }

    /**
     * Método set.
     * Para cambiar el nombre de trabajo del desarrollador.
     * 
     * @param nombreDeTrabajo -> El nuevo nombre de trabajo.
     */
    public void setNombreDeTrabajo(String nombreDeTrabajo) {
        this.nombreDeTrabajo = nombreDeTrabajo;
    }

    /**
     * Método get.
     * Para obtener el nombre de trabajo del desarrollador.
     * 
     * @return El nombre de trabajo del desarrollador.
     */
    public String getNombreDeTrabajo() {
        return this.nombreDeTrabajo;
    }

    /**
     * Método print.
     * Imprime la información básica del desarrollador en consola.
     */
    public void imprimirInfo() {
        System.out.println("\nDesarrollador: " + getNombre());
        System.out.println("La dirección de " + getNombre() + " es: " + getDireccion());
        System.out.println("El salario de " + getNombre() + " es: " + getSalario());

        if (this.getProyectos().isEmpty()) {
            System.out.println("El desarrollador por el momento no tiene proyectos asignados");
        } else {
            System.out.println("Proyectos actuales: ");
            consultarProyectos();
        }

        if (this.getReporte().isEmpty()) {
            System.out.println("El desarrollador por el momento no tiene reportes de desempeño");
        } else {
            System.out.println("Reportes actuales: ");
            consultarReportes();
        }
    }

    /**
     * Método aumentarSalario.
     * Sobrescribe el método en Empleado para aplicar un aumento de salario específico para el desarrollador.
     */
    @Override
    public void aumentarSalario() {
        this.setSalario(this.getSalario() + this.getSalario() * 0.20);
    }

    /**
     * Método generarReporte.
     * Sobrescribe el método en Empleado para agregar un reporte de desempeño.
     * 
     * @param reporte -> El reporte de desempeño que se va a agregar.
     */
    @Override
    public void generarReporte(String reporte) {
        System.out.println("\nEl desarrollador " + this.getNombre() + " recibió el siguiente reporte: " + reporte);
        this.getReporte().add(reporte);
    }

    /**
     * Método agregarProyectos.
     * Sobrescribe el método en Empleado para agregar un proyecto al desarrollador.
     * 
     * @param proyecto -> El proyecto que se va a agregar.
     */
    @Override
    public void agregarProyectos(String proyecto) {
        System.out.println("\nEl desarrollador " + this.getNombre() + " recibió el proyecto: " + proyecto + " para trabajar con los desarrolladores");
        this.getProyectos().add(proyecto);
    }
}
