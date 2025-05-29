package entities;


import java.util.Date;

import entities.enums.Status;

public class Matricula {
	
	private Date dataMatricula;
	private Aluno aluno;
	private Disciplina disciplina;
	private Turma turma;
	private Status status;
	
	public Matricula(Aluno aluno, Disciplina disciplina, Turma turma) {
		this.dataMatricula = new Date();
		this.disciplina = disciplina;
		this.turma = turma;
		this.status = Status.MATRICULADO;
		this.aluno = aluno;
		this.aluno.adicionaDisciplinaMatriculada(this);
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public Turma getTurma() {
		return turma;
	}

	public Status getStatus() {
		return status;
	}
	
	public void confirmar() {
		if (status == Status.MATRICULADO || status == Status.TRANCADO) {
		    status = Status.CURSANDO;
		}
	}

	public void trancar() {
		if (status == Status.CURSANDO) {
			status = Status.TRANCADO;
		}
	}
	
	public void aprovar() {
		if (this.status == Status.CURSANDO)	{
			this.status = Status.CONCLUIDO;
		}
	}
	
	public void reprovar() {
		if (this.status == Status.CURSANDO)	{
			this.status = Status.REPROVADO;
		}
	}

	@Override
	public String toString() {
		return "Matricula (Status - " + status + 
			   ") " + dataMatricula +  
			   "\nDisciplina " + disciplina.getNome() + 
			   "\nTurma=" + turma.getNome() + "\n";
	}
	
	
}
