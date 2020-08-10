/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.CtrOperaciones;
import controlador.Servicios;
import java.text.DecimalFormat;
import javax.swing.JFrame;

/**
 *
 * @author Darwin
 */
public class MulEsfuerzoFrame extends javax.swing.JFrame {

    /**
     * Creates new form MulEsfuerzoFrame
     */
    DecimalFormat formato1 = new DecimalFormat("#.00");
    Servicios sv = new Servicios();

    JFrame ventana = new JFrame("Multiplicador Esfuerzo");

    public MulEsfuerzoFrame() {
        initComponents();
        jPanel1.setBackground(PrincipalFrame.color1);
        this.getContentPane().setBackground(PrincipalFrame.color2);
        lbMulti.setText(String.valueOf(CtrOperaciones.est.getMulEsfuerzo()));
        ventana.setSize(800, 600);
        this.setResizable(false);
        //this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        txtMessage.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbMulti = new javax.swing.JLabel();
        cbxReusabilidad = new javax.swing.JComboBox<>();
        cbxConfiabilidad = new javax.swing.JComboBox<>();
        cbxDificultad = new javax.swing.JComboBox<>();
        cbxAptitud = new javax.swing.JComboBox<>();
        cbxExperienci = new javax.swing.JComboBox<>();
        cbxFacilidades = new javax.swing.JComboBox<>();
        cbxCronograma = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        txtMessage = new javax.swing.JTextField();

        jButton6.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Confiabilidad y Complejidad");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Experiendia del Personal");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Reusabilidad Requerida");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Dificultad de la Plataforma");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Aptitud del Personal");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Facilidades");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cronograma de desarrollo Requerido");

        btnOk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Total: ");

        lbMulti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMulti.setText("jLabel9");

        cbxReusabilidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxReusabilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "HI", "VHI", "XHI", "XLO", "VLO", "LO" }));
        cbxReusabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxReusabilidadActionPerformed(evt);
            }
        });

        cbxConfiabilidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxConfiabilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "HI", "VHI", "XHI", "XLO", "VLO", "LO" }));
        cbxConfiabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxConfiabilidadActionPerformed(evt);
            }
        });

        cbxDificultad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxDificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "HI", "VHI", "XHI", "XLO", "VLO", "LO" }));
        cbxDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDificultadActionPerformed(evt);
            }
        });

        cbxAptitud.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxAptitud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "HI", "VHI", "XHI", "XLO", "VLO", "LO" }));
        cbxAptitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAptitudActionPerformed(evt);
            }
        });

        cbxExperienci.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxExperienci.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "HI", "VHI", "XHI", "XLO", "VLO", "LO" }));
        cbxExperienci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxExperienciActionPerformed(evt);
            }
        });

        cbxFacilidades.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxFacilidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "HI", "VHI", "XHI", "XLO", "VLO", "LO" }));
        cbxFacilidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFacilidadesActionPerformed(evt);
            }
        });

        cbxCronograma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxCronograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "HI", "VHI", "XHI", "XLO", "VLO", "LO" }));
        cbxCronograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCronogramaActionPerformed(evt);
            }
        });

        txtMessage.setEditable(false);
        txtMessage.setBackground(new java.awt.Color(36, 41, 46));
        txtMessage.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        txtMessage.setForeground(new java.awt.Color(204, 204, 204));
        txtMessage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMessage.setText("Multiplicador Esfuerzo");
        txtMessage.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMulti)
                    .addComponent(cbxConfiabilidad, 0, 68, Short.MAX_VALUE)
                    .addComponent(cbxReusabilidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxDificultad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxAptitud, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxExperienci, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxFacilidades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxCronograma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxConfiabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxReusabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxAptitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxExperienci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFacilidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMulti)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(btnOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void cbxReusabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxReusabilidadActionPerformed
        // TODO add your handling code here:
        if ("NOM" == cbxReusabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[1] = 1;
        }
        if ("HI" == cbxReusabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[1] = 1.07;
        }
        if ("VHI" == cbxReusabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[1] = 1.15;
        }
        if ("XHI" == cbxReusabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[1] = 1.24;
        }
        if ("XLO" == cbxReusabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[1] = 1;
        }
        if ("VLO" == cbxReusabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[1] = 1;
        }
        if ("LO" == cbxReusabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[1] = 0.9;
        }
        lbMulti.setText(String.valueOf(formato1.format(sv.calMultiEsfuerzo())));
    }//GEN-LAST:event_cbxReusabilidadActionPerformed

    private void cbxConfiabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxConfiabilidadActionPerformed
        // TODO add your handling code here:
        if ("NOM" == cbxConfiabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[0] = 1;
        }
        if ("HI" == cbxConfiabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[0] = 1.3;
        }
        if ("VHI" == cbxConfiabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[0] = 1.74;
        }
        if ("XHI" == cbxConfiabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[0] = 2.38;
        }
        if ("XLO" == cbxConfiabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[0] = 0.73;
        }
        if ("VLO" == cbxConfiabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[0] = 0.81;
        }
        if ("LO" == cbxConfiabilidad.getSelectedItem()) {
            CtrOperaciones.arrayM[0] = 0.98;
        }
        lbMulti.setText(String.valueOf(formato1.format(sv.calMultiEsfuerzo())));
    }//GEN-LAST:event_cbxConfiabilidadActionPerformed

    private void cbxDificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDificultadActionPerformed
        // TODO add your handling code here:
        if ("NOM" == cbxDificultad.getSelectedItem()) {
            CtrOperaciones.arrayM[2] = 1;
        }
        if ("HI" == cbxDificultad.getSelectedItem()) {
            CtrOperaciones.arrayM[2] = 1.29;
        }
        if ("VHI" == cbxDificultad.getSelectedItem()) {
            CtrOperaciones.arrayM[2] = 1.81;
        }
        if ("XHI" == cbxDificultad.getSelectedItem()) {
            CtrOperaciones.arrayM[2] = 2.61;
        }
        if ("XLO" == cbxDificultad.getSelectedItem()) {
            CtrOperaciones.arrayM[2] = 1;
        }
        if ("VLO" == cbxDificultad.getSelectedItem()) {
            CtrOperaciones.arrayM[2] = 1;
        }
        if ("LO" == cbxDificultad.getSelectedItem()) {
            CtrOperaciones.arrayM[2] = 0.87;
        }
        lbMulti.setText(String.valueOf(formato1.format(sv.calMultiEsfuerzo())));
    }//GEN-LAST:event_cbxDificultadActionPerformed

    private void cbxAptitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAptitudActionPerformed
        // TODO add your handling code here:
        if ("NOM" == cbxAptitud.getSelectedItem()) {
            CtrOperaciones.arrayM[3] = 1;
        }
        if ("HI" == cbxAptitud.getSelectedItem()) {
            CtrOperaciones.arrayM[3] = 0.83;
        }
        if ("VHI" == cbxAptitud.getSelectedItem()) {
            CtrOperaciones.arrayM[3] = 0.63;
        }
        if ("XHI" == cbxAptitud.getSelectedItem()) {
            CtrOperaciones.arrayM[3] = 0.5;
        }
        if ("XLO" == cbxAptitud.getSelectedItem()) {
            CtrOperaciones.arrayM[3] = 2.12;
        }
        if ("VLO" == cbxAptitud.getSelectedItem()) {
            CtrOperaciones.arrayM[3] = 1.62;
        }
        if ("LO" == cbxAptitud.getSelectedItem()) {
            CtrOperaciones.arrayM[3] = 1.26;
        }
        lbMulti.setText(String.valueOf(formato1.format(sv.calMultiEsfuerzo())));
    }//GEN-LAST:event_cbxAptitudActionPerformed

    private void cbxExperienciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxExperienciActionPerformed
        // TODO add your handling code here:
        if ("NOM" == cbxExperienci.getSelectedItem()) {
            CtrOperaciones.arrayM[4] = 1;
        }
        if ("HI" == cbxExperienci.getSelectedItem()) {
            CtrOperaciones.arrayM[4] = 0.87;
        }
        if ("VHI" == cbxExperienci.getSelectedItem()) {
            CtrOperaciones.arrayM[4] = 0.71;
        }
        if ("XHI" == cbxExperienci.getSelectedItem()) {
            CtrOperaciones.arrayM[4] = 0.62;
        }
        if ("XLO" == cbxExperienci.getSelectedItem()) {
            CtrOperaciones.arrayM[4] = 1.59;
        }
        if ("VLO" == cbxExperienci.getSelectedItem()) {
            CtrOperaciones.arrayM[4] = 1.63;
        }
        if ("LO" == cbxExperienci.getSelectedItem()) {
            CtrOperaciones.arrayM[4] = 1.12;
        }
        lbMulti.setText(String.valueOf(formato1.format(sv.calMultiEsfuerzo())));
    }//GEN-LAST:event_cbxExperienciActionPerformed

    private void cbxFacilidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFacilidadesActionPerformed
        // TODO add your handling code here:
        if ("NOM" == cbxFacilidades.getSelectedItem()) {
            CtrOperaciones.arrayM[5] = 1;
        }
        if ("HI" == cbxFacilidades.getSelectedItem()) {
            CtrOperaciones.arrayM[5] = 0.87;
        }
        if ("VHI" == cbxFacilidades.getSelectedItem()) {
            CtrOperaciones.arrayM[5] = 0.73;
        }
        if ("XHI" == cbxFacilidades.getSelectedItem()) {
            CtrOperaciones.arrayM[5] = 0.62;
        }
        if ("XLO" == cbxFacilidades.getSelectedItem()) {
            CtrOperaciones.arrayM[5] = 1.43;
        }
        if ("VLO" == cbxFacilidades.getSelectedItem()) {
            CtrOperaciones.arrayM[5] = 1.3;
        }
        if ("LO" == cbxFacilidades.getSelectedItem()) {
            CtrOperaciones.arrayM[5] = 1.1;
        }
        lbMulti.setText(String.valueOf(formato1.format(sv.calMultiEsfuerzo())));
    }//GEN-LAST:event_cbxFacilidadesActionPerformed

    private void cbxCronogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCronogramaActionPerformed
        // TODO add your handling code here:
        if ("NOM" == cbxCronograma.getSelectedItem()) {
            CtrOperaciones.arrayM[6] = 1;
        }
        if ("HI" == cbxCronograma.getSelectedItem()) {
            CtrOperaciones.arrayM[6] = 1;
        }
        if ("VHI" == cbxCronograma.getSelectedItem()) {
            CtrOperaciones.arrayM[6] = 1;
        }
        if ("XHI" == cbxCronograma.getSelectedItem()) {
            CtrOperaciones.arrayM[6] = 1;
        }
        if ("XLO" == cbxCronograma.getSelectedItem()) {
            CtrOperaciones.arrayM[6] = 1;
        }
        if ("VLO" == cbxCronograma.getSelectedItem()) {
            CtrOperaciones.arrayM[6] = 1.43;
        }
        if ("LO" == cbxCronograma.getSelectedItem()) {
            CtrOperaciones.arrayM[6] = 1.14;
        }
        lbMulti.setText(String.valueOf(formato1.format(sv.calMultiEsfuerzo())));
    }//GEN-LAST:event_cbxCronogramaActionPerformed

    // int cont = 1;    int conR = 1;int conP = 1;int conA = 1;int conE = 1;   int conF = 1;    int contC = 1;
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
            java.util.logging.Logger.getLogger(MulEsfuerzoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MulEsfuerzoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MulEsfuerzoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MulEsfuerzoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MulEsfuerzoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> cbxAptitud;
    private javax.swing.JComboBox<String> cbxConfiabilidad;
    private javax.swing.JComboBox<String> cbxCronograma;
    private javax.swing.JComboBox<String> cbxDificultad;
    private javax.swing.JComboBox<String> cbxExperienci;
    private javax.swing.JComboBox<String> cbxFacilidades;
    private javax.swing.JComboBox<String> cbxReusabilidad;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbMulti;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
