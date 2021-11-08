package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {
		
		Conta contaCorrente1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        contaCorrente1.setTitular(clienteCC1);
        contaCorrente1.deposita(333.0);

        Conta contaPoupanca2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        contaPoupanca2.setTitular(clienteCC2);
        contaPoupanca2.deposita(444.0);

        Conta contaCorrente3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        contaCorrente3.setTitular(clienteCC3);
        contaCorrente3.deposita(111.0);

        Conta contaPoupanca4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        contaPoupanca4.setTitular(clienteCC4);
        contaPoupanca4.deposita(222.0);
        
        List<Conta> lista = new ArrayList<>();
        lista.add(contaCorrente1);
        lista.add(contaPoupanca2);
        lista.add(contaCorrente3);
        lista.add(contaPoupanca4);
        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
  //    NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        lista.sort(null);
        
   //   Collections.sort(lista, new NumeroDaContaComparator());
   //   Collections.sort(lista);
   //   Collections.reverse(lista);
        
        System.out.println("----------------");
        
        for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}
	}
}

class TitularDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {

		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		return nomeC1.compareTo(nomeC2);
	}
	
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		return Integer.compare(c1.getNumero(), c2.getNumero());
		
//		return c1.getNumero() - c2.getNumero();

//		if(c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//			
//		if(c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		
//		return 0;
	}
	
	
}
