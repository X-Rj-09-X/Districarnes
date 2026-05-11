/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ricardo J
 */
public abstract class Usuario {
    
    private int id;
    private String nombre;
    private String correo;
    private String contraseña;
    
    //constructor

    public Usuario(int id, String nombre, String correo, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    
    //getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        }
        
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (!correo.isEmpty()) {
            this.correo = correo;
        }
        
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        if (contraseña.length() >= 4) {
            this.contraseña = contraseña;
        }
        
    }
    
    //met. abstracto
    public abstract String getRol();

    @Override
    public String toString() {

        return id
                + " | "
                + nombre
                + " | "
                + correo
                + " | "
                + getRol();
    }
}
