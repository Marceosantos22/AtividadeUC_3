
package Class;


public class DetalheObs {
	
	private String consultaREalizada;
	private String observacao;
	private int selecaoConsulta;
	
	
	public DetalheObs(){
		
		
	}

	public DetalheObs(String consultaREalizada, String observacao, int selecaoConsulta) {
		this.consultaREalizada = consultaREalizada;
		this.observacao = observacao;
		this.selecaoConsulta = selecaoConsulta;
	}

	public String getConsultaREalizada() {
		return consultaREalizada;
	}

	public void setConsultaREalizada(String consultaREalizada) {
		this.consultaREalizada = consultaREalizada;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getSelecaoConsulta() {
		return selecaoConsulta;
	}

	public void setSelecaoConsulta(int selecaoConsulta) {
		this.selecaoConsulta = selecaoConsulta;
	}
	
	
}
