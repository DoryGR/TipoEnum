package principal;

import entities.Aluno;
import entities.Disciplina;
import entities.Matricula;
import entities.Turma;

public class Principal {

	public static void main(String[] args) {
		
		Turma t1 = new Turma(1, "2023.1");
		Turma t2 = new Turma(1, "2023.2");
		
		Disciplina d1 = new Disciplina("POOI", 72);
		Disciplina d2 = new Disciplina("POOII", 72);
		
		Aluno a1 = new Aluno("1", "Dory");
		Aluno a2 = new Aluno("2", "Carol");
		Aluno a3 = new Aluno("3", "Isabelle");
		Aluno a4 = new Aluno("4", "Ana Laura");
		
		Matricula m1 = new Matricula(a1, d1, t1);
		Matricula m2 = new Matricula(a2, d1, t1);
		Matricula m3 = new Matricula(a3, d1, t1);
		m3.confirmar();
		m3.aprovar();
		Matricula m4 = new Matricula(a3, d2, t1);
		
		a1.listarMatriculas();
		a3.listarMatriculas();
	}

}
