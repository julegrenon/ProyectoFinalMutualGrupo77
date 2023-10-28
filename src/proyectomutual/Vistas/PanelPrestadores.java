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

public class PanelPrestadores extends javax.swing.JPanel {

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

    private PrestadorData prestadorData = new PrestadorData();
    private Prestador prestadorNuevo = null;

    private EspecialidadData especialidadData = new EspecialidadData();
    private Especialidad especialidadNueva = null;

    public PanelPrestadores() {
        initComponents();
        cargarColumnas();
        cargarComboBox();
        cargarTablaPrestadores();
        herramientasAgregarEspecialidadInvisible();
        jBMostrarTodosLosPrestadores.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrestador = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jCBEspecialidad = new javax.swing.JComboBox<>();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAgregar = new javax.swing.JLabel();
        jLEliminar = new javax.swing.JLabel();
        jLabelEliminar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLAgregar = new javax.swing.JLabel();
        jBMostrarTodosLosPrestadores = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePrestadores = new javax.swing.JTable();
        jLabelFiltrar = new javax.swing.JLabel();
        jButtonNuevaEspecialidad = new javax.swing.JButton();
        jTextFieldNuevaEspecialidad = new javax.swing.JTextField();
        jButtonAgregarEspecialidad = new javax.swing.JButton();
        jLPrestadorModificar = new javax.swing.JLabel();
        jLabelModificar = new javax.swing.JLabel();
        jBCancelarNuevaEspecialidad = new javax.swing.JButton();
        jLabelIngreseEspecialidad = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(670, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPPrestador.setBackground(new java.awt.Color(204, 255, 255));
        jPPrestador.setMinimumSize(new java.awt.Dimension(670, 410));
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

        jLabelTitulo.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 102, 102));
        jLabelTitulo.setText("GESTIÓN PRESTADORES");
        jPPrestador.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabelAgregar.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabelAgregar.setForeground(new java.awt.Color(0, 102, 102));
        jLabelAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregar.setText("Agregar");
        jPPrestador.add(jLabelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jLEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarChica.jpg"))); // NOI18N
        jLEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLEliminarMouseClicked(evt);
            }
        });
        jPPrestador.add(jLEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 50, 50));

        jLabelEliminar.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabelEliminar.setForeground(new java.awt.Color(0, 102, 102));
        jLabelEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEliminar.setText("Eliminar");
        jPPrestador.add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 70, -1));
        jPPrestador.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MasOrden.png"))); // NOI18N
        jLAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarMouseClicked(evt);
            }
        });
        jPPrestador.add(jLAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 50, 50));

        jBMostrarTodosLosPrestadores.setBackground(new java.awt.Color(0, 153, 153));
        jBMostrarTodosLosPrestadores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBMostrarTodosLosPrestadores.setForeground(new java.awt.Color(255, 255, 255));
        jBMostrarTodosLosPrestadores.setText("VER TODOS");
        jBMostrarTodosLosPrestadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabelFiltrar.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 11)); // NOI18N
        jLabelFiltrar.setForeground(new java.awt.Color(0, 102, 102));
        jLabelFiltrar.setText("FILTRAR POR ESPECIALIDAD:");
        jPPrestador.add(jLabelFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jButtonNuevaEspecialidad.setBackground(new java.awt.Color(0, 153, 153));
        jButtonNuevaEspecialidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNuevaEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevaEspecialidad.setText("NUEVA ESPECIALIDAD");
        jButtonNuevaEspecialidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNuevaEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaEspecialidadActionPerformed(evt);
            }
        });
        jPPrestador.add(jButtonNuevaEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 180, -1));
        jPPrestador.add(jTextFieldNuevaEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 180, -1));

        jButtonAgregarEspecialidad.setBackground(new java.awt.Color(0, 153, 153));
        jButtonAgregarEspecialidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAgregarEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregarEspecialidad.setText("AGREGAR");
        jButtonAgregarEspecialidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgregarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarEspecialidadActionPerformed(evt);
            }
        });
        jPPrestador.add(jButtonAgregarEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLPrestadorModificar.setBackground(new java.awt.Color(153, 255, 204));
        jLPrestadorModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar chico_1.jpg"))); // NOI18N
        jLPrestadorModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLPrestadorModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLPrestadorModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPrestadorModificarMouseClicked(evt);
            }
        });
        jPPrestador.add(jLPrestadorModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, 50));

        jLabelModificar.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabelModificar.setForeground(new java.awt.Color(0, 102, 102));
        jLabelModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelModificar.setText("Modificar");
        jPPrestador.add(jLabelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 70, -1));

        jBCancelarNuevaEspecialidad.setBackground(new java.awt.Color(0, 153, 153));
        jBCancelarNuevaEspecialidad.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 11)); // NOI18N
        jBCancelarNuevaEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        jBCancelarNuevaEspecialidad.setText("CANCELAR");
        jBCancelarNuevaEspecialidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCancelarNuevaEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarNuevaEspecialidadActionPerformed(evt);
            }
        });
        jPPrestador.add(jBCancelarNuevaEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 90, -1));

        jLabelIngreseEspecialidad.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 11)); // NOI18N
        jLabelIngreseEspecialidad.setForeground(new java.awt.Color(0, 102, 102));
        jLabelIngreseEspecialidad.setText("INGRESE UNA ESPECIALIDAD:");
        jPPrestador.add(jLabelIngreseEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 160, -1));

        add(jPPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 410));
        jPPrestador.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jBMostrarTodosLosPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarTodosLosPrestadoresActionPerformed
        botonMostrarTodosLosPrestadores();
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
        botonEliminarPrestador();
    }//GEN-LAST:event_jLEliminarMouseClicked

    private void jButtonNuevaEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaEspecialidadActionPerformed
        botonNuevaEspecialidad();
    }//GEN-LAST:event_jButtonNuevaEspecialidadActionPerformed

    private void jButtonAgregarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarEspecialidadActionPerformed
        botonAgregarEspecialidad();
        herramientasAgregarEspecialidadInvisible();
        cargarTablaVacia();
        cargarTablaPrestadores();
        cargarComboBox();
    }//GEN-LAST:event_jButtonAgregarEspecialidadActionPerformed

    private void jPPrestadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPrestadorMouseClicked
        herramientasAgregarEspecialidadInvisible();
    }//GEN-LAST:event_jPPrestadorMouseClicked

    private void jLPrestadorModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPrestadorModificarMouseClicked
        botonModificarPrestador();
    }//GEN-LAST:event_jLPrestadorModificarMouseClicked

    private void jTablePrestadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrestadoresMouseClicked
        herramientasAgregarEspecialidadInvisible();
    }//GEN-LAST:event_jTablePrestadoresMouseClicked

    private void jBCancelarNuevaEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarNuevaEspecialidadActionPerformed
        herramientasAgregarEspecialidadInvisible();
    }//GEN-LAST:event_jBCancelarNuevaEspecialidadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelarNuevaEspecialidad;
    private javax.swing.JButton jBMostrarTodosLosPrestadores;
    private javax.swing.JButton jButtonAgregarEspecialidad;
    private javax.swing.JButton jButtonNuevaEspecialidad;
    private javax.swing.JComboBox<Especialidad> jCBEspecialidad;
    private javax.swing.JLabel jLAgregar;
    private javax.swing.JLabel jLEliminar;
    private javax.swing.JLabel jLPrestadorModificar;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelFiltrar;
    private javax.swing.JLabel jLabelIngreseEspecialidad;
    private javax.swing.JLabel jLabelModificar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPPrestador;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablePrestadores;
    private javax.swing.JTextField jTextFieldNuevaEspecialidad;
    // End of variables declaration//GEN-END:variables

//==================================================================================
    //Setea nombre de columnas
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

//MÉTODOS TABLAS
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
        try {
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
            jBMostrarTodosLosPrestadores.setVisible(true);
        } catch (NullPointerException ex) {
            cargarTablaVacia();
            cargarTablaPrestadores();
            jBMostrarTodosLosPrestadores.setVisible(false);
        }
    }

    //Limpia datos de la tabla
    private void cargarTablaVacia() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

//==================================================================================
//MÉTODOS COMBOBOX
    private void cargarComboBox() {
        jCBEspecialidad.removeAll();
        jCBEspecialidad.addItem(null);
        List<Especialidad> especialidadesLista = especialidadData.listarEspecialidades();

        for (Especialidad especialidades : especialidadesLista) {

            jCBEspecialidad.addItem(especialidades);
        }
    }

    private void limpiarComboBox() {
        while (jCBEspecialidad.getItemCount() > 0) {
            jCBEspecialidad.removeAllItems();
        }
    }

    private void herramientasAgregarEspecialidadInvisible() {
        jTextFieldNuevaEspecialidad.setText("");
        jTextFieldNuevaEspecialidad.setVisible(false);
        jButtonAgregarEspecialidad.setVisible(false);
        jBCancelarNuevaEspecialidad.setVisible(false);
        jLabelIngreseEspecialidad.setVisible(false);
        jButtonNuevaEspecialidad.setVisible(true);
    }

    //METODOS BOTONES
    private void botonModificarPrestador() {

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
    }

    private void botonEliminarPrestador() {
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
    }

    private void botonAgregarEspecialidad() {
        try {
            String especialidadTxt = jTextFieldNuevaEspecialidad.getText();

            Especialidad nuevaEspecialidad = new Especialidad(especialidadTxt);

            especialidadData.agregarEspecialidad(nuevaEspecialidad);

            herramientasAgregarEspecialidadInvisible();

            jCBEspecialidad.setSelectedIndex(0);
            limpiarComboBox();
            cargarComboBox();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una especialidad para agregar");
        }
    }

    private void botonNuevaEspecialidad() {
        jTextFieldNuevaEspecialidad.setVisible(true);
        jButtonAgregarEspecialidad.setVisible(true);
        jBCancelarNuevaEspecialidad.setVisible(true);
        jLabelIngreseEspecialidad.setVisible(true);
        jButtonNuevaEspecialidad.setVisible(false);
    }

    private void botonMostrarTodosLosPrestadores() {
        cargarTablaVacia();
        cargarTablaPrestadores();
        //herramientasAgregarEspecialidadInvisible();
        jBMostrarTodosLosPrestadores.setVisible(false);
        jCBEspecialidad.setSelectedIndex(0);
    }
}
   

