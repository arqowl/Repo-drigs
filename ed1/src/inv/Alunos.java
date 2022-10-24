package inv;

import quest1.Produtos;

public class Alunos {
	private String nome;
	private String matricula;
	
	public Alunos(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Alunos [nome=" + this.nome + ", matricula=" + this.matricula + "]";
	}
	
	public int compareTo(Alunos aluno) {
		int resultado;
		resultado = this.getMatricula().compareTo(aluno.getMatricula());
		return resultado;
	}
	
	
	
	

}
