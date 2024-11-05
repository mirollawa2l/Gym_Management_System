
package FrontEnd;

import Backend.AdminRole ;
import Backend.TrainerDatabase;

public class AdminRoleWindow extends javax.swing.JFrame{
 private   AdminRole admin;
 private TrainerDatabase database;

   
    public AdminRoleWindow() {
        initComponents();
         admin=new AdminRole();
         database= new TrainerDatabase();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addTrainer = new javax.swing.JButton();
        removeTrainer = new javax.swing.JButton();
        viewTrainer = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addTrainer.setText("Add Trainer");
        addTrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrainerActionPerformed(evt);
            }
        });

        removeTrainer.setText("Remove Trainer");
        removeTrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTrainerActionPerformed(evt);
            }
        });

        viewTrainer.setText("View Trainer");
        viewTrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTrainerActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeTrainer, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewTrainer, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                        .addComponent(addTrainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(addTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrainerActionPerformed
         AddTrainerWindow addWindow = new AddTrainerWindow(admin,database);
         addWindow.setVisible(true);
        
    }//GEN-LAST:event_addTrainerActionPerformed

    private void removeTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTrainerActionPerformed
     RemoveTrainerWindow removeWindow = new RemoveTrainerWindow(admin,database);
     removeWindow.setVisible(true);
       
    }//GEN-LAST:event_removeTrainerActionPerformed

    private void viewTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTrainerActionPerformed
            ViewTrainerWindow viewWindow = new ViewTrainerWindow(admin,database);
            viewWindow.setVisible(true);
        
    }//GEN-LAST:event_viewTrainerActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
            admin.logout();
       
    }//GEN-LAST:event_logoutActionPerformed


    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTrainer;
    private javax.swing.JButton logout;
    private javax.swing.JButton removeTrainer;
    private javax.swing.JButton viewTrainer;
    // End of variables declaration//GEN-END:variables

}
