package javaapplication6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import static javaapplication6.AlienDatumIntervall.idb;
import javax.swing.*;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author Pia Vargas, Amanda Demir
 * 
 * Valideringsklass
 * 
 */
public class Valideringen {
    
    private static InfDB idb;

    static boolean kollaLosen(JTextField Txtlosen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Valideringen (){
     
        
         try {
           idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            
        }
    }
    
    
   
    public static boolean kollatomRuta (JTextField checkaRuta)
    {
        boolean kolla = true;
        
        if (checkaRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "vänligen skriv använder namn och lösenord!");
            kolla = false;
        }
        
        return kolla;
    }
     
   
    public static boolean losennord(String losenord){
       boolean kolla = false;
       
       if(losenord.length() > 3 && losenord.length() < 100) {
           kolla = true;
       }
     // 
       else{
             JOptionPane.showMessageDialog(null, "vänligen skriv lösenord som är stora än 3 siffror och mindre än 100!");   
               }
        return kolla;
   }
    
   
    public static boolean datumm(JTextField kollapådatum) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
        
        boolean kolla = false;
        
        String datum = kollapådatum.getText();
        try {
            dateFormat.parse(datum);
            kolla = true;
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, " vänligen skriv så här  YYYY-MM-DD");
            kollapådatum.requestFocus();
            return false;
        }
   
        return kolla;
}
    
  
    
   // alla agenter ska börjas med A till ex Agent K, Agent Z och så vidare 
    public static boolean Förstabokstavenpåagentnamn(JTextField kollarutan){
        String j = kollarutan.getText();
        if (j.startsWith("A")) {
            return true;    
            }
        else{
            JOptionPane.showMessageDialog(null, "Vänligen skriv ett Agent som börjar med A bokstav, till exemple Agent K ");
             
                return false;
        }
    }
}
