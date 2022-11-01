package duplamenteEncadeadaCircular;

public class DoublyNode<T> {
    private DoublyNode<T> next ;
    private DoublyNode<T> prev ;
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
    public DoublyNode<T> getPrev() {
        return prev;
    }
    public void setPrev(DoublyNode<T> prev) {
        this.prev = prev;
    }
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
}
