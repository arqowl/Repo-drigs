package codAna;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String rg;
	private double altura;
	private int idade;
	
	public Pessoa(String nome, String rg, double altura, int idade) {
		this.nome = nome;
		this.rg = rg;
		this.altura = altura;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int compareTo(Pessoa pessoa) {
		return this.getRg().compareTo(pessoa.getRg());
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + ", altura=" + altura + ", idade=" + idade + "]";
	}
	
	public Pessoa copiarPessoa() {
		Pessoa nova = new Pessoa(this.nome, this.rg, this.altura, this.idade);
		return nova;	
	}
	
	


	
	
	
	
	
	

}
