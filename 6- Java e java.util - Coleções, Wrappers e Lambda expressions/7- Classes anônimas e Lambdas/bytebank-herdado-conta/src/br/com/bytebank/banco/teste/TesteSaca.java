package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		// tratando
		try {
			conta.saca(210.0);
		} catch (SaldoInsuficienteException excecao) {
			System.out.println("Excecao: " + excecao.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());

	}

}
