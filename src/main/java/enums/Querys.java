package enums;

public enum Querys {

    CONSULTAR_EMPLEADOS("SELECT * FROM empleados WHERE salario > 5000000 AND meses < 6"),
    INSERTAR_EMPLEADOS("INSERT INTO empleados (id_empleados,nombre,meses,salario)VALUES(%d,%s,%d,%d)\n");

    private final String value;

    Querys(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
