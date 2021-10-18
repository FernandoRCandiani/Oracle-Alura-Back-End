public class EditorVideo extends Funcionario{

	public double getBonificacao() {
		System.out.println("Chamando o método bonificação do Editor de Video");
		return super.getBonificacao() + 100;
	}
	
}
