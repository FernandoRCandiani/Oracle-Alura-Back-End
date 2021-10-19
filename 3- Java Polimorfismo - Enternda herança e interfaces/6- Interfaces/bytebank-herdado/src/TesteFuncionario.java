public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente fernando = new Gerente();
		
		fernando.setNome("Fernando Candiani");
		fernando.setCpf("123456789-01");
		fernando.setSalario(10000.00);
		
		System.out.println(fernando.getNome());
		System.out.println(fernando.getBonificacao());
	}
}
