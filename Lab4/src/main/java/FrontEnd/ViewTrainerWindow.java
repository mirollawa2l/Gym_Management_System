
package FrontEnd;

import Backend.AdminRole;
import Backend.Trainer;
import Backend.TrainerDatabase;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewTrainerWindow extends javax.swing.JPanel {
    private AdminRole admin;
    private TrainerDatabase database;
    private final String [] columnsNames=null;

    public ViewTrainerWindow(AdminRole admin,TrainerDatabase database) {
        initComponents();
        this.admin=admin;
        this.database=database;
        String [] columnsNames={"ID", "Name", "Email","Speciality","PhoneNumber"};
        ArrayList<Trainer> trainers =admin.getListOftrainers();
        Object[][]data =new Object[trainers.size()][columnsNames.length]; 
        for (int i=0;i<trainers.size();i++){
             Trainer trainer=trainers.get(i);
             data[i]=trainer.lineRepresesntation().split(",");}
//        DefaultTableModel model =new DefaultTableModel(data,columnsNames);
//        JTable table =new JTable(model);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
