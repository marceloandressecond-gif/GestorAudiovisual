package poo.audiovisual;

import java.util.ArrayList;

/**
 * Cortometraje: obra audiovisual de duracion inferior a 40 minutos,
 * orientada a festivales de cine independiente.
 *
 * Justificacion: tipo de contenido diferenciado por duracion, financiamiento
 * y contexto de exhibicion respecto al largometraje convencional.
 *
 * HERENCIA: extiende ContenidoAudiovisual.
 * ASOCIACION: referencia actores sin compartir ciclo de vida.
 */
public class Cortometraje extends ContenidoAudiovisual {

    private String director;
    private String festival;
    private boolean premiadoFestival;
    private String paisProduccion;

    // ASOCIACION con Actor: referencia sin dependencia de ciclo de vida
    private ArrayList<Actor> actores;

    public Cortometraje(String titulo, int duracionMinutos, int anioLanzamiento,
                        String genero, String director, String festival,
                        boolean premiadoFestival, String paisProduccion) {
        super(titulo, duracionMinutos, anioLanzamiento, genero);
        if (duracionMinutos > 40) {
            System.out.println("  [AVISO] Duracion (" + duracionMinutos +
                               " min) supera el limite de cortometraje (40 min).");
        }
        this.director = director;
        this.festival = festival;
        this.premiadoFestival = premiadoFestival;
        this.paisProduccion = paisProduccion;
        this.actores = new ArrayList<>();
    }

    public String getDirector()           { return director; }
    public String getFestival()           { return festival; }
    public boolean isPremiadoFestival()   { return premiadoFestival; }
    public String getPaisProduccion()     { return paisProduccion; }
    public ArrayList<Actor> getActores()  { return actores; }

    public void setDirector(String director)             { this.director = director; }
    public void setFestival(String festival)             { this.festival = festival; }
    public void setPremiadoFestival(boolean p)           { this.premiadoFestival = p; }
    public void setPaisProduccion(String paisProduccion) { this.paisProduccion = paisProduccion; }

    // ASOCIACION: se referencia al actor sin poseerlo
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public void mostrarActores() {
        System.out.println("  Actores del cortometraje (" + actores.size() + "):");
        if (actores.isEmpty()) {
            System.out.println("    (Sin actores)");
        } else {
            for (Actor a : actores) {
                a.mostrarInformacion();
            }
        }
    }

    // Metodo propio exclusivo de Cortometraje
    public void mostrarFichaFestival() {
        System.out.println("  -- Ficha de Festival --");
        System.out.println("    Festival: " + festival);
        System.out.println("    Pais: " + paisProduccion);
        System.out.println("    Premiado: " + (premiadoFestival ? "Si" : "No"));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== CORTOMETRAJE ===");
        System.out.println(toString());
        System.out.println("  Director: " + director);
        mostrarFichaFestival();
        mostrarActores();
    }
}
// Commit 4: subclases de ContenidoAudiovisual agregadas
