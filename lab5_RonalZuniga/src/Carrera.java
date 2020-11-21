public class Carrera {
    private String nombre;
    private String facultad;
    private double costo;
    private String jefe;

    public Carrera() {
    }

    public Carrera(String facultad, double costo, String jefe) {
        this.facultad = facultad;
        this.costo = costo;
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
