public class CriaConta {

	public static void main(String[] args) {
		
		
		// Criando o objeto para primeira conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		// Criando a segunda instância
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		System.out.println("O saldo da primeira conta " + primeiraConta.saldo);
		System.out.println("O saldo da segunda conta " + segundaConta.saldo);
		
		// Ao solicitarmos a execução da aplicação, teremos o resultado dos valores de agencia e numero
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 142;
		System.out.println("Agora a segunda conta está na agencia " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
