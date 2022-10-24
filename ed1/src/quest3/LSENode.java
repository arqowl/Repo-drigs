package quest3;

public class LSENode {
	private Numero info;
	private LSENode prox;
	
	public LSENode(Numero info) {
		this.info = info;
	}
	public Numero getInfo() {
		return info;
	}
	public void setInfo(Numero info) {
		this.info = info;
	}
	public LSENode getProx() {
		return prox;
	}
	public void setProx(LSENode prox) {
		this.prox = prox;
	}
	
	
	
	
	

}
