/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.*;
//import java.util.*;
/**
 *
 * @author jose
 */
public class Usuario implements Serializable {
    
    private String nombre;
    private String nick;   
    private int edad ;
    private transient String clave;
    private String correo;
    //public Comentario comentarios
    
    public Usuario(String nombre, String nick, int edad, String clave, String correo) {
        this.nombre = nombre;
        this.nick = nick;
        this.edad = edad;
        this.clave = clave;
        this.correo = correo;
    }
    
    public void escribirComentario(){
        
    }
    
    public void publicarFotografia(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
      
}
