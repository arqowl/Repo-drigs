package quest1;

import java.util.Scanner;

public class LSEProdutos {
	private LSENode primeiro;
	
	public boolean isEmpty() {
		if(this.primeiro == null) {
			return true;
		}
		else {
			return false;
		}
	}
	public LSENode buscar(Produtos prod) {
		LSENode aux;
		if(this.isEmpty()) {
			return null;
		}
		else {
			aux = this.primeiro;
			while(aux != null) {
				if(aux.getInfo().compareTo(prod) == 0) {
					return aux;
				}
				else {
					aux = aux.getProx();
				}
			}
			return null;
		}
	}
	
	public void inserirPrimeiro(Produtos prodInserir) {
		LSENode resultado = this.buscar(prodInserir);
		LSENode novo = new LSENode(prodInserir);
		
		if(resultado != null) {
			System.out.println("Aluno já existe na lista!");
		}
		else {
			if(this.isEmpty()) {
				this.primeiro = novo;
			}
			else {
				novo.setProx(this.primeiro);
				this.primeiro = novo;
			}
		}
	}
	
	
	
	public void inserirFinal(Produtos prodInserir) {
		LSENode resultado = this.buscar(prodInserir);
		LSENode novo = new LSENode (prodInserir);
		LSENode aux;
		
		if(resultado != null) {
			System.out.println("Já existe na lista!");
		}
		else {
			if(this.isEmpty()) {
				this.primeiro = novo;
			}
			else {
				aux = this.primeiro;
				while(aux.getProx() != null) {
					aux = aux.getProx();
				}
			aux.setProx(novo);	
			}
			
		}
	}
	public void removerPrimeiro() {
		if(this.isEmpty()) {
			System.out.println("A lista está vazia!");
		}
		else {
			this.primeiro = this.primeiro.getProx();
		}
	}
	
	public void removerUltimo() {
		LSENode aux;
		LSENode antes = null;
		if(this.isEmpty()) {
			System.out.println("A lista está vazia!");
		}
		else if(this.primeiro.getProx() == null) {
			this.primeiro = null;
		}
		else {
			aux = this.primeiro;
			while(aux.getProx() != null) {
				antes = aux;
				aux = aux.getProx();
			}
		antes.setProx(null);
		}
	}
	
	public void exibirProdutos() {
		LSENode aux;
		if(this.isEmpty()) {
			System.out.println("A lista está vazia!");
		}
		else {
			aux = this.primeiro;
			while(aux != null) {
				System.out.println(aux.getInfo().getDescricao());
				aux = aux.getProx();
			}
		}
	}
	public void exibirDados(String codigo) {
		//poderia também usando função busca que nem na próxima função
		Produtos exibirDado = new Produtos(codigo);
		LSENode resultado = this.buscar(exibirDado);
		
		if(resultado == null) {
			System.out.println("Aluno não encontrado");
		}
		else {
			System.out.println(resultado.getInfo());
		}
		
	}
	public void alterarDados(String codigo) {
		Scanner scan = new Scanner(System.in);
		Produtos alterarDado = new Produtos(codigo);
		LSENode resultado = this.buscar(alterarDado);
		
		if(resultado == null) {
			System.out.println("Aluno não encontrado!");
		}
		else {
			System.out.println("Digite um novo preço para o produto: ");
			double preco = scan.nextDouble(); scan.nextLine();
			System.out.println("Digite o novo estoque do produto: ");
			int estoque = scan.nextInt(); scan.nextLine();
			
			resultado.getInfo().setPreco(preco);
			resultado.getInfo().setEstoque(estoque);
			
		}
	}
	public void removerProduto(String codigo) {
		Produtos procurado = new Produtos(codigo);
		LSENode atualAux, antesAux;
		
		if(this.isEmpty()) {
			System.out.println("Lista Vazia!");
		}
		else if(this.primeiro.getProx() == null) {
			if(procurado.compareTo(this.primeiro.getInfo()) == 0) {
				this.primeiro = null;
			}
			else {
				System.out.println("Aluno não encontrado!");
			}
		}
		else {
			if(procurado.compareTo(this.primeiro.getInfo()) == 0) {
				this.primeiro = this.primeiro.getProx();
			}
			else {
				antesAux = null;
				atualAux = this.primeiro;
				while(atualAux != null) {
					if(atualAux.getInfo().compareTo(procurado) != 0) {
						antesAux = atualAux;
						atualAux = atualAux.getProx();
					}
					else {
						break;
					}
				}
				if(atualAux == null) {
					System.out.println("O valor não pertence a lista");
				}
				else {
					antesAux.setProx(atualAux.getProx());
				}
			}
		}
		
	}
	
	
	
	
	

}
