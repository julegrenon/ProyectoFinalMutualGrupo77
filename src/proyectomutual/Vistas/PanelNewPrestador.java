
package proyectomutual.Vistas;


import proyectomutual.AccesoDatos.PrestadorData;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import proyectomutual.AccesoDatos.EspecialidadData;
import static proyectomutual.Vistas.Menu.jPFondo;
import proyectomutual.entidades.Especialidad;
import proyectomutual.entidades.Prestador;


public class PanelNewPrestador extends javax.swing.JPanel {

    private PrestadorData prestaData = new PrestadorData();
    private EspecialidadData especData = new EspecialidadData();

    public PanelNewPrestador() {
        initComponents();
        cargarComboBoxEspecialidades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTDireP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTApellidoP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTTelP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTDNIP = new javax.swing.JTextField();
        jLAgregarP = new javax.swing.JLabel();
        jTNombreP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCBEspecialidades = new javax.swing.JComboBox<>();
        jLVolverP = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(204, 255, 255));
        setMaximumSize(new java.awt.Dimension(670, 410));
        setMinimumSize(new java.awt.Dimension(670, 410));
        setPreferredSize(new java.awt.Dimension(670, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("NUEVO PRESTADOR");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 24, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 609, 10));

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel2.setText("Nombre:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel3.setText("Apellido:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        add(jTDireP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 394, -1));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel4.setText("D.N.I:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        add(jTApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 394, -1));

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel5.setText("Télefono:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel6.setText("Dirección:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        add(jTTelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 394, -1));

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel7.setText("Especialidad:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        add(jTDNIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 394, -1));

        jLAgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        jLAgregarP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLAgregarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAgregarP.setMinimumSize(null);
        jLAgregarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarPMouseClicked(evt);
            }
        });
        add(jLAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));
        add(jTNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 394, -1));

        jLabel8.setText("( Llene todos los campos)");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, 20));

        jLabel9.setText("Agregar");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        add(jCBEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 394, -1));

        jLVolverP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Retroc.png"))); // NOI18N
        jLVolverP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLVolverP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLVolverPMouseClicked(evt);
            }
        });
        add(jLVolverP, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 6, -1, 42));
    }// </editor-fold>//GEN-END:initComponents
//=======================================================================================
    private void jLVolverPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVolverPMouseClicked
        PanelPrestadores prestadorVista = new PanelPrestadores();
        prestadorVista.setSize(670, 410);
        prestadorVista.setLocation(0, 0);
        jPFondo.removeAll();
        jPFondo.add(prestadorVista, BorderLayout.CENTER);

        jPFondo.revalidate();
        jPFondo.repaint();
    }//GEN-LAST:event_jLVolverPMouseClicked
//=======================================================================================
    private void jLAgregarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarPMouseClicked
        botonAgregarNuevoPrestador();
    }//GEN-LAST:event_jLAgregarPMouseClicked
    //=====================================================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Especialidad> jCBEspecialidades;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLAgregarP;
    private javax.swing.JLabel jLVolverP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTApellidoP;
    private javax.swing.JTextField jTDNIP;
    private javax.swing.JTextField jTDireP;
    private javax.swing.JTextField jTNombreP;
    private javax.swing.JTextField jTTelP;
    // End of variables declaration//GEN-END:variables

    //============================================
    //LIMPIA CAMPOS
    public void limpiarCampos() {
        jTNombreP.setText("");
        jTApellidoP.setText("");
        jTDNIP.setText("");
        jTTelP.setText("");
        jTDireP.setText("");
        jCBEspecialidades.setSelectedIndex(0);
    }

    //===========================================
    // CARGA COMBOBOX
    private void cargarComboBoxEspecialidades() {
        jCBEspecialidades.addItem(null);
        List<Especialidad> especialidadLista = especData.listarEspecialidades();
        for (Especialidad especialidad : especialidadLista) {

            jCBEspecialidades.addItem(especialidad);
        }
    }

    //MÉTODOS BOTONES
    private void botonAgregarNuevoPrestador() {
        try {
            String nombre = jTNombreP.getText();
            String apellido = jTApellidoP.getText();
            String dniNum = jTDNIP.getText();
            int dni = Integer.parseInt(dniNum);
            String telefonoNum = jTTelP.getText();
            int telefono = Integer.parseInt(telefonoNum);
            String domicilio = jTDireP.getText();

            if (jTDNIP.getText().equals("") || jTApellidoP.getText().equals("")
                    || jTNombreP.getText().equals("") || jTTelP.getText().equals("")
                    || jTDireP.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
            } else {

                Especialidad especialidadSeleccionada = (Especialidad) jCBEspecialidades.getSelectedItem();
                Prestador prestadorNuevo = new Prestador(nombre, apellido, dni, telefono, domicilio, especialidadSeleccionada, true);

                prestaData.agregarPrestador(prestadorNuevo);
                limpiarCampos();
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        } catch (NumberFormatException ex2) {
            JOptionPane.showMessageDialog(null, "DNI y teléfono sólo admiten números");
        }
    }
}
