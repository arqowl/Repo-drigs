package quest3;

public class LSENumero {
	private LSENode primeiro;
	
	public boolean isEmpty(){
		if(this.primeiro == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void inserirPrimeiro(Numero number) {
		LSENode node = new LSENode(number);
		if(this.isEmpty()) {
			this.primeiro = node;
		}
		else {
			node.setProx(this.primeiro);
			this.primeiro = node;
		}
	}
	
	public void exibir() {
		LSENode aux;
		if(this.isEmpty()) {
			System.out.println("A lista está vazia!");
		}
		else {
			aux = this.primeiro;
			while(aux != null) {
				System.out.println(aux.getInfo());
				aux = aux.getProx();
			}
		}
	}
	
	public LSENumero somarListas(LSENumero lista) {
		LSENode aux, aux2, aux3;
		LSENumero lista1 = new LSENumero();
		LSENumero lista2 = new LSENumero();
		LSENumero lista3 = new LSENumero();
		
		if(this.isEmpty() && lista.isEmpty()){
	        System.out.println("As duas listas estão vazias!");
	    }else {
	    	aux = this.primeiro;
	    	aux2 = lista.primeiro;
	    	while(aux != null && aux2 != null) {
	    		int numero1 = aux.getInfo().getNumero();
	    		Numero numeroInserir = new Numero(numero1);
	    		lista1.inserirPrimeiro(numeroInserir);
	    		
	    		int numero2 = aux2.getInfo().getNumero();
	    		Numero numeroInserir2 = new Numero(numero2);
	    		lista2.inserirPrimeiro(numeroInserir2);
	    		
	    		int termo = (aux.getInfo().getNumero() + aux2.getInfo().getNumero());
	    		Numero numeroInserir3 = new Numero(termo);
	    		
	    		lista3.inserirPrimeiro(numeroInserir3);
	    		
	    		aux = aux.getProx();

	    		aux2 = aux2.getProx();
	    		
	    	}
	    }
		return lista3;
	}

}
