package atividades.duplamenteEncadeada1.questao1;

public class DoublyNode<T extends Comparable<T>> {
    private DoublyNode<T> next;
    private DoublyNode<T> previous;
    private T info;

    public DoublyNode(T info) {
        this.info = info;
    }

    public DoublyNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    public DoublyNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode<T> previous) {
        this.previous = previous;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

}
