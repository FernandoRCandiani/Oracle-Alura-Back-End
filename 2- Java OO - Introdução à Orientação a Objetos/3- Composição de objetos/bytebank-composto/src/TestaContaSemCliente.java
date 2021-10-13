public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDoPedro = new Conta();
		System.out.println(contaDoPedro.saldo);
		
		contaDoPedro.titular = new Cliente();
		System.out.println(contaDoPedro.titular);
		
		contaDoPedro.titular.nome = "Pedro";
		System.out.println(contaDoPedro.titular.nome);
	}
}
