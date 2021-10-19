public class Cliente implements Autenticavel {

	private Validacao autenticador;
	
	public Cliente() {
		this.autenticador = new Validacao();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}


}
