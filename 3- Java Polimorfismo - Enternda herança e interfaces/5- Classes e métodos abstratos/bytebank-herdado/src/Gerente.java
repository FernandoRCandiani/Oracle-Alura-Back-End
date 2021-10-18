// Gerente é um funcionario - Gerente herda da classe Funcionario

public class Gerente extends Funcionario {

	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método bonificação do GERENTE");
		return super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}	
	
}
