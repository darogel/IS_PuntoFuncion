/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.itextpdf.text.BaseColor;
import controlador.Servicios;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darwin
 */
public class PrincipalFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalFrame
     */
    Servicios sv = new Servicios();
    public static Color color1 = new Color(36, 41, 46);
    public static Color color2 = new Color(246, 248, 250);
    BigDecimal bigDecimal;
    DefaultTableModel model = new DefaultTableModel();

    public PrincipalFrame() {
        initComponents();
        jPanel2.setBackground(PrincipalFrame.color1);
        this.getContentPane().setBackground(PrincipalFrame.color2);

        JOptionPane.showMessageDialog(null, "En caso de no ingresar Valores se usaran valores por defecto", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
        txtNombre.requestFocus();
        txtSced.setText("25");
        txtCost.setText("10");
        txtSalario.setText("0");
        txtNombre.setText("<Sample>");
        model.addColumn("Nombre");
        model.addColumn("Punto Función");
        model.addColumn("Lineas Cod");
        model.addColumn("Esf. Estimado");
        model.addColumn("Est. Tiempo");
        model.addColumn("% Holgura");
        model.addColumn("Tiempo Total");
        model.addColumn("Est. Persona");
        model.addColumn("Pago hora");
        model.addColumn("Est. Costo");
        model.addColumn("% Extra Costo");
        model.addColumn("Costo Total");
        this.jtTable.setModel(model);
        btnEliminar.setEnabled(false);
        btnReporte.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar = new javax.swing.JButton();
        txtSced = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnReestrablecer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTable = new javax.swing.JTable();
        txtCost = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnFactor = new javax.swing.JButton();
        btnMultiplicador = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cocomo II - Punto funcion");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnEliminar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtSced.setBackground(new java.awt.Color(246, 248, 250));
        txtSced.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtSced.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtSalario.setBackground(new java.awt.Color(246, 248, 250));
        txtSalario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Porcentaje de variación del Calendario: ");

        btnCalcular.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnReestrablecer.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnReestrablecer.setText("Restablecer tabla");
        btnReestrablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReestrablecerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Salario por Hora: ");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Porcentaje variación del Costo");

        jPanel1.setBackground(new java.awt.Color(246, 248, 250));

        jtTable.setBackground(new java.awt.Color(246, 248, 250));
        jtTable.setForeground(new java.awt.Color(51, 51, 51));
        jtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre Archivo", "Punto Función", "Lineas de Codigo", "Esfuerzo Estimado", "Est. tiempo", "% Holgura", "Tiempo Total", "Est. Personal", "Pago Hora", "Est. Costo", "% Extra Costo", "Costo Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTable.setGridColor(new java.awt.Color(246, 248, 250));
        jtTable.setSelectionBackground(new java.awt.Color(33, 136, 255));
        jScrollPane1.setViewportView(jtTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );

        txtCost.setBackground(new java.awt.Color(246, 248, 250));
        txtCost.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        btnFactor.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnFactor.setText("Factor Escala");
        btnFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorActionPerformed(evt);
            }
        });

        btnMultiplicador.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnMultiplicador.setText("Multiplicador Esfuerzo");
        btnMultiplicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicadorActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(246, 248, 250));
        txtNombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre del Proyecto: ");

        btnAgregar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAgregar.setText("Punto Funcion");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(36, 31, 46));
        lblTitulo.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo.setText("COCOMO II - PUNTO FUNCIÓN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFactor)
                .addGap(18, 18, 18)
                .addComponent(btnMultiplicador)
                .addGap(47, 47, 47))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitulo)
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(btnMultiplicador)
                    .addComponent(btnFactor))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnReporte.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnReporte.setText("Generar Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSced, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(289, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReestrablecer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReporte)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalcular)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReestrablecer)
                    .addComponent(btnCalcular)
                    .addComponent(btnEliminar)
                    .addComponent(btnReporte))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int eli = jtTable.getSelectedRowCount();
        if (jtTable.getRowCount() > 0) {
            if (eli >= 0) {
                model.removeRow(eli);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos que eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        AgregarFrame ag = new AgregarFrame();
        ag.show();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        if (sv.est.getLineasCod() == 0) {
            JOptionPane.showMessageDialog(null, "Su punto función es Cero. Por favor ingrese valores para el punto función", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            double sced = Double.parseDouble(txtSced.getText());
            double salario = Double.parseDouble(txtSalario.getText());
            double costV = Double.parseDouble(txtCost.getText());
            sv.calcularPmEstimado();
            sv.calcularEstTiempo(sced);
            sv.calcularEstPersona();
            sv.calcularEstCosto(salario, costV);
            String[] agregar = new String[12];
            agregar[0] = txtNombre.getText();
            agregar[1] = String.valueOf(sv.est.getPuntoFuncion());
            bigDecimal = new BigDecimal(sv.est.getLineasCod() * 1000).setScale(2, RoundingMode.UP);
            agregar[2] = String.valueOf(bigDecimal);
            bigDecimal = new BigDecimal(sv.est.getPmEstimado()).setScale(2, RoundingMode.UP);
            agregar[3] = String.valueOf(bigDecimal);
            bigDecimal = new BigDecimal(sv.est.getEstTiempo() / (1 + (sced * 0.01))).setScale(2, RoundingMode.UP);
            agregar[4] = String.valueOf(bigDecimal);
            agregar[5] = String.valueOf(sced);
            bigDecimal = new BigDecimal(sv.est.getEstTiempo()).setScale(2, RoundingMode.UP);
            agregar[6] = String.valueOf(bigDecimal);
            bigDecimal = new BigDecimal(sv.est.getEsthHombre()).setScale(2, RoundingMode.UP);
            agregar[7] = String.valueOf(bigDecimal);
            agregar[8] = String.valueOf(salario);
            bigDecimal = new BigDecimal(sv.est.getEstCosto() / (1 + (costV * 0.01))).setScale(2, RoundingMode.UP);
            agregar[9] = String.valueOf(bigDecimal);
            bigDecimal = new BigDecimal(costV).setScale(2, RoundingMode.UP);
            agregar[10] = String.valueOf(bigDecimal);
            bigDecimal = new BigDecimal(sv.est.getEstCosto()).setScale(2, RoundingMode.UP);
            agregar[11] = String.valueOf(bigDecimal);
            model.addRow(agregar);
            btnEliminar.setEnabled(true);
            btnReporte.setEnabled(true);
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnReestrablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReestrablecerActionPerformed
        // TODO add your handling code here:
        int eliT = jtTable.getRowCount();
        for (int i = eliT - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        btnReporte.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnReestrablecerActionPerformed

    private void btnFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorActionPerformed
        // TODO add your handling code here:
        FactorEscalaFrame fe = new FactorEscalaFrame();
        fe.show();
    }//GEN-LAST:event_btnFactorActionPerformed

    private void btnMultiplicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicadorActionPerformed
        // TODO add your handling code here:
        MulEsfuerzoFrame mf = new MulEsfuerzoFrame();
        mf.show();
    }//GEN-LAST:event_btnMultiplicadorActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        if (jtTable.getRowCount() > 0) {
            Document document = new Document();
            try {
                String route = System.getProperty("user.home");
                PdfWriter.getInstance(document, new FileOutputStream(route + "/Desktop/ReporteEstimación_PF.pdf"));
                document.open();
                Paragraph title = new Paragraph("UNIVERSIDAD NACIONAL DE LOJA\n",
                        FontFactory.getFont("arial", 22, Font.BOLD, BaseColor.BLACK)
                );
                document.add(title);

                document.add(new Paragraph("Carrera de Ingeniería en Sistemas\n",
                        FontFactory.getFont("arial", 18, BaseColor.BLACK)));
                document.add(new Paragraph("INGENIERÍA DEL SOFTWARE\n",
                        FontFactory.getFont("arial", 16, BaseColor.BLACK)));
                document.add(new Paragraph("Integrantes: \n\tJimenez Borja Byron Ronaldo\n\tRogel Rivera Darwin Alexander\n\tLeón Mejía Jean Carlos\n",
                        FontFactory.getFont("arial", 14, BaseColor.BLACK)));
                document.add(new Paragraph("Docente: \n\tIng. Jose Guaman",
                        FontFactory.getFont("arial", 14, BaseColor.BLACK)));
                Date objData = new Date();
                document.add(new Paragraph("Fecha: " + objData.toString() + "\n\n",
                        FontFactory.getFont("arial", 14, BaseColor.BLACK)));
                PdfPTable table = new PdfPTable(jtTable.getColumnCount());

                Font letra = new Font(Font.FontFamily.TIMES_ROMAN, 9);
                table.addCell(new Phrase("Nombre", letra));
                table.addCell(new Phrase("Punto F.", letra));
                table.addCell(new Phrase("Lineas Cod.", letra));
                table.addCell(new Phrase("Esf. Estimado", letra));
                table.addCell(new Phrase("Est. Tiempo", letra));
                table.addCell(new Phrase("% Holgura", letra));
                table.addCell(new Phrase("Tiempo Total.", letra));
                table.addCell(new Phrase("Est. Persona", letra));
                table.addCell(new Phrase("Pago Hora", letra));
                table.addCell(new Phrase("Est. Costo", letra));
                table.addCell(new Phrase("% Extra Costo", letra));
                table.addCell(new Phrase("Costo Total", letra));

                table.setHeaderRows(1);
                for (int row = 0; row < jtTable.getRowCount(); row++) {
                    for (int column = 0; column < jtTable.getColumnCount(); column++) {
                        table.addCell(new Phrase(jtTable.getValueAt(row, column).toString(), letra));
                    }
                }

                document.add(table);
                document.close();
                JOptionPane.showMessageDialog(null, "¡Se ha generado el archivo PDF correctamente!",
                        "RESULTADO", JOptionPane.INFORMATION_MESSAGE);

            } catch (FileNotFoundException fileNotFoundException) {
                JOptionPane.showMessageDialog(null, "No se encontró el fichero para generar el pdf!",
                        "RESULTADO", JOptionPane.ERROR_MESSAGE);
            } catch (DocumentException ex) {
                Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "!La Tabla esta Vacia¡");
        }


    }//GEN-LAST:event_btnReporteActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFactor;
    private javax.swing.JButton btnMultiplicador;
    private javax.swing.JButton btnReestrablecer;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTable;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSced;
    // End of variables declaration//GEN-END:variables
}
