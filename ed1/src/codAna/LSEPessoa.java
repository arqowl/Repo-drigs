package codAna;

public class LSEPessoa {
	private LSENode primeiro;
	
	public boolean isEmpty() {
		if(this.primeiro == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public LSENode buscar(Pessoa procurada) {
		LSENode aux;
		if(this.isEmpty()) {
			return null;
		}
		else {
			aux = this.primeiro;
			while(aux != null){
				if(aux.getInfo().compareTo(procurada) == 0) {
					return aux;
				}
				else {
					aux = aux.getProx();
				}
			}
		return null;
		}
	}
	
	public void inserirPrimeiro(Pessoa inserir) {
		LSENode resultado = this.buscar(inserir);
		LSENode novo = new LSENode(inserir);
		
		
		if(resultado != null) {
			System.out.println("Já existe na lista!");
		}
		else {
			if(this.primeiro == null) {
				this.primeiro = novo;
			}
			else {
				novo.setProx(this.primeiro);
				this.primeiro = novo;
			}
		}
	}
	public void inserirUltimo(Pessoa inserir) {
		LSENode resultado = this.buscar(inserir);
		LSENode novo = new LSENode(inserir);
		LSENode aux;
		
		if(resultado != null) {
			System.out.println("Já existe na lista!");
		}
		else {
			if(this.primeiro == null) {
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
	
	
	
	public LSEPessoa criarUniao(LSEPessoa outra) {
		LSEPessoa listaUniao = new LSEPessoa();
		LSENode aux;
		Pessoa original, copia;
		
		aux = this.primeiro;
		while(aux != null) {
			original = aux.getInfo();
			copia = original.copiarPessoa();
			listaUniao.inserirUltimo(copia);
			aux = aux.getProx();
		}
		
		aux = outra.primeiro;
		while(aux != null) {
			original = aux.getInfo();
			copia = original.copiarPessoa();
			listaUniao.inserirUltimo(copia);
			aux = aux.getProx();
		}
		return listaUniao;
	}
	
	public LSEPessoa criarListaInvertida() {
		LSEPessoa listaInvertida = new LSEPessoa();
		LSENode aux;
		Pessoa original;
		Pessoa copia;
		aux = this.primeiro;
		while(aux != null) {
			original = aux.getInfo();
			copia = original.copiarPessoa();
			listaInvertida.inserirPrimeiro(copia);
			aux = aux.getProx();
		}
		return listaInvertida;
	}

}
