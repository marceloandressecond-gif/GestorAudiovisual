package poo.audiovisual;

import java.util.ArrayList;

/**
 * Subclase de ContenidoAudiovisual que representa un documental.
 *
 * HERENCIA: extiende ContenidoAudiovisual.
 * AGREGACION: contiene Investigadores que existen de forma independiente
 * y pueden colaborar en distintos documentales simultaneamente.
 */
public class Documental extends ContenidoAudiovisual {

    private String tematica;
    private String narrador;
    private String productora;

    // AGREGACION: los investigadores llegan desde fuera
    private ArrayList<Investigador> investigadores;

    public Documental(String titulo, int duracionMinutos, int anioLanzamiento,
                      String genero, String tematica,
                      String narrador, String productora) {
        super(titulo, duracionMinutos, anioLanzamiento, genero);
        this.tematica = tematica;
        this.narrador = narrador;
        this.productora = productora;
        this.investigadores = new ArrayList<>();
    }

    public String getTematica()                           { return tematica; }
    public String getNarrador()                           { return narrador; }
    public String getProductora()                         { return productora; }
    public ArrayList<Investigador> getInvestigadores()    { return investigadores; }

    public void setTematica(String tematica)      { this.tematica = tematica; }
    public void setNarrador(String narrador)      { this.narrador = narrador; }
    public void setProductora(String productora)  { this.productora = productora; }

    // AGREGACION: el investigador viene creado desde afuera
    public void agregarInvestigador(Investigador investigador) {
        investigadores.add(investigador);
        System.out.println("  + Investigador '" + investigador.getNombre() +
                           "' vinculado a '" + getTitulo() + "'");
    }

    public void mostrarInvestigadores() {
        System.out.println("  Investigadores de '" + getTitulo() +
                           "' (" + investigadores.size() + " en total):");
        if (investigadores.isEmpty()) {
            System.out.println("    (Sin investigadores registrados)");
        } else {
            for (Investigador i : investigadores) {
                i.mostrarInformacion();
            }
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== DOCUMENTAL ===");
        System.out.println(toString());
        System.out.println("  Tematica: " + tematica);
        System.out.println("  Narrador: " + narrador);
        System.out.println("  Productora: " + productora);
        mostrarInvestigadores();
    }
}
