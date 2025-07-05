package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String director;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cortometraje:");
        System.out.println("Título: " + getTitulo() +
                ", Duración: " + getDuracionEnMinutos() + " min" +
                ", Género: " + getGenero() +
                ", Director: " + director);
    }
}
