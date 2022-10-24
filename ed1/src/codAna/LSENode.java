package codAna;

public class LSENode {
	private Pessoa info;
	private LSENode prox;
	
	public LSENode(Pessoa info) {
		this.info = info;
	}

	public Pessoa getInfo() {
		return info;
	}

	public void setInfo(Pessoa info) {
		this.info = info;
	}

	public LSENode getProx() {
		return prox;
	}

	public void setProx(LSENode prox) {
		this.prox = prox;
	}
	
	

}
