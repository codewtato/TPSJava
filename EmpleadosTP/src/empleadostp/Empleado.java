package empleadostp;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;


    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 25000.0;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void actualizarSalario(double porcentaje) {
        this.salario = this.salario + (this.salario * porcentaje / 100);
    }

    public void actualizarSalario(int cantidadFija) {
        this.salario = this.salario + cantidadFija;
    }

    @Override
    public String toString() {
        return String.format("Empleado [ID: %d, Nombre: %s, Puesto: %s, Salario: %.2f]",
                        this.id, this.nombre, this.puesto, this.salario);
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
