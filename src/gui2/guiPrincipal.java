/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;

//import java.awt.Component;
import gui2.guiAgendamento;
import gui2.guiEspecialidade;
import gui2.guiProfissional;
import gui2.guiPaciente;
import gui2.guiSala;
import javax.swing.JDesktopPane;
import model.ImagemFundo;

//import static java.awt.Frame.MAXIMIZED_BOTH;
/**
 *
 * @author Manoela
 */
public class guiPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form guiPrincipal
     */
    public guiPrincipal() {
        initComponents();
        desktopPane.setBorder(new ImagemFundo());
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("Hospital Macaé");
        //setLocationRelativeTo(null);
        //setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        itemEspecialidade = new javax.swing.JMenuItem();
        itemProfissional = new javax.swing.JMenuItem();
        itemPaciente = new javax.swing.JMenuItem();
        itemSala = new javax.swing.JMenuItem();
        itemMotivoAlta = new javax.swing.JMenuItem();
        itemMedicamento = new javax.swing.JMenuItem();
        itemMaterial = new javax.swing.JMenuItem();
        itemProcedimento = new javax.swing.JMenuItem();
        itemCID = new javax.swing.JMenuItem();
        itemLocal = new javax.swing.JMenuItem();
        itemLeito = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemBairro = new javax.swing.JMenuItem();
        itemCidade = new javax.swing.JMenuItem();
        itemEstado = new javax.swing.JMenuItem();
        menuAtividades = new javax.swing.JMenu();
        itemInternacao = new javax.swing.JMenuItem();
        itemAlta = new javax.swing.JMenuItem();
        itemAgendamento = new javax.swing.JMenuItem();
        itemMediCirurgia = new javax.swing.JMenuItem();
        itemEvolucao = new javax.swing.JMenuItem();
        itemPrescricao = new javax.swing.JMenuItem();
        itemProntuarioVirtual = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        itemRelatorio3 = new javax.swing.JMenuItem();
        itemRelatorio = new javax.swing.JMenuItem();
        itemRelatorio2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        qtdMaterial = new javax.swing.JMenuItem();
        qtdMedicamento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuCadastros.setText("Gerenciamento");

        itemEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Especialidade.jpg"))); // NOI18N
        itemEspecialidade.setText("Gerenciar Especialidade");
        itemEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEspecialidadeActionPerformed(evt);
            }
        });
        menuCadastros.add(itemEspecialidade);

        itemProfissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Médico1.jpg"))); // NOI18N
        itemProfissional.setText("Gerenciar Profissional");
        itemProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProfissionalActionPerformed(evt);
            }
        });
        menuCadastros.add(itemProfissional);

        itemPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Paciente+.jpg"))); // NOI18N
        itemPaciente.setText("Gerenciar Paciente");
        itemPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPacienteActionPerformed(evt);
            }
        });
        menuCadastros.add(itemPaciente);

        itemSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Sala Cirurgica.jpg"))); // NOI18N
        itemSala.setText("Gerenciar Sala");
        itemSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalaActionPerformed(evt);
            }
        });
        menuCadastros.add(itemSala);

        itemMotivoAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Alta.jpg"))); // NOI18N
        itemMotivoAlta.setText("Gerenciar Motivo da Alta");
        itemMotivoAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMotivoAltaActionPerformed(evt);
            }
        });
        menuCadastros.add(itemMotivoAlta);

        itemMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Medicamentos1.jpg"))); // NOI18N
        itemMedicamento.setText("Gerenciar Medicamentos");
        itemMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMedicamentoActionPerformed(evt);
            }
        });
        menuCadastros.add(itemMedicamento);

        itemMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Material1.jpg"))); // NOI18N
        itemMaterial.setText("Gerenciar Materiais");
        itemMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMaterialActionPerformed(evt);
            }
        });
        menuCadastros.add(itemMaterial);

        itemProcedimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Procedimentos.jpg"))); // NOI18N
        itemProcedimento.setText("Gerenciar Procedimento");
        itemProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProcedimentoActionPerformed(evt);
            }
        });
        menuCadastros.add(itemProcedimento);

        itemCID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/CID.jpg"))); // NOI18N
        itemCID.setText("Gerenciar CID");
        itemCID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCIDActionPerformed(evt);
            }
        });
        menuCadastros.add(itemCID);

        itemLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Local.jpg"))); // NOI18N
        itemLocal.setText("Gerenciar Localização");
        itemLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLocalActionPerformed(evt);
            }
        });
        menuCadastros.add(itemLocal);

        itemLeito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Leito.jpg"))); // NOI18N
        itemLeito.setText("Gerenciar Leito");
        itemLeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLeitoActionPerformed(evt);
            }
        });
        menuCadastros.add(itemLeito);

        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        menuCadastros.add(itemSair);

        jMenuBar1.add(menuCadastros);

        jMenu1.setText("Cadastro");

        itemBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Bairro.jpg"))); // NOI18N
        itemBairro.setText("Cadastro Bairro");
        itemBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBairroActionPerformed(evt);
            }
        });
        jMenu1.add(itemBairro);

        itemCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Cidade1.jpg"))); // NOI18N
        itemCidade.setText("Cadastro Cidade");
        itemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCidadeActionPerformed(evt);
            }
        });
        jMenu1.add(itemCidade);

        itemEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Estado1.jpg"))); // NOI18N
        itemEstado.setText("Cadastro Estado");
        itemEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEstadoActionPerformed(evt);
            }
        });
        jMenu1.add(itemEstado);

        jMenuBar1.add(jMenu1);

        menuAtividades.setText("Atividades");

        itemInternacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Internação.jpg"))); // NOI18N
        itemInternacao.setText("Internação");
        itemInternacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInternacaoActionPerformed(evt);
            }
        });
        menuAtividades.add(itemInternacao);

        itemAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Alta.jpg"))); // NOI18N
        itemAlta.setText("Alta");
        itemAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAltaActionPerformed(evt);
            }
        });
        menuAtividades.add(itemAlta);

        itemAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Agendamento.jpg"))); // NOI18N
        itemAgendamento.setText("Agendar Cirurgia");
        itemAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgendamentoActionPerformed(evt);
            }
        });
        menuAtividades.add(itemAgendamento);

        itemMediCirurgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Medicamento2.jpg"))); // NOI18N
        itemMediCirurgia.setText("Adicionar Medicamento/cirurgia");
        itemMediCirurgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMediCirurgiaActionPerformed(evt);
            }
        });
        menuAtividades.add(itemMediCirurgia);

        itemEvolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Evolução1.jpg"))); // NOI18N
        itemEvolucao.setText("Evolução de Paciente");
        itemEvolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEvolucaoActionPerformed(evt);
            }
        });
        menuAtividades.add(itemEvolucao);

        itemPrescricao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Prescrição.jpg"))); // NOI18N
        itemPrescricao.setText("Prescrição Medica de Paciente");
        itemPrescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPrescricaoActionPerformed(evt);
            }
        });
        menuAtividades.add(itemPrescricao);

        itemProntuarioVirtual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Prontuário Virtual.jpg"))); // NOI18N
        itemProntuarioVirtual.setText("Prontuário Virtual");
        itemProntuarioVirtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProntuarioVirtualActionPerformed(evt);
            }
        });
        menuAtividades.add(itemProntuarioVirtual);

        jMenuItem2.setText("Adicionar Material/Cirugia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuAtividades.add(jMenuItem2);

        jMenuBar1.add(menuAtividades);

        menuRelatorio.setText("Relatórios");

        itemRelatorio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Relatório.jpg"))); // NOI18N
        itemRelatorio3.setText("Cirurgias");
        itemRelatorio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRelatorio3ActionPerformed(evt);
            }
        });
        menuRelatorio.add(itemRelatorio3);

        itemRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Relatório2.jpg"))); // NOI18N
        itemRelatorio.setText("Cirurgias/data");
        itemRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRelatorioActionPerformed(evt);
            }
        });
        menuRelatorio.add(itemRelatorio);

        itemRelatorio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Relatório3.jpg"))); // NOI18N
        itemRelatorio2.setText("Cirurgias/especialidade");
        itemRelatorio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRelatorio2ActionPerformed(evt);
            }
        });
        menuRelatorio.add(itemRelatorio2);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Relatório4.jpg"))); // NOI18N
        jMenuItem1.setText("Internação/Período");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuRelatorio.add(jMenuItem1);

        qtdMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Relatório5.jpg"))); // NOI18N
        qtdMaterial.setText("Qtd. Material");
        qtdMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdMaterialActionPerformed(evt);
            }
        });
        menuRelatorio.add(qtdMaterial);

        qtdMedicamento.setText("Qtd. Medicamento");
        qtdMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdMedicamentoActionPerformed(evt);
            }
        });
        menuRelatorio.add(qtdMedicamento);

        jMenuBar1.add(menuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPacienteActionPerformed
        // TODO add your handling code here:
        guiPaciente g;
        g = new guiPaciente();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemPacienteActionPerformed

    private void itemEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEspecialidadeActionPerformed
        // TODO add your handling code here:
        guiEspecialidade g = new guiEspecialidade();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemEspecialidadeActionPerformed

    private void itemProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProfissionalActionPerformed
        // TODO add your handling code here:
        guiProfissional g = new guiProfissional();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemProfissionalActionPerformed

    private void itemSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalaActionPerformed
        // TODO add your handling code here:
        guiSala g = new guiSala();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemSalaActionPerformed

    private void itemAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgendamentoActionPerformed
        // TODO add your handling code here:
        guiAgendamento g = new guiAgendamento();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemAgendamentoActionPerformed

    private void itemRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRelatorioActionPerformed
        // TODO add your handling code here:
        guiRelatorio g = new guiRelatorio();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemRelatorioActionPerformed

    private void itemBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBairroActionPerformed
        // TODO add your handling code here:
        guiBairro g = new guiBairro();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemBairroActionPerformed

    private void itemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCidadeActionPerformed
        // TODO add your handling code here:
        guiCidade g = new guiCidade();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemCidadeActionPerformed

    private void itemEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEstadoActionPerformed
        // TODO add your handling code here:
        guiEstado g = new guiEstado();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemEstadoActionPerformed

    private void itemMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMedicamentoActionPerformed
        // TODO add your handling code here:
        guiMedicamento g = new guiMedicamento();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemMedicamentoActionPerformed

    private void itemProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProcedimentoActionPerformed
        // TODO add your handling code here:
        guiProcedimento g = new guiProcedimento();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemProcedimentoActionPerformed

    private void itemMotivoAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMotivoAltaActionPerformed
        // TODO add your handling code here:
        guiMotivoAlta g = new guiMotivoAlta();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemMotivoAltaActionPerformed

    private void itemLeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLeitoActionPerformed
        // TODO add your handling code here:
        guiLeito g = new guiLeito();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemLeitoActionPerformed

    private void itemCIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCIDActionPerformed
        // TODO add your handling code here:
        guiCID g = new guiCID();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemCIDActionPerformed

    private void itemMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMaterialActionPerformed
        // TODO add your handling code here:
        guiMaterial g = new guiMaterial();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemMaterialActionPerformed

    private void itemInternacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInternacaoActionPerformed
        // TODO add your handling code here:
        guiInternacao g = new guiInternacao();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemInternacaoActionPerformed

    private void itemRelatorio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRelatorio2ActionPerformed
        // TODO add your handling code here:
        guiRelatorio2 g = new guiRelatorio2();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemRelatorio2ActionPerformed

    private void itemRelatorio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRelatorio3ActionPerformed
        // TODO add your handling code here:
        guiRelatorio3 g = new guiRelatorio3();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemRelatorio3ActionPerformed

    private void itemLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLocalActionPerformed
        // TODO add your handling code here:
        guiLocalizacao g = new guiLocalizacao();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemLocalActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        guiRelatorio4 g = new guiRelatorio4();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void qtdMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdMaterialActionPerformed
        // TODO add your handling code here:
        guiRelatorioMaterial g = new guiRelatorioMaterial();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_qtdMaterialActionPerformed

    private void qtdMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdMedicamentoActionPerformed
        // TODO add your handling code here:
        guiRelatorioMedicamento g = new guiRelatorioMedicamento();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_qtdMedicamentoActionPerformed

    private void itemMediCirurgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMediCirurgiaActionPerformed
        // TODO add your handling code here:
        guiMediCirurgia g = new guiMediCirurgia();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemMediCirurgiaActionPerformed

    private void itemEvolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEvolucaoActionPerformed
        // TODO add your handling code here:
        guiEvolucao g = new guiEvolucao();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemEvolucaoActionPerformed

    private void itemAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAltaActionPerformed
        // TODO add your handling code here:
        guiAlta g = new guiAlta();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemAltaActionPerformed

    private void itemPrescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPrescricaoActionPerformed
        // TODO add your handling code here:
        guiPrecriscao g = new guiPrecriscao();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemPrescricaoActionPerformed

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_itemSairActionPerformed

    private void itemProntuarioVirtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProntuarioVirtualActionPerformed
        // TODO add your handling code here:
        guiProntuarioVirtual g = new guiProntuarioVirtual();
        desktopPane.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_itemProntuarioVirtualActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        guiCirurgiaMaterial a = new guiCirurgiaMaterial();
         desktopPane.add(a);
        a.setVisible(true);
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemAgendamento;
    private javax.swing.JMenuItem itemAlta;
    private javax.swing.JMenuItem itemBairro;
    private javax.swing.JMenuItem itemCID;
    private javax.swing.JMenuItem itemCidade;
    private javax.swing.JMenuItem itemEspecialidade;
    private javax.swing.JMenuItem itemEstado;
    private javax.swing.JMenuItem itemEvolucao;
    private javax.swing.JMenuItem itemInternacao;
    private javax.swing.JMenuItem itemLeito;
    private javax.swing.JMenuItem itemLocal;
    private javax.swing.JMenuItem itemMaterial;
    private javax.swing.JMenuItem itemMediCirurgia;
    private javax.swing.JMenuItem itemMedicamento;
    private javax.swing.JMenuItem itemMotivoAlta;
    private javax.swing.JMenuItem itemPaciente;
    private javax.swing.JMenuItem itemPrescricao;
    private javax.swing.JMenuItem itemProcedimento;
    private javax.swing.JMenuItem itemProfissional;
    private javax.swing.JMenuItem itemProntuarioVirtual;
    private javax.swing.JMenuItem itemRelatorio;
    private javax.swing.JMenuItem itemRelatorio2;
    private javax.swing.JMenuItem itemRelatorio3;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenuItem itemSala;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuAtividades;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem qtdMaterial;
    private javax.swing.JMenuItem qtdMedicamento;
    // End of variables declaration//GEN-END:variables
}