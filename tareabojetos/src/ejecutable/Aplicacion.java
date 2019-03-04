/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutable;

import javax.swing.JOptionPane;
import tareabojetos.Trabajadores;

/**
 *
 * @author Tomas
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        int opc;
        /*
                 these are the builders*/
        Trabajadores trabajadorUno=new Trabajadores();
        Trabajadores trabajadorDos=new Trabajadores();
        Trabajadores trabajadorTres=new Trabajadores();
        Trabajadores trabajadorCuatro=new Trabajadores();
        Trabajadores trabajadorCinco=new Trabajadores();
        
        
        /*
        method call and menu for workers
        
        */
        opc=Integer.parseInt(JOptionPane.showInputDialog("digite el trabajador que quiere colocarle los datos dependiendo del numero (solo digite el numero)"+"\n"+"1.trabajador uno"+"\n"+"2.trabajador dos"+"\n"+"3.trabajador tres"+"\n"+"4.trabador cuatro"+"\n"+"5.trbajador cinco"));
        switch (opc){
            case 1: JOptionPane.showMessageDialog(null, ""+trabajadorUno.name(JOptionPane.showInputDialog("digite el nombre del trabajador"))+"\n"+trabajadorUno.year(Integer.parseInt(JOptionPane.showInputDialog("digite la edad del trabajador")))+ " años" +"\n"+"direccion "+trabajadorUno.address(JOptionPane.showInputDialog("digite la direccion del trabajador"))+"\n"+"Cel. "+trabajadorUno.phoneNumer(Double.parseDouble(JOptionPane.showInputDialog("digite el numero del trabajador"))));
            break;
            case 2: JOptionPane.showMessageDialog(null, ""+trabajadorDos.name(JOptionPane.showInputDialog("digite el nombre del trabajador"))+"\n"+trabajadorDos.year(Integer.parseInt(JOptionPane.showInputDialog("digite la edad del trabajador")))+ " años" +"\n"+"direccion "+trabajadorDos.address(JOptionPane.showInputDialog("digite la direccion del trabajador"))+"\n"+"Cel. "+trabajadorDos.phoneNumer(Double.parseDouble(JOptionPane.showInputDialog("digite el numero del trabajador"))));
            break;
            case 3: JOptionPane.showMessageDialog(null, ""+trabajadorTres.name(JOptionPane.showInputDialog("digite el nombre del trabajador"))+"\n"+trabajadorTres.year(Integer.parseInt(JOptionPane.showInputDialog("digite la edad del trabajador")))+ " años" +"\n"+"direccion "+trabajadorTres.address(JOptionPane.showInputDialog("digite la direccion del trabajador"))+"\n"+"Cel. "+trabajadorTres.phoneNumer(Double.parseDouble(JOptionPane.showInputDialog("digite el numero del trabajador"))));
            break;
            case 4: JOptionPane.showMessageDialog(null, ""+trabajadorCuatro.name(JOptionPane.showInputDialog("digite el nombre del trabajador"))+"\n"+trabajadorCuatro.year(Integer.parseInt(JOptionPane.showInputDialog("digite la edad del trabajador")))+ " años" +"\n"+"direccion "+trabajadorCuatro.address(JOptionPane.showInputDialog("digite la direccion del trabajador"))+"\n"+"Cel. "+trabajadorCuatro.phoneNumer(Double.parseDouble(JOptionPane.showInputDialog("digite el numero del trabajador"))));
            break;
            case 5: JOptionPane.showMessageDialog(null, ""+trabajadorCinco.name(JOptionPane.showInputDialog("digite el nombre del trabajador"))+"\n"+trabajadorCinco.year(Integer.parseInt(JOptionPane.showInputDialog("digite la edad del trabajador")))+ " años" +"\n"+"direccion "+trabajadorCinco.address(JOptionPane.showInputDialog("digite la direccion del trabajador"))+"\n"+"Cel. "+trabajadorCinco.phoneNumer(Double.parseDouble(JOptionPane.showInputDialog("digite el numero del trabajador"))));
            break;
            default: JOptionPane.showInputDialog("error");
            
            
            
        }  
     
    }
    
}
