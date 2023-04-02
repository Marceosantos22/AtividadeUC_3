package View;

import Class.DetalheObs;
import Class.Paciente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaInicial extends javax.swing.JFrame {
  
  public static TelaInicial telaInicial = new TelaInicial();
  
  private final String[] tableColumns = {"Paciente", "Telefone", "CPF",
	"Data", "Já era Paciente", "Consulta Realizada"};
  
  DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
  
  private List<Paciente> pacienteList = new ArrayList<>();
  
  public TelaInicial() {
	
	initComponents();
	setLocationRelativeTo(null);
	
  }
  
  @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jbt_finalizarConsulta = new javax.swing.JButton();
      jbt_novaConsulta = new javax.swing.JButton();
      jbt_excluirConsulta = new javax.swing.JButton();
      jScrollPane2 = new javax.swing.JScrollPane();
      jTable_Pacientes = new javax.swing.JTable();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("NutriSoft - Agendamentos");

      jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
      jLabel1.setText("Boas vindas ao sistema de agendamento");

      jbt_finalizarConsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      jbt_finalizarConsulta.setText("Finalizar Consulta");
      jbt_finalizarConsulta.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbt_finalizarConsultaActionPerformed(evt);
         }
      });

      jbt_novaConsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      jbt_novaConsulta.setText("Nova Consulta");
      jbt_novaConsulta.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbt_novaConsultaActionPerformed(evt);
         }
      });

      jbt_excluirConsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      jbt_excluirConsulta.setText("Excluir Consulta");
      jbt_excluirConsulta.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbt_excluirConsultaActionPerformed(evt);
         }
      });

      jTable_Pacientes.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Paciente", "Telefone", "CPF", "Data", "Ja era Paciente", "Consulta Realizada"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }
      });
      jScrollPane2.setViewportView(jTable_Pacientes);

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addComponent(jbt_novaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(44, 44, 44)
            .addComponent(jbt_excluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
            .addComponent(jbt_finalizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(36, 36, 36))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(280, Short.MAX_VALUE))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jbt_excluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jbt_novaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jbt_finalizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

        private void jbt_excluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_excluirConsultaActionPerformed
		  
		  if (pegarposicao() < 0) {
			
			JOptionPane.showMessageDialog(null, "Selecione um Paciente para excluir!");
			
		  } else {
			
			excluirDadosPaciente(pegarposicao());
			
		  }
        }//GEN-LAST:event_jbt_excluirConsultaActionPerformed

        private void jbt_finalizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_finalizarConsultaActionPerformed
		  
		  DetalhesConsulta detalhesConsulta = new DetalhesConsulta();
		  
		  if (realizada() == 1) {
			detalhesConsulta.checkPacienteoff();
			detalhesConsulta.getObs(getObs());
			detalhesConsulta.setVisible(true);
			
		  } else if (realizada() == 2) {
			
			detalhesConsulta.getObs(getObs());
			detalhesConsulta.setVisible(true);
			
		  } else {
			
			JOptionPane.showMessageDialog(null, "Necessário selecionar uma consulta para Finalizar!");
			
		  }

        }//GEN-LAST:event_jbt_finalizarConsultaActionPerformed

        private void jbt_novaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_novaConsultaActionPerformed
		  TelaCadastro telaCadastro = new TelaCadastro();
		  telaCadastro.setVisible(true);
		  telaCadastro.setLocationRelativeTo(null);

        }//GEN-LAST:event_jbt_novaConsultaActionPerformed
  
  public static void main(String args[]) {

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
	  java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	  java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	  java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	  java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	java.awt.EventQueue.invokeLater(new Runnable() {
	  public void run() {
		telaInicial.setVisible(true);
	  }
	});
  }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel jLabel1;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JTable jTable_Pacientes;
   private javax.swing.JButton jbt_excluirConsulta;
   private javax.swing.JButton jbt_finalizarConsulta;
   private javax.swing.JButton jbt_novaConsulta;
   // End of variables declaration//GEN-END:variables

  public void inserirPaciente(Paciente paciente) {
	
	pacienteList.add(paciente);
	atualizarPaciente();
	
  }
  
  private void atualizarPaciente() {
	
	if (!pacienteList.isEmpty()) {
	  
	  Paciente paciente;
	  
	  tableModel = new DefaultTableModel(tableColumns, 0);
	  
	  for (int i = 0; i < pacienteList.size(); i++) {
		
		paciente = pacienteList.get(i);
		
		String[] rowData = {paciente.getNomePaciente(), paciente.getTelefone(), paciente.getCpf(),
		  paciente.getDataConsulta(), paciente.getJaEPaciente(),
		  paciente.getDetalheObs().getConsultaREalizada()};
		
		tableModel.addRow(rowData);
	  }
	  
	  jTable_Pacientes.setModel(tableModel);
	  
	} else {
	  
	  tableModel = new DefaultTableModel(tableColumns, 0);
	  jTable_Pacientes.setModel(tableModel);
	}
  }
  
  public int pegarposicao() {
	
	int posicao = jTable_Pacientes.getSelectedRow();
	
	return posicao;
  }
  
  public int realizada() {
	int resp = 0;
	
	if (jTable_Pacientes.getSelectedRow() >= 0) {
	  
	  Paciente paciente = pacienteList.get(jTable_Pacientes.getSelectedRow());
	  
	  if (paciente.getDetalheObs().getConsultaREalizada().equals("Já Realizada")) {
		resp = 1;
	  } else {
		resp = 2;
	  }
	}
	return resp;
	
  }
  
  public void atualizarJaRealizada(String jaRealizada, int posicao) {
	
	Paciente paciente = pacienteList.get(posicao);
	paciente.getDetalheObs().setConsultaREalizada(jaRealizada);
	
	jTable_Pacientes.setValueAt(jaRealizada, posicao, 5);
	
	jTable_Pacientes.clearSelection();
	
  }
  
  public void salvarObs(String mensagem, int posicao) {
	
	Paciente paciente = pacienteList.get(posicao);
	paciente.getDetalheObs().setObservacao(mensagem);
	jTable_Pacientes.clearSelection();
	
  }
  
  public String getObs() {
	String mensagem;
	
	Paciente paciente = pacienteList.get(pegarposicao());
	mensagem = paciente.getDetalheObs().getObservacao();
	
	return mensagem;
  }
  
  private void excluirDadosPaciente(int posPaciente) {
	
	if (posPaciente >= 0) {
	  
	  String[] options = {"Sim", "Não"};
	  
	  int deletar = JOptionPane.showOptionDialog(
			  rootPane,
			  "Tem certeza que deseja excluir?",
			  "Exclusão do Paciente",
			  JOptionPane.DEFAULT_OPTION,
			  JOptionPane.QUESTION_MESSAGE,
			  null,
			  options,
			  options[0]
	  );
	  
	  if (deletar == 0) {
		
		pacienteList.remove(posPaciente);
		
		atualizarPaciente();
		JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso!");
	  } else {
		
		jTable_Pacientes.clearSelection();
	  }
	}
  }
}
