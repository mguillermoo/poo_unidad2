package uni1a;

public class Temporada {
    private int numero;
    private int episodios;
    private int añoEstreno;     
    private String sinopsis;   

    public Temporada(int numero, int episodios, int añoEstreno, String sinopsis) {
        this.numero = numero;
        this.episodios = episodios;
        this.añoEstreno = añoEstreno;
        this.sinopsis = sinopsis;
    }

    public int getNumero() {
        return numero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    @Override
    public String toString() {
        return "T" + numero + " (" + añoEstreno + "): " + episodios + " episodios - " + sinopsis;
    }
}
