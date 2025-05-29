package entities;

import java.util.Objects;

public class Disciplina {
	
	private String nome;
	private int cargaHoraria;
	
	public Disciplina(String nome, int cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", cargaHoraria=" + cargaHoraria + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargaHoraria, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return cargaHoraria == other.cargaHoraria && Objects.equals(nome, other.nome);
	}

}
