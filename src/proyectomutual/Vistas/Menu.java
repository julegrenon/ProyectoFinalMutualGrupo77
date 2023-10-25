/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomutual.Vistas;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;

public class Menu extends javax.swing.JFrame {

    //Variables de localización del mouse para mover la ventana
    int xMouse, yMouse;
 
    
    public Menu() {
        initComponents();
        
        //Setea la localización de la ventana en el centtro
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        //ImageIcon icono= new ImageIcon(getClass().getResource("/Imagenes/Image800.png"));
        //Image miImagen=icono.getImage();
        Escritorio = new javax.swing.JDesktopPane();
        jLBanner = new javax.swing.JLabel();
        jPInicio = new javax.swing.JPanel();
        jPBotonera = new javax.swing.JPanel();
        jBAfiliado = new javax.swing.JButton();
        jBPrestador = new javax.swing.JButton();
        jBEspecialista = new javax.swing.JButton();
        jBOrden = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        //ImageIcon icono=new ImageIcon(getClass().getResource("/Imagenes/Image800.png"));
        //Image miImagen=icono.getImage();
        jPFondo = new javax.swing.JPanel();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Escritorio.setBackground(new java.awt.Color(255, 255, 255));
        Escritorio.setToolTipText("X");
        Escritorio.setPreferredSize(new java.awt.Dimension(900, 515));
        Escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLBanner.setBackground(new java.awt.Color(204, 255, 255));
        jLBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Banner 900x100.png"))); // NOI18N
        jLBanner.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLBannerMouseDragged(evt);
            }
        });
        jLBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLBannerMousePressed(evt);
            }
        });
        Escritorio.add(jLBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 906, -1));

        jPInicio.setBackground(new java.awt.Color(204, 255, 255));
        jPInicio.setPreferredSize(new java.awt.Dimension(229, 800));
        jPInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPBotonera.setBackground(new java.awt.Color(153, 255, 204));
        jPBotonera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAfiliado.setBackground(new java.awt.Color(102, 102, 102));
        jBAfiliado.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jBAfiliado.setForeground(new java.awt.Color(153, 255, 255));
        jBAfiliado.setText("AFILIADOS");
        jBAfiliado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAfiliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAfiliadoMouseClicked(evt);
            }
        });
        jBAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAfiliadoActionPerformed(evt);
            }
        });
        jPBotonera.add(jBAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 220, 80));

        jBPrestador.setBackground(new java.awt.Color(102, 102, 102));
        jBPrestador.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jBPrestador.setForeground(new java.awt.Color(153, 255, 255));
        jBPrestador.setText("PRESTADORES");
        jBPrestador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrestadorActionPerformed(evt);
            }
        });
        jPBotonera.add(jBPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 86, 220, 80));

        jBEspecialista.setBackground(new java.awt.Color(102, 102, 102));
        jBEspecialista.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jBEspecialista.setForeground(new java.awt.Color(153, 255, 255));
        jBEspecialista.setText("ESPECIALISTAS");
        jBEspecialista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEspecialistaActionPerformed(evt);
            }
        });
        jPBotonera.add(jBEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 172, 220, 80));

        jBOrden.setBackground(new java.awt.Color(102, 102, 102));
        jBOrden.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jBOrden.setForeground(new java.awt.Color(153, 255, 255));
        jBOrden.setText("CONSULTAS POR ORDEN");
        jBOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrdenActionPerformed(evt);
            }
        });
        jPBotonera.add(jBOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 258, 220, 80));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 255, 204));
        jButton1.setText("SALIR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPBotonera.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jPInicio.add(jPBotonera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 410));

        Escritorio.add(jPInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 101, -1, 410));

        jPFondo.setBackground(new java.awt.Color(204, 255, 255));
        jPFondo.setPreferredSize(new java.awt.Dimension(671, 415));

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImageFondo.jpg"))); // NOI18N
        jLFondo.setPreferredSize(new java.awt.Dimension(670, 410));

        javax.swing.GroupLayout jPFondoLayout = new javax.swing.GroupLayout(jPFondo);
        jPFondo.setLayout(jPFondoLayout);
        jPFondoLayout.setHorizontalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPFondoLayout.setVerticalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Escritorio.add(jPFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 670, 410));

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 515));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAfiliadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAfiliadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAfiliadoMouseClicked

    private void jBAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAfiliadoActionPerformed
        //Istancia clase panel 
        PanelAfiliados afiliadosVista=new PanelAfiliados();
        
        //Setea dimensiones y location
        afiliadosVista.setSize(670, 410);
        afiliadosVista.setLocation(0, 0);
        
        //Remueve y agrega la vista del panel instanciada
        jPFondo.removeAll();
        jPFondo.add(afiliadosVista, BorderLayout.CENTER);
        
        jPFondo.revalidate();
        jPFondo.repaint();

    }//GEN-LAST:event_jBAfiliadoActionPerformed

    private void jBPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrestadorActionPerformed
        //Istancia clase panel 
        PanelPrestadores prestadoresVista=new PanelPrestadores();
        
        //Setea dimensiones y location
        prestadoresVista.setSize(670, 410);
        prestadoresVista.setLocation(0, 0);
        
        //Remueve y agrega la vista del panel instanciada
        jPFondo.removeAll();
        jPFondo.add(prestadoresVista, BorderLayout.CENTER);
        
        jPFondo.revalidate();
        jPFondo.repaint();

    }//GEN-LAST:event_jBPrestadorActionPerformed

    private void jBOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrdenActionPerformed
        //Istancia clase panel 
        PanelOrdenes ordenesVista=new PanelOrdenes();
        
        //Setea dimensiones y location
        ordenesVista.setSize(670, 410);
        ordenesVista.setLocation(0, 0);
        
        //Remueve y agrega la vista del panel instanciada
        jPFondo.removeAll();
        jPFondo.add(ordenesVista, BorderLayout.CENTER);
        
        jPFondo.revalidate();
        jPFondo.repaint();

    }//GEN-LAST:event_jBOrdenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEspecialistaActionPerformed
            //Istancia clase panel 
        PanelEspecialidad especialidadVista=new PanelEspecialidad();
        
        //Setea dimensiones y location
        especialidadVista.setSize(670, 410);
        especialidadVista.setLocation(0, 0);
        
        //Remueve y agrega la vista del panel instanciada
        jPFondo.removeAll();
        jPFondo.add(especialidadVista, BorderLayout.CENTER);
        
        jPFondo.revalidate();
        jPFondo.repaint();

    }//GEN-LAST:event_jBEspecialistaActionPerformed

    //Localización del mouse al hacer clic para mover la ventana
    private void jLBannerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBannerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLBannerMousePressed

    //Localización del mouse al arrastrar para mover la ventana
    private void jLBannerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBannerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLBannerMouseDragged

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton jBAfiliado;
    private javax.swing.JButton jBEspecialista;
    private javax.swing.JButton jBOrden;
    private javax.swing.JButton jBPrestador;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLBanner;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JPanel jPBotonera;
    public static javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPInicio;
    // End of variables declaration//GEN-END:variables
}
