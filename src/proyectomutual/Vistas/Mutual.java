/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomutual.Vistas;

import java.awt.BorderLayout;

/**
 *
 * @author m
 */
public class Mutual extends javax.swing.JPanel {

    /**
     * Creates new form Mutual
     */
    public Mutual() {
        initComponents();
        
        PanelAfiliados pa= new PanelAfiliados();
        pa.setSize(683, 415);
        pa.setLocation(0, 0);
        
        jPVistas.removeAll();
        jPVistas.add(pa, BorderLayout.CENTER);
        jPVistas.revalidate();
        jPVistas.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBotonera = new javax.swing.JPanel();
        jBAfiliado = new javax.swing.JButton();
        jBPrestador = new javax.swing.JButton();
        jBEspecialista = new javax.swing.JButton();
        jBOrden = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPVistas = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPBotonera.setBackground(new java.awt.Color(153, 255, 204));
        jPBotonera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAfiliado.setBackground(new java.awt.Color(255, 255, 255));
        jBAfiliado.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jBAfiliado.setForeground(new java.awt.Color(0, 102, 102));
        jBAfiliado.setText("AFILIADOS");
        jBAfiliado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAfiliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAfiliadoMouseClicked(evt);
            }
        });
        jPBotonera.add(jBAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 220, 80));

        jBPrestador.setBackground(new java.awt.Color(255, 255, 255));
        jBPrestador.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jBPrestador.setForeground(new java.awt.Color(0, 102, 102));
        jBPrestador.setText("PRESTADORES");
        jBPrestador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrestadorActionPerformed(evt);
            }
        });
        jPBotonera.add(jBPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 86, 220, 80));

        jBEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        jBEspecialista.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jBEspecialista.setForeground(new java.awt.Color(0, 102, 102));
        jBEspecialista.setText("ESPECIALISTAS");
        jBEspecialista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPBotonera.add(jBEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 172, 220, 80));

        jBOrden.setBackground(new java.awt.Color(255, 255, 255));
        jBOrden.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jBOrden.setForeground(new java.awt.Color(0, 102, 102));
        jBOrden.setText("CONSULTAS POR ORDEN");
        jBOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrdenActionPerformed(evt);
            }
        });
        jPBotonera.add(jBOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 258, 220, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPBotonera.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 350, -1, 51));

        jPVistas.setBackground(new java.awt.Color(255, 255, 255));
        jPVistas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPVistas, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBotonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPVistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPrestadorActionPerformed

    private void jBOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBOrdenActionPerformed

    private void jBAfiliadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAfiliadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAfiliadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAfiliado;
    private javax.swing.JButton jBEspecialista;
    private javax.swing.JButton jBOrden;
    private javax.swing.JButton jBPrestador;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPBotonera;
    private javax.swing.JPanel jPVistas;
    // End of variables declaration//GEN-END:variables
}
