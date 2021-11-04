package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		// int[] idades = new int[5];
		//Conta[] contas = new Conta[5];
		Object[] referencias = new Object[5];
		
		ContaCorrente contaCorrente1 = new ContaCorrente(22, 11);
		referencias[0] = contaCorrente1;
		
		ContaPoupanca contaPoupanca1 = new ContaPoupanca(22, 22);
		referencias[1] = contaPoupanca1;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
	//	System.out.println(contaCorrente2.getNumero());
	//	System.out.println(contas[1].getNumero());
		
	//	Object referenciaGenerica = contas[1];
	//	System.out.println(((Conta) referenciaGenerica).getNumero());		
		
	//	Conta ref = contas[1];
	//	ContaCorrente ref = (ContaCorrente) contas[1]; // ERRO ClassCastException
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast
		
		System.out.println(ref.getNumero());
	}
}
