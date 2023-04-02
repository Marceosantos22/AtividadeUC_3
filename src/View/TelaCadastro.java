package View;

import Class.Paciente;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {

  DetalhesConsulta detalhesConsulta = new DetalhesConsulta();
  TelaInicial telaInicial = new TelaInicial();

  public TelaCadastro() {
	initComponents();
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcb_jaPaciente = new javax.swing.JCheckBox();
        jbt_Cadastrar = new javax.swing.JButton();
        jtf_telefone = new javax.swing.JFormattedTextField();
        jtf_cpf = new javax.swing.JFormattedTextField();
        jtf_data = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NutriSoft - Cadastro de Paciente");
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Cadastro de Paciente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nome do(a) Paciente:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Data da Conulta:");

        jcb_jaPaciente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcb_jaPaciente.setText("Já é paciente");
        jcb_jaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_jaPacienteActionPerformed(evt);
            }
        });

        jbt_Cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbt_Cadastrar.setText("Cadastrar");
        jbt_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_CadastrarActionPerformed(evt);
            }
        });

        try {
            jtf_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtf_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtf_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_data, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_nome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel4))
                                    .addComponent(jcb_jaPaciente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jbt_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jtf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jcb_jaPaciente)
                .addGap(63, 63, 63)
                .addComponent(jbt_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void jcb_jaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_jaPacienteActionPerformed

        }//GEN-LAST:event_jcb_jaPacienteActionPerformed

        private void jbt_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_CadastrarActionPerformed

		  if (!emptyFields()) {

			if (!validacao()) {
			  TelaInicial.telaInicial.inserirPaciente(getPaciente());
			  dispose();

			}

		  }


        }//GEN-LAST:event_jbt_CadastrarActionPerformed

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
	  java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	  java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	  java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	  java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	java.awt.EventQueue.invokeLater(new Runnable() {
	  public void run() {
		new TelaCadastro().setVisible(true);
	  }
	});
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbt_Cadastrar;
    private javax.swing.JCheckBox jcb_jaPaciente;
    private javax.swing.JFormattedTextField jtf_cpf;
    private javax.swing.JFormattedTextField jtf_data;
    private javax.swing.JTextField jtf_nome;
    private javax.swing.JFormattedTextField jtf_telefone;
    // End of variables declaration//GEN-END:variables

  public Paciente getPaciente() {

	Paciente paciente = new Paciente();

	paciente.setNomePaciente(jtf_nome.getText().toUpperCase());
	paciente.setTelefone(jtf_telefone.getText());
	paciente.setCpf(jtf_cpf.getText());
	paciente.setDataConsulta(jtf_data.getText());

	if (jcb_jaPaciente.isSelected()) {

	  paciente.setJaEPaciente("SIM");

	} else {

	  paciente.setJaEPaciente("NAO");

	}

	paciente.setDetalheObs(detalhesConsulta.getDetalheObs());

	return paciente;

  }

  private boolean emptyFields() {

	boolean empty = true;

	if (jtf_nome.getText().trim().isEmpty()) {

	  JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Preencha o nome do Paciente.");

	} else if (jtf_telefone.getText().trim().isEmpty()) {

	  JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Favor informa telefone do Paciente.");

	} else if (jtf_cpf.getText().trim().isEmpty()) {

	  JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Necessário informar o CPF do Paciente.");

	} else if (jtf_data.getText().trim().isEmpty()) {

	  JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Data da Consulta não informada.");

	} else {

	  empty = false;
	}

	return empty;
  }

  private boolean validacao() {

	boolean valid = true;

	String validacao = jtf_nome.getText();
	boolean nomeValido = validacao.matches("[a-zA-Z\\s]+");

	String validacao1 = jtf_telefone.getText();
	boolean telefoneValido = validacao1.matches("[(][0-9]{2}[)][0-9]{4,5}-[0-9]{4}");

	String validacao2 = jtf_cpf.getText();
	boolean cpfValido = validacao2.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");

	String validacao3 = jtf_data.getText();
	boolean dataValido = validacao3.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");

	if (nomeValido == false) {

	  JOptionPane.showMessageDialog(null, "Escreva o nome do Paciente apenas com letras!");

	} else if (telefoneValido == false) {

	  JOptionPane.showMessageDialog(null, "Informe o telefone no formato ( (xx)xxxxx-xxxx ou (xx)xxxx-xxxx )");

	} else if (cpfValido == false) {

	  JOptionPane.showMessageDialog(null, "Informe os 11 dígitos do CPF do Paciente! (xxx.xxx.xxx-xx) ");

	} else if (dataValido == false) {

	  JOptionPane.showMessageDialog(null, "Informe a data conforme ex (DD/MM/AAAA)");

	} else {

	  valid = false;

	}

	return valid;
  }

}
