public class DoublyLinkedList<T extends Comparable<T>> {
    private DoublyNode<T> first;
    private DoublyNode<T> last;
    private int nodeCounter;
    private int nodeLimit;

    public boolean isEmpty(){
        if(this.nodeCounter == 0){
            return true;
        }
        return false;
    }

    public void insertFirst(T value){
        DoublyNode<T> newNode = DoublyNode <> (value);
        if(this.isEmpty()){

        }
    }



    
}
