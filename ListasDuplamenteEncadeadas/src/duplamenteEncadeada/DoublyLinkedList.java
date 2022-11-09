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

    

    /*public DoublyNode<T> simpleSearch(T value){  //busca simples

        if(this.isEmpty()){
            return null;
        }
        else if(value.compareTo(this.first.getData()) == 0){
            return this.first;
        }
        else if(value.compareTo(this.last.getData()) == 0){
            return this.last;
        }
        else{
            DoublyNode<T> currentNode = this.first;
            while(currentNode.getData().compareTo(value) != 0){
                currentNode = currentNode.getNext();

                if(currentNode == null){
                    return null;
                }
            }
        return currentNode;
        }
      
    }*/

    public DoublyNode<T> betterSearchAscendingOrder(T value){
        DoublyNode<T> currentNode = new DoublyNode<>(value);
        if(this.isEmpty()){
            return null;
        }
        else if(value.compareTo(this.first.getData()) == 0){
            return this.first;
        }
        else if(value.compareTo(this.last.getData()) == 0){
            return this.last;
        }
        else{
            currentNode = this.first;
            while(currentNode != null){
                if(value.compareTo(currentNode.getData()) > 0){  //Se a lista está em ordem crescente, e o valor que passamos é maior que o atual
                                                                 //então ele não está na lista
                    return null;
                }
                else if(value.compareTo(currentNode.getData()) == 0){
                    return currentNode;
                }
                else{
                    currentNode = currentNode.getNext();
                }
            }
        return null;
        }
        
    }

    public void insertAscendingOrderNoRepeat(T data) {

        DoublyNode<T> actualNode;
        DoublyNode<T> prevNode = null;

        DoublyNode<T> newNode = new DoublyNode<>(data);

        if (this.isEmpty()) {

            this.first = newNode;
            this.last = newNode;
            this.nodeCounter++;

        } else if (data.compareTo(this.first.getData()) < 0) {

            newNode.setNext(this.first);
            this.first.setPrevious(newNode);
            this.first = newNode;
            this.nodeCounter++;

        } else if (data.compareTo(this.last.getData()) > 0) {

            this.last.setNext(newNode);
            newNode.setPrevious(this.last);
            this.last = newNode;
            this.nodeCounter++;

        } else if (data.compareTo(this.last.getData()) == 0) {
            System.out.println("Repetead value");

        } else {

            actualNode = this.first;

            while (actualNode != null) {

                if (data.compareTo(actualNode.getData()) == 0) {

                    System.out.println("Repetead value");
                    return;

                } else if (data.compareTo(actualNode.getData()) < 0) {

                    prevNode = actualNode.getPrevious();
                    prevNode.setNext(newNode);
                    actualNode.setPrevious(newNode);
                    newNode.setNext(actualNode);
                    newNode.setPrevious(prevNode);
                    this.nodeCounter++;
                    return;

                } else {
                    
                    actualNode = actualNode.getNext();
                }

            }
        }

    }

    public void showElements(){
        if(this.isEmpty()){
            System.out.println("Vazia!");
        }
        else{
            DoublyNode<T> currentNode = this.first;
            while(currentNode != null){
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNext();
            }
        }
    }

    /*public void removeElement(T value){
        DoublyNode<T> elementFound = this.simpleSearch(value);
        DoublyNode<T> before, after;
        
        if(elementFound == null){
            System.out.println("Value has not been found");
        }
        else if(this.nodeCounter == 1){  //lista com apenas 1 nó
            this.first = null;
            this.last = null;
            this.nodeCounter = 0;
        }
        else if(elementFound == this.first){  //resultado igual a primeiro nó(remove primeiro)
            this.first = this.first.getNext();
            this.first.setPrevious(null);
            this.nodeCounter--;
        }
        else if(elementFound == this.last){  // resultado igual a último nó(remove último)
            this.last = this.last.getPrevious();
            this.last.setNext(null);
            this.nodeCounter--;
        }
        else{  // remover no "meio"
        before = elementFound.getPrevious();
        after = elementFound.getNext();

        before.setNext(after);
        after.setPrevious(before);
        this.nodeCounter--;
        }
    }  */

    public void removeElementAscendingOrderedList(T value){
        DoublyNode<T> elementFound = this.betterSearchAscendingOrder(value);
        DoublyNode<T> before, after;
        
        if(elementFound == null){
            System.out.println("Value has not been found");
        }
        else if(this.nodeCounter == 1){  //lista com apenas 1 nó
            this.first = null;
            this.last = null;
            this.nodeCounter = 0;
        }
        else if(elementFound == this.first){  //resultado igual a primeiro nó(remove primeiro)
            this.first = this.first.getNext();
            this.first.setPrevious(null);
            this.nodeCounter--;
        }
        else if(elementFound == this.last){  // resultado igual a último nó(remove último)
            this.last = this.last.getPrevious();
            this.last.setNext(null);
            this.nodeCounter--;
        }
        else{  // remover no "meio"
        before = elementFound.getPrevious();
        after = elementFound.getNext();

        before.setNext(after);
        after.setPrevious(before);
        this.nodeCounter--;
        }
    }  
}
