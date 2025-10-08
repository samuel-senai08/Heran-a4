package Heranca3;

public class Engenheiro extends Funcionario {
	private int numCrea;
	
	public Engenheiro (String nome, String matricula, double salario, String telefone, String endereco, String dataNascimento, int numCrea ) {
		super(nome,matricula,salario,telefone,endereco,dataNascimento);
		this.numCrea = numCrea;
	}

	public int getNumCrea() {
		return numCrea;
	}

	public void setNumCrea(int numCrea) {
		this.numCrea = numCrea;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Numero CRA: " + numCrea);
	}

}

