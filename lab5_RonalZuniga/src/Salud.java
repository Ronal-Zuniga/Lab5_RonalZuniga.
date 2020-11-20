
public class Salud extends Carrera {

    private String tipo;

    public Salud() {
        super();
    }

    public Salud(String tipo, String facultad, double costo, String jefe) {
        super(facultad, costo, jefe);
        setTipo(tipo);
    }

    public Salud(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("Medicina y Cirugía") || tipo.equals("Odontología") || tipo.equals("Nutrición")
                || tipo.equals("Terapia Física y Ocupacional")) {
            this.tipo = tipo;
            super.setNombre(tipo);
        }
    }

    @Override
    public String toString() {
        return "Salud{" + "tipo=" + tipo + '}';
    }
    
}
