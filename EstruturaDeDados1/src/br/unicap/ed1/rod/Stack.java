package br.unicap.ed1.rod;

public class Stack<T> {
	private LSENode<T> top;
	
	public boolean isEmpty() {
		if(this.top == null) {
			return true;
		}
		else {
			return false;
		}
	}
	public void push(T valor) {  //inserir no início
		LSENode<T> novo = new LSENode(valor);
		novo.setProx(this.top);
		this.top = novo;
	}
	
	public boolean isFull(){
		return false;  // não tem como 
	}
	
	public T pop() {
		LSENode<T> aux = this.top;
		this.top = this.top.getProx();
		return aux.getInfo();
	}

}
