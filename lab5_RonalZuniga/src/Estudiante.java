public class Estudiante extends Persona{
    private int cuenta;
    private Carrera carrera;

    public Estudiante() {
        super();
    }

    public Estudiante(int cuenta, Carrera carrera, String nombre, String apellido, int edad, String genero) {
        super(nombre, apellido, edad, genero);
        this.cuenta = cuenta;
        this.carrera = carrera;
    }

    public Estudiante(int cuenta, Carrera carrera) {
        this.cuenta = cuenta;
        this.carrera = carrera;
    }
    

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return cuenta + "  " + super.getNombre() + "  " + super.getApellido();
    }
    
}
