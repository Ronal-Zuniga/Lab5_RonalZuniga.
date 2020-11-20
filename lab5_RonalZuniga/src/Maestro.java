
import java.util.ArrayList;

public class Maestro extends Persona{
    private double salario;
    private ArrayList<Clases> clases = new ArrayList();

    public Maestro() {
        super();
    }

    public Maestro(double salario, String nombre, String apellido, int edad, String genero) {
        super(nombre, apellido, edad, genero);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return super.getNombre() + "  " + super.getApellido() + "  " + super.getEdad();
    }
    
}
