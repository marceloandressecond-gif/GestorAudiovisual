package poo.audiovisual;

/**
 * Clase Actor: representa a un interprete cinematografico o televisivo.
 *
 * Relacion: AGREGACION con Pelicula y Cortometraje.
 * El actor existe de forma independiente; puede participar en multiples
 * producciones sin que su existencia dependa de ninguna de ellas.
 */
public class Actor {

    private String nombre;
    private int edad;
    private String nacionalidad;
    private String rolPrincipal;

    public Actor(String nombre, int edad, String nacionalidad, String rolPrincipal) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.rolPrincipal = rolPrincipal;
    }

    public String getNombre()        { return nombre; }
    public int getEdad()             { return edad; }
    public String getNacionalidad()  { return nacionalidad; }
    public String getRolPrincipal()  { return rolPrincipal; }

    public void setNombre(String nombre)              { this.nombre = nombre; }
    public void setEdad(int edad)                     { this.edad = edad; }
    public void setNacionalidad(String nacionalidad)  { this.nacionalidad = nacionalidad; }
    public void setRolPrincipal(String rolPrincipal)  { this.rolPrincipal = rolPrincipal; }

    public void mostrarInformacion() {
        System.out.println("    Actor: " + nombre +
                           " | Edad: " + edad +
                           " | Pais: " + nacionalidad +
                           " | Rol: " + rolPrincipal);
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ", " + edad + " anios) -> " + rolPrincipal;
    }
}
