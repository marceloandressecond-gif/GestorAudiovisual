package poo.audiovisual;

/**
 * Clase Temporada: representa una temporada de una serie de television.
 *
 * Relacion: COMPOSICION con SerieDeTV.
 * La temporada no tiene sentido fuera del contexto de la serie; es creada
 * y destruida junto con el objeto SerieDeTV que la contiene.
 */
public class Temporada {

    private int numeroTemporada;
    private int numeroEpisodios;
    private int anioEstreno;
    private String sinopsis;

    public Temporada(int numeroTemporada, int numeroEpisodios,
                     int anioEstreno, String sinopsis) {
        this.numeroTemporada = numeroTemporada;
        this.numeroEpisodios = numeroEpisodios;
        this.anioEstreno = anioEstreno;
        this.sinopsis = sinopsis;
    }

    public int getNumeroTemporada()  { return numeroTemporada; }
    public int getNumeroEpisodios()  { return numeroEpisodios; }
    public int getAnioEstreno()      { return anioEstreno; }
    public String getSinopsis()      { return sinopsis; }

    public void setNumeroTemporada(int numeroTemporada)  { this.numeroTemporada = numeroTemporada; }
    public void setNumeroEpisodios(int numeroEpisodios)  { this.numeroEpisodios = numeroEpisodios; }
    public void setAnioEstreno(int anioEstreno)          { this.anioEstreno = anioEstreno; }
    public void setSinopsis(String sinopsis)             { this.sinopsis = sinopsis; }

    public void mostrarInformacion() {
        System.out.println("    Temporada " + numeroTemporada +
                           " | Episodios: " + numeroEpisodios +
                           " | Estreno: " + anioEstreno +
                           " | Sinopsis: " + sinopsis);
    }

    @Override
    public String toString() {
        return "T" + numeroTemporada + " (" + anioEstreno + ") - " +
               numeroEpisodios + " episodios: " + sinopsis;
    }
}
// Commit 3: relaciones entre clases implementadas
