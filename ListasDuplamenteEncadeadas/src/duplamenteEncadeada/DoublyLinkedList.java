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
        DoublyNode<T> newNode = new DoublyNode <> (value);

        if(this.isEmpty()){
            this.first = newNode;
            this.last = newNode;
            this.nodeCounter = 1;
        }
        else{
            newNode.setNext(this.first);
            this.first.setPrevious(newNode);
            this.first = newNode;
            this.nodeCounter++;
        }
    }

    public void insertLast(T value){
        DoublyNode<T> newNode = new DoublyNode <> (value);

        if(this.isEmpty()){
            this.first = newNode;
            this.last = newNode;
            this.nodeCounter = 1;
        }
        else{
            this.last.setNext(newNode);
            newNode.setPrevious(this.last);
            this.last = newNode;
            this.nodeCounter++;
        }
    }

    public void deleteFirst(){

        if(this.isEmpty()){
            System.out.println("Lista vazia!");
        }
        else if(this.nodeCounter == 1){
            this.first = null;
            this.last = null;
            this.nodeCounter = 0;
        }
        else{
            this.first = this.first.getNext();
            this.first.setPrevious(null);
            this.nodeCounter--;
        }
    }

    public void deleteLast(){
        if(this.isEmpty()){
            System.out.println("Lista vazia!");
        }
        else if(this.nodeCounter == 1){
            this.first = null;
            this.last = null;
            this.nodeCounter = 0;
        }
        else{
            this.last = this.last.getPrevious();
            this.last.setNext(null);
            this.nodeCounter--;
        }
    }



    
}
