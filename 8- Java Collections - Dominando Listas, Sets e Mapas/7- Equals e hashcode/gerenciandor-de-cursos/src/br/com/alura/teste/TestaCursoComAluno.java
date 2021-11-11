package br.com.alura.teste;

public class TestaCursoComAluno {

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
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println("O aluno " + a1.getNome() + " esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 35214);
		System.out.println("E esse Turini, esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 eh equals ao Turini?");
		System.out.println(a1.equals(turini));
		
		
	}
}
