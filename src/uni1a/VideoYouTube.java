package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private int likes;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String canal, int likes) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.likes = likes;
    }

    public String getCanal() {
        return canal;
    }

    public int getLikes() {
        return likes;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Video YouTube:");
        System.out.println("Título: " + getTitulo() + ", Duración: " + getDuracionEnMinutos() + " min, Canal: " + canal
                + ", Likes: " + likes);
    }
}
