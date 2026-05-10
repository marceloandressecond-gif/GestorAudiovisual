package poo.audiovisual;

import java.util.ArrayList;

/**
 * Subclase de ContenidoAudiovisual que representa una pelicula.
 *
 * HERENCIA: extiende ContenidoAudiovisual.
 * AGREGACION: contiene una lista de Actor. Los actores son creados fuera
 * de la pelicula y pueden pertenecer a otras producciones.
 */
public class Pelicula extends ContenidoAudiovisual {

    private String director;
    private double presupuestoMillones;
    private String clasificacion;

    // AGREGACION: actores creados externamente y referenciados aqui
    private ArrayList<Actor> actores;

    public Pelicula(String titulo, int duracionMinutos, int anioLanzamiento,
                    String genero, String director,
                    double presupuestoMillones, String clasificacion) {
        super(titulo, duracionMinutos, anioLanzamiento, genero);
        this.director = director;
        this.presupuestoMillones = presupuestoMillones;
        this.clasificacion = clasificacion;
        this.actores = new ArrayList<>();
    }

    public String getDirector()               { return director; }
    public double getPresupuestoMillones()     { return presupuestoMillones; }
    public String getClasificacion()          { return clasificacion; }
    public ArrayList<Actor> getActores()      { return actores; }

    public void setDirector(String director)                   { this.director = director; }
    public void setPresupuestoMillones(double p)               { this.presupuestoMillones = p; }
    public void setClasificacion(String clasificacion)         { this.clasificacion = clasificacion; }

    // AGREGACION: el actor llega desde fuera, no se crea aqui
    public void agregarActor(Actor actor) {
        actores.add(actor);
        System.out.println("  + Actor '" + actor.getNombre() +
                           "' agregado a '" + getTitulo() + "'");
    }

    public void mostrarActores() {
        System.out.println("  Reparto de '" + getTitulo() + "' (" + actores.size() + " actores):");
        if (actores.isEmpty()) {
            System.out.println("    (Sin actores registrados)");
        } else {
            for (Actor a : actores) {
                a.mostrarInformacion();
            }
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== PELICULA ===");
        System.out.println(toString());
        System.out.println("  Director: " + director);
        System.out.println("  Presupuesto: $" + presupuestoMillones + "M USD");
        System.out.println("  Clasificacion: " + clasificacion);
        mostrarActores();
    }
}
