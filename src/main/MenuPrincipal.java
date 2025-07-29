/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author emago
 */
public class MenuPrincipal extends JFrame {
    public MenuPrincipal() {
        setTitle("Sistema de Reservas de Vuelo");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnBuscar = new JButton("Buscar Vuelos");
        JButton btnReservar = new JButton("Reservar Vuelo");
        JButton btnGestionar = new JButton("Gestionar Itinerarios");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.add(btnBuscar);
        panel.add(btnReservar);
        panel.add(btnGestionar);

        add(panel);
    }
}
  

