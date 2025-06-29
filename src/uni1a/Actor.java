package uni1a;

public class Actor {
    private String nombre;
    private int edad;
    private String nacionalidad; 
    private String personaje;    

    public Actor(String nombre, int edad, String nacionalidad, String personaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.personaje = personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años) - " + personaje + " [" + nacionalidad + "]";
    }
}
