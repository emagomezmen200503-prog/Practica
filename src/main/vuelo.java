/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author emago
 */
public class vuelo {

public class Vuelo {

        static void add(Vuelo vuelo) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    private int id;
    private String aerolinea;
    private String origen;
    private String destino;
    private String fecha;
    private String hora;
    private int espacios;
    private double precio;

    public Vuelo(int id, String aerolinea, String origen, String destino, String fecha, String hora, int espacios, double precio) {
        this.id = id;
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.espacios = espacios;
        this.precio = precio;
    }

    // Getters y Setters
    }

public class Reserva {
    private int id;
    private int idUsuario;
    private int idVuelo;
    private String fechaReserva;

    public Reserva(int id, int idUsuario, int idVuelo, String fechaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idVuelo = idVuelo;
        this.fechaReserva = fechaReserva;
    }
}  
}
