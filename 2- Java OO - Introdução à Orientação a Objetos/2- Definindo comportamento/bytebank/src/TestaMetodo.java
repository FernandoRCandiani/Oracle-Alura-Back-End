public class TestaMetodo {
	
	public static void main(String[] args) {
		
		//Criando conta do Fernando
		Conta contaDoFernando = new Conta();
		contaDoFernando.saldo = 100;
		
		// Depositando valor na conta
		contaDoFernando.deposita(50);
		System.out.println(contaDoFernando.saldo);
		
		// Sacando valor na conta
		boolean conseguiuRetirar = contaDoFernando.saca(20);
		System.out.println(contaDoFernando.saldo);
		System.out.println(conseguiuRetirar);
		
		//Criando conta do Pedro
		Conta contaDoPedro = new Conta();
		contaDoPedro.deposita(1000);
		
		// Transferindo valor na conta
		if(contaDoPedro.transfere(300, contaDoFernando)) {
			System.out.println("Transferencia feita com susseso.");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDoPedro.saldo);
		System.out.println(contaDoFernando.saldo);
	}
}
