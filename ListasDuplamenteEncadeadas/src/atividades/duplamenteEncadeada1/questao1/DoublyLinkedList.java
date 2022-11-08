package atividades.duplamenteEncadeada1.questao1;

public class DoublyLinkedList<T extends Comparable<T>> {

    private DoublyNode<T> first;
    private DoublyNode<T> last;
    private int nodeCount;

    public boolean isEmpty() {

        if (this.nodeCount == 0) {
            return true;

        }

        return false;

    }

    public void insertFirst(T data) {

        DoublyNode<T> newNode = new DoublyNode<>(data);

        if (this.isEmpty()) {

            this.first = newNode;
            this.last = newNode;
            this.nodeCount++;

        } else {

            newNode.setNext(this.first);
            this.first.setPrevious(newNode);
            this.first = newNode;
            this.nodeCount++;
        }

    }

    public void insertLast(T data) {

        DoublyNode<T> newNode = new DoublyNode<>(data);

        if (this.isEmpty()) {

            this.first = newNode;
            this.last = newNode;
            this.nodeCount++;

        } else {

            this.last.setNext(newNode);
            newNode.setPrevious(this.last);
            this.last = newNode;
            this.nodeCount++;

        }

    }

    public void showData() {

        DoublyNode<T> aux;

        if (this.isEmpty()) {

            System.out.println("List is empty");

        } else {

            aux = this.first;

            while (aux != null) {

                System.out.print(aux.getInfo() + " ");
                aux = aux.getNext();

            }

            System.out.println(" ");
        }
    }

    public void showDataLast() {

        DoublyNode<T> aux;

        if (this.isEmpty()) {

            System.out.println("List is empty");

        } else {

            aux = this.last;

            while (aux != null) {

                System.out.print(aux.getInfo() + " ");
                aux = aux.getPrevious();

            }

            System.out.println(" ");
        }
    }

    public void removeFirst() {

        if (this.isEmpty()) {

            System.out.println("List is empty");

        } else if (this.nodeCount == 1) {

            this.first = null;
            this.last = null;
            this.nodeCount--;

        } else {

            this.first = this.first.getNext();
            this.first.setPrevious(null);
            this.nodeCount--;

        }

    }

    public void removeLast() {

        if (this.isEmpty()) {

            System.out.println("List is empty");

        } else if (this.nodeCount == 1) {

            this.first = null;
            this.last = null;
            this.nodeCount--;

        } else {

            this.last = this.last.getPrevious();
            this.last.setNext(null);
            this.nodeCount--;
        }

    }

    public void insertAscendingOrderRepeat(T data) {

        DoublyNode<T> actualNode;
        DoublyNode<T> prevNode = null;

        DoublyNode<T> newNode = new DoublyNode<>(data);

        if (this.isEmpty()) {

            this.first = newNode;
            this.last = newNode;
            this.nodeCount++;

        } else if (data.compareTo(this.first.getInfo()) < 0) {

            newNode.setNext(this.first);
            this.first.setPrevious(newNode);
            this.first = newNode;
            this.nodeCount++;

        } else if (data.compareTo(this.last.getInfo()) > 0) {

            this.last.setNext(newNode);
            newNode.setPrevious(this.last);
            this.last = newNode;
            this.nodeCount++;

        } else if (data.compareTo(this.last.getInfo()) == 0) {
            System.out.println("Repetead value");

        } else {

            actualNode = this.first;

            while (actualNode != null) {

                if (data.compareTo(actualNode.getInfo()) == 0) {

                    System.out.println("Repetead value");
                    return;

                } else if (data.compareTo(actualNode.getInfo()) < 0) {

                    prevNode = actualNode.getPrevious();
                    prevNode.setNext(newNode);
                    actualNode.setPrevious(newNode);
                    newNode.setNext(actualNode);
                    newNode.setPrevious(prevNode);
                    this.nodeCount++;
                    return;

                } else {
                    
                    actualNode = actualNode.getNext();
                }

            }
        }

    }

    public void insertDescendingOrderRepeat(T data) {

        DoublyNode<T> actualNode;
        DoublyNode<T> prevNode = null;

        DoublyNode<T> newNode = new DoublyNode<>(data);

        if (this.isEmpty()) {

            this.first = newNode;
            this.last = newNode;
            this.nodeCount++;

        } else if (data.compareTo(this.first.getInfo()) > 0) {

            newNode.setNext(this.first);
            this.first.setPrevious(newNode);
            this.first = newNode;
            this.nodeCount++;

        } else if (data.compareTo(this.last.getInfo()) < 0) {

            this.last.setNext(newNode);
            newNode.setPrevious(this.last);
            this.last = newNode;
            this.nodeCount++;

        } else if (data.compareTo(this.last.getInfo()) == 0) {
            System.out.println("Repetead value");

        } else {

            actualNode = this.first;

            while (actualNode != null) {

                if (data.compareTo(actualNode.getInfo()) == 0) {

                    System.out.println("Repetead value");
                    return;

                } else if (data.compareTo(actualNode.getInfo()) > 0) {

                    prevNode = actualNode.getPrevious();
                    prevNode.setNext(newNode);
                    actualNode.setPrevious(newNode);
                    newNode.setNext(actualNode);
                    newNode.setPrevious(prevNode);
                    this.nodeCount++;
                    return;

                } else {
                    
                    actualNode = actualNode.getNext();
                }

            }
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
            for(int i = 0; i < this.nodeCount; i++){
                if(aux.getInfo().compareTo(value) == 0){
                    return aux;
                }
                aux = aux.getNext();
            }
        }
        return null;
    }
    
    public DoublyNode<T> betterSeachList (T value){  // busca sequencial melhorada
        DoublyNode<T> aux;

        

        if(this.isEmpty()){
            return null;
        }
        else if(value.compareTo(this.last.getInfo()) == 0){
            return this.last;
        }
        else if(value.compareTo(this.last.getInfo()) > 0){
            return null;
        }
        else{
            aux = this.first;
            while(aux.getNext() != null){
                if(aux.getInfo().compareTo(value) == 0){  //achei
                    return aux;
                }
                else if(value.compareTo(aux.getInfo()) > 0){
                    aux = aux.getNext();
                }
                else{
                    return null;
                }
            }
        }
        return null;
    }

    public void betterRemove(T value){
        DoublyNode<T> result = this.betterSeachList(value);

        DoublyNode<T> before, after;

        if(result == null){
            System.out.println("Value has not been found");
        }
        else if(this.nodeCount == 1){  //lista com apenas 1 nó
            this.first = null;
            this.last = null;
            this.nodeCount = 0;
        }
        else if(result == this.first){  //resultado igual a primeiro nó(remove primeiro)
            this.first = this.first.getNext();
            this.first.setPrevious(null);
            this.nodeCount--;
        }
        else if(result == this.last){  // resultado igual a último nó(remove último)
            this.last = this.last.getPrevious();
            this.last.setNext(null);
            this.nodeCount--;
        }
        else{  // remover no "meio"
        before = result.getPrevious();
        after = result.getNext();

        before.setNext(after);
        after.setPrevious(before);
        this.nodeCount--;

        }
    }
    

}
