package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Object contaCorrente = new ContaCorrente(22, 22);
		Object contaPoupanca = new ContaPoupanca(33, 33);
//		Object cliente = new Cliente();
		
		System.out.println(contaCorrente);
		System.out.println(contaPoupanca);
	
	//	println(cliente);
	}
	
	static void println() {
		
	}
	
	static void println(int a) {
		
	}
	
	static void println(boolean valor) {
		
	}
	
	static void println(Object referencia) {
		
	}
	
	
	
}
