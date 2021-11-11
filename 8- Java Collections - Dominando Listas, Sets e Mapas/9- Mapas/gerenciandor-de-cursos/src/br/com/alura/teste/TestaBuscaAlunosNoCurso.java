package br.com.alura.teste;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do java", 
				"Fernando Candiani");
			
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula",20 ));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
	
		Aluno a1 = new Aluno("Rodrigo Turini", 35214);
		Aluno a2 = new Aluno("Guilherme Silveira", 56547);
		Aluno a3 = new Aluno("Mauricio Aniche", 12475);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Qual eh o aluno com matricula 56547?");
		Aluno aluno = javaColecoes.buscaMatriculado(56547);
		System.out.println("Aluno: " + aluno);
	}
}
