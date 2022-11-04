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
        else{
            newNode.setNext(this.first);
            this.first.setPrev(newNode);
            this.first = newNode;
            this.nodeNumber++;
            this.last.setNext(this.first);
            this.first.setPrev(this.last);

        }
    }

    public void insertLast(T value){
        DoublyNode<T> newNode = new DoublyNode<>(value);

        if(this.isEmpty()){
            this.first = newNode;
            this.last = newNode;
            this.nodeNumber++;
            this.last.setNext(this.first);
            this.first.setPrev(this.last);
        }else{
            this.last.setNext(newNode);
            newNode.setPrev(this.last);
            this.last = newNode;
            this.nodeNumber++;
            this.last.setNext(this.first);
            this.first.setPrev(this.last);        
        }
        
    }

    public void showAll(){
        DoublyNode<T> aux = this.first;

        if(this.isEmpty()){
            System.out.println("List is empty!");
        }

        else{
            for(int i = 0; i < nodeNumber; i++){
                System.out.println(aux.getInfo());
                aux = aux.getNext();
            }
        }
  
    }

    public void deleteFirst(){
        if(this.isEmpty()){
            System.out.println("List is empty! ");
        }
        else if(this.nodeNumber == 1){
            this.first = null;
            this.last = null;
            this.nodeNumber = 0;
        }
        else{
            this.first = this.first.getNext();
            this.nodeNumber--;
            this.last.setNext(this.first);
            this.first.setPrev(this.last);
            
        }
    }

    public void deleteLast(){

        if(this.isEmpty()){
            System.out.println("List is empty! ");
        }
        else if(this.nodeNumber == 1){
            this.first = null;
            this.last = null;
            this.nodeNumber = 0;
        }
        else{
            this.last = this.last.getPrev();
            this.nodeNumber--;
            this.last.setNext(this.first);
            this.first.setPrev(this.last);
        }
    }

    public DoublyNode<T> searchList(T value){  //busca simples(não está ordenado)

        if(this.isEmpty()){
            return null;
        }
        else if(value.compareTo(this.first.getInfo()) == 0){
            return this.first;
        }
        else if(value.compareTo(this.last.getInfo()) == 0){
            return this.last;
        }
        
        else{
            DoublyNode<T> aux = this.first;
            for(int i = 0; i < this.nodeNumber; i++){
                if(aux.getInfo().compareTo(value) == 0){
                    return aux;
                }
            }
        }
        return null;
    }

    
}
