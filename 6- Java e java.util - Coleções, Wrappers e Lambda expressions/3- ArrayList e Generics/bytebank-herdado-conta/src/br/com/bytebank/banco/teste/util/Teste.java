package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta contaCorrente1 = new ContaCorrente(22, 11);
        lista.add(contaCorrente1);

        Conta contaCorrente2 = new ContaCorrente(22, 22);
        lista.add(contaCorrente2);
        
        System.out.println("Tamanho: " + lista.size());
        
        Conta ref = lista.get(0);
        
        System.out.println(ref.getNumero());
        
        lista.remove(0);
        
        System.out.println("Tamanho: " + lista.size());
	
        Conta contaCorrente3 = new ContaCorrente(22, 33);
        lista.add(contaCorrente3);

        Conta contaCorrente4 = new ContaCorrente(22, 44);
        lista.add(contaCorrente4);
        
        for(int i = 0; i < lista.size();i++) {
        	Object oRef = lista.get(i);
        	System.out.println(oRef);
        }
        
        System.out.println("----------------------");
        
        for(Conta conta : lista) {
        	System.out.println(conta);
        }
	}
}
