
public class Licenciaturas extends Carrera {

    private String tipo;
    
    public Licenciaturas() {
        super();
    }
    
    public Licenciaturas(String tipo, String facultad, double costo, String jefe) {
        super(facultad, costo, jefe);
        this.tipo = tipo;
    }
    
    public Licenciaturas(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        if (tipo.equals("Finanzas") || tipo.equals("Derecho") || tipo.equals("Administración de Empresas")
                || tipo.equals("Diseño Gráfico") || tipo.equals("Mercadotecnia")) {
            this.tipo = tipo;
            super.setNombre("Licenciatura en " + tipo);
        }
    }
    
    @Override
    public String toString() {
        return "Licenciaturas{" + "tipo=" + tipo + '}';
    }
    
}
