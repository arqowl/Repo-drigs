package atividades.circular1.questao1;

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
                aux = aux.getNext();
            }
        }
        return null;
    }

    public void showAllInverse(){
        DoublyNode<T> aux = this.last;

        if(this.isEmpty()){
            System.out.println("List is empty!");
        }

        else{
            for(int i = 0; i < nodeNumber; i++){
                System.out.println(aux.getInfo());
                aux = aux.getPrev();
            }
        }
  
    }

    public void remove(T value){
        DoublyNode<T> searchResult = this.searchList(value);
        DoublyNode<T> before;
        DoublyNode<T> after;

        if(this.isEmpty()){
            System.out.println("Vazia!");
        }
        else if(searchResult != null){
            if(value.compareTo(this.first.getInfo()) == 0 && this.nodeNumber == 1){
                this.first = null;
                this.last = null;
                this.nodeNumber = 0;
            }
            else if(value.compareTo(this.first.getInfo()) == 0){
                this.first = this.first.getNext();
                this.first.setPrev(null);
                this.nodeNumber--;
            }
            else if(value.compareTo(this.last.getInfo()) == 0){
                this.last = this.last.getPrev();
                this.last.setNext(null);
                this.nodeNumber--;
            }
            else{
                before = searchResult.getPrev();
                after = searchResult.getNext();
                before.setNext(after);
                after.setPrev(before);
            }
        }
        else{
            System.out.println("Não encontrado na lista!");
        }
        
        
        
        
    }



    
}
