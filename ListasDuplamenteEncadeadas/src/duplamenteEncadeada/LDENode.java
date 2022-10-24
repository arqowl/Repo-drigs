package duplamenteEncadeada;

public class LDENode<T extends Comparable<T>> {
    private LDENode<T> ant;
    private T info;
    private LDENode <T> prox;

    public LDENode (T valor){
        this.info = valor;
    }

    public LDENode<T> getAnt() {
        return ant;
    }

    public void setAnt(LDENode<T> ant) {
        this.ant = ant;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public LDENode<T> getProx() {
        return prox;
    }

    public void setProx(LDENode<T> prox) {
        this.prox = prox;
    }

    
    
}
