# GestorAudiovisual
GestorAudiovisual — Proyecto POO Java
Descripción
Sistema de gestión de contenido audiovisual desarrollado en Java como práctica de la Unidad 2 de Programación Orientada a Objetos. Modela películas, series, documentales, cortometrajes y videos educativos, junto con sus actores, temporadas e investigadores.
Objetivo
Ampliar un proyecto Java existente implementando los cuatro tipos de relaciones entre clases en POO:
Herencia — subclases que reutilizan y extienden la clase base
Composición — objetos que no existen fuera de su contenedor
Agregación — objetos independientes referenciados por otro
Asociación — referencia sin dependencia de ciclo de vida
---
Estructura del Proyecto
```
GestorAudiovisual/
└── src/
    └── poo/
        └── audiovisual/
            ├── ContenidoAudiovisual.java   ← Clase abstracta base
            ├── Pelicula.java               ← Herencia + Agregación (Actor)
            ├── SerieDeTV.java              ← Herencia + Composición (Temporada)
            ├── Documental.java             ← Herencia + Agregación (Investigador)
            ├── Actor.java                  ← Entidad relacionada
            ├── Temporada.java              ← Entidad relacionada
            ├── Investigador.java           ← Entidad relacionada
            ├── Cortometraje.java           ← Nueva subclase + Asociación (Actor)
            ├── VideoEducativo.java         ← Nueva subclase + Asociación (Investigador)
            └── PruebaAudioVisual.java      ← Clase principal (main)
```
---
Clases del Proyecto
Clases Base
Clase	Tipo	Descripción
`ContenidoAudiovisual`	Abstracta	Clase raíz con atributos comunes
`Pelicula`	Concreta	Película de cine con director y presupuesto
`SerieDeTV`	Concreta	Serie TV con plataforma y temporadas
`Documental`	Concreta	Documental con temática y narrador
`Cortometraje`	Concreta	Obra ≤40 min para festivales
`VideoEducativo`	Concreta	Contenido pedagógico en plataformas digitales
Clases de Entidades Relacionadas
Clase	Relación	Con quién
`Actor`	Agregación	Pelicula, Cortometraje
`Temporada`	Composición	SerieDeTV
`Investigador`	Agregación / Asociación	Documental, VideoEducativo
---
Relaciones Implementadas
```
ContenidoAudiovisual (abstracta)
    ├── Pelicula       ──●───── Actor        (agregación,  0..*)
    ├── SerieDeTV      ──◆───── Temporada    (composición, 1..*)
    ├── Documental     ──●───── Investigador (agregación,  0..*)
    ├── Cortometraje   ──────── Actor        (asociación,  0..*)
    └── VideoEducativo ──────── Investigador (asociación,  0..*)
```
---
Conceptos de POO Aplicados
Concepto	Implementación
Herencia	5 subclases de `ContenidoAudiovisual` usando `extends`
Polimorfismo	`mostrarDetalles()` sobrescrito en cada subclase
Encapsulamiento	Atributos `private` con getters y setters
Abstracción	`ContenidoAudiovisual` es `abstract`
ArrayList	Gestión dinámica de actores, temporadas e investigadores
---
Instalación y Ejecución
Requisitos
Java JDK 8 o superior
Eclipse IDE 2021 o superior
Clonar el repositorio
```bash
git clone https://github.com/Flores-Marcelo/GestorAudiovisual.git
```
Importar en Eclipse
`File → Import → General → Existing Projects into Workspace`
Seleccionar la carpeta clonada → `Finish`
Clic derecho en `PruebaAudioVisual.java`
`Run As → Java Application`
Salida esperada
El programa muestra 8 bloques en consola demostrando herencia, polimorfismo, agregación, composición y asociación.
---
Diagrama UML
```
ContenidoAudiovisual (abstract)
    ├── Pelicula       ◇──── Actor        (agregación)
    ├── SerieDeTV      ◆──── Temporada    (composición)
    ├── Documental     ◇──── Investigador (agregación)
    ├── Cortometraje   ────── Actor       (asociación)
    └── VideoEducativo ────── Investigador (asociación)
```
---
Autor
Nombre: Marcelo Flores
Carrera: Ingeniería de Software
Materia: Programación Orientada a Objetos
Universidad: Universidad Politécnica Salesiana
