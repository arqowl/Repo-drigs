public class DoublyNode<T extends Comparable<T>> {
    private DoublyNode<T> next;
    private DoublyNode<T> previous;
    private T value;

    
    public DoublyNode(T value) {
        this.value = value;
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
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }


}
