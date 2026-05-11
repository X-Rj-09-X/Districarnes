/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Ricardo J
 */
public class PersistenciaServicio {

    public void guardarLog(String mensaje) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("pedidos.txt", true));

            writer.write(mensaje);

            writer.newLine();

            writer.close();

        } catch (IOException e) {

            System.out.println(
                    "Error al guardar archivo"
            );
        }
    }
}