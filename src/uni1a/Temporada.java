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

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    @Override
    public String toString() {
        return "T" + numero + " (" + añoEstreno + "): " + episodios + " episodios - " + sinopsis;
    }
}
