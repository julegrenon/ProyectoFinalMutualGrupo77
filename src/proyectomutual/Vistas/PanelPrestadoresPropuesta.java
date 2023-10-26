package proyectomutual.Vistas;





import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectomutual.AccesoDatos.EspecialidadData;
import proyectomutual.AccesoDatos.PrestadorData;
import static proyectomutual.Vistas.Menu.jPFondo;
import proyectomutual.entidades.Afiliado;
import proyectomutual.entidades.Especialidad;
import proyectomutual.entidades.Prestador;

public class PanelPrestadoresPropuesta extends javax.swing.JPanel {
    
        //Setea modelo de tabla
    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
             if (c >= 2 && c <= 6) {
                return true;
            }
            return false;
        }
    };

   ArrayList<Especialidad> especialidadesLista = new ArrayList();
   ArrayList<Prestador> prestadorLista = new ArrayList<>();
   
   
    private PrestadorData prestadorData= new PrestadorData();
    private Prestador prestadorNuevo= null;
    
    private EspecialidadData especialidadData= new EspecialidadData();
    private Especialidad especialidadNueva= null;
   
    public PanelPrestadoresPropuesta() {
        initComponents();
        cargarColumnas();
        cargarComboBox();
        cargarTablaPrestadores();
        jTextFieldNuevaEspecialidad.setVisible(false);
        jButtonAgregarEspecialidad.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrestador = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jCBEspecialidad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLEliminar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLAgregar = new javax.swing.JLabel();
        jBMostrarTodosLosPrestadores = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePrestadores = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButtonNuevaEspecialidad = new javax.swing.JButton();
        jTextFieldNuevaEspecialidad = new javax.swing.JTextField();
        jButtonAgregarEspecialidad = new javax.swing.JButton();
        jLAfiliadoModificar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(670, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPPrestador.setBackground(new java.awt.Color(153, 255, 204));
        jPPrestador.setPreferredSize(new java.awt.Dimension(670, 410));
        jPPrestador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPPrestadorMouseClicked(evt);
            }
        });
        jPPrestador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPPrestador.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 58, 620, -1));

        jCBEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEspecialidadActionPerformed(evt);
            }
        });
        jPPrestador.add(jCBEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 180, -1));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("GESTION PRESTADORES");
        jPPrestador.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agregar");
        jPPrestador.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jLEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarChica.jpg"))); // NOI18N
        jLEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLEliminarMouseClicked(evt);
            }
        });
        jPPrestador.add(jLEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 50, 50));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Eliminar");
        jPPrestador.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 70, -1));
        jPPrestador.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MasOrden.png"))); // NOI18N
        jLAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarMouseClicked(evt);
            }
        });
        jPPrestador.add(jLAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 50, 50));

        jBMostrarTodosLosPrestadores.setText("VER TODOS");
        jBMostrarTodosLosPrestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarTodosLosPrestadoresActionPerformed(evt);
            }
        });
        jPPrestador.add(jBMostrarTodosLosPrestadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        jTablePrestadores.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePrestadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePrestadoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablePrestadores);

        jPPrestador.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 240));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("FILTRAR POR ESPECIALIDAD:");
        jPPrestador.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jButtonNuevaEspecialidad.setText("NUEVA ESPECIALIDAD");
        jButtonNuevaEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaEspecialidadActionPerformed(evt);
            }
        });
        jPPrestador.add(jButtonNuevaEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));
        jPPrestador.add(jTextFieldNuevaEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 140, -1));

        jButtonAgregarEspecialidad.setText("AGREGAR");
        jButtonAgregarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarEspecialidadActionPerformed(evt);
            }
        });
        jPPrestador.add(jButtonAgregarEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLAfiliadoModificar.setBackground(new java.awt.Color(153, 255, 204));
        jLAfiliadoModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar chico_1.jpg"))); // NOI18N
        jLAfiliadoModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLAfiliadoModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAfiliadoModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAfiliadoModificarMouseClicked(evt);
            }
        });
        jPPrestador.add(jLAfiliadoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 50, 50));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar");
        jPPrestador.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 70, -1));

        add(jPPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 683, 415));
        jPPrestador.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jBMostrarTodosLosPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarTodosLosPrestadoresActionPerformed
        cargarTablaVacia();
        cargarTablaPrestadores();
    herramientasAgregarEspecialidadInvisible();
    }//GEN-LAST:event_jBMostrarTodosLosPrestadoresActionPerformed


    //=====================================================================================
    private void jCBEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEspecialidadActionPerformed
       cargarTablaVacia();
       cargarTablaPrestadoresXEspecialidad();
    }//GEN-LAST:event_jCBEspecialidadActionPerformed

    //==================================================================================
    //AGREGAR
    
    private void jLAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseClicked
        PanelNewPrestador nuevoPrestadorVista = new PanelNewPrestador();
        nuevoPrestadorVista.setSize(670, 410);
        nuevoPrestadorVista.setLocation(0, 0);
        jPFondo.removeAll();
        jPFondo.add(nuevoPrestadorVista, BorderLayout.CENTER);
        jPFondo.revalidate();
        jPFondo.repaint();
    }//GEN-LAST:event_jLAgregarMouseClicked

    //==================================================================================
    //ELIMINAR
    private void jLEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEliminarMouseClicked
         try {
            //Crea variable para guardar la fila seleccionada
            int filaSeleccionada = jTablePrestadores.getSelectedRow();

            //Setea datos desde la tabla
            int id = (Integer) jTablePrestadores.getValueAt(filaSeleccionada, 0);

            //Llamada a método modificar
            prestadorData.eliminarPrestador(id);

            //Refresh de tablas
            cargarTablaVacia();
            cargarTablaPrestadores();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No hay ninguna selección para eliminar");
        } catch (NumberFormatException ex2) {
            JOptionPane.showMessageDialog(null, "ERROR");
        } catch (ArrayIndexOutOfBoundsException ex3) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un prestador para eliminar");
        }
    }//GEN-LAST:event_jLEliminarMouseClicked

    private void jButtonNuevaEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaEspecialidadActionPerformed
        jTextFieldNuevaEspecialidad.setVisible(true);
        jButtonAgregarEspecialidad.setVisible(true);
        jButtonNuevaEspecialidad.setVisible(false);

        
    }//GEN-LAST:event_jButtonNuevaEspecialidadActionPerformed

    private void jButtonAgregarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarEspecialidadActionPerformed
                
       botonAgregarEspecialidad();
       herramientasAgregarEspecialidadInvisible();
    }//GEN-LAST:event_jButtonAgregarEspecialidadActionPerformed

    private void jPPrestadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPrestadorMouseClicked
        herramientasAgregarEspecialidadInvisible();
    }//GEN-LAST:event_jPPrestadorMouseClicked

    private void jLAfiliadoModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAfiliadoModificarMouseClicked

        try {
            //Crea variable para guardar la fila seleccionada
            int filaSeleccionada = jTablePrestadores.getSelectedRow();

            //Setea datos desde la tabla
            int id = (Integer) jTablePrestadores.getValueAt(filaSeleccionada, 0);
            String especialidadTxt = (String) jTablePrestadores.getValueAt(filaSeleccionada, 1);
            String nombre = (String) jTablePrestadores.getValueAt(filaSeleccionada, 2);
            String apellido = (String) jTablePrestadores.getValueAt(filaSeleccionada, 3);
            int dni = (Integer) jTablePrestadores.getValueAt(filaSeleccionada, 4);
            int telefono = (Integer) jTablePrestadores.getValueAt(filaSeleccionada, 5);
            String domicilio = (String) jTablePrestadores.getValueAt(filaSeleccionada, 6);

            //Busca afiliado a través de método
            Prestador prestadorSeleccionado = prestadorData.buscarPrestador(id);
            Especialidad especialidad = especialidadData.buscarEspecialidadXNombre(especialidadTxt);

            //Setea estado
            boolean estado = prestadorSeleccionado.isEstado();

            //Instancia objeto final de alumno a modificar
            Prestador prestadorModif = new Prestador(id, nombre, apellido, dni, telefono, domicilio, especialidad, estado);

            //Llamada a método modificar
            prestadorData.modificarPrestador(prestadorModif);

            //Refresh de tabla
            cargarTablaVacia();
            cargarTablaPrestadores();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacíos");
        } catch (NumberFormatException ex2) {
            JOptionPane.showMessageDialog(null, "Formato incorrecto. Complete los campos con los caracteres correctos");
        } catch (ArrayIndexOutOfBoundsException ex3) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un prestador para editar");
        }
    }//GEN-LAST:event_jLAfiliadoModificarMouseClicked

    private void jTablePrestadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrestadoresMouseClicked
        herramientasAgregarEspecialidadInvisible();
    }//GEN-LAST:event_jTablePrestadoresMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBMostrarTodosLosPrestadores;
    private javax.swing.JButton jButtonAgregarEspecialidad;
    private javax.swing.JButton jButtonNuevaEspecialidad;
    private javax.swing.JComboBox<Especialidad> jCBEspecialidad;
    private javax.swing.JLabel jLAfiliadoModificar;
    private javax.swing.JLabel jLAgregar;
    private javax.swing.JLabel jLEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPPrestador;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablePrestadores;
    private javax.swing.JTextField jTextFieldNuevaEspecialidad;
    // End of variables declaration//GEN-END:variables
 
//==================================================================================
  
    //setea nombre de columnas
    private void cargarColumnas() {
        modelo.addColumn("ID");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Domicilio");
        jTablePrestadores.setModel(modelo);
    }

//CARGA LISTA PRESTADORES
    public void cargarTablaPrestadores() {

        modelo.setRowCount(0);
        List<Prestador> listaPrestadores = prestadorData.listarPrestador();

        for (Prestador prestadores : listaPrestadores) {

            modelo.addRow(new Object[]{
                prestadores.getIdPrestador(), prestadores.getEspecialidad().getEspecialidad(),
                prestadores.getNombre(), prestadores.getApellido(), prestadores.getDni(), prestadores.getTelefono(),
                prestadores.getDomicilio()});

        }
    }

    public void cargarTablaPrestadoresXEspecialidad() {

        modelo.setRowCount(0);
        //guardo captura combobox
        Especialidad especialidadSelec = (Especialidad) jCBEspecialidad.getSelectedItem();

        List<Prestador> listaPrestadoresXEspecialidad = prestadorData.listaPrestadorEspecialidad(especialidadSelec.getIdEspecialidad());

        for (Prestador prestadores : listaPrestadoresXEspecialidad) {

            modelo.addRow(new Object[]{
                prestadores.getIdPrestador(), prestadores.getEspecialidad().getEspecialidad(),
                prestadores.getNombre(), prestadores.getApellido(), prestadores.getDni(), prestadores.getTelefono(),
                prestadores.getDomicilio()});

        }

    }

//==================================================================================
//CARGA COMBOBOX DE ESPECIALIDADES
    private void cargarComboBox() {
        jCBEspecialidad.removeAll();
        jCBEspecialidad.addItem(null);
        List<Especialidad> especialidadesLista = especialidadData.listarEspecialidades();

        for (Especialidad especialidades : especialidadesLista) {

            jCBEspecialidad.addItem(especialidades);
        }
    }

    //Limpia datos de la tabla
    private void cargarTablaVacia() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    private void botonAgregarEspecialidad() {
        try {
            String especialidadTxt = jTextFieldNuevaEspecialidad.getText();

            Especialidad nuevaEspecialidad = new Especialidad(especialidadTxt);

            especialidadData.agregarEspecialidad(nuevaEspecialidad);

            herramientasAgregarEspecialidadInvisible();

            cargarComboBox();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una especialidad para agregar");
        }
    }

    private void herramientasAgregarEspecialidadInvisible() {
        jTextFieldNuevaEspecialidad.setText("");
        jTextFieldNuevaEspecialidad.setVisible(false);
        jButtonAgregarEspecialidad.setVisible(false);
        jButtonNuevaEspecialidad.setVisible(true);
    }
}
   

