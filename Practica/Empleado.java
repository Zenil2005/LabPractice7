package mx.unam.fi.poo.g1.p7.Empleado;
import java.util.ArrayList;

/**
 * Clase base Empleado. 
 * De esta clase se obtendrán las bases de los métodos y parámetros de las demás clases derivadas.
 */
public class Empleado {
    private String nombre;
    private String direccion;
    private double salario;
    private ArrayList<String> reporte;
    private ArrayList<String> proyectos;

    /**
     * Constructor de Empleado.
     *
     * @param nombre -> El nombre del empleado.
     * @param direccion -> La dirección del empleado.
     * @param salario -> El salario del empleado.
     */
    public Empleado(String nombre, String direccion, double salario) {
        setNombre(nombre);
        setDireccion(direccion);
        setSalario(salario);
        setReporte();
        setProyectos();
    }

    /**
     * Método set.
     * Para cambiar el nombre del empleado.
     * @param nombre -> El nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get.
     *Para acceder al nombre del empleado
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método set.
     *Para cambiar la dirección del empleado
     * @param direccion -> La dirección del empleado.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método get.
     *
     * @return La dirección del empleado.
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * Método set.
     *Para cambiar el salario del empleado.
     * @param salario -> El salario del empleado.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método get.
     * Para acceder al salario del empleado.
     * @return El salario del empleado.
     */
    public double getSalario() {
        return this.salario;
    }

    /**
     * Método set.
     * Inicializa la lista de reportes de desempeño del empleado.
     */
    public void setReporte() {
        this.reporte = new ArrayList<>();
    }

    /**
     * Método get.
     * Para acceder a la lista de reportes del empleado.
     * 
     * @return Una lista de reportes de desempeño.
     */
    public ArrayList<String> getReporte() {
        return this.reporte;
    }

    /**
     * Método set.
     * Inicializa la lista de proyectos asociados al empleado.
     */
    public void setProyectos() {
        this.proyectos = new ArrayList<>();
    }

    /**
     * Método get.
     * Para acceder a la lista de Proyectos del empleado.
     *
     * @return Lista de proyectos.
     */
    public ArrayList<String> getProyectos() {
        return this.proyectos;
    }

    /**
     * Método aumentarSalario.
     * Método que según la clase derivada se sustituirá a conveniencia.
     */
    public void aumentarSalario() {
        System.out.println("El empleado recibe un aumento");
    }

    /**
     * Método consultarReportes.
     * Consulta los reportes de desempeño registrados para el empleado y los imprime.
     */
    public void consultarReportes() {
        System.out.println("Reportes de desempeño de " + getNombre() + ":");
        for (String reporte : this.getReporte()) {
            System.out.println("- " + reporte);
        }
    }

    /**
     * Consulta los proyectos en los que el empleado está trabajando y los imprime.
     */
    public void consultarProyectos() {
        System.out.println("Proyectos de " + getNombre() + ":");
        for (String proyecto : this.getProyectos()) {
            System.out.println("- " + proyecto);
        }
    }

    /**
     * Método generarReporte.
     * Agrega un nuevo reporte de desempeño al empleado.
     *
     * @param reporte -> El nuevo reporte de desempeño a agregar.
     */
    public void generarReporte(String reporte) {
        this.reporte.add(reporte);
    }

    /**
     * Método agregarProyectos.
     * Agrega un nuevo proyecto a la lista de proyectos del empleado.
     *
     * @param proyecto -> El nuevo proyecto a agregar.
     */
    public void agregarProyectos(String proyecto) {
        this.proyectos.add(proyecto);
    }

    /**
     * Método print.
     * Imprime la información básica del empleado en consola.
     */
    public void imprimirInfo() {
        System.out.println("\nEmpleado: " + getNombre());
        System.out.println("La dirección de " + getNombre() + " es: " + getDireccion());
        System.out.println("El salario de " + getNombre() + " es: " + getSalario());
        
        if (this.proyectos.isEmpty()) {
            System.out.println("El empleado por el momento no tiene proyectos asignados");
        } else {
            System.out.println("Proyectos actuales: ");
            consultarProyectos();
        }
        
        if (this.reporte.isEmpty()) {
            System.out.println("El empleado por el momento no tiene reportes de desempeño");
        } else {
            System.out.println("Reportes actuales: ");
            consultarReportes();
        }
    }
}
