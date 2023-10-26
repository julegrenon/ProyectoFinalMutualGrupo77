
package proyectomutual.Vistas;


import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import proyectomutual.AccesoDatos.EspecialidadData;
import proyectomutual.AccesoDatos.PrestadorData;
import static proyectomutual.Vistas.Menu.jPFondo;
import proyectomutual.entidades.Especialidad;
import proyectomutual.entidades.Prestador;

public class PanelPrestadores extends javax.swing.JPanel {

   ArrayList<Especialidad> especialidadesLista = new ArrayList();
   ArrayList<Prestador> prestadorLista = new ArrayList<>();
   DefaultListModel modelo = new DefaultListModel();
   DefaultListModel modelo2 = new DefaultListModel();
   
   
    private PrestadorData prestaData= new PrestadorData();
    private Prestador prestadorNuevo= null;
    
    private EspecialidadData espData= new EspecialidadData();
    private Especialidad especialidadNueva= null;
   
    public PanelPrestadores() {
        initComponents();
        jLPA.setModel(modelo);
        jLPXE.setModel(modelo2);
        cargarComboBox();
      // limpiarList();
      // limpiarList2();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrestador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLPA = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLPXE = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jCBEspecialidad = new javax.swing.JComboBox<>();
        jLVolver = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLEliminar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLAgregar = new javax.swing.JLabel();
        jBMostrar = new javax.swing.JButton();
        jLModificarP = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(670, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPPrestador.setBackground(new java.awt.Color(204, 255, 255));
        jPPrestador.setPreferredSize(new java.awt.Dimension(670, 410));
        jPPrestador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Prestadores activos");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPPrestador.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 310, -1));

        jLPA.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jLPA);

        jPPrestador.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 460, 110));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Prestadores por especialidad");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPPrestador.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 310, -1));

        jLPXE.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jLPXE);

        jPPrestador.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 620, 60));
        jPPrestador.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 58, 620, -1));

        jCBEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        jCBEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEspecialidadActionPerformed(evt);
            }
        });
        jPPrestador.add(jCBEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 460, -1));

        jLVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Retroc.png"))); // NOI18N
        jLVolver.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLVolverMouseClicked(evt);
            }
        });
        jPPrestador.add(jLVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, 50));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("GESTION PRESTADORES");
        jPPrestador.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Agregar");
        jPPrestador.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jLEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jLEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarChica.jpg"))); // NOI18N
        jLEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLEliminarMouseClicked(evt);
            }
        });
        jPPrestador.add(jLEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 50, 50));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Eliminar");
        jPPrestador.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, 20));
        jPPrestador.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MasOrden.png"))); // NOI18N
        jLAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarMouseClicked(evt);
            }
        });
        jPPrestador.add(jLAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 50, 50));

        jBMostrar.setForeground(new java.awt.Color(0, 0, 0));
        jBMostrar.setText("Mostrar");
        jBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarActionPerformed(evt);
            }
        });
        jPPrestador.add(jBMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jLModificarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar chico_1.jpg"))); // NOI18N
        jLModificarP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLModificarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLModificarPMouseClicked(evt);
            }
        });
        jPPrestador.add(jLModificarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 50, 50));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Modificar");
        jPPrestador.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        add(jPPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 683, 415));
        jPPrestador.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarActionPerformed
    cargarLista();
    
    }//GEN-LAST:event_jBMostrarActionPerformed

    //===================================================================================
    //VOLVER
    private void jLVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVolverMouseClicked
        jPFondo.removeAll();
        jPFondo.revalidate();
        jPFondo.repaint();
    }//GEN-LAST:event_jLVolverMouseClicked
    //=====================================================================================
    private void jCBEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEspecialidadActionPerformed
  //  limpiarList2();
    cargarListaPxE();
    }//GEN-LAST:event_jCBEspecialidadActionPerformed
    //==================================================================================
    //AGREGAR
    private void jLAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseClicked
     
        PanelPrestadores prestadorVista = new PanelPrestadores();
        prestadorVista.setSize(670, 410);
        prestadorVista.setLocation(0, 0);
        jPFondo.removeAll();
        jPFondo.add(prestadorVista, BorderLayout.CENTER);
        jPFondo.revalidate();
        jPFondo.repaint();
    }//GEN-LAST:event_jLAgregarMouseClicked

    //==================================================================================
    //ELIMINAR
    private void jLEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEliminarMouseClicked

        eliminaDatoSelec();
       
    }//GEN-LAST:event_jLEliminarMouseClicked

    private void jLModificarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarPMouseClicked
       
       
        
//    private DefaultListModel eliminaDatoSelec() {
//
//        DefaultListModel modelo = (DefaultListModel) jLPA.getModel();
//
//        modelo.remove(jLPA.getSelectedIndex());
//
//        return modelo;
//    }
        
    }//GEN-LAST:event_jLModificarPMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBMostrar;
    private javax.swing.JComboBox<Especialidad> jCBEspecialidad;
    private javax.swing.JLabel jLAgregar;
    private javax.swing.JLabel jLEliminar;
    private javax.swing.JLabel jLModificarP;
    private javax.swing.JList<String> jLPA;
    private javax.swing.JList<String> jLPXE;
    private javax.swing.JLabel jLVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPPrestador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
 
//==================================================================================
//Limpiar lista1
    public DefaultListModel limpiarList(){
    
        DefaultListModel modeloVacio=new DefaultListModel();
        jLPA.setModel(modeloVacio);
       return modeloVacio;
    }
    
   //==================================================================================
//Limpiar lista2
    public DefaultListModel limpiarList2(){
    
        DefaultListModel modeloVacio2=new DefaultListModel();
        jLPXE.setModel(modeloVacio2);
       return modeloVacio2;
    }
//===================================================================================
//CARGA LISTA PRESTADORES

    public void cargarLista() {

        modelo.removeAllElements();
        ArrayList<Prestador> prestadorLista = (ArrayList<Prestador>) prestaData.listarPrestador();
        for (Prestador prestadorNuevo: prestadorLista) {
            modelo.addElement(prestadorNuevo.getEspecialidad().getEspecialidad()+" // "+prestadorNuevo.getNombre()+", "+prestadorNuevo.getApellido());
        }
    }
//==================================================================================
//CARGA COMBOBOX DE ESPECIALIDADES
     public void cargarComboBox() {
        jCBEspecialidad.removeAllItems();

        List<Especialidad> especialidadesLista = espData.listarEspecialidades();

        for (Especialidad especial : especialidadesLista) {
            jCBEspecialidad.addItem(especial);
        }
             
           //otra opcion para recorrer
          // for(int i=0; i<especialidadesLista.size();i++){
          // jCBEspecialidad.addItem((Especialidad) espData.listarEspecialidades());         
    }

 //===============================================================
 //CARGA LISTA PRESTADORES x ESP
       public void cargarListaPxE() {

        try {
            modelo2.removeAllElements();
            Especialidad especialidadSelec = (Especialidad) jCBEspecialidad.getSelectedItem();
            ArrayList<Prestador> prestadorLista = (ArrayList<Prestador>) prestaData.listaPrestadorEspecialidad(especialidadSelec.getIdEspecialidad());

            for (Prestador prestadorNuevo : prestadorLista) {
                    modelo2.addElement(prestadorNuevo.getEspecialidad().getEspecialidad() + " ------------  Dr/a " + prestadorNuevo.getNombre() + ", " + prestadorNuevo.getApellido());
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una especialidad");
        }
       }
   //=================================================
   //ELIMINAR
   
    private DefaultListModel eliminaDatoSelec() {

        DefaultListModel modelo = (DefaultListModel) jLPA.getModel();

        modelo.remove(jLPA.getSelectedIndex());

        return modelo;
    }

 //====================================================
 // MODIFICAR
    public void modificarPrestador(){
    
    Prestador prestadorSeleccionado= new Prestador();
    
 
//    private DefaultListModel modificarDatoSelec() {
//
//        DefaultListModel modelo = (DefaultListModel) jLPA.getModel();
//
//        
//        modelo.remove(jLPA.getSelectedIndex());
//
//        return modelo;
//    }
    
 //====================================================
 // METODO CARGAR CON DIALOGO
//    public void cargarListaPxE() {
//
//        modelo2.removeAllElements();
//        Especialidad especialidadSelec = (Especialidad) jCBEspecialidad.getSelectedItem();
//        ArrayList<Prestador> prestadorLista = (ArrayList<Prestador>) prestaData.listaPrestadorEspecialidad(especialidadSelec.getIdEspecialidad());
//        for (Prestador prestadorNuevo : prestadorLista) {
//            if (especialidadSelec != null) {
//                if (especialidadSelec.equals(prestadorLista)) {
//
//                    modelo2.addElement(prestadorNuevo.getEspecialidad().getEspecialidad() + " ------------  Dr/a " + prestadorNuevo.getNombre() + ", " + prestadorNuevo.getApellido());
//                } else {
//                    JOptionPane.showMessageDialog(jPPrestador, "No hay prestadores con esa especialidad");
//                }
//                JOptionPane.showMessageDialog(null, "Debe seleccionar una especialidad");
//            }
//======================================================                        
       }

}
       
