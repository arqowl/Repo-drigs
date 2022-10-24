package quest3;

public class Numero {
	private int numero;
	
	public Numero(int n) {
		this.numero = n;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Numero [numero=" + this.numero + "]";
	}
	
	
	
}
