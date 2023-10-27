/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomutual.Vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import proyectomutual.AccesoDatos.OrdenData;
import proyectomutual.AccesoDatos.PrestadorData;
import static proyectomutual.Vistas.Menu.jPFondo;
import proyectomutual.entidades.Afiliado;
import proyectomutual.entidades.Orden;
import proyectomutual.entidades.Prestador;

/**
 *
 * @author m
 */
public class PanelNewOrden extends javax.swing.JPanel {

//VARIABLES DATA
    private PrestadorData prestadorData = new PrestadorData();
    private OrdenData ordenData = new OrdenData();
    
    public PanelNewOrden() {
        initComponents();
        
        llenarComboBoxFormaPago();
        llenarComboBoxPrestadores();
        
        completarTextFieldAfiliadoNuevaOrden();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelAfiliado = new javax.swing.JLabel();
        jTextAfil = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jCPago = new javax.swing.JComboBox<>();
        jLabelFormaDePago = new javax.swing.JLabel();
        jLabelImporte = new javax.swing.JLabel();
        jTextImporte = new javax.swing.JTextField();
        jLAgregarOrden = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLVolver = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPrestador = new javax.swing.JLabel();
        jComboBoxPrestador = new javax.swing.JComboBox<>();
        jDFecha = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("NUEVA ORDEN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 27, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 89, 618, 10));

        jLabelAfiliado.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabelAfiliado.setForeground(new java.awt.Color(0, 102, 102));
        jLabelAfiliado.setText("AFILIADO:");
        add(jLabelAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 117, -1, -1));

        jTextAfil.setEditable(false);
        add(jTextAfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 117, 328, -1));

        jLabelFecha.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(0, 102, 102));
        jLabelFecha.setText("FECHA:");
        add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 163, -1, -1));

        add(jCPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 202, 328, -1));

        jLabelFormaDePago.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabelFormaDePago.setForeground(new java.awt.Color(0, 102, 102));
        jLabelFormaDePago.setText("FORMA DE PAGO:");
        add(jLabelFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 203, -1, -1));

        jLabelImporte.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabelImporte.setForeground(new java.awt.Color(0, 102, 102));
        jLabelImporte.setText("IMPORTE:");
        add(jLabelImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 246, -1, -1));
        add(jTextImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 246, 328, -1));

        jLAgregarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MasOrden.png"))); // NOI18N
        jLAgregarOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAgregarOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarOrdenMouseClicked(evt);
            }
        });
        add(jLAgregarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 334, -1, 47));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jLabel7.setText("Agregar");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 387, -1, -1));

        jLVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Retroc.png"))); // NOI18N
        jLVolver.setText(" ");
        jLVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLVolverMouseClicked(evt);
            }
        });
        add(jLVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 6, 48, 39));

        jLabel8.setText("( Llene todos los campos )");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 61, -1, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("$");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 246, -1, -1));

        jLabelPrestador.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabelPrestador.setForeground(new java.awt.Color(0, 102, 102));
        jLabelPrestador.setText("PRESTADOR:");
        add(jLabelPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 289, -1, -1));

        jComboBoxPrestador.setMaximumSize(new java.awt.Dimension(28, 20));
        add(jComboBoxPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 288, 328, -1));
        add(jDFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 155, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVolverMouseClicked
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

    }//GEN-LAST:event_jLVolverMouseClicked

    private void jLAgregarOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarOrdenMouseClicked
     
        try {
            //instancia objeto para traer afiliado
            PanelAfiliados afilNuevaOrden = new PanelAfiliados();
            Afiliado afiliado = afilNuevaOrden.afiliadoParaNewOrden;
            
            //Guarda en variables los campos
            LocalDate fecha = fromDateToLocalDate(jDFecha.getDate());
            String formaPago = (String) jCPago.getSelectedItem();
            String importeNum = jTextImporte.getText();
            double importe = Double.parseDouble(importeNum);
            Prestador prestadorSeleccionado = (Prestador) jComboBoxPrestador.getSelectedItem();
            


            //VERIFICA QUE ESTEN COMPLETOS TODOS LOS DATOS ANTES DE AGREGAR
            if (jTextImporte.getText().equals("") || jDFecha.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
            } else {
                Orden nuevaOrden = new Orden(fecha, formaPago, importe, afiliado, prestadorSeleccionado);

                ordenData.guardarOrden(nuevaOrden);
                refreshCampos();
                
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        } catch (NumberFormatException ex2) {
            JOptionPane.showMessageDialog(null, "Importe sólo admite números");
        }
    }//GEN-LAST:event_jLAgregarOrdenMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCPago;
    private javax.swing.JComboBox<Prestador> jComboBoxPrestador;
    private com.toedter.calendar.JDateChooser jDFecha;
    private javax.swing.JLabel jLAgregarOrden;
    private javax.swing.JLabel jLVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAfiliado;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFormaDePago;
    private javax.swing.JLabel jLabelImporte;
    private javax.swing.JLabel jLabelPrestador;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextAfil;
    private javax.swing.JTextField jTextImporte;
    // End of variables declaration//GEN-END:variables

    //MÉTODOS
    private void llenarComboBoxPrestadores() {
        jComboBoxPrestador.addItem(null);
        List<Prestador> prestadoresLista = prestadorData.listarPrestador();
        for (Prestador prestadores : prestadoresLista) {

            jComboBoxPrestador.addItem(prestadores);
        }
    }
    
    private void llenarComboBoxFormaPago(){
        jCPago.addItem(null);
        jCPago.addItem("Efectivo");
        jCPago.addItem("Débito");
    }

    //Casteo de date a local date
    public LocalDate fromDateToLocalDate(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    private void refreshCampos() {
        jTextImporte.setText("");
        jDFecha.setDate(null);
        jComboBoxPrestador.setSelectedIndex(0);
        jCPago.setSelectedIndex(0);
    }

    private void completarTextFieldAfiliadoNuevaOrden() {
        //Instancia clase para traer objeto a setear en textField
        PanelAfiliados afil = new PanelAfiliados();
        //Setea textField
        jTextAfil.setText(afil.afiliadoStringParaOrden);
        jTextAfil.setBackground(Color.gray);
    }
}
