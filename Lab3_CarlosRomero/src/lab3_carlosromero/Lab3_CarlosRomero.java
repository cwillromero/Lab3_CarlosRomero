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
    static ArrayList <Locales> locales=new ArrayList();
    static ArrayList <Persona> personas=new ArrayList();
    public static void main(String[] args) {
        /*String inicio="";
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
        }*/
        Menu();
        //}
    }
    
    public static void Menu(){
        String inicio="";
        while(!inicio.equals("Salir")){
            String[] z={"Menú Administrativo","Agregar Persona","Modificar Persona","Eliminar Persona","Listar Personas","Salir"};
            inicio= (String) JOptionPane.showInputDialog(null, "                           Menu Inicial            ","Centro Comercial", JOptionPane.DEFAULT_OPTION, null, z, z[0]);
            if(inicio.equals(z[0])){
                if(personas.size()==0){
                    JOptionPane.showMessageDialog(null, "Debe Agregar Personas Primero!");
                }else{
                    menu();
                }
            }
            if (inicio.equals(z[1])) {
                agregar();
            }
            if(inicio.equals(z[2])){
                if(personas.size()==0){
                    JOptionPane.showMessageDialog(null, "Debe Agregar Personas Primero!");
                }else{
                    modificar();
                }
            }
            if(inicio.equals(z[2])){
                if(personas.size()==0){
                    JOptionPane.showMessageDialog(null, "Debe Agregar Personas Primero!");
                }else{
                    int Pos=Integer.parseInt(JOptionPane.showInputDialog("Ingese la posición a eliminar:"));
                    while (Pos>=personas.size()) {
                        JOptionPane.showMessageDialog(null, "Esa Posición no existe!");
                        Pos=Integer.parseInt(JOptionPane.showInputDialog("Ingese la posición a eliminar:"));
                    }
                    personas.remove(Pos);
                }
            }
            if(inicio.equals(z[4])){
                if(personas.size()==0){
                    JOptionPane.showMessageDialog(null, "Debe Agregar Personas Primero!");
                }else{
                String s="________________________________________Personas________________________________________\n";
                for (Object t : personas) {
                    s+=""+personas.indexOf(t)+""+") \n"+t+"\n\n";    
                }
                JOptionPane.showMessageDialog(null, s);
                }
            }
            
        }
    }
    
    public static void agregar(){
        String tipo="";
        String[] t={"Empleado","Cliente"};
        tipo=(String) JOptionPane.showInputDialog(null, "Seleccion un tipo de persona:",null, JOptionPane.DEFAULT_OPTION, null, t, t[0]);
        if(tipo.equals(t[0])){
        personas.add(new Clientes());
        String Username=JOptionPane.showInputDialog("Ingrese el Username:");
        for (int i = 0; i < personas.size()-1; i++) {
                while(((Persona) personas.get(i)).getUsername().equals(Username)){
                JOptionPane.showMessageDialog(null,"Username Repetido!");
                Username=JOptionPane.showInputDialog("Ingrese el Username:");
            }
        }
        personas.get(personas.size()-1).setUsername(Username);
        String Password=JOptionPane.showInputDialog("Ingrese el Password:"); 
        personas.get(personas.size()-1).setPassword(Password);
        String Correo=JOptionPane.showInputDialog("Ingrese el correo:");  
        personas.get(personas.size()-1).setCorreo(Correo);
        String NombreCompleto=JOptionPane.showInputDialog("Ingrese Nombre Completo:");  
        personas.get(personas.size()-1).setNombreCompleto(NombreCompleto);
        String ID=JOptionPane.showInputDialog("Ingrese ID:");
        for (int i = 0; i < personas.size()-1; i++) {
                while(((Persona) personas.get(i)).getID().equals(ID)){
                JOptionPane.showMessageDialog(null,"ID Repetido!");
                ID=JOptionPane.showInputDialog("Ingrese el ID:");
            }
        }
        personas.get(personas.size()-1).setID(ID);
        String FechaNacimiento=JOptionPane.showInputDialog("Ingrese Fecha de Nacimiento:","DD/MM/AAAA"); 
        personas.get(personas.size()-1).setFechaNacimiento(FechaNacimiento);
            String Horario=JOptionPane.showInputDialog("Ingrese el Horraio De Trabajo:","00:00-00:00");
            ((Empleados) personas.get(personas.size()-1)).setHorario(Horario);
            int NumeroDeProductosVendidos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero de Productos Vendidos:","0"));
            ((Empleados) personas.get(personas.size()-1)).setNumeroDeProductosVendidos(NumeroDeProductosVendidos);
        } 
        if(tipo.equals(t[1])){
            personas.add(new Empleados());
        String Username=JOptionPane.showInputDialog("Ingrese el Username:");
        for (int i = 0; i < personas.size()-1; i++) {
                while(((Persona) personas.get(i)).getUsername().equals(Username)){
                JOptionPane.showMessageDialog(null,"Username Repetido!");
                Username=JOptionPane.showInputDialog("Ingrese el Username:");
            }
        }
        personas.get(personas.size()-1).setUsername(Username);
        String Password=JOptionPane.showInputDialog("Ingrese el Password:"); 
        personas.get(personas.size()-1).setPassword(Password);
        String Correo=JOptionPane.showInputDialog("Ingrese el correo:");  
        personas.get(personas.size()-1).setCorreo(Correo);
        String NombreCompleto=JOptionPane.showInputDialog("Ingrese Nombre Completo:");  
        personas.get(personas.size()-1).setNombreCompleto(NombreCompleto);
        String ID=JOptionPane.showInputDialog("Ingrese ID:");
        for (int i = 0; i < personas.size()-1; i++) {
                while(((Persona) personas.get(i)).getID().equals(ID)){
                JOptionPane.showMessageDialog(null,"ID Repetido!");
                ID=JOptionPane.showInputDialog("Ingrese el ID:");
            }
        }
        personas.get(personas.size()-1).setID(ID);
        String FechaNacimiento=JOptionPane.showInputDialog("Ingrese Fecha de Nacimiento:","DD/MM/AAAA"); 
        personas.get(personas.size()-1).setFechaNacimiento(FechaNacimiento);
        ArrayList ProductosComprados=new ArrayList();
        if()
    }
    
    public static void modificar(){
        
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
