package duplamenteEncadeadaCircular;

public class CircularLinkedList<T extends Comparable <T>> {
    private DoublyNode<T> first;
    private DoublyNode<T> last;
    private int nodeNumber;

    public boolean isEmpty(){
        if(this.nodeNumber == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void insertFirst(T value){
        DoublyNode<T> newNode = new DoublyNode<>(value);  
        
        if(this.isEmpty()){
            this.first = newNode;
            this.last = newNode;
            this.nodeNumber++;
            this.last.setNext(this.first);  //garantindo circularidade da lista
            this.first.setPrev(this.last);
        }
        
    }
}
