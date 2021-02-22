import data.GenerarDatos;
import enums.Querys;
import integracion.ConexionBD;
import integracion.ConsultarDatos;
import integracion.InsertarDatos;
import models.DatosEmpleados;
import java.util.ArrayList;
import static enums.ConfiguracionConexion.*;
import static enums.Querys.INSERTAR_EMPLEADOS;

public class InteraccionConBd {


    public static void main(String[] args) {

        //Metodo de conexion a base de datos
        ConexionBD conexionBD = new ConexionBD(DRIVER.getValue(), PROTOCOLO.getValue(), SERVIDOR.getValue(), BD.getValue(), USUARIO.getValue(), CONTRASENA.getValue());
        conexionBD.conectar();

        //Insersión de datos a base de datos
        GenerarDatos generarDatos = new GenerarDatos();
        ArrayList<DatosEmpleados> listaDeEmpleados = generarDatos.empleados();

        for (DatosEmpleados Empleado : listaDeEmpleados) {

            new InsertarDatos(conexionBD.getConexion(), String.format(INSERTAR_EMPLEADOS.getValue(), Empleado.getId_empleado(), "'" + Empleado.getNombre() + "'", Empleado.getMeses(), Empleado.getSalario()));

        }

        //Consulta de datos de base de datos
        ConsultarDatos consultarDatos = new ConsultarDatos();
        String resultadoConsulta = consultarDatos.RealizarConsulta(conexionBD.getConexion(), Querys.CONSULTAR_EMPLEADOS.getValue());

        System.out.println("Los empleados solicitados son: " + resultadoConsulta);

        conexionBD.desconectar();
    }

}