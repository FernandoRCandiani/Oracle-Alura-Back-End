public class TesteConexao {

	public static void main(String[] args) {

		// otimizando o codigo	
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException excecao) {
			System.out.println("Deu erro na conexao");
		}
		
//		Conexao conexao = null;
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//		} catch(IllegalStateException excecao) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			System.out.println("Finally");
//			if(conexao != null) {
//				conexao.fecha();
//			}
//		}
	}
}
