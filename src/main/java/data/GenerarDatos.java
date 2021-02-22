package data;

import models.DatosEmpleados;

import java.util.ArrayList;

public class GenerarDatos {

    private final ArrayList<DatosEmpleados> listaDeEmpleados = new ArrayList<DatosEmpleados>();

    public ArrayList<DatosEmpleados> empleados() {

        listaDeEmpleados.add(new DatosEmpleados(12258, "Simón", 3, 6000000));
        listaDeEmpleados.add(new DatosEmpleados(13545, "Tomás", 5, 5400000));
        listaDeEmpleados.add(new DatosEmpleados(45687, "Bartolomé", 9, 7200000));
        listaDeEmpleados.add(new DatosEmpleados(21546, "Juan", 24, 4300000));
        listaDeEmpleados.add(new DatosEmpleados(46875, "Andrés", 65, 3500000));
        listaDeEmpleados.add(new DatosEmpleados(654543, "Pedro", 54, 3800000));
        listaDeEmpleados.add(new DatosEmpleados(56156, "Santiago", 12, 6600000));
        listaDeEmpleados.add(new DatosEmpleados(99865, "Felipe", 13, 1800000));
        listaDeEmpleados.add(new DatosEmpleados(33461, "Mateo", 1, 3514132));
        listaDeEmpleados.add(new DatosEmpleados(788756, "Judas", 4, 2355000));

        return listaDeEmpleados;
    }

}
