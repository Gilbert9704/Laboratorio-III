/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author jose
 */
public class Cometario {
    
    String texto;
    private Date fechaComentario;

    public Cometario(String texto, int anio, int mes, int dia) {
        this.texto = texto;
        GregorianCalendar calendario=new GregorianCalendar(anio, mes, dia);
        this.fechaComentario = calendario.getTime();
    }
    
    
    
    }
