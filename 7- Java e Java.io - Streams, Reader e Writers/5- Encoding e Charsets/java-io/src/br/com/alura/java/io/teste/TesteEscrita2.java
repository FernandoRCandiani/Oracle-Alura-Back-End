package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscrita2 {


	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw = new FileWriter("Lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);

		PrintStream ps = new PrintStream("lorem2.txt", "UTF-8");
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("a^~asfasdfsafdas dfs sdf asf assd");
		
//		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//		bw.newLine();
//		bw.write("ãéasfasdfsafdas dfs sdf asf assd");
		
		ps.close();
		
	}
}
