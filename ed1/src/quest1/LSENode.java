package quest1;

public class LSENode {
	private Produtos info;
	private LSENode prox;
	
	public LSENode(Produtos info) {
		this.info = info;
	}

	
	public Produtos getInfo() {
		return info;
	}

	public void setInfo(Produtos info) {
		this.info = info;
	}

	public LSENode getProx() {
		return prox;
	}

	public void setProx(LSENode prox) {
		this.prox = prox;
	}
	
	
	
	

}
