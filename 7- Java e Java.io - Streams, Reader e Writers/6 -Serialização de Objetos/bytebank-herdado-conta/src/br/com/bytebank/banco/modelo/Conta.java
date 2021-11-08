package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Fernando
 *
 */

public abstract class Conta implements Comparable<Conta>, Serializable{

	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	private static int total = 0;
	
	/**
	 *  Construtor para inicializar o objeto a partir da agencia e numero.
	 *  
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
	//	Conta.total++;
	//	System.out.println("O total de contas eh: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
	//	System.out.println("Estou criando uma conta " + this.numero);	
	}
	
	public abstract void deposita (double valor);
	
	/**
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		
		if(this.saldo <= valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor:" + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);		
		destino.deposita(valor);
	}
	
	@Override
	public boolean equals(Object referencia) {
		
		Conta outra = (Conta) referencia; 
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + " Agencia: " + this.agencia + ", Saldo:" + this.saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
}
