package poo;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");

        // Relación Actor - Película
        Actor actor1 = new Actor("Emma Stone", 34, "EE.UU.", "Protagonista");
        ((Pelicula) contenidos[0]).agregarActor(actor1);

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            mostrarDetalles(contenido);
            System.out.println();
        }
    }

    public static void mostrarDetalles(ContenidoAudiovisual contenido) {
        System.out.println("ID: " + contenido.getId());
        System.out.println("Título: " + contenido.getTitulo());
        System.out.println("Duración: " + contenido.getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + contenido.getGenero());
        if (contenido instanceof Pelicula) {
            Pelicula peli = (Pelicula) contenido;
            System.out.println("Estudio: " + peli.getEstudio());
            System.out.println("Actores:");
            for (Actor a : peli.getActores()) {
                System.out.println("  - " + a);
            }
        }
    }
}