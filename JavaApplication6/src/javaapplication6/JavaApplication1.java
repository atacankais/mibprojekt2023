/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
import java.util.logging.Level;
import java.util.logging.Logger; 
import oru.inf.InfDB;
import oru.inf.InfException; 

/**
 *
 * @author atacankais
 */
public class JavaApplication1 {

private static InfDB idb;
public static void main (String[]args) throws InfException {
try{
idb = new InfDB ("mibdb", "3306","mibdba", "mibkey"); 
}
catch (InfException ex){
        

Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE,null,ex);
        }

}

}