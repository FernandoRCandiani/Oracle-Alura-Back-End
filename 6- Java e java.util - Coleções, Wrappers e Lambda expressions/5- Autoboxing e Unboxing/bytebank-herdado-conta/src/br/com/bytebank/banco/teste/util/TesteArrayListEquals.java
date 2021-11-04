package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

//		Conta contaCorrente1 = new ContaCorrente(22, 22);
//		Conta contaCorrente2 = new ContaCorrente(22, 22);
//		
//		boolean igual = contaCorrente1.ehIgual(contaCorrente2);
//		System.out.println(igual);
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta contaCorrente1 = new ContaCorrente(22, 11);
        lista.add(contaCorrente1);

        Conta contaCorrente2 = new ContaCorrente(22, 22);
        lista.add(contaCorrente2);
        
        Conta contaCorrente3 = new ContaCorrente(22, 22);
                
        boolean existe = lista.contains(contaCorrente3);
        
        System.out.println("Já existe? " + existe);
        

        for(Conta conta : lista) {
        	System.out.println(conta);
        }
	}
}
