public class Ingenierias extends Carrera{
    private String tipo;
    
    public Ingenierias() {
        super();
    }
    
    public Ingenierias(String tipo, String facultad, double costo, String jefe) {
        super(facultad, costo, jefe);
        setTipo(tipo);
    }
    
    public Ingenierias(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        if (tipo.equals("Sistemas Computacionales") || tipo.equals("Industrial y de Sistemas") || tipo.equals("Mecatrónica")
                || tipo.equals("Biomédica") || tipo.equals("Energía")) {
            this.tipo = tipo;
            super.setNombre("Ingeniería en " + tipo);
        }
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
