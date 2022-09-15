/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

/**
 *
 * @author welli
 */
public class TasksDialogScreen extends javax.swing.JDialog {

    TaskController controller;
    Project project;

    public TasksDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panToolBar = new javax.swing.JPanel();
        lblToolBarTitle = new javax.swing.JLabel();
        lblToolBarSave = new javax.swing.JLabel();
        panTask = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lblDeadline = new javax.swing.JLabel();
        lblNotes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        txtDeadline = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panToolBar.setBackground(new java.awt.Color(0, 153, 102));

        lblToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblToolBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblToolBarTitle.setText("Tarefa");

        lblToolBarSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToolBarSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        lblToolBarSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblToolBarSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panToolBarLayout = new javax.swing.GroupLayout(panToolBar);
        panToolBar.setLayout(panToolBarLayout);
        panToolBarLayout.setHorizontalGroup(
            panToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panToolBarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblToolBarSave, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        panToolBarLayout.setVerticalGroup(
            panToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panToolBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblToolBarTitle)
                    .addComponent(lblToolBarSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panTask.setBackground(new java.awt.Color(255, 255, 255));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblName.setText("Nome");

        lblDescription.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblDescription.setText("Descri��o");

        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        lblDeadline.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblDeadline.setText("Prazo");

        lblNotes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNotes.setText("Notas");

        txtNotes.setColumns(20);
        txtNotes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNotes.setRows(5);
        jScrollPane2.setViewportView(txtNotes);

        txtDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout panTaskLayout = new javax.swing.GroupLayout(panTask);
        panTask.setLayout(panTaskLayout);
        panTaskLayout.setHorizontalGroup(
            panTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtName)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
            .addComponent(lblNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addComponent(txtDeadline)
        );
        panTaskLayout.setVerticalGroup(
            panTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTaskLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescription)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panToolBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void lblToolBarSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblToolBarSaveMouseClicked
        try {
            if (!txtName.getText().isEmpty() && !txtDeadline.getText().isEmpty()) {
                Task task = new Task();
                task.setIdProject(project.getId());
                task.setName(txtName.getText());
                task.setDescription(txtDescription.getText());
                task.setNotes(txtNotes.getText());
                task.setIsCompleted(false);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date deadline = null;
                deadline = dateFormat.parse(txtDeadline.getText());
                task.setDeadline(deadline);
                controller.save(task);
                JOptionPane.showMessageDialog(rootPane, "Tarefa Salva com sucesso");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "A tarefa n�o foi salva,"
                        + "pois existem campos obrigat�rios a serem preenchidos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

    }//GEN-LAST:event_lblToolBarSaveMouseClicked

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
            java.util.logging.Logger.getLogger(TasksDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TasksDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TasksDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TasksDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TasksDialogScreen dialog = new TasksDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDeadline;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNotes;
    private javax.swing.JLabel lblToolBarSave;
    private javax.swing.JLabel lblToolBarTitle;
    private javax.swing.JPanel panTask;
    private javax.swing.JPanel panToolBar;
    private javax.swing.JFormattedTextField txtDeadline;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtNotes;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }

}
