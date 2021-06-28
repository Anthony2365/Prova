package br.com.senai.aluno;


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
		aluno.setCurso(tec.nextLine());
	
		return aluno;
	}

}
