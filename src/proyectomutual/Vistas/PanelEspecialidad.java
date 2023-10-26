/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomutual.Vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectomutual.AccesoDatos.EspecialidadData;
import proyectomutual.AccesoDatos.PrestadorData;
import proyectomutual.entidades.Especialidad;
import proyectomutual.entidades.Prestador;

/**
 *
 * @author m
 */
public class PanelEspecialidad extends javax.swing.JPanel {
    
    
    private DefaultTableModel modelo = new DefaultTableModel(){
      
        public boolean isCellEditable(int f, int c){
            return false;
        }
        
    };
    
    private PrestadorData prestadorData = new PrestadorData();
    private EspecialidadData especialidadData = new EspecialidadData();

    /**
     * Creates new form PanelEspecialidad
     */
    public PanelEspecialidad() {
        initComponents();
        cargarColumnas();
        cargarTabla();
        textFieldNuevaEspecialidadInvisible();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPEspecialidad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEspecialidades = new javax.swing.JTable();
        jTextFieldNuevaEspecialidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabelNuevaEspecialidad = new javax.swing.JLabel();
        jButtonAgregarNuevaEspecialidad = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(670, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPEspecialidad.setBackground(new java.awt.Color(153, 255, 204));
        jPEspecialidad.setPreferredSize(new java.awt.Dimension(670, 410));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("GESTION ESPECIALIDADES");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MasOrden.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Retroc.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("AGREGAR");

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("ELIMINAR");

        jTableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableEspecialidades);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarChica.jpg"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelNuevaEspecialidad.setText("Ingrese una nueva especialidad");

        jButtonAgregarNuevaEspecialidad.setText("AGREGAR");
        jButtonAgregarNuevaEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarNuevaEspecialidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPEspecialidadLayout = new javax.swing.GroupLayout(jPEspecialidad);
        jPEspecialidad.setLayout(jPEspecialidadLayout);
        jPEspecialidadLayout.setHorizontalGroup(
            jPEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEspecialidadLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
            .addGroup(jPEspecialidadLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEspecialidadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPEspecialidadLayout.createSequentialGroup()
                        .addGroup(jPEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPEspecialidadLayout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jTextFieldNuevaEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEspecialidadLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonAgregarNuevaEspecialidad)
                                .addGap(149, 149, 149)))
                        .addComponent(jLabel11)))
                .addGap(104, 104, 104))
            .addGroup(jPEspecialidadLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(73, 73, 73)
                .addComponent(jLabelNuevaEspecialidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(96, 96, 96))
        );
        jPEspecialidadLayout.setVerticalGroup(
            jPEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEspecialidadLayout.createSequentialGroup()
                .addGroup(jPEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEspecialidadLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jPEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabelNuevaEspecialidad)))
                .addGroup(jPEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEspecialidadLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPEspecialidadLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPEspecialidadLayout.createSequentialGroup()
                                .addComponent(jTextFieldNuevaEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAgregarNuevaEspecialidad))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        add(jPEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6AncestorAdded

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        textFieldNuevaEspecialidadVisible();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButtonAgregarNuevaEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarNuevaEspecialidadActionPerformed
        try {
            if (jTextFieldNuevaEspecialidad.getText() != null){
            String especialidadTexto = jTextFieldNuevaEspecialidad.getText();
            
            Especialidad nuevaEspecialidad = new Especialidad (especialidadTexto);
            
            especialidadData.agregarEspecialidad(nuevaEspecialidad);
            
            textFieldNuevaEspecialidadInvisible();
            cargarTablaVacia();
            cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de una especialidad para agregar");
                cargarTablaVacia();
            cargarTabla();
            }
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "ERRROR");
        }
    }//GEN-LAST:event_jButtonAgregarNuevaEspecialidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarNuevaEspecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNuevaEspecialidad;
    private javax.swing.JPanel jPEspecialidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableEspecialidades;
    private javax.swing.JTextField jTextFieldNuevaEspecialidad;
    // End of variables declaration//GEN-END:variables


    private void cargarColumnas(){
        modelo.addColumn("ID");
        modelo.addColumn("ESPECIALIDAD");
        jTableEspecialidades.setModel(modelo);
    }
    

    private void cargarTabla() {
        modelo.setRowCount(0);

        List<Especialidad> especialidadLista = especialidadData.listarEspecialidades();

        for (Especialidad especialidades : especialidadLista) {
            modelo.addRow(new Object[]{
                especialidades.getIdEspecialidad(), especialidades.getEspecialidad()});
        }
    }
    
    private void textFieldNuevaEspecialidadInvisible() {
        jTextFieldNuevaEspecialidad.setVisible(false);
        jLabelNuevaEspecialidad.setVisible(false);
        jButtonAgregarNuevaEspecialidad.setVisible(false);
    }

    private void textFieldNuevaEspecialidadVisible() {
        jTextFieldNuevaEspecialidad.setVisible(true);
        jLabelNuevaEspecialidad.setVisible(true);
        jButtonAgregarNuevaEspecialidad.setVisible(true);
    }
    
        //Limpia datos de la tabla
    private void cargarTablaVacia() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
}    

