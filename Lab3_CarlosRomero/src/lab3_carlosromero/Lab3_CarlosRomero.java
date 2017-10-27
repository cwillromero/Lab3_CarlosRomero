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
        Menu();
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
            if(inicio.equals(z[3])){
                if(personas.size()==0){
                    JOptionPane.showMessageDialog(null, "Debe Agregar Personas Primero!");
                }else{
                    int Pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
                    while (Pos>=personas.size()) {
                        JOptionPane.showMessageDialog(null, "Esa Posición no existe!");
                        Pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
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
        tipo=(String) JOptionPane.showInputDialog(null, "Seleccion un tipo de persona:","Agregar", JOptionPane.DEFAULT_OPTION, null, t, t[0]);
        if(tipo.equals(t[0])){
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
            String Horario=JOptionPane.showInputDialog("Ingrese el Horraio De Trabajo:","00:00-00:00");
            ((Empleados) personas.get(personas.size()-1)).setHorario(Horario);
            int NumeroDeProductosVendidos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero de Productos Vendidos:","0"));
            ((Empleados) personas.get(personas.size()-1)).setNumeroDeProductosVendidos(NumeroDeProductosVendidos);
        } 
        else{
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
        double Dinero=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero", "0.00"));
        ((Clientes) personas.get(personas.size()-1)).setDinero(Dinero);
        }
    }
        
    public static void modificar(){
        String s="________________________________________Personas________________________________________\n";
        for (Object t : personas) {
            s+=""+personas.indexOf(t)+""+") \n"+t+"\n\n";    
         }
        System.out.println(s);
        int Pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
        while (Pos>=personas.size()) {
            JOptionPane.showMessageDialog(null, "Esa Posición no existe!");
            Pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
        }
        if(personas.get(Pos).toString().contains("Empleado")){
            String[] m={"Username","Password","Correo","Nombre Completo","ID","Fecha de Nacimiento","Horario","Numero de Productos Vendidos"};
            String p=(String) JOptionPane.showInputDialog(null, "Seleccion una opcion:","Modificar", JOptionPane.DEFAULT_OPTION, null, m, m[0]);
            if(p.equals(m[0])){
                String Username=JOptionPane.showInputDialog("Ingrese el Username Nuevo:");
                for (int i = 0; i < personas.size()-1; i++) {
                        while(((Persona) personas.get(i)).getUsername().equals(Username)){
                        JOptionPane.showMessageDialog(null,"Username Repetido!");
                        Username=JOptionPane.showInputDialog("Ingrese el Username:");
                    }
                }
                personas.get(personas.size()-1).setUsername(Username);
            }
            if(p.equals(m[1])){
                String Password=JOptionPane.showInputDialog("Ingrese el Password:"); 
                personas.get(personas.size()-1).setPassword(Password);
            }
            if(p.equals(m[2])){
                String Correo=JOptionPane.showInputDialog("Ingrese el Correo:");  
                personas.get(personas.size()-1).setCorreo(Correo);
            }
            if(p.equals(m[3])){
                String NombreCompleto=JOptionPane.showInputDialog("Ingrese Nombre Completo:");  
                personas.get(personas.size()-1).setNombreCompleto(NombreCompleto);
            }
            if(p.equals(m[4])){
                String ID=JOptionPane.showInputDialog("Ingrese ID:");
                for (int i = 0; i < personas.size()-1; i++) {
                        while(((Persona) personas.get(i)).getID().equals(ID)){
                        JOptionPane.showMessageDialog(null,"ID Repetido!");
                        ID=JOptionPane.showInputDialog("Ingrese el ID:");
                    }
                }
                personas.get(personas.size()-1).setID(ID);
            }
            if(p.equals(m[5])){
                String FechaNacimiento=JOptionPane.showInputDialog("Ingrese Fecha de Nacimiento:","DD/MM/AAAA"); 
                personas.get(personas.size()-1).setFechaNacimiento(FechaNacimiento);
            }
            if(p.equals(m[6])){
                String Horario=JOptionPane.showInputDialog("Ingrese el Horraio De Trabajo:","00:00-00:00");
                ((Empleados) personas.get(personas.size()-1)).setHorario(Horario);
            }
            if(p.equals(m[7])){
                int NumeroDeProductosVendidos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero de Productos Vendidos:","0"));
                ((Empleados) personas.get(personas.size()-1)).setNumeroDeProductosVendidos(NumeroDeProductosVendidos);
            }
        }else{
            String[] m={"Username","Password","Correo","Nombre Completo","ID","Fecha de Nacimiento","Dinero"};
            String p=(String) JOptionPane.showInputDialog(null, "Seleccion una opcion:","Modificar", JOptionPane.DEFAULT_OPTION, null, m, m[0]);
            if(p.equals(m[0])){
                String Username=JOptionPane.showInputDialog("Ingrese el Username Nuevo:");
                for (int i = 0; i < personas.size()-1; i++) {
                        while(((Persona) personas.get(i)).getUsername().equals(Username)){
                        JOptionPane.showMessageDialog(null,"Username Repetido!");
                        Username=JOptionPane.showInputDialog("Ingrese el Username:");
                    }
                }
                personas.get(personas.size()-1).setUsername(Username);
            }
            if(p.equals(m[1])){
                String Password=JOptionPane.showInputDialog("Ingrese el Password:"); 
                personas.get(personas.size()-1).setPassword(Password);
            }
            if(p.equals(m[2])){
                String Correo=JOptionPane.showInputDialog("Ingrese el Correo:");  
                personas.get(personas.size()-1).setCorreo(Correo);
            }
            if(p.equals(m[3])){
                String NombreCompleto=JOptionPane.showInputDialog("Ingrese Nombre Completo:");  
                personas.get(personas.size()-1).setNombreCompleto(NombreCompleto);
            }
            if(p.equals(m[4])){
                String ID=JOptionPane.showInputDialog("Ingrese ID:");
                for (int i = 0; i < personas.size()-1; i++) {
                        while(((Persona) personas.get(i)).getID().equals(ID)){
                        JOptionPane.showMessageDialog(null,"ID Repetido!");
                        ID=JOptionPane.showInputDialog("Ingrese el ID:");
                    }
                }
                personas.get(personas.size()-1).setID(ID);
            }
            if(p.equals(m[5])){
                String FechaNacimiento=JOptionPane.showInputDialog("Ingrese Fecha de Nacimiento:","DD/MM/AAAA"); 
                personas.get(personas.size()-1).setFechaNacimiento(FechaNacimiento);
            }
            if(p.equals(m[6])){
                double Dinero=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero", "0.00"));
                ((Clientes) personas.get(personas.size()-1)).setDinero(Dinero);
            }
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
