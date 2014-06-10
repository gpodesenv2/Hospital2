/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import jpa.EspecialidadeJpaController;
import jpa.SalaJpaController;
import model.Especialidade;
import model.Sala;

/**
 *
 * @author Manoela
 */
public class guiSala extends javax.swing.JInternalFrame {

    /**
     * Creates new form guiSala
     */
    public guiSala() {
        initComponents();
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
        cboSala = new javax.swing.JComboBox();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltsEspecialidade = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        cboEspecialidade = new javax.swing.JComboBox();
        bntAdicionar = new javax.swing.JButton();
        bntGravar = new javax.swing.JButton();
        bntEditar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Sala");
        setToolTipText("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Sala:");

        cboSala.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Pesquisa.jpg"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ltsEspecialidade);

        jLabel2.setText("Especialidade:");

        bntAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Adicionar.jpg"))); // NOI18N
        bntAdicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAdicionarActionPerformed(evt);
            }
        });

        bntGravar.setForeground(new java.awt.Color(153, 153, 153));
        bntGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/GRAVAR1.jpg"))); // NOI18N
        bntGravar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntGravar.setPreferredSize(new java.awt.Dimension(68, 68));
        bntGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGravarActionPerformed(evt);
            }
        });

        bntEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Edita.jpg"))); // NOI18N
        bntEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntEditar.setMaximumSize(new java.awt.Dimension(59, 63));
        bntEditar.setMinimumSize(new java.awt.Dimension(59, 63));
        bntEditar.setPreferredSize(new java.awt.Dimension(68, 68));

        bntCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Cancelar.jpg"))); // NOI18N
        bntCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntCancelar.setPreferredSize(new java.awt.Dimension(68, 68));
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bntAdicionar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bntGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(bntEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboSala, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(cboEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bntAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        //Sala s= (Sala)cboSala.getSelectedItem();
        //ltsEspecialidade.removeAll();
        try {

            List l2 = new SalaJpaController().getSala((String) cboSala.getSelectedItem());
                        
            ltsEspecialidade.setListData(l2.toArray());
            
            if (l2.isEmpty()){
                JOptionPane.showMessageDialog(null, "Não há especialidades cadastradas nesta sala");
            }
//            Sala s = (Sala)new SalaJpaController().getSala((String)cboSala.getSelectedItem());
//            System.out.println("passou");
//            if (s==null) return;

//            List l = new SalaJpaController().getListEspecialidade(s);
//            ltsEspecialidade.setListData(l.toArray());
            //ltsEspecialidade.setListData(SalaJpaController.getLista().toArray());
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não há especialidades cadastradas nesta sala");
            ltsEspecialidade.setModel(new DefaultListModel());            
            return;
        }

        //        try {
            //                    sala = new SalaJpaController().getSala(codSala.getText());
            //
            //                } catch (Exception e) {
            //                    JOptionPane.showMessageDialog(null, "Sala não encontrada");
            //                    return;
            //                }
        //                List l = new SalaJpaController().getListEspecialidade(especialidade);
        //                ltsEspecialidade.setListData(l.toArray());
        //                cboEspecialidade.setSelectedItem(sala.getEspecialidade());

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void bntAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAdicionarActionPerformed

        Sala s = new Sala();
        s.setEspecialidade((Especialidade) cboEspecialidade.getSelectedItem());
        s.setNumero((String) cboSala.getSelectedItem());

        new SalaJpaController().create(s);
        JOptionPane.showMessageDialog(null,"Nova especialidade adicionada a Sala\n" );
        ltsEspecialidade.setModel(new DefaultListModel()); 
        

        //        List l = new SalaJpaController().getListEspecialidade(especialidade);
        //        ltsEspecialidade.setListData(l.toArray());

    }//GEN-LAST:event_bntAdicionarActionPerformed

    private void bntGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGravarActionPerformed
        // TODO add your handling code here:
        Sala s = new Sala();
        s.setEspecialidade((Especialidade) cboEspecialidade.getSelectedItem());
        s.setNumero((String) cboSala.getSelectedItem());
        new SalaJpaController().create(s);

        JOptionPane.showMessageDialog(null,"Especialidade cadastrada na Sala NUMERO: " + s.getNumero());

    }//GEN-LAST:event_bntGravarActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        List l = new EspecialidadeJpaController().findEspecialidadeEntities();
        
        cboEspecialidade.removeAllItems();
        for (int i=0;i<l.size();i++) {
        cboEspecialidade.addItem(l.get(i));
        }
        
        
        
    }//GEN-LAST:event_formInternalFrameActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAdicionar;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton bntGravar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox cboEspecialidade;
    private javax.swing.JComboBox cboSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList ltsEspecialidade;
    // End of variables declaration//GEN-END:variables
}
