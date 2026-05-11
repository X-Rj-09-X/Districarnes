/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Ricardo J
 */
public class Principal extends JFrame {
    
    public Principal() {

        setTitle("Districarnes - Sistema Principal");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panelPrincipal = new JPanel();

        panelPrincipal.setLayout(new BorderLayout());

        // Título
        JLabel titulo = new JLabel("Bienvenido a Districarnes", SwingConstants.CENTER);

        titulo.setFont(new Font("Arial",Font.BOLD,24));

        // Área central
        JTextArea areaInformacion =
                new JTextArea();

        areaInformacion.setEditable(false);

        areaInformacion.setText("Sistema Ecommerce Districarnes");

        // Botones
        JPanel panelBotones =
                new JPanel();

        JButton botonProductos =
                new JButton("Productos");

        JButton botonCarrito =
                new JButton("Carrito");

        JButton botonPedidos =
                new JButton("Pedidos");

        panelBotones.add(botonProductos);
        panelBotones.add(botonCarrito);
        panelBotones.add(botonPedidos);

        // Agregar componentes
        panelPrincipal.add(
                titulo,
                BorderLayout.NORTH
        );

        panelPrincipal.add(
                new JScrollPane(areaInformacion),
                BorderLayout.CENTER
        );

        panelPrincipal.add(
                panelBotones,
                BorderLayout.SOUTH
        );

        add(panelPrincipal);

        setVisible(true);
    }
}
