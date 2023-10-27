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

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("NUEVA ORDEN");

        jLabelAfiliado.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabelAfiliado.setForeground(new java.awt.Color(0, 102, 102));
        jLabelAfiliado.setText("AFILIADO:");

        jTextAfil.setEditable(false);

        jLabelFecha.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(0, 102, 102));
        jLabelFecha.setText("FECHA:");

        jLabelFormaDePago.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabelFormaDePago.setForeground(new java.awt.Color(0, 102, 102));
        jLabelFormaDePago.setText("FORMA DE PAGO:");

        jLabelImporte.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabelImporte.setForeground(new java.awt.Color(0, 102, 102));
        jLabelImporte.setText("IMPORTE:");

        jLAgregarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MasOrden.png"))); // NOI18N
        jLAgregarOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAgregarOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarOrdenMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jLabel7.setText("Agregar");

        jLVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Retroc.png"))); // NOI18N
        jLVolver.setText(" ");
        jLVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLVolverMouseClicked(evt);
            }
        });

        jLabel8.setText("( Llene todos los campos )");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("$");

        jLabelPrestador.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabelPrestador.setForeground(new java.awt.Color(0, 102, 102));
        jLabelPrestador.setText("PRESTADOR:");

        jComboBoxPrestador.setMaximumSize(new java.awt.Dimension(28, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(198, 198, 198)
                        .addComponent(jLVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelAfiliado)
                                                .addComponent(jLabelFecha)
                                                .addComponent(jLabelFormaDePago))
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelImporte)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2)
                                            .addGap(1, 1, 1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelPrestador)
                                        .addGap(57, 57, 57)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextImporte)
                                    .addComponent(jTextAfil, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                    .addComponent(jCPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxPrestador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(257, 257, 257))))
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLAgregarOrden))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAfiliado)
                    .addComponent(jTextAfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFormaDePago))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelImporte)
                    .addComponent(jTextImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrestador)
                    .addComponent(jComboBoxPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLAgregarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVolverMouseClicked
        //Istancia clase panel 
        PanelAfiliados afiliadosVista = new PanelAfiliados();

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
        botonAgregarNuevaOrden();
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

    private void llenarComboBoxFormaPago() {
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

    //MÉTODO BOTON
    private void botonAgregarNuevaOrden() {
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
    }
}
