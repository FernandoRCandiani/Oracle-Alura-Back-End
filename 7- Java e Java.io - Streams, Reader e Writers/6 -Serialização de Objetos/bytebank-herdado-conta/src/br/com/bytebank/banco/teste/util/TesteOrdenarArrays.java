package br.com.bytebank.banco.teste.util;

import java.util.Arrays;

public class TesteOrdenarArrays {

	public static void main(String[] args) {
		int[] numeros = new int[] { 43, 15, 64, 22, 89 };

		Arrays.sort(numeros); // m�todo utilit�rio sort

		System.out.println(Arrays.toString(numeros)); // m�todo utilit�rio toString

		// Saida : [15, 22, 43, 64, 89]
	}

}
