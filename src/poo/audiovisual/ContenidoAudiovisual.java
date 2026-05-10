package poo.audiovisual;

/**
 * Clase abstracta base que representa cualquier contenido audiovisual.
 * Todas las subclases deben implementar mostrarDetalles().
 */
public abstract class ContenidoAudiovisual {

    private String titulo;
    private int duracionMinutos;
    private int anioLanzamiento;
    private String genero;

    public ContenidoAudiovisual(String titulo, int duracionMinutos,
                                 int anioLanzamiento, String genero) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.anioLanzamiento = anioLanzamiento;
        this.genero = genero;
    }

    public String getTitulo()          { return titulo; }
    public int getDuracionMinutos()    { return duracionMinutos; }
    public int getAnioLanzamiento()    { return anioLanzamiento; }
    public String getGenero()          { return genero; }

    public void setTitulo(String titulo)                    { this.titulo = titulo; }
    public void setDuracionMinutos(int duracionMinutos)     { this.duracionMinutos = duracionMinutos; }
    public void setAnioLanzamiento(int anioLanzamiento)     { this.anioLanzamiento = anioLanzamiento; }
    public void setGenero(String genero)                    { this.genero = genero; }

    // Metodo abstracto: cada subclase define como mostrar sus detalles
    public abstract void mostrarDetalles();

    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + "] " + titulo +
               " (" + anioLanzamiento + ") | Genero: " + genero +
               " | Duracion: " + duracionMinutos + " min";
    }
}
