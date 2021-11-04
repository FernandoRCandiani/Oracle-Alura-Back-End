package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardador {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta contaCorrente = new ContaCorrente(22, 11);
		guardador.adiciona(contaCorrente);
		
		Conta contaCorrente2 = new  ContaCorrente(22, 22);
		guardador.adiciona(contaCorrente2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}
}
