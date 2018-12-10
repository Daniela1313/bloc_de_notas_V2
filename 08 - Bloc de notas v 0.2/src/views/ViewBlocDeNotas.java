package views;

import models.ModelFondo_Block_de_Notas;

/**
 *
 * @author Daniela Garcia Rios
 */
public class ViewBlocDeNotas extends javax.swing.JFrame {

    /**
     * Creates new form ViewBlocDeNotas
     */
    public ViewBlocDeNotas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jpFondo_block_de_notas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_file_archivo = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmfmenu_de_archivo = new javax.swing.JMenu();
        jMenuItemOpen = new javax.swing.JMenuItem();
        jMenuItemReadSave = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanelFondoPropertyChange(evt);
            }
        });

        jpFondo_block_de_notas.setOpaque(false);

        jt_file_archivo.setColumns(20);
        jt_file_archivo.setRows(5);
        jScrollPane1.setViewportView(jt_file_archivo);

        javax.swing.GroupLayout jpFondo_block_de_notasLayout = new javax.swing.GroupLayout(jpFondo_block_de_notas);
        jpFondo_block_de_notas.setLayout(jpFondo_block_de_notasLayout);
        jpFondo_block_de_notasLayout.setHorizontalGroup(
            jpFondo_block_de_notasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo_block_de_notasLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jpFondo_block_de_notasLayout.setVerticalGroup(
            jpFondo_block_de_notasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo_block_de_notasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo_block_de_notas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpFondo_block_de_notas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jmfmenu_de_archivo.setText("ARCHIVOS");

        jMenuItemOpen.setText("ABRIR ARCHIVO");
        jMenuItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenActionPerformed(evt);
            }
        });
        jmfmenu_de_archivo.add(jMenuItemOpen);

        jMenuItemReadSave.setText("GUARDAR ARCHIVO");
        jMenuItemReadSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReadSaveActionPerformed(evt);
            }
        });
        jmfmenu_de_archivo.add(jMenuItemReadSave);

        jMenuBar1.add(jmfmenu_de_archivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelFondoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanelFondoPropertyChange
        models.ModelFondo_Block_de_Notas imagenMenu = new ModelFondo_Block_de_Notas();
        jPanelFondo.add(imagenMenu);
        jPanelFondo.repaint();

    }//GEN-LAST:event_jPanelFondoPropertyChange

    private void jMenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemOpenActionPerformed

    private void jMenuItemReadSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReadSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemReadSaveActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBlocDeNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBlocDeNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBlocDeNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBlocDeNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBlocDeNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItemOpen;
    public javax.swing.JMenuItem jMenuItemReadSave;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JMenu jmfmenu_de_archivo;
    private javax.swing.JPanel jpFondo_block_de_notas;
    public javax.swing.JTextArea jt_file_archivo;
    // End of variables declaration//GEN-END:variables
}
