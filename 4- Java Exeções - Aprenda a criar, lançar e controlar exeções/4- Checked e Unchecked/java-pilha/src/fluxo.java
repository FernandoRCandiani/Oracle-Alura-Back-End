public class fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metado1();
		}catch(ArithmeticException | NullPointerException | MinhaExcecao excecoes) {
			String mensagem = excecoes.getMessage();
			System.out.println("Exception " + mensagem);
			excecoes.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	public static void metado1() throws MinhaExcecao {
		System.out.println("Inicio do metado1");
		metado2();
		System.out.println("Fim do metado1");
	}
	
	public static void metado2() throws MinhaExcecao {
		System.out.println("Inicio do metado2");

		throw new MinhaExcecao("Deu muito errado");
	
	//	System.out.println("Fim do metado2");
	}
}

