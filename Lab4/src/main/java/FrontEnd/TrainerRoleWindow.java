package FrontEnd;

import Backend.ClassDatabase;
import Backend.MemberClassRegistrationDatabase;
import Backend.MemberDatabase;
import Backend.TrainerRole;

public class TrainerRoleWindow extends javax.swing.JFrame {

    private TrainerRole trainer;
    private MemberDatabase memberDatabase;
    private ClassDatabase classDatabase;
    private MemberClassRegistrationDatabase memberClassRegistrationDatabase;

    public TrainerRoleWindow() {
        initComponents();
        trainer = new TrainerRole();
        memberDatabase = new MemberDatabase();
        classDatabase = new ClassDatabase();
        memberClassRegistrationDatabase = new MemberClassRegistrationDatabase();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMember = new javax.swing.JButton();
        viewMember = new javax.swing.JButton();
        addClass = new javax.swing.JButton();
        viewClass = new javax.swing.JButton();
        registration = new javax.swing.JButton();
        cancelRegistration = new javax.swing.JButton();
        viewRegistration = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addMember.setText("View Member");
        addMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberActionPerformed(evt);
            }
        });

        viewMember.setText("View Class");
        viewMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMemberActionPerformed(evt);
            }
        });

        addClass.setText("Add Member");
        addClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassActionPerformed(evt);
            }
        });

        viewClass.setText("Add Class");
        viewClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClassActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(viewRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMember, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(addClass, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(viewMember, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(viewClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(registration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addClass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMember, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewClass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassActionPerformed
        AddClassWindow addClassWindow = new AddClassWindow(trainer, classDatabase);
        addClassWindow.setVisible(true);
    }//GEN-LAST:event_addClassActionPerformed

    private void addMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberActionPerformed

        AddMemberWindow addMemberWindow = new AddMemberWindow(trainer, memberDatabase);
        addMemberWindow.setVisible(true);
    }//GEN-LAST:event_addMemberActionPerformed

    private void viewClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClassActionPerformed
        ViewClassWindow viewClassWindow = new ViewClassWindow(trainer, classDatabase);
        viewClassWindow.setVisible(true);
    }//GEN-LAST:event_viewClassActionPerformed

    private void viewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMemberActionPerformed
        ViewMemberWindow viewMemberWindow = new ViewMemberWindow(trainer, memberDatabase);
        viewMemberWindow.setVisible(true);
    }//GEN-LAST:event_viewMemberActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        trainer.logout();
    }//GEN-LAST:event_logoutActionPerformed

    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationActionPerformed
        AddRegistrationWindow addRegistrationWindow = new AddRegistrationWindow(trainer, memberClassRegistrationDatabase);
        addRegistrationWindow.setVisible(true);
    }//GEN-LAST:event_registrationActionPerformed

    private void cancelRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRegistrationActionPerformed
        CancelRegistrationWindow cancelRegistrationWindow = new CancelRegistrationWindow(trainer, memberClassRegistrationDatabase);
        cancelRegistrationWindow.setVisible(true);
    }//GEN-LAST:event_cancelRegistrationActionPerformed

    private void viewRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRegistrationActionPerformed
        ViewRegistrationWindow viewRegistrationWindow = new ViewRegistrationWindow(trainer, memberClassRegistrationDatabase);
        viewRegistrationWindow.setVisible(true);
    }//GEN-LAST:event_viewRegistrationActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainerRoleWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClass;
    private javax.swing.JButton addMember;
    private javax.swing.JButton cancelRegistration;
    private javax.swing.JButton logout;
    private javax.swing.JButton registration;
    private javax.swing.JButton viewClass;
    private javax.swing.JButton viewMember;
    private javax.swing.JButton viewRegistration;
    // End of variables declaration//GEN-END:variables
}
