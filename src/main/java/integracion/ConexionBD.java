package integracion;

import models.DatosConexion;

import java.sql.*;

public class ConexionBD {

    private Connection conexion;
    private final DatosConexion datosConexion = new DatosConexion();


    public ConexionBD(String driver, String protocolo, String servidor, String bd, String usuario, String contrasena) {

        datosConexion.setDriver(driver);
        datosConexion.setProtocolo(protocolo);
        datosConexion.setServidor(servidor);
        datosConexion.setBd(bd);
        datosConexion.setUsuario(usuario);
        datosConexion.setContrasena(contrasena);
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void conectar() {

        try {
            Class.forName(datosConexion.getDriver()).newInstance();
            conexion = DriverManager.getConnection(datosConexion.getProtocolo() + "://" + datosConexion.getServidor() + "/" + datosConexion.getBd(), datosConexion.getUsuario(), datosConexion.getContrasena());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}