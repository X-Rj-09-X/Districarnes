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
public class Login extends JFrame{
    
    private JTextField campoCorreo;
    private JPasswordField campoContraseña;
    private JButton botonIngresar;

    public Login() {

        setTitle("Districarnes - Iniciar Sesión");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel principal
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(3, 2, 10, 10));

        // Componentes
        JLabel labelCorreo = new JLabel("Correo:");

        JLabel labelContraseña = new JLabel("Contraseña:");

        campoCorreo = new JTextField();

        campoContraseña = new JPasswordField();

        botonIngresar = new JButton("Ingresar");

        // Agregar componentes
        panel.add(labelCorreo);
        panel.add(campoCorreo);

        panel.add(labelContraseña);
        panel.add(campoContraseña);

        panel.add(new JLabel());
        panel.add(botonIngresar);

        add(panel, BorderLayout.CENTER);

        // Evento botón
        botonIngresar.addActionListener(e -> {

            String correo = campoCorreo.getText();

            String contraseña = new String(campoContraseña.getPassword());

            // Validar campos
            if (correo.isEmpty() || contraseña.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Complete todos los campos");

                return;
            }

            // Login correcto
            new Principal();

            dispose();
        });
        
        
        setVisible(true);
    }
    
}
