package listaComDescritor;

public class LSENode<T extends Comparable<T>> {
	//Classe T herda comparable, que vai ser inserido no nó.
	//forma do sistema garantir que a classe inserira no nó terá método comparable(extends).
	private T info;
	private LSENode<T> prox;
	
	public LSENode(T valor) {
		this.info = valor;
	}
	
	public void setInfo(T valor) {
		this.info = valor;
	}
	
	public T getInfo() {
		return this.info;
	}
	
	public void setProx(LSENode<T> novoProx) {
		this.prox = novoProx;
	}
	
	public LSENode<T> getProx(){
		return this.prox;
	}

}
