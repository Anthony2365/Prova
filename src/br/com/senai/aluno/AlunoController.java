package br.com.senai.aluno;


import java.util.List;
import java.util.Scanner;

public class AlunoController {
	
	private Scanner tec;
	
	public AlunoController() {
		tec = new Scanner(System.in);
	}

	public int LeOpcao() {
		System.out.println("> ");
		return tec.nextInt();
	}
	
	public Aluno cadastrAluno() {
		Aluno aluno = new Aluno();
		
		System.out.println("---CADASTRAR PESSOA ---");
		System.out.println("Informe o nome: ");
		tec.nextLine();
		aluno.setNomeAluno(tec.nextLine());
		
		System.out.println("Informe a sua idade: ");
		aluno.setIdadeAluno(tec.nextInt());
		
		System.out.println("Informe o seu curso: ");
		tec.nextLine();
		aluno.setCurso(tec.nextLine());
	
		return aluno;
	}
	
	public List<Aluno> listarAlunos(List<Aluno> alunos) {
		
		if(alunos.isEmpty()) {
			System.out.println("Não possui dados para lista. ");
			return null;
		}
		
		System.out.printf(" | %2s | %8s | %5s | %10s \n",
				"Id" , "Nome" , "Idade" , "Curso");
		for(int i = 0; i < alunos.size(); i++) {
			System.out.printf("| %2d | %8s |  %5d | %10s |\n ",
				i + 1,	
				alunos.get(i).getNomeAluno(),
				alunos.get(i).getIdadeAluno(),
				alunos.get(i).getCurso());
			
		}
		
		return alunos;
		
	}
	
	public List<Aluno> editarAluno(List<Aluno>alunos) {
		Aluno aluno = new Aluno();
		listarAlunos(alunos);
		
		if(alunos.isEmpty()) {
			return null;
		}
		System.out.println("Informe o id do aluno para editar: ");
		int idAluno = tec.nextInt() -1;
		
		System.out.println("1) Nome do Aluno: ");
		System.out.println("2) Idade: ");
		System.out.println("3) Curso: ");
		
		System.out.println("Informe o campo para ser editado: ");
		int Opcao = tec.nextInt();
		
		switch (Opcao) {
		case 1:
			
			System.out.println("--- EDITAR O NOME ---");
			System.out.println("Informe o novo nome: ");
			aluno.setNomeAluno(tec.next());
			
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setCurso(alunos.get(idAluno).getCurso());
			
			break;
			
			
		case 2:
			
			System.out.println("--- EDITAR A IDADE ---");
			System.out.println("Informe uma nova idade: ");
			aluno.setIdadeAluno(tec.nextInt());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setCurso(alunos.get(idAluno).getCurso());
			
			break;
			
		case 3:
			
			System.out.println("-- EDITAR O CURSO ");
			System.out.println("Informe um novo curso: ");
			aluno.setCurso(tec.next());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			
			break;
			
			default:
				System.out.println("opção invalida!");
				break;
			
		}
		
		alunos.set(idAluno,aluno);
		
		return alunos;
		
		
	}
	
	public void excluirAlunos(List<Aluno> alunos) {
		listarAlunos(alunos);
		if(alunos.isEmpty()) {
			return;
		}
		
		System.out.println("--- EXCLUIR PESSOA ---");
		System.out.println("Informe o Id da pessoa para excluir: ");
		int idAluno = tec.nextInt() -1;
		
		if(alunos.size() <= idAluno) {
			
			System.out.println("Curso não cadastrado.");
			return;
		}
		alunos.remove(idAluno);
	}
	
	public void menu(List<Aluno> alunos) {
		System.out.println("1)Cadastrar ");
		System.out.println("2)Editar");
		System.out.println("3)Listar");
		System.out.println("4)Excluir");
		
		System.out.println("Informe o campo para ser editado: ");
		Scanner tec = new Scanner(System.in);
		int opcao = tec.nextInt();
		
		switch(opcao) {
		
		case 1:
			alunos.add(cadastrAluno());
			break;
			
		case 2:
			editarAluno(alunos);
			break;
			
		case 3:
			listarAlunos(alunos);
			break;
			
			
		case 4:
			excluirAlunos(alunos);
			break;
		}
		
	}

}
