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
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectomutual.AccesoDatos.AfiliadoData;
import proyectomutual.AccesoDatos.OrdenData;
import proyectomutual.AccesoDatos.PrestadorData;
import proyectomutual.entidades.Afiliado;
import proyectomutual.entidades.Orden;
public class PanelOrdenes extends javax.swing.JPanel {

    //Setea modelo de tabla
    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };

    //VARIABLES DATA
    private OrdenData ordenData = new OrdenData();
    private AfiliadoData afiliadoData = new AfiliadoData();
    private PrestadorData prestadorData = new PrestadorData();

    public PanelOrdenes() {
        initComponents();
        cargarColumnas();
        cargarTablaOrdenes();
        textFieldsInvisibles();
        botonBuscarXFiltroVisible();
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
        jCheckDNI = new javax.swing.JCheckBox();
        jCheckPrestador = new javax.swing.JCheckBox();
        jCheckFecha = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jTDNIConsulta = new javax.swing.JTextField();
        jTIdPrestador = new javax.swing.JTextField();
        jBLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonBuscarXFiltro = new javax.swing.JButton();
        jDFecha = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(670, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPOrden.setBackground(new java.awt.Color(204, 255, 255));
        jPOrden.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPOrden.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 520, 120));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("CONSULTA ORDEN");
        jPOrden.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jCheckDNI.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jCheckDNI.setForeground(new java.awt.Color(0, 102, 102));
        jCheckDNI.setText("DNI AFILIADO");
        jCheckDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckDNIActionPerformed(evt);
            }
        });
        jPOrden.add(jCheckDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jCheckPrestador.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jCheckPrestador.setForeground(new java.awt.Color(0, 102, 102));
        jCheckPrestador.setText("ID PRESTADOR");
        jCheckPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckPrestadorActionPerformed(evt);
            }
        });
        jPOrden.add(jCheckPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jCheckFecha.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jCheckFecha.setForeground(new java.awt.Color(0, 102, 102));
        jCheckFecha.setText("Fecha");
        jCheckFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckFechaActionPerformed(evt);
            }
        });
        jPOrden.add(jCheckFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Buscar por..");
        jPOrden.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));
        jPOrden.add(jTDNIConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 120, -1));
        jPOrden.add(jTIdPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 120, -1));

        jBLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        jBLimpiar.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 12)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setText("NUEVA BÚSQUEDA");
        jBLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jPOrden.add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));
        jPOrden.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 610, 10));

        jButtonBuscarXFiltro.setBackground(new java.awt.Color(0, 153, 153));
        jButtonBuscarXFiltro.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 11)); // NOI18N
        jButtonBuscarXFiltro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscarXFiltro.setText("Buscar");
        jButtonBuscarXFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarXFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarXFiltroActionPerformed(evt);
            }
        });
        jPOrden.add(jButtonBuscarXFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 120, 30));
        jPOrden.add(jDFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 110, 30));

        add(jPOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 410));
        jPOrden.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        cargarTablaVacia();
        cargarTablaOrdenes();
        limpiarCamposYChecks();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jCheckDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckDNIActionPerformed
        if (jCheckDNI.isSelected()) {
            jTDNIConsulta.setVisible(true);
            jTDNIConsulta.setText("");
        }

        if (jCheckDNI.isSelected() == false) {
            jTDNIConsulta.setVisible(false);
        }
        botonBuscarXFiltroVisible();
    }//GEN-LAST:event_jCheckDNIActionPerformed

    private void jCheckPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckPrestadorActionPerformed
        if (jCheckPrestador.isSelected()) {
            jTIdPrestador.setVisible(true);
            jTIdPrestador.setText("");
        }

        if (jCheckPrestador.isSelected() == false) {
            jTIdPrestador.setVisible(false);
        }
        botonBuscarXFiltroVisible();
    }//GEN-LAST:event_jCheckPrestadorActionPerformed

    private void jCheckFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckFechaActionPerformed
        if (jCheckFecha.isSelected()) {
            jDFecha.setVisible(true);
            jDFecha.setDate(null);
        }

        if (jCheckFecha.isSelected() == false) {
            jDFecha.setVisible(false);
        }
        botonBuscarXFiltroVisible();
    }//GEN-LAST:event_jCheckFechaActionPerformed

    private void jButtonBuscarXFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarXFiltroActionPerformed
        botonBuscarXFiltro();
    }//GEN-LAST:event_jButtonBuscarXFiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jButtonBuscarXFiltro;
    private javax.swing.JCheckBox jCheckDNI;
    private javax.swing.JCheckBox jCheckFecha;
    private javax.swing.JCheckBox jCheckPrestador;
    private com.toedter.calendar.JDateChooser jDFecha;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPOrden;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTConsultaOrden;
    private javax.swing.JTextField jTDNIConsulta;
    private javax.swing.JTextField jTIdPrestador;
    // End of variables declaration//GEN-END:variables

    //MÉTODOS
    //setea nombre de columnas
    private void cargarColumnas() {
        modelo.addColumn("Nro de orden");
        modelo.addColumn("Afiliado");
        modelo.addColumn("Prestador");
        modelo.addColumn("Fecha");
        jTConsultaOrden.setModel(modelo);
    }

    //Cargar tablaOrdenes total
    private void cargarTablaOrdenes() {

        modelo.setRowCount(0);
        List<Orden> listaOrdenes = ordenData.listarOrdenes();

        for (Orden ordenes : listaOrdenes) {

            modelo.addRow(new Object[]{
                ordenes.getIdOrden(), ordenes.getAfiliado().toString(),
                ordenes.getPrestador().toString(), ordenes.getFecha()});

        }
    }

    private void cargarTablaOrdenesXDNI() {

        //Guarda dni en variable
        String dniNum = jTDNIConsulta.getText();
        int dni = Integer.parseInt(dniNum);

        //Llamada a método para buscar el afiliado y obtener el id
        Afiliado afiliadoEncontrado = afiliadoData.buscarAfiliadoPorDni(dni);

        //Guarda id en variable idAFiliado
        int idAfiliado = afiliadoEncontrado.getIdAfiliado();

        modelo.setRowCount(0);
        List<Orden> listaOrdenesXDNI = ordenData.buscaOrdenPorAfil(idAfiliado);

        for (Orden ordenes : listaOrdenesXDNI) {
            modelo.addRow(new Object[]{
                ordenes.getIdOrden(), ordenes.getAfiliado().toString(),
                ordenes.getPrestador().toString(), ordenes.getFecha()
            });
        }
    }

    //Limpia datos de la tabla
    private void cargarTablaVacia() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    private void textFieldsInvisibles() {
        jTDNIConsulta.setVisible(false);
        jTIdPrestador.setVisible(false);
        jDFecha.setVisible(false);
    }

    //Limpiar campos
    private void limpiarCamposYChecks() {
        jTDNIConsulta.setText("");
        jTIdPrestador.setText("");
        jDFecha.setDate(null);

        jCheckDNI.setSelected(false);
        jCheckPrestador.setSelected(false);
        jCheckFecha.setSelected(false);

        jTDNIConsulta.setVisible(false);
        jTIdPrestador.setVisible(false);
        jDFecha.setVisible(false);
    }

    //Carga tabla según filtro seleccionado
    private void cargarTablaSegunFiltro() {
        //Por DNI Afiliado
        if (jCheckDNI.isSelected()) {

            //Guarda dni en variable
            String dniNum = jTDNIConsulta.getText();
            int dni = Integer.parseInt(dniNum);

            //Llamada a método para buscar el afiliado y obtener el id
            Afiliado afiliadoEncontrado = afiliadoData.buscarAfiliadoPorDni(dni);

            //Guarda id en variable idAFiliado
            int idAfiliado = afiliadoEncontrado.getIdAfiliado();

            modelo.setRowCount(0);
            List<Orden> listaOrdenesXDNI = ordenData.buscaOrdenPorAfil(idAfiliado);

            for (Orden ordenes : listaOrdenesXDNI) {
                modelo.addRow(new Object[]{
                    ordenes.getIdOrden(), ordenes.getAfiliado().toString(),
                    ordenes.getPrestador().toString(), ordenes.getFecha()
                });
            }
        }

        //Por idPrestador
        if (jCheckPrestador.isSelected()) {

            String idNum = jTIdPrestador.getText();
            int idPrestador = Integer.parseInt(idNum);

            modelo.setRowCount(0);
            List<Orden> listaOrdenesXPrestador = ordenData.buscaOrdenPorPrestador(idPrestador);

            for (Orden ordenes : listaOrdenesXPrestador) {
                modelo.addRow(new Object[]{
                    ordenes.getIdOrden(), ordenes.getAfiliado().toString(),
                    ordenes.getPrestador().toString(), ordenes.getFecha()
                });
            }
        }

        //Por fecha
        if (jCheckFecha.isSelected()) {
            LocalDate fecha = fromDateToLocalDate(jDFecha.getDate());

            modelo.setRowCount(0);
            List<Orden> listaOrdenesXFecha = ordenData.buscaOrdenPorFecha(fecha);

            for (Orden ordenes : listaOrdenesXFecha) {
                modelo.addRow(new Object[]{
                    ordenes.getIdOrden(), ordenes.getAfiliado().toString(),
                    ordenes.getPrestador().toString(), ordenes.getFecha()
                });
            }

        }

        //Se prueba búsquedas combinadas
        //Combina las 3
        if (jCheckDNI.isSelected() && jCheckPrestador.isSelected() && jCheckFecha.isSelected()) {

            //Guarda variables
            String dniNum = jTDNIConsulta.getText();
            int dni = Integer.parseInt(dniNum);
            String idNum = jTIdPrestador.getText();
            int idPrestador = Integer.parseInt(idNum);
            LocalDate fecha = fromDateToLocalDate(jDFecha.getDate());

            //Llamada a método para buscar el afiliado y obtener el id
            Afiliado afiliadoEncontrado = afiliadoData.buscarAfiliadoPorDni(dni);

            //Guarda id en variable idAFiliado
            int idAfiliado = afiliadoEncontrado.getIdAfiliado();

            modelo.setRowCount(0);
            List<Orden> listaOrdenesXFecha = ordenData.buscaOrdenPorAfiliadoPrestadorYFecha(idAfiliado, idPrestador, fecha);

            for (Orden ordenes : listaOrdenesXFecha) {
                modelo.addRow(new Object[]{
                    ordenes.getIdOrden(), ordenes.getAfiliado().toString(),
                    ordenes.getPrestador().toString(), ordenes.getFecha()
                });
            }

        }

        //Combina Afiliado y prestador
        if (jCheckDNI.isSelected() && jCheckPrestador.isSelected()) {

            //Guarda variables
            String dniNum = jTDNIConsulta.getText();
            int dni = Integer.parseInt(dniNum);
            String idNum = jTIdPrestador.getText();
            int idPrestador = Integer.parseInt(idNum);

            //Llamada a método para buscar el afiliado y obtener el id
            Afiliado afiliadoEncontrado = afiliadoData.buscarAfiliadoPorDni(dni);

            //Guarda id en variable idAFiliado
            int idAfiliado = afiliadoEncontrado.getIdAfiliado();

            modelo.setRowCount(0);
            List<Orden> listaOrdenesXFecha = ordenData.buscaOrdenPorAfiliadoYPrestador(idAfiliado, idPrestador);

            for (Orden ordenes : listaOrdenesXFecha) {
                modelo.addRow(new Object[]{
                    ordenes.getIdOrden(), ordenes.getAfiliado().toString(),
                    ordenes.getPrestador().toString(), ordenes.getFecha()
                });
            }

        }

        //Busca x afiliado y fecha
        if (jCheckDNI.isSelected() && jCheckFecha.isSelected()) {

            //Guarda variables
            String dniNum = jTDNIConsulta.getText();
            int dni = Integer.parseInt(dniNum);
            LocalDate fecha = fromDateToLocalDate(jDFecha.getDate());

            //Llamada a método para buscar el afiliado y obtener el id
            Afiliado afiliadoEncontrado = afiliadoData.buscarAfiliadoPorDni(dni);

            //Guarda id en variable idAFiliado
            int idAfiliado = afiliadoEncontrado.getIdAfiliado();

            modelo.setRowCount(0);
            List<Orden> listaOrdenesXFecha = ordenData.buscaOrdenPorAfiliadoYFecha(idAfiliado, fecha);

            for (Orden ordenes : listaOrdenesXFecha) {
                modelo.addRow(new Object[]{
                    ordenes.getIdOrden(), ordenes.getAfiliado().toString(),
                    ordenes.getPrestador().toString(), ordenes.getFecha()
                });
            }

        }

        //busca x prestador y fecha
        if (jCheckPrestador.isSelected() && jCheckFecha.isSelected()) {

            //Guarda variables
            String idNum = jTIdPrestador.getText();
            int idPrestador = Integer.parseInt(idNum);
            LocalDate fecha = fromDateToLocalDate(jDFecha.getDate());

            modelo.setRowCount(0);
            List<Orden> listaOrdenesXFecha = ordenData.buscaOrdenPorPrestadorYFecha(idPrestador, fecha);

            for (Orden ordenes : listaOrdenesXFecha) {
                modelo.addRow(new Object[]{
                    ordenes.getIdOrden(), ordenes.getAfiliado().toString(),
                    ordenes.getPrestador().toString(), ordenes.getFecha()
                });
            }

        }

    }

    //casteo localDate a date
    public LocalDate fromDateToLocalDate(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    private void botonBuscarXFiltroVisible() {

        if (jCheckDNI.isSelected() || jCheckPrestador.isSelected() || jCheckFecha.isSelected()) {
            jButtonBuscarXFiltro.setVisible(true);
        } else {
            jButtonBuscarXFiltro.setVisible(false);
        }
    }

    //MÉTODOS BOTONES
    private void botonBuscarXFiltro() {
        try {
            cargarTablaVacia();
            cargarTablaSegunFiltro();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un valor númerico en campo DNI o ID Prestador para realizar la búesqueda");
            cargarTablaVacia();
            cargarTablaOrdenes();
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha para buscar");
            cargarTablaVacia();
            cargarTablaOrdenes();
        }
    }
}
