/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Datos.Usuario;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class ArchivoInf {
    
    Usuario objUsuario;
    Usuario objAux;
    Usuario objUsuario2;
    ObjectOutputStream oos;
    ObjectInputStream ois;
    
    File usuarios = new File("usuarios");
    
    public void almacenarDatosUsr(HashMap usuariosReg) throws FileNotFoundException{
        try {
            oos = new ObjectOutputStream(new FileOutputStream(usuarios));
            oos.writeObject(usuariosReg);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoInf.class.getName()).log(Level.SEVERE, null, ex);
        }  
        JOptionPane.showMessageDialog(null, "Se han guardado los datos");
    }
    
    public void leerDatosUsr(HashMap usuariosReg) throws ClassNotFoundException{
        try {
            ois = new ObjectInputStream(new FileInputStream(usuarios));
            usuariosReg = (HashMap)ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoInf.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, usuariosReg);
        JOptionPane.showMessageDialog(null, "Se han cargado los datos");
    }
}
