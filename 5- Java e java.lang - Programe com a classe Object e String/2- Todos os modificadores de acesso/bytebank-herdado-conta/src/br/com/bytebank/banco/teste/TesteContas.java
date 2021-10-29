package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposita(100.0);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
		contaPoupanca.deposita(200.0);
		
		try {
			contaCorrente.transfere(10.0, contaPoupanca);
		} catch (SaldoInsuficienteException excecao) {
			System.out.println(excecao.getMessage());			
		}
		
		System.out.println("CC: " + contaCorrente.getSaldo());
		System.out.println("CP: " + contaPoupanca.getSaldo());
	}
}
