package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		// int[] idades = new int[5];
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente contaCorrente1 = new ContaCorrente(22, 11);
		contas[0] = contaCorrente1;
		
		ContaCorrente contaCorrente2 = new ContaCorrente(22, 22);
		contas[1] = contaCorrente2;
		
		//System.out.println(contaCorrente2.getNumero());
		System.out.println(contas[0].getNumero());
	
		ContaCorrente ref = contas[1];
		
		System.out.println(ref.getNumero());
	}
}
