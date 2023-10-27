
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
        setPreferredSize(new java.awt.Dimension(670, 410));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("NUEVO PRESTADOR");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel4.setText("D.N.I:");

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel5.setText("Télefono:");

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel6.setText("Dirección:");

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel7.setText("Especialidad:");

        jLAgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        jLAgregarP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLAgregarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAgregarP.setMinimumSize(null);
        jLAgregarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarPMouseClicked(evt);
            }
        });

        jLabel8.setText("( Llene todos los campos)");

        jLabel9.setText("Agregar");

        jLVolverP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Retroc.png"))); // NOI18N
        jLVolverP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLVolverP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLVolverPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1)
                        .addGap(0, 223, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 620, Short.MAX_VALUE)
                        .addComponent(jLVolverP)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(42, 42, 42)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTNombreP)
                                .addComponent(jTApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTDireP, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTDNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTTelP, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel8)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLAgregarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(jLVolverP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jTApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jTDNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTTelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTDireP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jCBEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLAgregarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel9)))
                        .addContainerGap())))
        );
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
