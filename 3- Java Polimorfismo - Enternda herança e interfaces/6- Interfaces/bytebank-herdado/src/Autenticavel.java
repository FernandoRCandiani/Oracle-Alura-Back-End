// Contrato Autenticavel
	//quem assina esse contrato precisa implementar
		//metodo setSenha
		//metodo autentica
public abstract interface Autenticavel {

	public boolean autentica(int senha);

	public void setSenha(int senha);
}
