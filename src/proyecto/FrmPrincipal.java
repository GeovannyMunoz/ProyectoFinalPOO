package proyecto;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class FrmPrincipal extends javax.swing.JFrame {
    
    ArrayList<Object> jugadores = new ArrayList<>();
    ClsControlador controller = new ClsControlador();

    public FrmPrincipal() {
        initComponents();
        jugadores = controller.extraerObjetos("jugadores.dat");
               
        llenarCombo1();
        cmbJugador2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarJ = new javax.swing.JButton();
        cmbJugador1 = new javax.swing.JComboBox<>();
        cmbJugador2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrarJ.setText("Registrar Jugador");
        btnRegistrarJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarJActionPerformed(evt);
            }
        });

        cmbJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJugador1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btnRegistrarJ)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(cmbJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(cmbJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(btnRegistrarJ)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarJActionPerformed
        FrmRegistroJugador registro = new FrmRegistroJugador();
        registro.setTitle("Registrar Jugador");
        registro.setLocationRelativeTo(null);
        registro.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_btnRegistrarJActionPerformed

    private void cmbJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJugador1ActionPerformed
        ClsJugador jugadorSeleccionado = (ClsJugador)cmbJugador1.getSelectedItem();
        if(jugadores.size() > 0){
            cmbJugador2.setEnabled(true);
            jugadores.remove(jugadorSeleccionado);
            cmbJugador2.setModel(new javax.swing.DefaultComboBoxModel(jugadores.toArray()));
        }else{
            cmbJugador2.setEnabled(false);
        }
        cmbJugador1.setEnabled(false);
        cmbJugador2.setEnabled(true);
    }//GEN-LAST:event_cmbJugador1ActionPerformed

    public void llenarCombo1(){
        if(jugadores.size() > 0){
            cmbJugador1.setEnabled(true);
            jugadores = controller.extraerObjetos("jugadores.dat");
            cmbJugador1.setModel(new javax.swing.DefaultComboBoxModel(jugadores.toArray()));
        }else{
            cmbJugador1.setEnabled(false);
        }
    }
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPrincipal principal = new FrmPrincipal();
                principal.setTitle("Principal");
                principal.setLocationRelativeTo(null);
                principal.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarJ;
    private javax.swing.JComboBox<String> cmbJugador1;
    private javax.swing.JComboBox<String> cmbJugador2;
    // End of variables declaration//GEN-END:variables
}
