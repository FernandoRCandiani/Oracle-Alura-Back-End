package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2  {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
	
		while(scanner.hasNextLine()) {
			String linha =scanner.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			System.out.format(new Locale("pt", "BR"),"%s - %04d- %05d, %20s: %08.2f %n",
					tipoConta, agencia, numero, titular, saldo);
			
			linhaScanner.close();
			
		//	String[] valores = linha.split(",");
		//	System.out.println(valores[3]);
		//	System.out.println(Arrays.toString(valores));
		}
		scanner.close();
	}
}
