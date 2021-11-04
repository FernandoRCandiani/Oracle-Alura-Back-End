package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		int[]idades = new int[5]; // Inicializa o array com os valores padroes
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
//		idades[0] = 29;
//		idades[1] = 26;
//		idades[2] = 36;
//		idades[3] = 16;
//		idades[4] = 66;
//
//		
//		int idade1 = idades[4];
//		
//		System.out.println(idade1);
//		
//		System.out.println(idades.length);
//		
		
		
	}
}