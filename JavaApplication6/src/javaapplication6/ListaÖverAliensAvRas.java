/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication6;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication6.ListaĆ¶veraliensombefinnersigiangivenplats.idb;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author kristinamalki
 */
public class ListaĆverAliensAvRas extends javax.swing.JFrame {
public static InfDB idb; 
ArrayList avRas;
   
    public ListaĆverAliensAvRas(){
        initComponents();
        
        
          avRas = new ArrayList<String> (); //namnget listan
         try {
           idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        rastyp = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Ange ras fĆ¶r lista:");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rastyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Worm", "Squid" }));
        rastyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rastypActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rastyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(rastyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addGap(85, 85, 85)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String rass= rastyp.getSelectedItem().toString();
        // String q= "SELECT namn FROM alien WHERE Alien_ID IN(SELECT Alien_ID FROM " + rass + ")";
        //   avRas =idb.fetchColumn("SELECT Alien_ID from Squid join Worm on Squid.Alien_ID=Worm.Alien_ID join Boglodite on Boglodite.Alien_ID=Worm.Alien_ID  WHERE Alien_ID IN(SELECT Alien_ID FROM " + rass + ")+")";
        // avRas=idb.fetchColumn(q);
        //  avRas =idb.fetchColumn("SELECT Alien_ID from Squid join Worm on Squid.Alien_ID=Worm.Alien_ID join Boglodite on Boglodite.Alien_ID=Worm.Alien_ID where = '" +ras+ "'");
     //   JOptionPane.showMessageDialog(null,"Aliens av denna ras: " + "");
        
   

     

     
           try {
             
     
       if(rass.equals("Boglodite")){
      
                avRas= idb.fetchRows("Select Alien_ID from Boglodite");
                  JOptionPane.showMessageDialog(null,"Aliens av denna ras: " +avRas+"");
               
            } 
                
  if(rass.equals("Squid")){
        
                avRas= idb.fetchRows("Select  Alien_ID from Squid");
               
                JOptionPane.showMessageDialog(null,"Aliens av denna ras: " +avRas+"");
            } 
  
  if(rass.equals("Worm")){
        
                avRas= idb.fetchRows("Select Alien_ID from Worm");
                  JOptionPane.showMessageDialog(null,"Aliens av denna ras: " +avRas+"");
                  
                  System.out.println(avRas);
            } 
  
  
  
  
  
           }
           
           
           
  catch (InfException ex) {
                Logger.getLogger(ListaĆverAliensAvRas.class.getName()).log(Level.SEVERE, null, ex);
            }

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rastypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rastypActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rastypActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaĆverAliensAvRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaĆverAliensAvRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaĆverAliensAvRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaĆverAliensAvRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaĆverAliensAvRas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> rastyp;
    // End of variables declaration//GEN-END:variables
}
