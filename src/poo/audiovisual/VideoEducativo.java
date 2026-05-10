package poo.audiovisual;

import java.util.ArrayList;

/**
 * VideoEducativo: contenido audiovisual disenado con fines pedagogicos
 * para plataformas de aprendizaje en linea o ensenanza formal.
 *
 * Justificacion: la digitalizacion de la educacion ha consolidado este
 * formato como categoria independiente, con atributos y logica propios
 * que no comparte con el cine ni la television convencional.
 *
 * HERENCIA: extiende ContenidoAudiovisual.
 * ASOCIACION: referencia Investigadores como expertos avaladores del contenido.
 */
public class VideoEducativo extends ContenidoAudiovisual {

    private String nivelEducativo;
    private String plataforma;
    private String objetivoAprendizaje;
    private String idioma;

    // ASOCIACION con Investigador: expertos que validan el contenido
    private ArrayList<Investigador> expertosAvaladores;

    public VideoEducativo(String titulo, int duracionMinutos, int anioLanzamiento,
                          String genero, String nivelEducativo,
                          String plataforma, String objetivoAprendizaje,
                          String idioma) {
        super(titulo, duracionMinutos, anioLanzamiento, genero);
        this.nivelEducativo = nivelEducativo;
        this.plataforma = plataforma;
        this.objetivoAprendizaje = objetivoAprendizaje;
        this.idioma = idioma;
        this.expertosAvaladores = new ArrayList<>();
    }

    public String getNivelEducativo()                        { return nivelEducativo; }
    public String getPlataforma()                            { return plataforma; }
    public String getObjetivoAprendizaje()                   { return objetivoAprendizaje; }
    public String getIdioma()                                { return idioma; }
    public ArrayList<Investigador> getExpertosAvaladores()   { return expertosAvaladores; }

    public void setNivelEducativo(String nivelEducativo)         { this.nivelEducativo = nivelEducativo; }
    public void setPlataforma(String plataforma)                 { this.plataforma = plataforma; }
    public void setObjetivoAprendizaje(String obj)               { this.objetivoAprendizaje = obj; }
    public void setIdioma(String idioma)                         { this.idioma = idioma; }

    // ASOCIACION: se vincula a expertos existentes
    public void agregarExperto(Investigador investigador) {
        expertosAvaladores.add(investigador);
        System.out.println("  + Experto '" + investigador.getNombre() +
                           "' vinculado a '" + getTitulo() + "'");
    }

    public void mostrarExpertos() {
        System.out.println("  Expertos avaladores (" + expertosAvaladores.size() + "):");
        if (expertosAvaladores.isEmpty()) {
            System.out.println("    (Sin expertos registrados)");
        } else {
            for (Investigador i : expertosAvaladores) {
                i.mostrarInformacion();
            }
        }
    }

    // Metodo propio exclusivo de VideoEducativo
    public void mostrarResumenPedagogico() {
        System.out.println("  -- Resumen Pedagogico --");
        System.out.println("    Nivel: " + nivelEducativo);
        System.out.println("    Idioma: " + idioma);
        System.out.println("    Plataforma: " + plataforma);
        System.out.println("    Objetivo: " + objetivoAprendizaje);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== VIDEO EDUCATIVO ===");
        System.out.println(toString());
        mostrarResumenPedagogico();
        mostrarExpertos();
    }
}
