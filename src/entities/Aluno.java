package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

	private String cpf;
	private String nome;
	private List<Matricula> listaMatricula = new ArrayList<>();
	
	public Aluno(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public boolean adicionaDisciplinaMatriculada(Matricula matricula) {
		
		if (matricula != null && !listaMatricula.contains(matricula)) {
			listaMatricula.add(matricula);
			return true;
		}
		return false;
	}
	
	public boolean removerDisciplinaMatriculada(Matricula matricula) {
		
		if (matricula != null && listaMatricula.contains(matricula)) {
			listaMatricula.remove(matricula);
			return true;
		}
		return false;
	}
	
	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}
	
	public List<Matricula> getListaMatriculas(){
		return listaMatricula;
	}
	
	public void listarMatriculas() {
		
		if (listaMatricula.isEmpty()) {
			System.out.println("Aluno não tem matricula!");
		}
		else {
			System.out.println("Aluno(a): " + nome);
			for (Matricula m : listaMatricula) {
				System.out.println(m.toString());
			}
		}
	}

	@Override
	public String toString() {
		return "Aluno [cpf=" + cpf + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}
	
}
