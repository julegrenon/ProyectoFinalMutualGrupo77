/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomutual.Vistas;

/**
 *
 * @author sonia
 */
import java.awt.BorderLayout;
public class PanelOrdenes extends javax.swing.JPanel {

    /**
     * Creates new form PanelOrdenes
     */
    public PanelOrdenes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPOrden = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsultaOrden = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jTDNIConsulta = new javax.swing.JTextField();
        jTIdPrestador = new javax.swing.JTextField();
        jLVolver = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(670, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPOrden.setBackground(new java.awt.Color(153, 255, 204));
        jPOrden.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTConsultaOrden.setBackground(new java.awt.Color(255, 255, 255));
        jTConsultaOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTConsultaOrden);

        jPOrden.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 520, 120));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("CONSULTA ORDEN");
        jPOrden.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 102, 102));
        jCheckBox1.setText("DNI");
        jPOrden.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 102, 102));
        jCheckBox2.setText("ID PRESTADOR");
        jPOrden.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 102, 102));
        jCheckBox3.setText("Fecha");
        jPOrden.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Buscar por..");
        jPOrden.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));
        jPOrden.add(jTDNIConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 100, -1));
        jPOrden.add(jTIdPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 120, -1));

        jLVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Retroc.png"))); // NOI18N
        jLVolver.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPOrden.add(jLVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, 50));

        jBLimpiar.setText("NUEVA BÚSQUEDA");
        jPOrden.add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));
        jPOrden.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 610, 10));

        add(jPOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 410));
        jPOrden.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLVolver;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPOrden;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTConsultaOrden;
    private javax.swing.JTextField jTDNIConsulta;
    private javax.swing.JTextField jTIdPrestador;
    // End of variables declaration//GEN-END:variables
}
