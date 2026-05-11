/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;
import modelos.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Ricardo J
 */
public class UsuarioServicio {
    
    private ArrayList<Usuario> usuarios;
    
    //constructor
    public UsuarioServicio() {

        usuarios = new ArrayList<>();
    }
    
    
    //agregar
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    //obtener
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    //buscar
    public Usuario buscarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;
    }
    
    //validacion
    public Usuario iniciarSesion(String correo, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario.getContraseña().equals(contraseña)) {

                return usuario;
            }
        }

        return null;
    }
    
    //eliminar
    public boolean eliminarUsuario(int id) {
        Usuario usuario = buscarUsuario(id);
        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }

        return false;
    }
    
}
