/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication6;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author atacankais
 */
public class HuvudMenyAdmin extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form HuvudMenyAdmin
     */
    public HuvudMenyAdmin() {  
        initComponents();
        
           try {
           idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            
        } 
    }
    
    public void taBortUtrustning() { //KLAR
        TaBortUtrustning k = new TaBortUtrustning();
        k.setVisible(true);
    }
    public void ändraAgentInfo() //KLAR
    {
        ÄndraAgentInformation k = new ÄndraAgentInformation();
        k.setVisible(true);
    }
    
    public void oppnaalienreg(){
        Reggaalien r= new Reggaalien ();
        r.setVisible(true);
        }
    public void oppnatabortalien(){
        RaderaAlien da= new RaderaAlien();
        da.setVisible(true);
    }
    public void oppenändralösnordmenyföradmin(){
        Ändralösenordföragenochalien l= new Ändralösenordföragenochalien();
        l.setVisible(true);
    }
    
    public void loggoutmeny(){
        main m= new main();
        m.setVisible(true);
        dispose();
    }

    public void adminÄndraAllAlienInfo(){ //KLAR
        AdminÄndraAllAlienInfo n = new AdminÄndraAllAlienInfo();
        n.setVisible(true);
        dispose();
    }
    public void adminÄndraOmrådesChef() { //KLAR
        ÄndraOmrådesChef a = new ÄndraOmrådesChef();
        a.setVisible(true);
    }

    public void adminÄndraKontorsChef() { //KLAR
        ÄndraKontorsChef k = new ÄndraKontorsChef();
        k.setVisible(true);
    }

    public void tilldelaAdminStatus() {
        TilldelaAdminStatus s = new TilldelaAdminStatus();
        s.setVisible(true);
    }
    public void tabortagent(){
        RaderaAgent system= new RaderaAgent();
        system.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        RegAlien = new javax.swing.JButton();
        ÄndraAlienInfo = new javax.swing.JButton();
        RaderaAlien = new javax.swing.JButton();
        RaderaUtru = new javax.swing.JButton();
        RegAgent = new javax.swing.JButton();
        SökAgentInfo = new javax.swing.JButton();
        GeAdminTillAgent = new javax.swing.JButton();
        ÄndraAgentInfo = new javax.swing.JButton();
        RaderaAgent = new javax.swing.JButton();
        ÄndraOmrChef = new javax.swing.JButton();
        ÄndraKonChef = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ÄndraLösen = new javax.swing.JButton();
        LoggaUt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Huvudmeny Admin");

        RegAlien.setText("Registrera ny alien");
        RegAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegAlienActionPerformed(evt);
            }
        });

        ÄndraAlienInfo.setText("Ändra alieninformation");
        ÄndraAlienInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraAlienInfoActionPerformed(evt);
            }
        });

        RaderaAlien.setText("Ta bort alien");
        RaderaAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaderaAlienActionPerformed(evt);
            }
        });

        RaderaUtru.setText("Ta bort utrustning");
        RaderaUtru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaderaUtruActionPerformed(evt);
            }
        });

        RegAgent.setText("Registrera ny agent");
        RegAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegAgentActionPerformed(evt);
            }
        });

        SökAgentInfo.setText("Sök agentinformation");
        SökAgentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SökAgentInfoActionPerformed(evt);
            }
        });

        GeAdminTillAgent.setText("Tilldela administratörsstatus till agent");
        GeAdminTillAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeAdminTillAgentActionPerformed(evt);
            }
        });

        ÄndraAgentInfo.setText("Ändra agentinformation");
        ÄndraAgentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraAgentInfoActionPerformed(evt);
            }
        });

        RaderaAgent.setText("Ta bort agent");
        RaderaAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaderaAgentActionPerformed(evt);
            }
        });

        ÄndraOmrChef.setText("Ändra områdeschef");
        ÄndraOmrChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraOmrChefActionPerformed(evt);
            }
        });

        ÄndraKonChef.setText("Ändra kontorschef");
        ÄndraKonChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraKonChefActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication6/admin.png"))); // NOI18N

        ÄndraLösen.setText("Ändra Lösenord");
        ÄndraLösen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraLösenActionPerformed(evt);
            }
        });

        LoggaUt.setText("Logout");
        LoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoggaUtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(RaderaAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ÄndraAlienInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RaderaAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ÄndraAgentInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ÄndraOmrChef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ÄndraKonChef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RaderaUtru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(GeAdminTillAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SökAgentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RegAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ÄndraLösen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LoggaUt)
                                .addGap(86, 86, 86)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegAlien)
                    .addComponent(RegAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RaderaAlien)
                    .addComponent(RaderaAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ÄndraAlienInfo)
                    .addComponent(SökAgentInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ÄndraAgentInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ÄndraOmrChef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ÄndraKonChef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GeAdminTillAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RaderaUtru)
                        .addGap(18, 18, 18)
                        .addComponent(ÄndraLösen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LoggaUt)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegAlienActionPerformed
        oppnaalienreg();
    }//GEN-LAST:event_RegAlienActionPerformed

    private void RegAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegAgentActionPerformed
        oppnaalienreg();
    }//GEN-LAST:event_RegAgentActionPerformed

    private void RaderaAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaderaAlienActionPerformed
        oppnatabortalien(); // KLAR
    }//GEN-LAST:event_RaderaAlienActionPerformed

    private void ÄndraLösenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraLösenActionPerformed
        oppenändralösnordmenyföradmin(); // kallar metoden för att öppan ändralösenord rutan för admin    
    }//GEN-LAST:event_ÄndraLösenActionPerformed

    private void LoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoggaUtActionPerformed
        loggoutmeny(); // KLAR
    }//GEN-LAST:event_LoggaUtActionPerformed

    private void ÄndraAlienInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraAlienInfoActionPerformed
        adminÄndraAllAlienInfo(); //KLAR
    }//GEN-LAST:event_ÄndraAlienInfoActionPerformed

    private void RaderaAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaderaAgentActionPerformed
        tabortagent();  // KLAR
    }//GEN-LAST:event_RaderaAgentActionPerformed

    private void SökAgentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SökAgentInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SökAgentInfoActionPerformed

    private void ÄndraAgentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraAgentInfoActionPerformed
        ändraAgentInfo(); //KLAR
    }//GEN-LAST:event_ÄndraAgentInfoActionPerformed

    private void ÄndraOmrChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraOmrChefActionPerformed
        adminÄndraOmrådesChef(); //KLAR
    }//GEN-LAST:event_ÄndraOmrChefActionPerformed

    private void ÄndraKonChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraKonChefActionPerformed
        adminÄndraKontorsChef(); //KLAR
    }//GEN-LAST:event_ÄndraKonChefActionPerformed

    private void GeAdminTillAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeAdminTillAgentActionPerformed
        tilldelaAdminStatus(); //KLAR
    }//GEN-LAST:event_GeAdminTillAgentActionPerformed

    private void RaderaUtruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaderaUtruActionPerformed
        taBortUtrustning(); //KLAR
    }//GEN-LAST:event_RaderaUtruActionPerformed

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
            java.util.logging.Logger.getLogger(HuvudMenyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuvudMenyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuvudMenyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuvudMenyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HuvudMenyAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GeAdminTillAgent;
    private javax.swing.JButton LoggaUt;
    private javax.swing.JButton RaderaAgent;
    private javax.swing.JButton RaderaAlien;
    private javax.swing.JButton RaderaUtru;
    private javax.swing.JButton RegAgent;
    private javax.swing.JButton RegAlien;
    private javax.swing.JButton SökAgentInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton ÄndraAgentInfo;
    private javax.swing.JButton ÄndraAlienInfo;
    private javax.swing.JButton ÄndraKonChef;
    private javax.swing.JButton ÄndraLösen;
    private javax.swing.JButton ÄndraOmrChef;
    // End of variables declaration//GEN-END:variables
}
