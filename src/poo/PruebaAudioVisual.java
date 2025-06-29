package poo;

import uni1a.*;

public class PruebaAudioVisual {

    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de contenido audiovisual
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
        contenidos[3] = new VideoYouTube("Java Básico", 12, "Educación", "CodeMaster", 1000);
        contenidos[4] = new Cortometraje("Luz", 18, "Drama", "Ana Pérez");

        // Relación Actor - Película
        Actor actor1 = new Actor("Emma Stone", 34, "EE.UU.", "Protagonista");
        ((Pelicula) contenidos[0]).agregarActor(actor1);

        // Relación Temporada - SerieDeTV
        Temporada t1 = new Temporada(1, 10, 2011, "La guerra comienza");
        ((SerieDeTV) contenidos[1]).agregarTemporada(t1);

        // Relación Investigador - Documental
        Investigador inv = new Investigador("Carl Sagan", "NASA", "Astronomía", 20);
        ((Documental) contenidos[2]).setInvestigador(inv);

        // Mostrar detalles de cada contenido
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
        } else if (contenido instanceof SerieDeTV) {
            SerieDeTV serie = (SerieDeTV) contenido;
            System.out.println("Temporadas (cantidad): " + serie.getTemporadas());
            System.out.println("Detalles de temporadas:");
            for (Temporada t : serie.getTemporadasLista()) {
                System.out.println("  - " + t);
            }
        } else if (contenido instanceof Documental) {
            Documental doc = (Documental) contenido;
            System.out.println("Tema: " + doc.getTema());
            if (doc.getInvestigador() != null) {
                System.out.println("Investigador: " + doc.getInvestigador());
            }
        } else if (contenido instanceof VideoYouTube) {
            VideoYouTube video = (VideoYouTube) contenido;
            System.out.println("Canal: " + video.getCanal());
            System.out.println("Likes: " + video.getLikes());
        } else if (contenido instanceof Cortometraje) {
            Cortometraje corto = (Cortometraje) contenido;
            System.out.println("Director: " + corto.getDirector());
        }
    }
}
