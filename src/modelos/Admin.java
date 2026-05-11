/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ricardo J
 */
public class Admin extends Usuario {

    public Admin(int id, String nombre, String correo, String contraseña) {

        super(id, nombre, correo, contraseña);
    }

    @Override
    public String getRol() {
        return "ADMINISTRADOR";
    }
}
