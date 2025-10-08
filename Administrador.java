package Heranca3;

public class Administrador extends Funcionario {
    private int cra;

    public Administrador(String nome, String matricula, double salario, String telefone, String endereco, String dataNascimento, int cra) {
    	super(nome, matricula, salario, telefone, endereco, dataNascimento);
        this.cra = cra;
    }

    public int getCra() {
        return cra;
    }

    public void setCra(int cra) {
        this.cra = cra;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("Número CRA: " + cra); 
    }
}
