package Heranca3;

public class Principal {
public static void main(String[] args) {
	Administrador administrador = new Administrador("Samuel Bonifacio Rodrigues" ,"123456", 15000.00 ,"(15) 98809-7393","Rua Expedicionarios Itapetininganos", "21//07/2008", 354678);
	Engenheiro engenheiro = new Engenheiro ("Gustavo Henrique Carvalho", "987654", 14000.00, "(15) 98706-4563", "Rua Nelson Gines", "15/09/2008", 739486); 
	Medico medico = new Medico ("Renzo Baltazar Durci Gavioli", "546780", 16000.00, "(15) 99543-2365", "Rua Abigail Holtz de Moraes", "14/10/2008", 658947);	

	System.out.println("=== Dados do Administrador ===");
	administrador.exibirInformacoes();
	
	System.out.println();
	System.out.println("=== Dados do Engenheiro ===");
	engenheiro.exibirInformacoes();
	
	System.out.println();
	
	System.out.println("=== Dados do Medico ===");
	medico.exibirInformacoes();
	
}
}
