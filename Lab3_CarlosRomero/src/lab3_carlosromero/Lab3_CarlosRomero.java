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
        String u=JOptionPane.showInputDialog("Ingrese el Usuario:\n(Usuario: programacionII)","programacionII");
        while(!u.equals("programacionII")){
            u=JOptionPane.showInputDialog("Usuario Incorrecto!\nIngrese el Usuario:\n(Usuario: programacionII)","programacionII");
        }
        String c=JOptionPane.showInputDialog("Ingrese la Contraseña:\n(Contraseña:lab32017)","lab32017");
        while(!c.equals("lab32017")){
            c=JOptionPane.showInputDialog("Contraseña Incorrecta!\nIngrese la Contraseña:\n(Contraseña:lab32017)","lab32017");
        }
        menu();
        }
    }
    
    public static void Menu(){
        String inicio="";
        while(!inicio.equals("Salir")){
            String[] z={"Agregar Persona","Modificar Persona","Eliminar Persona","Menú Administrativo","Salir"};
            inicio= (String) JOptionPane.showInputDialog(null, "Inicie Sesión","Centro Comercial", JOptionPane.DEFAULT_OPTION, null, z, z[0]);
        }
    }
    
    public static void menu(){
        String adminitracion="";
        while(!adminitracion.equals("Salir")){
         String[] z={"Empleados","Clientes","Salir"};
         adminitracion=(String) JOptionPane.showInputDialog(null, "Seleccion una opción:","Administración", JOptionPane.DEFAULT_OPTION, null, z, z[0]);
         if(adminitracion.equals("Empleados")){
             Empleados();
         }if(adminitracion.equals("Clientes")){
             Clientes();
         }
        }
    } 
    
    public static void Empleados(){
        String menu="";
        while(!menu.equals("Salir")){
            String[] z={"Agregar Locales","Modificar Locales","Salir"};
            menu=(String) JOptionPane.showInputDialog(null, "Seleccion una opción:","Empleados", JOptionPane.DEFAULT_OPTION, null, z, z[0]);
        }
    }
    
    public static void Clientes(){
        System.out.println("AS");
    } 
}
