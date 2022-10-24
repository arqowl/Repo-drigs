package inv;

public class LSEAlunos {
	private LSENode primeiro;
	
	public boolean isEmpty() {
		if(this.primeiro == null) {
			return true;
		}
		else {
			return false;
		}
	}
	public LSENode buscar(Alunos al) {
		LSENode aux;
		if(this.isEmpty()) {
			return null;
		}
		else {
			aux = this.primeiro;
			while(aux != null) {
				if(aux.getInfo().compareTo(al) == 0) {
					return aux;
				}
				else {
					aux = aux.getProx();
				}
			}
			return null;
		}
	}
	public void exibir() {
		LSENode aux;
		if(this.isEmpty()) {
			System.out.println("Lista vazia!");
		}
		else {
			aux = this.primeiro;
			while (aux != null){
				System.out.println(aux.getInfo());
				aux = aux.getProx();
			}
		}
	}
	public void inserirPrimeiro(Alunos al) {
		LSENode resultado = this.buscar(al);
		LSENode novo = new LSENode(al);
		
		if(this.isEmpty()) {
			this.primeiro = novo;
		}
		else {
			novo.setProx(this.primeiro);
			this.primeiro = novo;
		}
	}
	
	public LSEAlunos inverter() {
		LSEAlunos listaInvertida = new LSEAlunos();
		LSENode aux;
		aux = this.primeiro;
		while(aux != null) {
			listaInvertida.inserirPrimeiro(aux.getInfo());
			aux = aux.getProx();
		}
	return listaInvertida;
	}
	

}
