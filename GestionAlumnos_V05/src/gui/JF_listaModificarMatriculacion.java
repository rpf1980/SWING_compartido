/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import dao.alumno.DAOAlumno;
import gui.JF_menuPrincipal;
import javax.swing.JFrame;
import pojo.alumno.Alumno;
import dao.matricula.DAOmatriculas;
import pojo.matricula.Matricula;

/**
 *
 * @author RPF
 */
public class JF_listaModificarMatriculacion extends javax.swing.JFrame
{
    public JF_listaModificarMatriculacion()
    {
        initComponents();
        myInitComponent();
    }

    public void myInitComponent()
    {
        jList1.setModel(new javax.swing.AbstractListModel()
        {          
            DAOmatriculas dao = new DAOmatriculas();           
            String[] strings = dao.recuperaArrayMatriculas();
                      
            public int getSize()
            {
                return strings.length;
            }

            public Object getElementAt(int i)
            {
                return strings[i];
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        idTextDNI = new javax.swing.JTextField();
        idBtnSiguiente = new javax.swing.JButton();
        idBtnCancelar = new javax.swing.JButton();
        idBtnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INGRESE EL DNI DEL ALUMNO PARA MODIFICAR SU MATRÍCULA");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("DNI:");

        idBtnSiguiente.setText("SIGUIENTE");
        idBtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBtnSiguienteActionPerformed(evt);
            }
        });

        idBtnCancelar.setText("CANCEL");
        idBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBtnCancelarActionPerformed(evt);
            }
        });

        idBtnEliminar.setText("ELIMINAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(idBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idBtnEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(idTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(idBtnSiguiente)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idBtnSiguiente)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idBtnCancelar)
                    .addComponent(idBtnEliminar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento btn CANCEL ---> volvemos al menú principal
    private void idBtnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_idBtnCancelarActionPerformed
    {//GEN-HEADEREND:event_idBtnCancelarActionPerformed
        //Pasamos al siguiente Frame
        JFrame panel = new JF_menuPrincipal();
        panel.pack();
        panel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel.setVisible(true);
        
        //Escondemos el Frame en el que estamos
        this.setVisible(false);
    }//GEN-LAST:event_idBtnCancelarActionPerformed

    //SIGUIENTE
    private void idBtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBtnSiguienteActionPerformed
        //******FALTA COMPROBAR DNI NO VACÍO******
        JFrame nextPanel = new JF_datosModificarMatriculacion(idTextDNI.getText().toString());
        nextPanel.pack();
        nextPanel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nextPanel.setVisible(true);

        //Escondemos el panel en el que estamos
        this.setVisible(false);
    }//GEN-LAST:event_idBtnSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(JF_listaModificarMatriculacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(JF_listaModificarMatriculacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(JF_listaModificarMatriculacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(JF_listaModificarMatriculacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new JF_listaModificarMatriculacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton idBtnCancelar;
    private javax.swing.JButton idBtnEliminar;
    private javax.swing.JButton idBtnSiguiente;
    private javax.swing.JTextField idTextDNI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
