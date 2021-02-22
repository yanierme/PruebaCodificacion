package models;

public class DatosEmpleados {

    private int id_empleado;
    private String nombre;
    private int meses;
    private int salario;

    public DatosEmpleados(int id_empleado, String nombre, int meses, int salario) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.meses = meses;
        this.salario = salario;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
