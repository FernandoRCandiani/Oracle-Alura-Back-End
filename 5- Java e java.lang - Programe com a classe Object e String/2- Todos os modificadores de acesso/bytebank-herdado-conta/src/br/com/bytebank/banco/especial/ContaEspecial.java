package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
/*	A classe ContaEspecial, mesmo que sendo uma filha da classe Conta, n�o 
 * possui acesso ao atributo saldo, pois este n�o se encontra vis�vel fora 
 * de seu pacote. As duas classes possuem relacionamentos �ntimos, sendo 
 * classe Conta a m�e e ContaEspecial a filha. O modificador de visibilidade 
 * protected torna elementos p�blicos para as classes filhas.
 * 
	Mesmo que a classe filha esteja em outro pacote, o atributo saldo em 
	Conta ser� vis�vel caso seja acompanhado por protected. O acesso ao 
	atributo saldo da classe Conta n�o � poss�vel de nenhum outro local, 
	apenas da classe filha. 
*/

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
