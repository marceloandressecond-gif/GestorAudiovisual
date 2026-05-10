package poo.audiovisual;

/**
 * Clase principal que demuestra el funcionamiento completo del sistema.
 *
 * Demuestra:
 *   - Herencia (5 subclases de ContenidoAudiovisual)
 *   - Polimorfismo (array de ContenidoAudiovisual)
 *   - Agregacion (Pelicula-Actor, Documental-Investigador)
 *   - Composicion (SerieDeTV-Temporada)
 *   - Asociacion (Cortometraje-Actor, VideoEducativo-Investigador)
 *   - ArrayList (agregar, recorrer, contar)
 *   - Getters y Setters
 */
public class PruebaAudioVisual {

    public static void main(String[] args) {

        separador("SISTEMA GESTOR DE CONTENIDO AUDIOVISUAL - POO");

        // ============================================================
        // BLOQUE 1: HERENCIA - Creacion de subclases
        // ============================================================
        separador("BLOQUE 1: HERENCIA - Instanciacion de subclases");

        Pelicula pelicula = new Pelicula(
            "Inception", 148, 2010, "Ciencia Ficcion",
            "Christopher Nolan", 160.0, "PG-13"
        );

        SerieDeTV serie = new SerieDeTV(
            "Breaking Bad", 47, 2008, "Drama",
            "Vince Gilligan", "AMC", false
        );

        Documental documental = new Documental(
            "Our Planet", 60, 2019, "Naturaleza",
            "Biodiversidad y cambio climatico",
            "David Attenborough", "Netflix"
        );

        Cortometraje corto = new Cortometraje(
            "La Noche de la Lluvia", 18, 2022, "Drama",
            "Ana Lucia Morales", "Festival de Sundance",
            true, "Ecuador"
        );

        VideoEducativo video = new VideoEducativo(
            "Introduccion a la POO con Java", 35, 2023,
            "Educacion", "Universidad",
            "YouTube", "Comprender los pilares de la POO en Java",
            "Espanol"
        );

        System.out.println("Objetos creados correctamente:");
        System.out.println("  - " + pelicula.getTitulo());
        System.out.println("  - " + serie.getTitulo());
        System.out.println("  - " + documental.getTitulo());
        System.out.println("  - " + corto.getTitulo());
        System.out.println("  - " + video.getTitulo());

        // ============================================================
        // BLOQUE 2: AGREGACION - Actor con Pelicula y Cortometraje
        // ============================================================
        separador("BLOQUE 2: AGREGACION - Actores independientes");

        // Los actores se crean FUERA de la pelicula -> AGREGACION
        Actor actor1 = new Actor("Leonardo DiCaprio", 49, "Estadounidense", "Dom Cobb");
        Actor actor2 = new Actor("Joseph Gordon-Levitt", 43, "Estadounidense", "Arthur");
        Actor actor3 = new Actor("Tom Hardy", 46, "Britanico", "Eames");

        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
        pelicula.agregarActor(actor3);

        // actor1 tambien aparece en el cortometraje -> demuestra independencia
        Actor actorCorto = new Actor("Maria Garcia", 32, "Ecuatoriana", "Protagonista");
        corto.agregarActor(actorCorto);
        corto.agregarActor(actor1); // mismo objeto, otro contexto

        System.out.println("Actor compartido: " + actor1.getNombre() +
                           " aparece en pelicula Y en cortometraje.");

        // ============================================================
        // BLOQUE 3: COMPOSICION - Temporadas dentro de SerieDeTV
        // ============================================================
        separador("BLOQUE 3: COMPOSICION - Temporadas creadas dentro de la serie");

        // Las Temporadas se instancian DENTRO del metodo -> COMPOSICION
        serie.agregarTemporada(7, 2008,
            "Walter White comienza a fabricar metanfetamina");
        serie.agregarTemporada(13, 2009,
            "Consecuencias del envenenamiento de Brock");
        serie.agregarTemporada(13, 2010,
            "Walter enfrenta a los hermanos Salamanca");
        serie.agregarTemporada(13, 2011,
            "El mundo de Walter se derrumba");

        System.out.println("La serie tiene " +
            serie.getTemporadas().size() + " temporadas registradas.");

        // ============================================================
        // BLOQUE 4: AGREGACION - Investigadores
        // ============================================================
        separador("BLOQUE 4: AGREGACION - Investigadores independientes");

        Investigador inv1 = new Investigador(
            "Dr. James Hansen", "Climatologia",
            "NASA Goddard Institute", 35
        );
        Investigador inv2 = new Investigador(
            "Dra. Jane Goodall", "Primatologia",
            "Jane Goodall Institute", 60
        );
        Investigador inv3 = new Investigador(
            "Dr. Carlos Perez", "Ingenieria de Software",
            "Universidad Central del Ecuador", 15
        );

        documental.agregarInvestigador(inv1);
        documental.agregarInvestigador(inv2);

        // inv1 tambien avala el video -> demuestra independencia (agregacion)
        video.agregarExperto(inv1);
        video.agregarExperto(inv3);

        System.out.println("Investigador compartido: " + inv1.getNombre() +
                           " colabora en documental Y en video educativo.");

        // ============================================================
        // BLOQUE 5: MOSTRAR DETALLES - Polimorfismo con override
        // ============================================================
        separador("BLOQUE 5: DETALLES COMPLETOS - Override de mostrarDetalles()");

        pelicula.mostrarDetalles();
        System.out.println();

        serie.mostrarDetalles();
        System.out.println();

        documental.mostrarDetalles();
        System.out.println();

        corto.mostrarDetalles();
        System.out.println();

        video.mostrarDetalles();

        // ============================================================
        // BLOQUE 6: POLIMORFISMO - Array de ContenidoAudiovisual
        // ============================================================
        separador("BLOQUE 6: POLIMORFISMO - Catalogo unificado");

        ContenidoAudiovisual[] catalogo = {
            pelicula, serie, documental, corto, video
        };

        System.out.println("Catalogo completo (" + catalogo.length + " elementos):");
        for (ContenidoAudiovisual c : catalogo) {
            System.out.println("  -> " + c.toString());
        }

        // ============================================================
        // BLOQUE 7: GETTERS Y SETTERS - Modificacion de datos
        // ============================================================
        separador("BLOQUE 7: GETTERS Y SETTERS en accion");

        System.out.println("Clasificacion original: " + pelicula.getClasificacion());
        pelicula.setClasificacion("R");
        System.out.println("Clasificacion actualizada: " + pelicula.getClasificacion());

        System.out.println("Rol original de actor1: " + actor1.getRolPrincipal());
        actor1.setRolPrincipal("Dom Cobb (actualizado)");
        System.out.println("Rol actualizado: " + actor1.getRolPrincipal());

        System.out.println("Serie en emision: " + serie.isEnEmision());
        serie.setEnEmision(true);
        System.out.println("Serie actualizada en emision: " + serie.isEnEmision());

        // ============================================================
        // BLOQUE 8: RESUMEN FINAL de ArrayList
        // ============================================================
        separador("BLOQUE 8: RESUMEN DE LISTAS (ArrayList)");

        System.out.println("Pelicula '" + pelicula.getTitulo() + "': " +
            pelicula.getActores().size() + " actores.");
        System.out.println("Serie '" + serie.getTitulo() + "': " +
            serie.getTemporadas().size() + " temporadas.");
        System.out.println("Documental '" + documental.getTitulo() + "': " +
            documental.getInvestigadores().size() + " investigadores.");
        System.out.println("Cortometraje '" + corto.getTitulo() + "': " +
            corto.getActores().size() + " actores.");
        System.out.println("VideoEducativo '" + video.getTitulo() + "': " +
            video.getExpertosAvaladores().size() + " expertos.");

        separador("FIN DEL PROGRAMA - SISTEMA FUNCIONAL");
    }

    private static void separador(String titulo) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("  " + titulo);
        System.out.println("=".repeat(60));
    }
}
