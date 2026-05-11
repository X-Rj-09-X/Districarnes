/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import javax.swing.*;
import java.awt.*;
import modelos.Carne;
import javax.swing.JOptionPane;

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
        JTextArea areaInformacion = new JTextArea();

        areaInformacion.setEditable(false);

        areaInformacion.setFont(
                new Font("Monospaced", Font.PLAIN, 14));

        // Productos de ejemplo
        Carne carne1 = new Carne(1, "Carne Premium", 35000, 2, 10, "Ribeye", "Res");

        Carne carne2 = new Carne(2, "Costillas BBQ", 28000, 3, 15, "Costilla", "cerdo");
                
        Carne carne3 = new Carne(3, "Pechuga Campesina", 18000, 1, 20, "Pechuga", "Pollo");

        // Mostrar productos
        areaInformacion.append(
                "====== PRODUCTOS DISPONIBLES ======\n\n"
        );

        areaInformacion.append(
                carne1.toString() + "\n\n"
        );

        areaInformacion.append(
                carne2.toString() + "\n\n"
        );

        areaInformacion.append(
                carne3.toString() + "\n\n"
        );

        // Panel botones
        JPanel panelBotones = new JPanel();

        JButton botonProductos = new JButton("Productos");

        JButton botonCarrito = new JButton("Carrito");

        JButton botonPedidos = new JButton("Pedidos");
        
        JButton botonAgregarCarrito = new JButton("Agregar al carrito");

        
        panelBotones.add(botonProductos);
        panelBotones.add(botonCarrito);
        panelBotones.add(botonPedidos);
        panelBotones.add(botonAgregarCarrito);
        

        // Agregar componentes
        panelPrincipal.add(titulo, BorderLayout.NORTH);

        panelPrincipal.add(new JScrollPane(areaInformacion),BorderLayout.CENTER);

        panelPrincipal.add(panelBotones,BorderLayout.SOUTH);
        
        // Evento agregar carrito
        botonAgregarCarrito.addActionListener(e -> {

            JOptionPane.showMessageDialog(this, "Producto agregado al carrito");
        });

        // Evento carrito
        botonCarrito.addActionListener(e -> {

            JOptionPane.showMessageDialog(this, "Carrito funcionando");
        });

        // Evento pedidos
        botonPedidos.addActionListener(e -> {

            JOptionPane.showMessageDialog(this, "Pedidos funcionando");
        });

        add(panelPrincipal);

        setVisible(true);
    }
}
