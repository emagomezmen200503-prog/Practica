/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.*;
import java.util.*;
/**
 *
 * @author emago
 */

import java.sql.*;
import java.util.*;
import main.Conexion.ConexionDB;
import main.vuelo.Vuelo;

public class VueloDao {
    public List<Vuelo> buscarVuelos(String origen, String destino, String fecha) {
        List<Vuelo> vuelos = new ArrayList<>();
        String sql = "SELECT * FROM vuelos WHERE origen = ? AND destino = ? AND fecha = ?";

        try (Connection con = ConexionDB.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, origen);
            pst.setString(2, destino);
            pst.setString(3, fecha);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vuelos;
    }
}