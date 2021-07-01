package br.com.senai.Cursos;

import java.util.List;
import java.util.Scanner;

public class CursoController {
	
private Scanner tec;

 public CursoController() {
	 
	 tec = new Scanner(System.in);
	 
 	}
 
 	public Curso cadastrarCurso() {
 		Curso curso = new Curso();
 		
 		System.out.println("--- CADATRAR CURSO ---");
 		System.out.println("Nome do curso: ");
 		curso.setNomeCurso(tec.next());
 		
 		return curso;
 		
 	}
 	public List<Curso> listarCurso(List<Curso> cursos) {
 		
 		if(cursos.isEmpty()) {
 			System.out.println("Não possui curso cadastrados.");
 			return null;
 			
 		}
 		System.out.printf("| %2s | %10s|\n","Id", "nomeCurso");
 		for(int i = 0; i < cursos.size(); i ++) {
 			System.out.printf("| %2d | %10s |\n",
 				i + 1,
 			cursos.get(i).getNomeCurso());
 			
 		}
 		return cursos;
 	}
 	public List<Curso> ediatCurso(List<Curso>cursos){
 		Curso curso = new Curso();
 		
 		listarCurso(cursos);
 		
 		if(cursos.isEmpty()) {
 			return null;
 		}
 		
 		System.out.println("Informe o Id do curso para editar: ");
 		int idCurso = tec.nextInt() - 1;
 		
 		System.out.println("1)Nome do Curso");
 		System.out.println("Informe o campo para ser editado");
 		int Opcao = tec.nextInt();
 		
 		switch(Opcao) {
 		case 1:
 			System.out.println("-- EDITAR O NOME DO CURSO ---");
 			System.out.println("Informe um novo nome do curso: ");
 			curso.setNomeCurso(tec.next());
 			
 			cursos.set(idCurso, curso);
 			break;
 			
 			default:
 				System.out.println("opção inválida!");
 				break;
 		}
 		
 		return cursos;
 	}
 	
 	public void excluirCurso(List<Curso>cursos) {
 		listarCurso(cursos);
 		if(cursos.isEmpty()) {
 			return;
 		}
 		System.out.println("---EXCLUIR CURSO ---");
 		
 		System.out.println("Informe o Id do curso para excluir");
 		int idCurso = tec.nextInt()- 1; 
 		
 		if(cursos.size() <= idCurso) {
 			System.out.println("Curso não cadastrado.");
 			return;
 		}
 		cursos.remove(idCurso);
 	}
 	
 	public void menu(List<Curso> cursos) {
 		System.out.println("1)Cadastrar");
 		System.out.println("2)Listar");
 		System.out.println("3)Editar");
 		System.out.println("4)Excluir");
 		
 		System.out.println("informe o campo para ser editado: ");
 		int opcao= tec.nextInt();
 		
 		switch(opcao) {
 		
 		
 		case 1 : 
 			cursos.add(cadastrarCurso());
 			break;
 			
 		case 2 :
 			listarCurso(cursos);
 			break;
 			
 			
 		case 3 :
 			ediatCurso(cursos);
 			break;
 			
 			
 		case 4 : 
 			excluirCurso(cursos);
 			break;
 		
 		
 		
 		
 		
 		}
 	}
 
  	
}
