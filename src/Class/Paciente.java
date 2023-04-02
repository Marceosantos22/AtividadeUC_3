
package Class;


public class Paciente {
	
	private String nomePaciente;
	private String telefone;
	private String cpf;
	private String dataConsulta;
	private String jaEPaciente;
	DetalheObs detalheObs;
	
	public Paciente() {
		
	}

	public Paciente(String nomePaciente, String telefone, String cpf,
		String dataConsulta, String jaEPaciente, DetalheObs detalheConsulta) {
		
		this.nomePaciente = nomePaciente;
		this.telefone = telefone;
		this.cpf = cpf;
		this.dataConsulta = dataConsulta;
		this.jaEPaciente = jaEPaciente;
		this.detalheObs = detalheConsulta;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getJaEPaciente() {
		return jaEPaciente;
	}

	public void setJaEPaciente(String jaEPaciente) {
		this.jaEPaciente = jaEPaciente;
	}

	public DetalheObs getDetalheObs() {
		return detalheObs;
	}

	public void setDetalheObs(DetalheObs detalheObs) {
		this.detalheObs = detalheObs;
	}
	
	
	
}
