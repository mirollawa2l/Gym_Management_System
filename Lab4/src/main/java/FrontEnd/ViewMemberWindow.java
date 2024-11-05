
package FrontEnd;


import Backend.TrainerRole;
import Backend.Member;
import Backend.MemberDatabase;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewMemberWindow extends javax.swing.JPanel {
    private TrainerRole trainer;
    private MemberDatabase database;
    private final String [] columnsNames = null;
    

    
    public ViewMemberWindow(TrainerRole trainer,MemberDatabase database) {
        initComponents();
        this.trainer=trainer;
        this.database=database;
        String [] columnsNames={"ID", "Name", "Email","Membership Type","PhoneNumber"};
        ArrayList<Member> members =trainer.getListOfMembers();
        Object[][]data =new Object[members.size()][columnsNames.length]; 
        for (int i=0;i<members.size();i++){
             Member member=members.get(i);
             data[i]=member.lineRepresesntation().split(",");

}
           setData(data);
          this.setVisible(false);
    
        
    }
public void setData(Object [][] data)
    {
        jTable1.setModel(new DefaultTableModel(data,columnsNames)
                {
                  @Override
                  public boolean isCellEditable(int row,int column)
                {
                    return false;
                }
                });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
