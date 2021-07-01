package br.com.Anthony;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.Cursos.Curso;
import br.com.senai.Cursos.CursoController;
import br.com.senai.aluno.Aluno;
import br.com.senai.aluno.AlunoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Curso> cursos = new ArrayList<Curso>();
		
		
		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();
		
		boolean sair = false;
		
		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1)Aluno");
			System.out.println("2)Curso");
			System.out.println("3)Sair do Sistema");
			System.out.println("Informe o campo para ser editado: ");
			int opcao = alunoController.LeOpcao();
			
		
			
		switch(opcao) {
		
		case 1 :
			alunoController.menu(alunos);
		break;
		
		
		case 2 :
			cursoController.menu(cursos);
			break;
			
			
		case 3 : 
			sair = true;
			
			
		default:
			System.out.println("opção invalida");
			}
		
		}while(!sair);
		
		System.out.println("Sistema finalizado");
	

		}
}