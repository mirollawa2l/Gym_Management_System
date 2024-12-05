/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import Backend.ClassDatabase;
import Backend.MemberClassRegistrationDatabase;
import Backend.MemberDatabase;
import Backend.TrainerRole;


public class TrainerRoleWindow extends javax.swing.JFrame {
    
    public TrainerRole trainer;
    public MemberDatabase memberDatabase;
    public ClassDatabase classDatabase;
    public MemberClassRegistrationDatabase memberClassRegistrationDatabase;

    /**
     * Creates new form TrainerRoleWindow1
     */
    public TrainerRoleWindow() {
        initComponents();
           setContentPane(jPanel1);
        setVisible(true);
        setTitle("Trainer Role");
               this.setLocation(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
         trainer = new TrainerRole();
//        memberDatabase = new MemberDatabase();
//        classDatabase = new ClassDatabase();
//        memberClassRegistrationDatabase = new MemberClassRegistrationDatabase();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        viewClass = new javax.swing.JButton();
        AddClass = new javax.swing.JButton();
        registration = new javax.swing.JButton();
        cancelRegistration = new javax.swing.JButton();
        viewRegistration = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        AddMember = new javax.swing.JButton();
        ViewMember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewClass.setText("View Class");
        viewClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClassActionPerformed(evt);
            }
        });

        AddClass.setText("Add Class");
        AddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassActionPerformed(evt);
            }
        });

        registration.setText("Register Class For Registration");
        registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationActionPerformed(evt);
            }
        });

        cancelRegistration.setText("Cancel Registration ");
        cancelRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRegistrationActionPerformed(evt);
            }
        });

        viewRegistration.setText("View Registration ");
        viewRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRegistrationActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        AddMember.setText("Add Member");
        AddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberActionPerformed(evt);
            }
        });

        ViewMember.setText("View Member");
        ViewMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registration)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cancelRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AddMember)
                                .addComponent(ViewMember, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(viewClass, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(AddMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewMember)
                .addGap(18, 18, 18)
                .addComponent(AddClass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewClass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClassActionPerformed
         
         ViewClassWindow viewClassWindow = new ViewClassWindow();
         viewClassWindow.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_viewClassActionPerformed

    private void AddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassActionPerformed
         AddClassWindow c = new AddClassWindow();
         c.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_AddClassActionPerformed

    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationActionPerformed
           RegisterMemberForClassWindow addRegistrationWindow = new RegisterMemberForClassWindow();
              addRegistrationWindow.setVisible(true);
              this.setVisible(false);
    }//GEN-LAST:event_registrationActionPerformed

    private void cancelRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRegistrationActionPerformed
                CancelRegistrationWindow cancelRegistrationWindow = new CancelRegistrationWindow();
                cancelRegistrationWindow.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_cancelRegistrationActionPerformed

    private void viewRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRegistrationActionPerformed
               ViewRegistrationsWindow viewRegistrationWindow = new ViewRegistrationsWindow();
                viewRegistrationWindow.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_viewRegistrationActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        trainer.logout();
        this.setVisible(false);

    }//GEN-LAST:event_logoutActionPerformed

    private void AddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberActionPerformed
        // TODO add your handling code here:
        AddMemberWindow a = new AddMemberWindow();
       a.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_AddMemberActionPerformed

    private void ViewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMemberActionPerformed
        // TODO add your handling code here:
         ViewMemberWindow a = new ViewMemberWindow();
       a.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_ViewMemberActionPerformed

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
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainerRoleWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClass;
    private javax.swing.JButton AddMember;
    private javax.swing.JButton ViewMember;
    private javax.swing.JButton cancelRegistration;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton registration;
    private javax.swing.JButton viewClass;
    private javax.swing.JButton viewRegistration;
    // End of variables declaration//GEN-END:variables
}
