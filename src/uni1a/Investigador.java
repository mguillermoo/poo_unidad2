package uni1a;

public class Investigador {
    private String nombre;
    private String institucion;
    private String especialidad; 
    private int añosExperiencia; 

    public Investigador(String nombre, String institucion, String especialidad, int añosExperiencia) {
        this.nombre = nombre;
        this.institucion = institucion;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInstitucion() {
        return institucion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ", " + añosExperiencia + " años) - " + institucion;
    }
}
