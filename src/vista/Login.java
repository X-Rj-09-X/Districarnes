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
public class Login extends JFrame {

    private JTextField campoCorreo;

    private JPasswordField campoContraseña;

    private JButton botonIngresar;

    private JButton botonRegistro;

    public Login() {

        setTitle("Districarnes - Iniciar Sesión");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panelPrincipal = new JPanel();

        panelPrincipal.setLayout(new GridBagLayout());

        GridBagConstraints gbc =
                new GridBagConstraints();

        gbc.insets =
                new Insets(10, 10, 10, 10);

        // Componentes
        JLabel labelCorreo =
                new JLabel("Correo:");

        JLabel labelContraseña =
                new JLabel("Contraseña:");

        campoCorreo =
                new JTextField(15);

        campoContraseña =
                new JPasswordField(15);

        botonIngresar =
                new JButton("Ingresar");

        botonRegistro =
                new JButton("Registrarse");

        // Fila 1
        gbc.gridx = 0;
        gbc.gridy = 0;

        panelPrincipal.add(
                labelCorreo,
                gbc
        );

        gbc.gridx = 1;

        panelPrincipal.add(
                campoCorreo,
                gbc
        );

        // Fila 2
        gbc.gridx = 0;
        gbc.gridy = 1;

        panelPrincipal.add(
                labelContraseña,
                gbc
        );

        gbc.gridx = 1;

        panelPrincipal.add(
                campoContraseña,
                gbc
        );

        // Botón ingresar
        gbc.gridx = 1;
        gbc.gridy = 2;

        panelPrincipal.add(
                botonIngresar,
                gbc
        );

        // Botón registro
        gbc.gridy = 3;

        panelPrincipal.add(
                botonRegistro,
                gbc
        );

        // Evento login
        botonIngresar.addActionListener(e -> {

            String correo =
                    campoCorreo.getText();

            String contraseña =
                    new String(
                            campoContraseña.getPassword()
                    );

            if (correo.isEmpty()
                    || contraseña.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Complete todos los campos"
                );

                return;
            }

            // Usuario administrador
            if (correo.equals("admin")
                    && contraseña.equals("1234")) {

                JOptionPane.showMessageDialog(
                        this,
                        "Bienvenido administrador"
                );

                new Principal();

                dispose();

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Credenciales incorrectas"
                );
            }
        });

        // Evento registro
        botonRegistro.addActionListener(e -> {

            String correo =
                    campoCorreo.getText();

            String contraseña =
                    new String(
                            campoContraseña.getPassword()
                    );

            if (correo.isEmpty()
                    || contraseña.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Complete los campos"
                );

                return;
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Usuario registrado correctamente"
            );
        });

        add(panelPrincipal);

        setVisible(true);
    }
}
