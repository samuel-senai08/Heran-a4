package Heranca3;

public class Medico extends Funcionario {
    private int crm;

    public Medico(String nome, String matricula, double salario, String telefone,String endereco, String dataNascimento, int crm) {
        super(nome, matricula, salario, telefone, endereco, dataNascimento);
        this.crm = crm;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número CRM: " + crm);
    }
}
