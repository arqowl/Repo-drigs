public class DoublyNode<T> {
    private DoublyNode<T> next ;
    private DoublyNode<T> prev ;
    private int nodeCount;

    
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
    public int getNodeCount() {
        return nodeCount;
    }
    public void setNodeCount(int nodeCount) {
        this.nodeCount = nodeCount;
    }

    
}
