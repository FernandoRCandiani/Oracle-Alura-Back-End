package br.com.alura.teste;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do java", 
				"Fernando Candiani");
			
	//	javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula",20 ));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		
		System.out.println(javaColecoes.getAulas());
	}
}
