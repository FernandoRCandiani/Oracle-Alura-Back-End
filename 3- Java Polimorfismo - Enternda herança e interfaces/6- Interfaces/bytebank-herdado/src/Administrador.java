
public class Administrador extends Funcionario implements Autenticavel {
	
	private Validacao autenticador;
	
	public Administrador() {
		this.autenticador = new Validacao();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
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
