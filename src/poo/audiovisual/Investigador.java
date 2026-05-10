package poo.audiovisual;

/**
 * Clase Investigador: representa a un experto academico que participa
 * en documentales o videos educativos.
 *
 * Relacion: AGREGACION con Documental y VideoEducativo.
 * El investigador existe independientemente y puede colaborar en
 * multiples proyectos audiovisuales.
 */
public class Investigador {

    private String nombre;
    private String especialidad;
    private String institucion;
    private int aniosExperiencia;

    public Investigador(String nombre, String especialidad,
                        String institucion, int aniosExperiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.institucion = institucion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombre()           { return nombre; }
    public String getEspecialidad()     { return especialidad; }
    public String getInstitucion()      { return institucion; }
    public int getAniosExperiencia()    { return aniosExperiencia; }

    public void setNombre(String nombre)                   { this.nombre = nombre; }
    public void setEspecialidad(String especialidad)       { this.especialidad = especialidad; }
    public void setInstitucion(String institucion)         { this.institucion = institucion; }
    public void setAniosExperiencia(int aniosExperiencia)  { this.aniosExperiencia = aniosExperiencia; }

    public void mostrarInformacion() {
        System.out.println("    Investigador: " + nombre +
                           " | Especialidad: " + especialidad +
                           " | Institucion: " + institucion +
                           " | Exp: " + aniosExperiencia + " anios");
    }

    @Override
    public String toString() {
        return nombre + " - " + especialidad + " @ " + institucion;
    }
}
