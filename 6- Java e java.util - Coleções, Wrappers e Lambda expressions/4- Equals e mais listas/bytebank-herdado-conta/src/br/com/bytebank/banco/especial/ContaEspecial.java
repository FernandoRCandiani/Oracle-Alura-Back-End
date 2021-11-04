package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
/*	A classe ContaEspecial, mesmo que sendo uma filha da classe Conta, não 
 * possui acesso ao atributo saldo, pois este não se encontra visível fora 
 * de seu pacote. As duas classes possuem relacionamentos íntimos, sendo 
 * classe Conta a mãe e ContaEspecial a filha. O modificador de visibilidade 
 * protected torna elementos públicos para as classes filhas.
 * 
	Mesmo que a classe filha esteja em outro pacote, o atributo saldo em 
	Conta será visível caso seja acompanhado por protected. O acesso ao 
	atributo saldo da classe Conta não é possível de nenhum outro local, 
	apenas da classe filha. 
*/

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
