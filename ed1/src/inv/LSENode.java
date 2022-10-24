package inv;

public class LSENode {
	private Alunos info;
	private LSENode prox;
	
	public LSENode(Alunos info) {
		this.info = info;
	}

	public Alunos getInfo() {
		return info;
	}

	public void setInfo(Alunos info) {
		this.info = info;
	}

	public LSENode getProx() {
		return prox;
	}

	public void setProx(LSENode prox) {
		this.prox = prox;
	}
	
	
	
	

}
