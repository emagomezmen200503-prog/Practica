/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import main.vuelo.Vuelo;
/**
 *
 * @author emago
 */
public class BuscarVuelosVista {

    private JTextField txtOrigen, txtDestino, txtFecha;
    private JTable tabla;

    public BuscarVuelosVista() {
        setTitle("Buscar Vuelos");
        setSize(700, 400);
        setLocationRelativeTo(null);

        txtOrigen = new JTextField(10);
        txtDestino = new JTextField(10);
        txtFecha = new JTextField(10); // formato: YYYY-MM-DD
        JButton btnBuscar = new JButton("Buscar");

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Origen:"));
        inputPanel.add(txtOrigen);
        inputPanel.add(new JLabel("Destino:"));
        inputPanel.add(txtDestino);
        inputPanel.add(new JLabel("Fecha:"));
        inputPanel.add(txtFecha);
        inputPanel.add(btnBuscar);

        tabla = new JTable();
        JScrollPane scrollPane = new JScrollPane(tabla);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        btnBuscar.addActionListener(e -> buscarVuelos());
    }

    private void buscarVuelos() {
        String origen = txtOrigen.getText();
        String destino = txtDestino.getText();
        String fecha = txtFecha.getText();

        VueloDAO dao = new VueloDAO();
        List<Vuelo> vuelos = dao.buscarVuelos(origen, destino, fecha);

        DefaultTableModel model = new DefaultTableModel(
            new String[]{"ID", "Aerolínea", "Origen", "Destino", "Fecha", "Hora", "Espacios", "Precio"}, 0
        );

        for (Vuelo v : vuelos) {
            model.addRow(new Object[]{
                v.getId(), v.getAerolinea(), v.getOrigen(), v.getDestino(),
                v.getFecha(), v.getHora(), v.getEspacios(), v.getPrecio()
            });
        }  
    }

    private void setTitle(String buscar_Vuelos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(JPanel inputPanel, String NORTH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(JScrollPane scrollPane, String CENTER) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
