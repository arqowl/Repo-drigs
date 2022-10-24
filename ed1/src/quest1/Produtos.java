package quest1;

public class Produtos  {
	private String codigo;
	private String descricao;
	private double preco;
	private int estoque;
	
	
	public Produtos(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	
	public Produtos(String codigo) {
		this.codigo = codigo;
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public int compareTo(Produtos prod) {
		int resultado;
		resultado = this.getCodigo().compareTo(prod.getCodigo());
		return resultado;
	}


	@Override
	public String toString() {
		return "Produtos [codigo=" + this.codigo + ", descricao=" + this.descricao + ", Preco=" + this.preco + ", estoque=" + this.estoque
				+ "]";
	}
	
	
	
	

}
