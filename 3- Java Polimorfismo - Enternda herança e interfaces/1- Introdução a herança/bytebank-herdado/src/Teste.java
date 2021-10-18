// Entendendo com fazer construção para herança


public class Teste {

	public static void main(String[] args) {
		
		FuncionarioTeste funcionario1 = new FuncionarioTeste();
		
		// Funcionario Comum
		funcionario1.setSalario(3000.0);
		System.out.println(funcionario1.getTipo());
		System.out.println(funcionario1.getBonificacao());
		
		// Gerente
		FuncionarioTeste funcionario2 = new FuncionarioTeste();
		funcionario2.setTipo(1);
		funcionario2.setSalario(5000.0);
		System.out.println(funcionario2.getTipo());
		System.out.println(funcionario2.getBonificacao());
		
		// Diretor 
		FuncionarioTeste funcionario3 = new FuncionarioTeste();
		funcionario3.setTipo(3);
		funcionario3.setSalario(7000.0);
		System.out.println(funcionario3.getTipo());
		System.out.println(funcionario3.getBonificacao());
	}
}
