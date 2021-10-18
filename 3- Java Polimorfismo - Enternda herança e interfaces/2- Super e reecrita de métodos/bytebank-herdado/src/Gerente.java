// Gerente � um funcionario - Gerente herda da classe Funcionario

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
		return super.getBonificacao() + super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}	
	
}
