// Gerente é um FuncionarioAutenticavel - Gerente herda da classe Funcionario

public class Gerente extends Funcionario implements Autenticavel{

	private Validacao autenticador;
	
	public Gerente() {
		this.autenticador = new Validacao();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método bonificação do GERENTE");
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.autentica(senha);		
	}
}
