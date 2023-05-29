package Modelos;

public class Poblacion {
    String nombre ;
    int habitantes;
    double poblacionCadaMilMetros;
    int adultos;
    int asistentes;
    Festividad festividad;

    public Poblacion(String nombre, int habitantes, double poblacionCadaMilMetros, int adultos, int asistentes, Festividad festividad) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.poblacionCadaMilMetros = poblacionCadaMilMetros;
        this.adultos = adultos;
        this.asistentes = asistentes;
        this.festividad = festividad;
    }

    public Poblacion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public double getPoblacionCadaMilMetros() {
        return poblacionCadaMilMetros;
    }

    public void setPoblacionCadaMilMetros(double poblacionCadaMilMetros) {
        this.poblacionCadaMilMetros = poblacionCadaMilMetros;
    }

    public int getAdultos() {
        return adultos;
    }

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    public Festividad getFestividad() {
        return festividad;
    }

    public void setFestividad(Festividad festividad) {
        this.festividad = festividad;
    }
}
