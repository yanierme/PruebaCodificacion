package integracion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {

    private Statement sentencia;

    public InsertarDatos(Connection conexion, String query) {
        try {
            sentencia = conexion.createStatement();
            sentencia.execute(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage().substring(26, 76), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
