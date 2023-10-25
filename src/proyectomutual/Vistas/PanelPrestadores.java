
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
        cargarListaPxE();
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

        setPreferredSize(new java.awt.Dimension(670, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPPrestador.setBackground(new java.awt.Color(153, 255, 204));
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
        jPPrestador.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jLEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarChica.jpg"))); // NOI18N
        jLEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLEliminarMouseClicked(evt);
            }
        });
        jPPrestador.add(jLEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 50, 50));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Eliminar");
        jPPrestador.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));
        jPPrestador.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MasOrden.png"))); // NOI18N
        jLAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarMouseClicked(evt);
            }
        });
        jPPrestador.add(jLAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 50, 50));

        jBMostrar.setForeground(new java.awt.Color(0, 0, 0));
        jBMostrar.setText("Mostrar");
        jBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarActionPerformed(evt);
            }
        });
        jPPrestador.add(jBMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        add(jPPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 683, 415));
        jPPrestador.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarActionPerformed
      cargarLista();
    
    }//GEN-LAST:event_jBMostrarActionPerformed

    //===================================================================================
    //VOLVER
    private void jLVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVolverMouseClicked
     
        PanelPrestadores prestadorVista = new PanelPrestadores();
        prestadorVista.setSize(670, 410);
        prestadorVista.setLocation(0, 0);
        jPFondo.removeAll();
        jPFondo.add(prestadorVista, BorderLayout.CENTER);
        jPFondo.revalidate();
        jPFondo.repaint();
    }//GEN-LAST:event_jLVolverMouseClicked
 
    //=====================================================================================
    private void jCBEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEspecialidadActionPerformed
  
       cargarComboBox();
    }//GEN-LAST:event_jCBEspecialidadActionPerformed

    //==================================================================================
    //AGREGAR
    
    private void jLAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseClicked
       
    }//GEN-LAST:event_jLAgregarMouseClicked

    //==================================================================================
    //ELIMINAR
    private void jLEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEliminarMouseClicked
        try {
            String especialidadSelec = jLPA.getSelectedValue();
            prestaData.eliminarPrestador(especialidadSelec);

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar para eliminar");
        } catch (NumberFormatException ex2) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }//GEN-LAST:event_jLEliminarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBMostrar;
    private javax.swing.JComboBox<String> jCBEspecialidad;
    private javax.swing.JLabel jLAgregar;
    private javax.swing.JLabel jLEliminar;
    private javax.swing.JList<String> jLPA;
    private javax.swing.JList<String> jLPXE;
    private javax.swing.JLabel jLVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPPrestador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
 
//==================================================================================
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
    private void cargarComboBox(){
         jCBEspecialidad.removeAll();
          ArrayList<Especialidad> especialidadesLista = (ArrayList<Especialidad>) espData.listarEspecialidades();
     
          for(int i=0; i<especialidadesLista.size();i++){
          
              jCBEspecialidad.addItem(especialidadesLista.get(i).getEspecialidad());
          }
    }
    
   //==================================================================================
//CARGA LISTA PRESTADORES x ESP
   
    public void cargarListaPxE() {
        //limpio
        modelo2.removeAllElements();

        //guardo captura combobox
        Especialidad especialidadSelec = (Especialidad) jCBEspecialidad.getSelectedItem();

        //cheque que no sea null
        if (especialidadSelec != null) {

            //creo lista de especialidades
            ArrayList<Especialidad> especialidadesLista = new ArrayList();

            //guardo en lista lo que se selecciona
            especialidadesLista.add(especialidadSelec);

            //creo lista prestadores
            ArrayList<Prestador> prestadorListaPxE = new ArrayList();

            //cheque que no este vacia
            if (prestadorListaPxE != null) {

                //Agrego prestadores
                prestadorListaPxE.add(prestadorNuevo);

                //traigo la especialidad del prestador
                prestadorNuevo.getEspecialidad();
                
                //Agrego especialidad a la lista
                prestadorListaPxE.add(prestadorNuevo);

                //cargo a la vista la lista de prestadores
                modelo2.addElement(prestadorNuevo.toString());
            }   else {
                JOptionPane.showMessageDialog(null, " No hay prestadores con esa especialidad ");
        }
        }else {
                JOptionPane.showMessageDialog(null, " Seleccione un valor de la Lista ");
        }
    }
}
   

