/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomutual.Vistas;


import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectomutual.AccesoDatos.AfiliadoData;
import static proyectomutual.Vistas.Menu.jPFondo;
import proyectomutual.entidades.Afiliado;


public class PanelAfiliados extends javax.swing.JPanel {

    //Setea modelo de tabla
    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            if (c >= 1 && c <= 5) {
                return true;
            }
            return false;
        }
    };

    //Variables data
    private AfiliadoData afiliadoData = new AfiliadoData();

    //Variables para enviar a newOrden
    public static String afiliadoStringParaOrden = "";
    public static Afiliado afiliadoParaNewOrden;

    //constructor
    public PanelAfiliados() {
        initComponents();
        cargarColumnas();
        cargarTablaAfiliados();
        escribirTextFieldDNI();
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
        jTdni = new javax.swing.JTextField();
        jLAfiliadoBuscar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLAfiliadoEliminar = new javax.swing.JLabel();
        jBAfiliadoOrden = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLAfiliadoNuevo = new javax.swing.JLabel();
        jLAfiliadoModificar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAfiliado = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 255, 204));
        setMinimumSize(new java.awt.Dimension(670, 410));
        setPreferredSize(new java.awt.Dimension(670, 410));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Buscar por DNI");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jTdni.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTdni.setForeground(new java.awt.Color(204, 204, 204));
        jTdni.setText("Ingrese un DNI");
        jTdni.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTdni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTdniMouseClicked(evt);
            }
        });
        add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 150, -1));

        jLAfiliadoBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jLAfiliadoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarChica_1.jpg"))); // NOI18N
        jLAfiliadoBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLAfiliadoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAfiliadoBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAfiliadoBuscarMouseClicked(evt);
            }
        });
        add(jLAfiliadoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 50, 50));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Nuevo afiliado");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLAfiliadoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarChica.jpg"))); // NOI18N
        jLAfiliadoEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLAfiliadoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAfiliadoEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAfiliadoEliminarMouseClicked(evt);
            }
        });
        add(jLAfiliadoEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, 50));

        jBAfiliadoOrden.setBackground(new java.awt.Color(0, 153, 153));
        jBAfiliadoOrden.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 12)); // NOI18N
        jBAfiliadoOrden.setForeground(new java.awt.Color(255, 255, 255));
        jBAfiliadoOrden.setText("SACAR ORDEN");
        jBAfiliadoOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAfiliadoOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAfiliadoOrdenMouseClicked(evt);
            }
        });
        add(jBAfiliadoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 613, 13));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Modificar");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Eliminar");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        jLAfiliadoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarMas chica.jpg"))); // NOI18N
        jLAfiliadoNuevo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLAfiliadoNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAfiliadoNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAfiliadoNuevoMouseClicked(evt);
            }
        });
        add(jLAfiliadoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 50, 50));

        jLAfiliadoModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar chico_1.jpg"))); // NOI18N
        jLAfiliadoModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLAfiliadoModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAfiliadoModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAfiliadoModificarMouseClicked(evt);
            }
        });
        add(jLAfiliadoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 50, 50));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("GESTIÓN AFILIADO");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jTAfiliado.setModel(new javax.swing.table.DefaultTableModel(
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
        jTAfiliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAfiliadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTAfiliado);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 493, 120));
    }// </editor-fold>//GEN-END:initComponents


    private void jLAfiliadoNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAfiliadoNuevoMouseClicked
        //Istancia clase panel 
        PanelNewAfiliado nuevoAfiliadoVista = new PanelNewAfiliado();

        //Setea dimensiones y location
        nuevoAfiliadoVista.setSize(670, 410);
        nuevoAfiliadoVista.setLocation(0, 0);

        //Remueve y agrega la vista del panel instanciada
        jPFondo.removeAll();
        jPFondo.add(nuevoAfiliadoVista, BorderLayout.CENTER);

        jPFondo.revalidate();
        jPFondo.repaint();

    }//GEN-LAST:event_jLAfiliadoNuevoMouseClicked

    private void jLAfiliadoBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAfiliadoBuscarMouseClicked
        try {
            cargarTablaVacia();

            String dni = jTdni.getText();
            int dniNum = Integer.parseInt(dni);

            cargarTablaAfiliadosXDNI(dniNum);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un DNI para buscar");
        } catch (NumberFormatException ex2) {
            JOptionPane.showMessageDialog(null, "DNI sólo admite números");
        }
    }//GEN-LAST:event_jLAfiliadoBuscarMouseClicked

    private void jLAfiliadoModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAfiliadoModificarMouseClicked

        try {
            //Crea variable para guardar la fila seleccionada
            int filaSeleccionada = jTAfiliado.getSelectedRow();

            //Setea datos desde la tabla
            int id = (Integer) jTAfiliado.getValueAt(filaSeleccionada, 0);
            String nombre = (String) jTAfiliado.getValueAt(filaSeleccionada, 1);
            String apellido = (String) jTAfiliado.getValueAt(filaSeleccionada, 2);
            int dni = (Integer) jTAfiliado.getValueAt(filaSeleccionada, 3);
            int telefono = (Integer) jTAfiliado.getValueAt(filaSeleccionada, 4);
            String domicilio = (String) jTAfiliado.getValueAt(filaSeleccionada, 5);

            //Busca afiliado a través de método
            Afiliado afiliadoSeleccionado = afiliadoData.buscarAfiliado(id);

            //Setea estado
            boolean estado = afiliadoSeleccionado.isEstado();

            //Instancia objeto final de alumno a modificar
            Afiliado afiliadoModif = new Afiliado(id, nombre, apellido, dni, telefono, domicilio, estado);

            //Llamada a método modificar
            afiliadoData.modificarAfiliado(afiliadoModif);

            //Refresh de tabla
            cargarTablaVacia();
            cargarTablaAfiliados();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacíos");
        } catch (NumberFormatException ex2) {
            JOptionPane.showMessageDialog(null, "Formato incorrecto. Complete los campos con los caracteres correctos");
        } catch (ArrayIndexOutOfBoundsException ex3) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un afiliado para editar");
        }
    }//GEN-LAST:event_jLAfiliadoModificarMouseClicked

    private void jLAfiliadoEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAfiliadoEliminarMouseClicked
        try {
            //Crea variable para guardar la fila seleccionada
            int filaSeleccionada = jTAfiliado.getSelectedRow();

            //Setea datos desde la tabla
            int id = (Integer) jTAfiliado.getValueAt(filaSeleccionada, 0);

            //Llamada a método modificar
            afiliadoData.eliminarAfiliado(id);

            //Refresh de tablas
            cargarTablaVacia();
            cargarTablaAfiliados();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No hay ninguna selección para eliminar");
        } catch (NumberFormatException ex2) {
            JOptionPane.showMessageDialog(null, "ERROR");
        } catch (ArrayIndexOutOfBoundsException ex3) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un afiliado para eliminar");
        }
    }//GEN-LAST:event_jLAfiliadoEliminarMouseClicked

    private void jBAfiliadoOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAfiliadoOrdenMouseClicked
        
        try {
            //Crea variable para guardar la fila seleccionada
            int filaSeleccionada = jTAfiliado.getSelectedRow();

            //Setea datos desde la tabla
            int id = (Integer) jTAfiliado.getValueAt(filaSeleccionada, 0);

            //Busca afiliado a través de método
            Afiliado afiliadoSeleccionado = afiliadoData.buscarAfiliado(id);

            //Setea para nueva orden
            afiliadoStringParaOrden = afiliadoSeleccionado.toString();
            afiliadoParaNewOrden = afiliadoSeleccionado;

            //Istancia clase panel 
            PanelNewOrden nuevaOrden = new PanelNewOrden();

            //Setea dimensiones y location
            nuevaOrden.setSize(670, 410);
            nuevaOrden.setLocation(0, 0);

            //Remueve y agrega la vista del panel instanciada
            jPFondo.removeAll();
            jPFondo.add(nuevaOrden, BorderLayout.CENTER);

            jPFondo.revalidate();
            jPFondo.repaint();
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un afiliado para cargar una orden");
        }
    }//GEN-LAST:event_jBAfiliadoOrdenMouseClicked

    private void jTdniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTdniMouseClicked
        seleccionarTextoTextFieldDNI();
    }//GEN-LAST:event_jTdniMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (jTdni.getText().equals("")) {
            cargarTablaVacia();
            cargarTablaAfiliados();
            escribirTextFieldDNI();
        } 
    }//GEN-LAST:event_formMouseClicked

    private void jTAfiliadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAfiliadoMouseClicked
        escribirTextFieldDNI();
    }//GEN-LAST:event_jTAfiliadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAfiliadoOrden;
    private javax.swing.JLabel jLAfiliadoBuscar;
    private javax.swing.JLabel jLAfiliadoEliminar;
    private javax.swing.JLabel jLAfiliadoModificar;
    private javax.swing.JLabel jLAfiliadoNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTAfiliado;
    private javax.swing.JTextField jTdni;
    // End of variables declaration//GEN-END:variables

//MÉTODOS
    //setea nombre de columnas
    private void cargarColumnas() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Domicilio");
        jTAfiliado.setModel(modelo);
    }

    //Cargar tablaAfiliados
    private void cargarTablaAfiliados() {

        modelo.setRowCount(0);
        List<Afiliado> listaAfiliados = afiliadoData.listarAfiliados();

        for (Afiliado afiliados : listaAfiliados) {

            modelo.addRow(new Object[]{
                afiliados.getIdAfiliado(), afiliados.getNombre(), afiliados.getApellido(),
                afiliados.getDni(), afiliados.getTelefono(), afiliados.getDomicilio()
            });

        }
    }

    //Carga tabla de afiliado segun DNI
    private void cargarTablaAfiliadosXDNI(int DNI) {

        modelo.setRowCount(0);
        Afiliado afiliadoXDNI = afiliadoData.buscarAfiliadoPorDni(DNI);

        if (afiliadoXDNI != null) {

            modelo.addRow(new Object[]{
                afiliadoXDNI.getIdAfiliado(), afiliadoXDNI.getNombre(), afiliadoXDNI.getApellido(),
                afiliadoXDNI.getDni(), afiliadoXDNI.getTelefono(), afiliadoXDNI.getDomicilio()
            });
        }
    }

    //Limpia datos de la tabla
    private void cargarTablaVacia() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    
    //Completa textField de buscarXDNI cuando está vacío
    private void escribirTextFieldDNI() {
        if (jTdni.getText().equals("")) {
            jTdni.setText("Ingrese un DNI");
            jTdni.setForeground(Color.gray);
        }
    }
    
    private void seleccionarTextoTextFieldDNI() {
        jTdni.setSelectionStart(0);
        jTdni.setSelectionEnd(100);

       jTdni.setForeground(Color.black);
    }
}
