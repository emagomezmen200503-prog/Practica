/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author emago
 */
public class Conexion {
public class ConexionDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/reservas";
    private static final String USER = "postgres";j
    private static final String PASSWORD = "tu_clave";

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
 
}
