package poo.audiovisual;

import java.util.ArrayList;

/**
 * Subclase de ContenidoAudiovisual que representa una serie de television.
 *
 * HERENCIA: extiende ContenidoAudiovisual.
 * COMPOSICION: las Temporadas son creadas DENTRO de este metodo; no existen
 * ni tienen sentido fuera del objeto SerieDeTV.
 */
public class SerieDeTV extends ContenidoAudiovisual {

    private String creador;
    private String plataforma;
    private boolean enEmision;

    // COMPOSICION: las temporadas nacen y mueren con la serie
    private ArrayList<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionMinutos, int anioLanzamiento,
                     String genero, String creador,
                     String plataforma, boolean enEmision) {
        super(titulo, duracionMinutos, anioLanzamiento, genero);
        this.creador = creador;
        this.plataforma = plataforma;
        this.enEmision = enEmision;
        this.temporadas = new ArrayList<>();
    }

    public String getCreador()                    { return creador; }
    public String getPlataforma()                 { return plataforma; }
    public boolean isEnEmision()                  { return enEmision; }
    public ArrayList<Temporada> getTemporadas()   { return temporadas; }

    public void setCreador(String creador)        { this.creador = creador; }
    public void setPlataforma(String plataforma)  { this.plataforma = plataforma; }
    public void setEnEmision(boolean enEmision)   { this.enEmision = enEmision; }

    // COMPOSICION: la Temporada se instancia aqui adentro
    public void agregarTemporada(int numEpisodios, int anioEstreno, String sinopsis) {
        int numero = temporadas.size() + 1;
        Temporada t = new Temporada(numero, numEpisodios, anioEstreno, sinopsis);
        temporadas.add(t);
        System.out.println("  + Temporada " + numero +
                           " agregada a '" + getTitulo() + "'");
    }

    public void mostrarTemporadas() {
        System.out.println("  Temporadas de '" + getTitulo() +
                           "' (" + temporadas.size() + " en total):");
        if (temporadas.isEmpty()) {
            System.out.println("    (Sin temporadas registradas)");
        } else {
            for (Temporada t : temporadas) {
                t.mostrarInformacion();
            }
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== SERIE DE TV ===");
        System.out.println(toString());
        System.out.println("  Creador: " + creador);
        System.out.println("  Plataforma: " + plataforma);
        System.out.println("  En emision: " + (enEmision ? "Si" : "No"));
        mostrarTemporadas();
    }
}
