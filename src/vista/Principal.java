/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;
import modelos.Carne;
import servicio.PersistenciaServicio;

/**
 *
 * @author Ricardo J
 */

public class Principal extends JFrame {

    private double totalCarrito = 0;

    private int cantidadCarrito = 0;

    private PersistenciaServicio persistencia;

    public Principal() {

        persistencia = new PersistenciaServicio();

        setTitle("Districarnes - Sistema Principal");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panelPrincipal = new JPanel();

        panelPrincipal.setLayout(new BorderLayout());

        // Título
        JLabel titulo = new JLabel(
                "Bienvenido a Districarnes",
                SwingConstants.CENTER
        );

        titulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24
                )
        );

        // Área información
        JTextArea areaInformacion =
                new JTextArea();

        areaInformacion.setEditable(false);

        areaInformacion.setFont(
                new Font(
                        "Monospaced",
                        Font.PLAIN,
                        14
                )
        );

        // Productos ejemplo
        Carne carne1 = new Carne(
                1,
                "Carne Premium",
                35000,
                2,
                10,
                "Ribeye",
                "Res"
        );

        Carne carne2 = new Carne(
                2,
                "Costillas BBQ",
                28000,
                3,
                15,
                "Costilla",
                "Cerdo"
        );

        Carne carne3 = new Carne(
                3,
                "Pechuga Campesina",
                18000,
                1,
                20,
                "Pechuga",
                "Pollo"
        );

        // Arreglo productos
        Carne[] productos = {
            carne1,
            carne2,
            carne3
        };

        // Mostrar productos
        areaInformacion.append(
                "====== CATÁLOGO DISTRICARNES ======\n\n"
        );

        for (Carne producto : productos) {

            areaInformacion.append(
                    producto.toString()
                    + "\n\n"
            );
        }

        // Panel botones
        JPanel panelBotones = new JPanel();

        JButton botonProductos =
                new JButton("Productos");

        JButton botonCarrito =
                new JButton("Carrito");

        JButton botonPedidos =
                new JButton("Pedidos");

        JButton botonAgregarCarrito =
                new JButton("Agregar al carrito");

        JButton botonFinalizar =
                new JButton("Finalizar compra");

        JButton botonEliminar =
                new JButton("Eliminar carrito");

        JButton botonCantidad =
                new JButton("Modificar cantidad");

        JButton botonModificarProducto =
                new JButton("Modificar producto");

        panelBotones.add(botonProductos);
        panelBotones.add(botonCarrito);
        panelBotones.add(botonPedidos);
        panelBotones.add(botonAgregarCarrito);
        panelBotones.add(botonFinalizar);
        panelBotones.add(botonEliminar);
        panelBotones.add(botonCantidad);
        panelBotones.add(botonModificarProducto);

        // Evento agregar carrito
        botonAgregarCarrito.addActionListener(e -> {

            String entrada =
                    JOptionPane.showInputDialog(
                            this,
                            "Seleccione producto:\n"
                            + "1. Carne Premium\n"
                            + "2. Costillas BBQ\n"
                            + "3. Pechuga Campesina"
                    );

            try {

                int opcion =
                        Integer.parseInt(entrada);

                if (opcion < 1 || opcion > 3) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Producto inválido"
                    );

                    return;
                }

                Carne seleccion =
                        productos[opcion - 1];

                if (seleccion.getStock() <= 0) {

                    JOptionPane.showMessageDialog(
                            this,
                            "No hay stock disponible"
                    );

                    return;
                }

                cantidadCarrito++;

                totalCarrito +=
                        seleccion.getPrecio();

                seleccion.setStock(
                        seleccion.getStock() - 1
                );

                JOptionPane.showMessageDialog(
                        this,
                        "Producto agregado:\n"
                        + seleccion.getNombre()
                        + "\nTotal: $"
                        + totalCarrito
                );

                persistencia.guardarLog(
                        "Producto agregado: "
                        + seleccion.getNombre()
                );

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Ingrese número válido"
                );
            }
        });

        // Evento carrito
        botonCarrito.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    this,
                    "Cantidad productos: "
                    + cantidadCarrito
                    + "\nTotal carrito: $"
                    + totalCarrito
            );
        });

        // Evento pedidos
        botonPedidos.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    this,
                    "Historial disponible en pedidos.txt"
            );
        });

        // Evento eliminar carrito
        botonEliminar.addActionListener(e -> {

            if (cantidadCarrito <= 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "El carrito está vacío"
                );

                return;
            }

            cantidadCarrito--;

            totalCarrito -= carne1.getPrecio();

            carne1.setStock(
                    carne1.getStock() + 1
            );

            JOptionPane.showMessageDialog(
                    this,
                    "Producto eliminado\n"
                    + "Cantidad restante: "
                    + cantidadCarrito
            );
        });

        // Evento modificar cantidad
        botonCantidad.addActionListener(e -> {

            String entrada =
                    JOptionPane.showInputDialog(
                            this,
                            "Ingrese nueva cantidad"
                    );

            try {

                int nuevaCantidad =
                        Integer.parseInt(entrada);

                if (nuevaCantidad < 0) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Cantidad inválida"
                    );

                    return;
                }

                cantidadCarrito = nuevaCantidad;

                totalCarrito =
                        cantidadCarrito
                        * carne1.getPrecio();

                JOptionPane.showMessageDialog(
                        this,
                        "Cantidad actualizada\n"
                        + "Nuevo total: $"
                        + totalCarrito
                );

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Ingrese un número válido"
                );
            }
        });

        // Evento modificar producto
        botonModificarProducto.addActionListener(e -> {

            String entrada =
                    JOptionPane.showInputDialog(
                            this,
                            "Seleccione producto modificar:\n"
                            + "1. Carne Premium\n"
                            + "2. Costillas BBQ\n"
                            + "3. Pechuga Campesina"
                    );

            try {

                int opcion =
                        Integer.parseInt(entrada);

                if (opcion < 1 || opcion > 3) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Producto inválido"
                    );

                    return;
                }

                Carne seleccion =
                        productos[opcion - 1];

                String nuevoNombre =
                        JOptionPane.showInputDialog(
                                this,
                                "Nuevo nombre"
                        );

                double nuevoPrecio =
                        Double.parseDouble(
                                JOptionPane.showInputDialog(
                                        this,
                                        "Nuevo precio"
                                )
                        );

                seleccion.setNombre(
                        nuevoNombre
                );

                seleccion.setPrecio(
                        nuevoPrecio
                );

                areaInformacion.setText("");

                areaInformacion.append(
                        "====== CATÁLOGO DISTRICARNES ======\n\n"
                );

                for (Carne producto : productos) {

                    areaInformacion.append(
                            producto.toString()
                            + "\n\n"
                    );
                }

                JOptionPane.showMessageDialog(
                        this,
                        "Producto modificado correctamente"
                );

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Dato inválido"
                );
            }
        });

        // Evento finalizar compra
        botonFinalizar.addActionListener(e -> {

            if (totalCarrito <= 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "El carrito está vacío"
                );

                return;
            }

            String metodoPago =
                    JOptionPane.showInputDialog(
                            this,
                            "Método de pago:\n1. Tarjeta\n2. Efectivo"
                    );

            JOptionPane.showMessageDialog(
                    this,
                    "Pedido realizado correctamente\n"
                    + "Total pagado: $"
                    + totalCarrito
            );

            persistencia.guardarLog(
                    "Pedido realizado - Total: $"
                    + totalCarrito
                    + " - Método: "
                    + metodoPago
            );

            totalCarrito = 0;

            cantidadCarrito = 0;
        });

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