package View;

import Class.DetalheObs;
import javax.swing.JOptionPane;

public class DetalhesConsulta extends javax.swing.JFrame {
  
  public DetalhesConsulta() {
	initComponents();
	setLocationRelativeTo(null);
  }
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcb_consultaRealizada = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_observacao = new javax.swing.JTextArea();
        jbt_finalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NutiSoft - Detalhes da Consulta");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Detalhes da Consulta");

        jcb_consultaRealizada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcb_consultaRealizada.setText("Consulta Realizada");
        jcb_consultaRealizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_consultaRealizadaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Receita e observação");

        jta_observacao.setColumns(20);
        jta_observacao.setRows(5);
        jScrollPane1.setViewportView(jta_observacao);

        jbt_finalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbt_finalizar.setText("Finalizar");
        jbt_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jcb_consultaRealizada)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbt_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jcb_consultaRealizada)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbt_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void jcb_consultaRealizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_consultaRealizadaActionPerformed

        }//GEN-LAST:event_jcb_consultaRealizadaActionPerformed

    private void jbt_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_finalizarActionPerformed
	  
	  int posicao = TelaInicial.telaInicial.pegarposicao();
	  
	  if (!getDetalheObs().getObservacao().equals("")) {
		
		if (jcb_consultaRealizada.isSelected()) {
		  
		  System.out.println(posicao);
		  TelaInicial.telaInicial.atualizarJaRealizada(realizadaConsulta(), posicao);
		  TelaInicial.telaInicial.salvarObs(getDetalheObs().getObservacao(), posicao);
		  dispose();
		  
		} else {
		  
		  TelaInicial.telaInicial.salvarObs(getDetalheObs().getObservacao(), posicao);
		  dispose();
		}
	  } else {
		
		JOptionPane.showMessageDialog(null, "Favor informar uma observação da consulta!");
		
	  }
	  //dispose();

    }//GEN-LAST:event_jbt_finalizarActionPerformed
  
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
	  java.util.logging.Logger.getLogger(DetalhesConsulta.class
			  .getName()).log(java.util.logging.Level.SEVERE, null, ex);
	  
	} catch (InstantiationException ex) {
	  java.util.logging.Logger.getLogger(DetalhesConsulta.class
			  .getName()).log(java.util.logging.Level.SEVERE, null, ex);
	  
	} catch (IllegalAccessException ex) {
	  java.util.logging.Logger.getLogger(DetalhesConsulta.class
			  .getName()).log(java.util.logging.Level.SEVERE, null, ex);
	  
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	  java.util.logging.Logger.getLogger(DetalhesConsulta.class
			  .getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	java.awt.EventQueue.invokeLater(new Runnable() {
	  public void run() {
		new DetalhesConsulta().setVisible(true);
	  }
	});
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_finalizar;
    private javax.swing.JCheckBox jcb_consultaRealizada;
    private javax.swing.JTextArea jta_observacao;
    // End of variables declaration//GEN-END:variables

  public DetalheObs getDetalheObs() {
	
	DetalheObs detalheObs = new DetalheObs();
	
	detalheObs.setConsultaREalizada("NAO");
	detalheObs.setSelecaoConsulta(1);
	detalheObs.setObservacao(jta_observacao.getText());
	
	return detalheObs;
	
  }
  
  public String realizadaConsulta() {
	
	String resp;
	
	if (getDetalheObs().getConsultaREalizada().equals("")) {
	  
	  resp = "NAO";
	  
	} else {
	  
	  resp = "Já Realizada";
	  
	}
	
	return resp;
	
  }
  
  public void getObs(String mensagem) {
	
	jta_observacao.setText(mensagem);
	
  }
  
  public void checkPacienteoff() {

	jbt_finalizar.setVisible(false);
	jcb_consultaRealizada.setSelected(true);
	jcb_consultaRealizada.setEnabled(false);
	
	
  }
}
