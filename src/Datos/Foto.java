/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author jose
 */
public class Foto {
    String nombre ;
    String descripcion;
    Usuario[]enFoto = new Usuario[5];

    public Foto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setEnFoto(Usuario[] enFoto) {
        this.enFoto = enFoto;
    }

   

   
    
    
    
    
    
    
}
