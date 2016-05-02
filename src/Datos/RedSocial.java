/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import DAO.ArchivoInf;
import UI.RedSocialFrame;
import java.util.*;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class RedSocial {

    String name = null;
    String nickname = null;
    int age = 0;
    String password = null;
    String email = null;
    
    public HashMap<String, Usuario> usuarios = new HashMap<>();//password es la clave
    Scanner datos = new Scanner(System.in);
    
    ArchivoInf arch = new ArchivoInf();
    Usuario regUsr = new Usuario(name, nickname, age, password, email);
    
    public RedSocial(){
    }
    
    public void registrarUsuario() throws IllegalArgumentException, InputMismatchException{
    
        try{    
            name = RedSocialFrame.nombre.getText();
            regUsr.setNombre(name);
            nickname = RedSocialFrame.nick.getText();
            regUsr.setNick(nickname);
            age = Integer.parseInt(RedSocialFrame.edad.getText());
            regUsr.setEdad(age);
            password = RedSocialFrame.clave.getText();
            regUsr.setClave(password);
            email = RedSocialFrame.correo.getText();
            regUsr.setCorreo(email);

            if ("".equals(name) || "".equals(nickname) || age == 0 || "".equals(password) || "".equals(email)){
                throw new IllegalArgumentException("Aún faltan datos por completar");
            }else if(age < 0){
                throw new IllegalArgumentException("Edad Imposible");
            }else if ("123456".equals(password)){
                throw new IllegalArgumentException("La contraseña no puede ser (123456), intente nuevamente");
            }else if(!email.contains("@")){
                throw new IllegalArgumentException("El formato del correo es incorrecto");
            }else{  
                if (usuarios.containsKey(email)){
                    JOptionPane.showMessageDialog(null, "El correo electrónico ya existe, ingrese uno distinto");
                }else{
                    usuarios.put(email, new Usuario(name, nickname, age, password, email));
                    JOptionPane.showMessageDialog(null, "¡¡Registro Exitoso!!");
                    mostrarDatos();
                    arch.almacenarDatosUsr(usuarios);
                }
            }
        }catch(IllegalArgumentException iae){
            JOptionPane.showMessageDialog(null, iae.getMessage());
        }catch(InputMismatchException ime){
            JOptionPane.showMessageDialog(null, "Debe ingresar el tipo de dato solicitado");
        }catch(FileNotFoundException fne){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }    
    }
    
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, toString(),"Aviso", JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public String toString() {
        return "Datos del Usuario:" + "\n Nombre: " + regUsr.getNombre() + "\n Nick: " + regUsr.getNick() + "\n Edad: " + regUsr.getEdad() 
                + "\n Constraseña: " + regUsr.getClave() + "\n Correo: " + regUsr.getCorreo() + "\n Por favor no olvide su contraseña";
    }
    
    
}
