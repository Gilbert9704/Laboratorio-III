/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.ArchivoInf;
import Datos.Usuario;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArchivoInf info = new ArchivoInf();
        UI ui = new UI();
        
        HashMap<Integer, Usuario> registros = new HashMap<>();
        
        try {
            info.leerDatosUsr(registros);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ui.iniciarPrograma();
    }
    
}
