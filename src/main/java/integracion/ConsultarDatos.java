package integracion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultarDatos {

    String datosResultado = "";
    public String RealizarConsulta(Connection conexion , String query) {
        try {
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);

            String datoTeporal = "";
            while(resultado.next()){
                datoTeporal = resultado.getString(2) ;
                datosResultado = datosResultado +  datoTeporal +", " ;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return datosResultado;
    }
}
