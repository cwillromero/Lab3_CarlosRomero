/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_carlosromero;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class Lab3_CarlosRomero {
    static ArrayList <Locales> Locales=new ArrayList();
    public static void main(String[] args) {
        String inicio="";
        while(!inicio.equals("Salir")){
        String[] z={"Iniciar Seción","Salir"};
        inicio= (String) JOptionPane.showInputDialog(null, "Inicie Sesión","Centro Comercial", JOptionPane.DEFAULT_OPTION, null, z, z[0]);
        String u=JOptionPane.showInputDialog("Ingrese el Usuario:\n(Usuario: programacionII)");
        while(!u.equals("programacionII")){
            u=JOptionPane.showInputDialog("Usuario Incorrecto!\nIngrese el Usuario:\n(Usuario: programacionII)");
        }
        String c=JOptionPane.showInputDialog("Ingrese la Contraseña:\n(Contraseña:lab32017)");
        while(!c.equals("lab32017")){
            c=JOptionPane.showInputDialog("Contraseña Incorrecta!\nIngrese la Contraseña:\n(Contraseña:lab32017)");
        }
        
        }
    }
    
}
