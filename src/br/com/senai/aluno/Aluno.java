package br.com.senai.aluno;

import java.util.Calendar;

import br.com.senai.Endereco.Endereco;

public class Aluno extends Endereco{
	private String nomeAluno;
	private int  idadeAluno;
	private String curso;
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public int getIdadeAluno() {
		return idadeAluno;
	}
	public void setIdadeAluno(int idadeAluno) {

		this.idadeAluno = idadeAluno;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
