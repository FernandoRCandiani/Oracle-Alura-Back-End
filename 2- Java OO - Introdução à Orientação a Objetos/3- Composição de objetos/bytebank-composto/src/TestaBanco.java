public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente fernando = new Cliente();
		fernando.nome = "Fernando Candiani";
		fernando.cpf = "111.111.111-11";
		fernando.profissao = "Programador";
		
		Conta contaDoFernando = new Conta();
		contaDoFernando.deposita(1000);
		
		// Associa o cliente fernando a contaDoFernando
		contaDoFernando.titular = fernando;
		
		System.out.println(contaDoFernando.titular.nome);
	}
}
