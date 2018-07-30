package proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FrmRegistroJugador extends javax.swing.JFrame {
    
    ArrayList<Object> jugadores = new ArrayList<>();
    int cont = 0;
    ClsControlador controller = new ClsControlador();

    public FrmRegistroJugador() {
        initComponents();
        jugadores = controller.extraerObjetos("jugadores.dat");
               
        llenarCombo();
        llenarGrid();
        if(jugadores.size() > 0){
            ClsJugador ultimo = (ClsJugador) jugadores.get(jugadores.size()-1);
            cont = ultimo.getId();
        }
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        cmbJugadores = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNick = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbJugadores = new javax.swing.JTable();
        btnSeleccionPersonajes = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cmbJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJugadoresActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Cédula:");

        jLabel4.setText("Nick:");

        tbJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cédula", "Nick"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbJugadores);

        btnSeleccionPersonajes.setText("Ir a Seleccionar Personajes");
        btnSeleccionPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionPersonajesActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellido))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula)
                                    .addComponent(txtNick))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSeleccionPersonajes)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cmbJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSeleccionPersonajes)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ClsJugador jug = new ClsJugador();
        boolean validarCi = false;
        boolean validarNick = false;
            
        if((txtNombre.getText().equals("")) || (txtApellido.getText().equals("")) || (txtCedula.getText().equals("")) || (txtNick.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else{
            for(int i = 0; i < jugadores.size(); i ++){
            jug = (ClsJugador) jugadores.get(i);
            //System.out.println(jug.getCedula());
            if(jug.getCedula() == Integer.parseInt(txtCedula.getText())){
                validarCi = true;
                break;
            }
            if(jug.getUsuario().equals(txtNick.getText())){
                validarNick = true;
                break;
            }
            
        }
            if(validarCi == true){
                JOptionPane.showMessageDialog(null, "CI "+txtCedula.getText()+ " ya existe", "ERROR", JOptionPane.WARNING_MESSAGE);
            }else if(validarNick == true){
                JOptionPane.showMessageDialog(null, "Nick "+txtNick.getText()+ " ya existe", "ERROR", JOptionPane.WARNING_MESSAGE);
            }else{
                System.out.println("registra");
                cont++;
                ClsJugador jugador = new ClsJugador(cont, txtNombre.getText(), txtApellido.getText(),Integer.parseInt(txtCedula.getText()), txtNick.getText());
                jugadores.add(jugador);
                controller.escribirObjeto("jugadores.dat", jugadores);
                jugadores = controller.extraerObjetos("jugadores.dat");
                limpiar();
                llenarCombo();
                Object jugadorG [] = {jugador.getNombre(), jugador.getApellido(),jugador.getCedula(),jugador.getUsuario()};
                DefaultTableModel model = (DefaultTableModel) tbJugadores.getModel();
                model.addRow(jugadorG);
            }
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSeleccionPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionPersonajesActionPerformed
        FrmPrincipal principal = new FrmPrincipal();
        principal.setTitle("Principal");
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnSeleccionPersonajesActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ClsJugador jugadorSeleccionado = (ClsJugador)cmbJugadores.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) tbJugadores.getModel();
        model.removeRow(cmbJugadores.getSelectedIndex());
        jugadores.remove(jugadorSeleccionado);
        controller.escribirObjeto("jugadores.dat", jugadores);
        llenarCombo();
        limpiar();
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJugadoresActionPerformed
        ClsJugador jugadorSeleccionado = (ClsJugador)cmbJugadores.getSelectedItem();
        txtNombre.setText(jugadorSeleccionado.getNombre());
        txtApellido.setText(jugadorSeleccionado.getApellido());
        txtCedula.setText(String.valueOf(jugadorSeleccionado.getCedula()));
        txtNick.setText(jugadorSeleccionado.getUsuario());
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }//GEN-LAST:event_cmbJugadoresActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        ClsJugador jugadorSeleccionado = (ClsJugador)cmbJugadores.getSelectedItem();
        ClsJugador jug = new ClsJugador();
        boolean validarCi = false;
        boolean validarNick = false;
                
        if((txtNombre.getText().equals("")) || (txtApellido.getText().equals("")) || (txtCedula.getText().equals("")) || (txtNick.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else{
            for(int i = 0; i < jugadores.size(); i ++){
            jug = (ClsJugador) jugadores.get(i);
            //System.out.println(jug.getId());
            if(jug.getId() != jugadorSeleccionado.getId() ){
                if(jug.getCedula() == Integer.parseInt(txtCedula.getText())){
                    validarCi = true;
                    break;
                }
                if(jug.getUsuario().equals(txtNick.getText())){
                    validarNick = true;
                    break;
                }
            } 
        }
            if(validarCi == true){
                JOptionPane.showMessageDialog(null, "CI "+txtCedula.getText()+ " ya existe", "ERROR", JOptionPane.WARNING_MESSAGE);
            }else if(validarNick == true){
                JOptionPane.showMessageDialog(null, "Nick "+txtNick.getText()+ " ya existe", "ERROR", JOptionPane.WARNING_MESSAGE);
            }else{
                jugadorSeleccionado.setNombre(txtNombre.getText());
                jugadorSeleccionado.setApellido(txtApellido.getText());
                jugadorSeleccionado.setCedula(Integer.parseInt(txtCedula.getText()));
                jugadorSeleccionado.setUsuario(txtNick.getText());
                //System.out.println(jugadorSeleccionado.getId());

                Object jugadorG [] = {jugadorSeleccionado.getNombre(), jugadorSeleccionado.getApellido(),jugadorSeleccionado.getCedula(),jugadorSeleccionado.getUsuario()};
                DefaultTableModel model = (DefaultTableModel) tbJugadores.getModel();
                model.removeRow(cmbJugadores.getSelectedIndex());
                jugadores.remove(cmbJugadores.getSelectedIndex());
                model.insertRow(cmbJugadores.getSelectedIndex(), jugadorG);
                jugadores.add(cmbJugadores.getSelectedIndex(), jugadorSeleccionado);
                controller.escribirObjeto("jugadores.dat", jugadores);
                llenarCombo();
                limpiar();
                btnEditar.setEnabled(false);
                btnEliminar.setEnabled(false);
            }
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    public void limpiar(){
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtCedula.setText(null);
        txtNick.setText(null);
        btnGuardar.setEnabled(true);
    }
    
    public void llenarCombo(){
        if(jugadores.size() > 0){
            cmbJugadores.setEnabled(true);
            jugadores = controller.extraerObjetos("jugadores.dat");
            cmbJugadores.setModel(new javax.swing.DefaultComboBoxModel(jugadores.toArray()));
        }else{
            cmbJugadores.setEnabled(false);
        }
    }
    
    public void llenarGrid(){
        if(jugadores.size() > 0){
            ClsJugador jugador = new ClsJugador();
            DefaultTableModel model = (DefaultTableModel) tbJugadores.getModel();
            for(int i = 0; i < jugadores.size(); i ++){
                jugador = (ClsJugador) jugadores.get(i);
                Object jugadorG [] = {jugador.getNombre(), jugador.getApellido(), jugador.getCedula(),jugador.getUsuario()};
                model.insertRow(i, jugadorG);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSeleccionPersonajes;
    private javax.swing.JComboBox<String> cmbJugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbJugadores;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNick;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
