package listaComDescritor;

public class LSEComDescritor<T extends Comparable<T>> {
	//tipo <T> (genérico): Podemos criar listas com atributos de qualquer valor
	// as listas continuam sendo homogêneas
	// definimos a classe dps obj da lista genérica ao criá-las na main
	// quando eu crio uma classe, ela não vem com compareTo
	private LSENode<T> primeiro;
	private LSENode<T> ultimo;
	private int qtd;
	
	public boolean isEmpty() {
		if(this.qtd == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// inserir ordenado em ordem crescente e sem repetidos
	public void voidInserirOrdenado(T valor) {
		LSENode novo = new LSENode(valor);
		LSENode anterior = null, atual;
		
		if(this.isEmpty()) {
			this.primeiro = novo;
			this.ultimo = novo;
			this.qtd ++;
		}
		else if(valor.compareTo(this.primeiro.getInfo()) < 0){ // inserção no início
			 novo.setProx(this.primeiro);
			 this.primeiro = novo;
			 this.qtd ++;
		}
		else if(valor.compareTo(this.ultimo.getInfo()) > 0) { // inserção no final
			this.ultimo.setProx(novo);
			this.ultimo = novo;
			this.qtd ++;
		}
		else { // inserção no "meio" da lista
			atual = this.primeiro;
			while(atual != null) {
				if(atual.getInfo().compareTo(valor) > 0) { //achou ponto de inserção
					anterior.setProx(novo);
					novo.setProx(atual);
					qtd++;
					break;
				}
				else {
					anterior = atual;
					atual = atual.getProx();
				}
			}
		}
	}
	
	public void remover(T valor) {
		LSENode aux;
		LSENode<T> atual;
		LSENode anterior;
		if(this.isEmpty()) {
			System.out.println("Lista está vazia!");
		}
		else if(this.qtd == 1){
			if(valor.compareTo(this.primeiro.getInfo()) == 0) { // remoção de 1 nó com busca
				this.primeiro = null;
				this.ultimo = null;
				this.qtd = 0;
			}
			else {
				System.out.println("Valor não pertence a lista");
			}
		}
		else {  // lista com mais de 1 nó
			if(valor.compareTo(this.primeiro.getInfo()) == 0) {  //vendo se primeiro é igual ao procurado
				this.primeiro = this.primeiro.getProx();
				qtd --;
			}
			else if(valor.compareTo(this.primeiro.getInfo()) < 0) {  //se procurado vier antes de primeiro, n existe
				System.out.println("Valor não pertence a lista");
			}
			else if(valor.compareTo(this.ultimo.getInfo()) == 0) {  //se procurado for último nó
				aux = this.primeiro;
				while(aux.getProx() != this.ultimo) {
					aux = aux.getProx();
				}
				aux.setProx(null);
				this.ultimo = aux;
				this.qtd--;
			}
			else if(valor.compareTo(this.ultimo.getInfo()) > 0) { // se procurado for maior que último nó
				System.out.println("Valor não pertence a lista");
			}
			
			else {  // remoção no meio da lista
				anterior = null;
				atual = this.primeiro;
				while(atual != null) {
					if(valor.compareTo((atual.getInfo())) == 0) { // achou, remove
						anterior.setProx(atual.getProx());
						this.qtd --;
						break;
					}
					else if(valor.compareTo(atual.getInfo()) < 0) {
						System.out.println("Valor não pertence a lista");
					}
					else {
						anterior = atual;
						atual = atual.getProx();
					}
				}
			
			}
		}
	}
	
	
	
	
	/*
	public void inserirNoInicio(T valor) {
		LSENode<T> novo = new LSENode(valor);
		
		if(this.isEmpty()) {
			this.primeiro = novo;
			this.ultimo = novo;
			this.qtd = 1;
		}
		else {
			novo.setProx(this.primeiro);
			this.primeiro = novo;
			this.qtd ++;
		}
	}
	public void removerPrimeiro() {
		if(this.isEmpty()) {
			System.out.println("Lista está vazia!");
		}
		else if(this.qtd == 1) {
			this.primeiro = null;
			this.ultimo = null;
			this.qtd = 0;
		}
		else {
			this.primeiro = this.primeiro.getProx();
			this.qtd --;
		}
	}
	public void exibirTodos() {
		LSENode aux;
		if(this.isEmpty()) {
			System.out.println("Lista vazia!");
		}
		else {
			aux = this.primeiro;
			while(aux != null) {
				System.out.println(aux.getInfo());
				aux = aux.getProx();
			}
		}
	}
	*/
	
	
	
	

}
