package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura";//object literal
 
		String vazio = "   Alura   ";
		String outroVazio = vazio.trim();

		System.out.println(vazio);
		System.out.println(outroVazio);
		
		System.out.println(vazio.contains("Alu"));
		
//		System.out.println(outroVazio.isEmpty());
		
//		for(int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
//		System.out.println(nome.length());
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
//		String outro = new String("Alura");
		
//	 	char c = 'A';
//		char d = 'a';
//		String outro = nome.replace(c, d);
		
//		String outro = nome.toLowerCase();
		
//		System.out.println(nome);
//		System.out.println(outro);
	}
}
