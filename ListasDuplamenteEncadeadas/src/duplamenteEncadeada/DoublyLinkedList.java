public class DoublyLinkedList<T extends Comparable<T>> {
    private DoublyNode<T> first;
    private DoublyNode<T> last;
    private int qtd;
    private int nodeLimit;

    public boolean isEmpty(){
        if(this.qtd == 0){
            return true;
        }
        return false;
    }

    public void insertFirst(T value){
        DoublyNode<T> aux = new DoublyNode <> (value);

        if(this.isEmpty()){
            this.first = aux;
            this.last = aux;
            this.qtd = 1;
        }
        else{
            aux.setNext(this.first);
            this.first.setPrevious(aux);
            this.first = aux;
            this.qtd++;
        }
    }

    public void insertLast(T value){
        DoublyNode<T> aux = new DoublyNode <> (value);

        if(this.isEmpty()){
            this.first = aux;
            this.last = aux;
            this.qtd = 1;
        }
        else{
            this.last.setNext(aux);
            aux.setPrevious(this.last);
            this.last = aux;
            this.qtd++;
        }
    }

    public void deleteFirst(){

        if(this.isEmpty()){
            System.out.println("Lista vazia!");
        }
        else if(this.qtd == 1){
            this.first = null;
            this.last = null;
            this.qtd = 0;
        }
        else{
            this.first = this.first.getNext();
            this.first.setPrevious(null);
            this.qtd--;
        }
    }

    public void deleteLast(){
        if(this.isEmpty()){
            System.out.println("Lista vazia!");
        }
        else if(this.qtd == 1){
            this.first = null;
            this.last = null;
            this.qtd = 0;
        }
        else{
            this.last = this.last.getPrevious();
            this.last.setNext(null);
            this.qtd--;
        }
    }

    

    /*public DoublyNode<T> simpleSearch(T value){  //busca simples

        if(this.isEmpty()){
            return null;
        }
        else if(value.compareTo(this.first.getValue()) == 0){
            return this.first;
        }
        else if(value.compareTo(this.last.getValue()) == 0){
            return this.last;
        }
        else{
            DoublyNode<T> current = this.first;
            while(current.getValue().compareTo(value) != 0){
                current = current.getNext();

                if(current == null){
                    return null;
                }
            }
        return current;
        }
      
    }*/

    public DoublyNode<T> betterSearchAscendingOrder(T value){
        DoublyNode<T> current = new DoublyNode<>(value);
        if(this.isEmpty()){
            return null;
        }
        else if(value.compareTo(this.first.getValue()) == 0){
            return this.first;
        }
        else if(value.compareTo(this.last.getValue()) == 0){
            return this.last;
        }
        else{
            current = this.first;
            while(current != null){
                if(value.compareTo(current.getValue()) > 0){  //Se a lista está em ordem crescente, e o valor que passamos é maior que o atual
                                                                 //então ele não está na lista
                    return null;
                }
                else if(value.compareTo(current.getValue()) == 0){
                    return current;
                }
                else{
                    current = current.getNext();
                }
            }
        return null;
        }
        
    }

    private DoublyNode<T> betterSearchDescendingOrder(T value){
        DoublyNode<T> current = new DoublyNode<>(value);
        if(this.isEmpty()){
            return null;
        }
        else if(value.compareTo(this.first.getValue()) == 0){
            return this.first;
        }
        else if(value.compareTo(this.last.getValue()) == 0){
            return this.last;
        }
        else{
            current = this.first;
            while(current != null){
                if(value.compareTo(current.getValue()) < 0){  //Se a lista está em ordem decrescente, e o valor que passamos é menor que o atual
                                                                 //então ele não está na lista
                    return null;
                }
                else if(value.compareTo(current.getValue()) == 0){
                    return current;
                }
                else{
                    current = current.getNext();
                }
            }
        return null;
        }
        
    }

    public void insertAscendingOrderNoRepeat(T Value) {

        DoublyNode<T> actualNode;
        DoublyNode<T> prevNode = null;

        DoublyNode<T> aux = new DoublyNode<>(Value);

        if (this.isEmpty()) {

            this.first = aux;
            this.last = aux;
            this.qtd++;

        } else if (Value.compareTo(this.first.getValue()) < 0) {

            aux.setNext(this.first);
            this.first.setPrevious(aux);
            this.first = aux;
            this.qtd++;

        } else if (Value.compareTo(this.last.getValue()) > 0) {

            this.last.setNext(aux);
            aux.setPrevious(this.last);
            this.last = aux;
            this.qtd++;

        } else if (Value.compareTo(this.last.getValue()) == 0) {
            System.out.println("Repetead value");

        } else {

            actualNode = this.first;

            while (actualNode != null) {

                if (Value.compareTo(actualNode.getValue()) == 0) {

                    System.out.println("Repetead value");
                    return;

                } else if (Value.compareTo(actualNode.getValue()) < 0) {

                    prevNode = actualNode.getPrevious();
                    prevNode.setNext(aux);
                    actualNode.setPrevious(aux);
                    aux.setNext(actualNode);
                    aux.setPrevious(prevNode);
                    this.qtd++;
                    return;

                } else {
                    
                    actualNode = actualNode.getNext();
                }

            }
        }

    }

    public void insertAscendingOrderRepeat(T Value){
        DoublyNode<T> aux = new DoublyNode<>(Value);
        //Checa se está vazio
        if(this.isEmpty()){
            this.first = aux;
            this.last = aux;
            this.qtd++;
        }
        //Checar se o que será inserido é menor ou igual ao primeiro
        else if(Value.compareTo(this.first.getValue()) <= 0){
            aux.setNext(this.first);
            this.first.setPrevious(aux);
            this.first = aux;
            this.qtd++;
        }
        //Checa se é maior do que o último
        else if(Value.compareTo(this.last.getValue()) > 0){
            this.last.setNext(aux);
            aux.setPrevious(this.last);
            this.last = aux;
            this.qtd++;
        }
        //Inserção no meio
        else{
            DoublyNode<T> current = this.first.getNext();
            while(current != null){
                if(Value.compareTo(current.getValue()) <= 0){
                    aux.setPrevious(current.getPrevious());
                    aux.setNext(current);
                    current.getPrevious().setNext(aux);
                    current.setPrevious(aux);
                    this.qtd++;
                    break;
                }
                else{
                    current = current.getNext();
                }
            }
        }
      
    }

    public void insertDescendingOrderRepeat(T Value){
        DoublyNode<T> aux = new DoublyNode<>(Value);
        //Checa se está vazio
        if(this.isEmpty()){
            this.first = aux;
            this.last = aux;
            this.qtd++;
        }
        //Checar se possui apenas um nó
        if(qtd==1){
            if(Value.compareTo(this.first.getValue())<=0){
                this.first.setNext(aux);
                aux.setPrevious(this.first);
                this.last = aux;
                this.qtd++;
            } else{
                this.last.setPrevious(aux);
                aux.setNext(this.last);
                this.first = aux;
                this.qtd++;
            }
        }
        //Inserção no meio
        else{
            DoublyNode<T> current = this.first.getNext();
            while(current != null){
                if((Value.compareTo(current.getValue()) <= 0)&&(Value.compareTo(current.getNext().getValue()) != 0)){
                    aux.setPrevious(current);
                    aux.setNext(current.getNext());
                    current.setNext(aux);
                    current.getNext().setPrevious(aux);
                    this.qtd++;
                } 
                else{
                    current = current.getNext();
                }
            }
        }
      
    }

    public void insertDescendingOrderNoRepeat(T Value) {

        DoublyNode<T> actualNode;
        DoublyNode<T> prevNode = null;

        DoublyNode<T> aux = new DoublyNode<>(Value);

        if (this.isEmpty()) {

            this.first = aux;
            this.last = aux;
            this.qtd++;

        } else if (Value.compareTo(this.first.getValue()) > 0) {

            aux.setNext(this.first);
            this.first.setPrevious(aux);
            this.first = aux;
            this.qtd++;

        } else if (Value.compareTo(this.last.getValue()) < 0) {

            this.last.setNext(aux);
            aux.setPrevious(this.last);
            this.last = aux;
            this.qtd++;

        } else if (Value.compareTo(this.last.getValue()) == 0) {
            System.out.println("Repetead value");

        } else {

            actualNode = this.first;

            while (actualNode != null) {

                if (Value.compareTo(actualNode.getValue()) == 0) {

                    System.out.println("Repetead value");
                    return;

                } else if (Value.compareTo(actualNode.getValue()) > 0) {

                    prevNode = actualNode.getPrevious();
                    prevNode.setNext(aux);
                    actualNode.setPrevious(aux);
                    aux.setNext(actualNode);
                    aux.setPrevious(prevNode);
                    this.qtd++;
                    return;

                } else {
                    
                    actualNode = actualNode.getNext();
                }
            }
        }

    }

    public void insertDecrescentOrder(T Value) {

        DoublyNode<T> aux = new DoublyNode<>(Value);
        DoublyNode<T> prevNode;
        DoublyNode<T> nextNode;

        if (this.isEmpty()) {

            this.first = aux;
            this.last = aux;
            this.qtd++;

        } else if (Value.compareTo(this.first.getValue()) > 0) {

            aux.setNext(this.first);
            this.first.setPrevious(aux);
            this.first = aux;
            this.qtd++;

        } else if (Value.compareTo(this.last.getValue()) < 0 || (Value.compareTo(this.last.getValue()) == 0)) {

            aux.setPrevious(this.last);
            this.last.setNext(aux);
            this.last = aux;
            this.qtd++;

        } else if (Value.compareTo(this.first.getValue()) == 0) {

            nextNode = this.first.getNext();
            nextNode.setPrevious(aux);
            this.first.setNext(aux);
            aux.setNext(nextNode);
            aux.setPrevious(this.first);
            this.qtd++;
            

        } else {

            prevNode = this.first.getNext();

            for (int i = 1; i < qtd; i++) {

                if (Value.compareTo(prevNode.getValue()) == 0 || Value.compareTo(prevNode.getValue()) > 0) {

                    nextNode = prevNode.getNext();
                    nextNode.setPrevious(aux);
                    prevNode.setNext(aux);
                    aux.setPrevious(prevNode);
                    aux.setNext(nextNode);
                    this.qtd++;
                    return;

                } else {

                    prevNode = prevNode.getNext();
                }

            }
        }

    }

    public void showInfoDescendingNoRepeat(T value){
        DoublyNode<T> valueFound = this.betterSearchDescendingOrder(value);

        if(valueFound == null){
            System.out.println("Valor não encontrado");
        }else{
            System.out.println(valueFound.getValue());
        }
    }

    public void showElementsFirstToLast(){
        if(this.isEmpty()){
            System.out.println("Vazia!");
        }
        else{
            DoublyNode<T> current = this.first;
            while(current != null){
                System.out.println(current.getValue());
                current = current.getNext();
            }
        }
    }

    public void showElementsLastToFirst(){
        if(this.isEmpty()){
            System.out.println("Vazia!");
        }
        else{
            DoublyNode<T> current = this.last;
            while(current != null){
                System.out.println(current.getValue());
                current = current.getPrevious();
            }
        }
    }

    public void insertionSortAscending(T Value){
        DoublyNode<T> aux = new DoublyNode<>(Value);
        //Checando se a lista está vazia
        if(this.isEmpty()){
            this.first = aux;
            this.last = aux;
            this.qtd++;
        }
        //Checando se a lista possui um nó
        else if(this.qtd == 1){
            if(Value.compareTo(aux.getValue())<=0){
                this.first.setPrevious(aux);
                aux.setNext(this.first);
                this.first = aux;
                this.qtd++;
            } else{
                this.last.setNext(aux);
                aux.setPrevious(this.last);
                this.last = aux;
                this.qtd++;
            }
        } 
        //Checando com mais de um nó
        else{
            //Se for menor que o primeiro
            if(Value.compareTo(this.first.getValue())<=0){
                aux.setNext(this.first);
                this.first.setPrevious(aux);
                this.first = aux;
                this.qtd++;
            } else{
                DoublyNode<T> current = this.first;
                while(current != null){
                    if(Value.compareTo(current.getValue())<=0){
                        aux.setNext(current);
                        aux.setPrevious(current.getPrevious());
                        current.getPrevious().setNext(aux);
                        current.setPrevious(aux);
                        qtd++;
                        break;
                    } else{
                        current = current.getNext();
                    }
    
                }
            }
        }
    }

    public void insertionSortDescending(T Value){
        DoublyNode<T> current = this.last;
        DoublyNode<T> aux = new DoublyNode<>(Value);
        //Checando se a lista está vazia
        if(this.isEmpty()){
            this.first = aux;
            this.last = aux;
            this.qtd++;
        }
        //Checando se a lista possui um nó
        else if(this.qtd == 1){
            if(Value.compareTo(this.first.getValue())>0){
                this.first.setPrevious(aux);
                aux.setNext(this.first);
                this.first = aux;
                this.qtd++;
            } else{
                this.last.setNext(aux);
                aux.setPrevious(this.last);
                this.last = aux;
                this.qtd++;
            }
        }  
        //Checando com mais de um nó
        else{
            //Se for menor que o primeiro
            if(Value.compareTo(this.first.getValue())>0){
                this.first.setPrevious(aux);
                aux.setNext(this.first);
                this.first = aux;
                this.qtd++;
            }
            //Se for menor ou igual ao último
            else if(Value.compareTo(this.last.getValue())<=0){
                this.last.setNext(aux);
                aux.setPrevious(this.last);
                this.last = aux;
                this.qtd++;
            }
            else{

                while(current != null){
                    if(Value.compareTo(current.getValue())<=0){
                        aux.setNext(current.getNext());
                        aux.setPrevious(current);
                        current.getNext().setPrevious(aux);
                        current.setNext(aux);
                        qtd++;
                        break;
                    } else{
                        current = current.getPrevious();
                    }
    
                }
            }
        }
    }

    /*public void removeElement(T value){
        DoublyNode<T> elementFound = this.simpleSearch(value);
        DoublyNode<T> before, after;
        
        if(elementFound == null){
            System.out.println("Value has not been found");
        }
        else if(this.qtd == 1){  //lista com apenas 1 nó
            this.first = null;
            this.last = null;
            this.qtd = 0;
        }
        else if(elementFound == this.first){  //resultado igual a primeiro nó(remove primeiro)
            this.first = this.first.getNext();
            this.first.setPrevious(null);
            this.qtd--;
        }
        else if(elementFound == this.last){  // resultado igual a último nó(remove último)
            this.last = this.last.getPrevious();
            this.last.setNext(null);
            this.qtd--;
        }
        else{  // remover no "meio"
        before = elementFound.getPrevious();
        after = elementFound.getNext();

        before.setNext(after);
        after.setPrevious(before);
        this.qtd--;
        }
    }  */

    public void removeElementAscendingOrderedListNoRepeat(T value){
        DoublyNode<T> elementFound = this.betterSearchAscendingOrder(value);
        DoublyNode<T> before, after;
        
        if(elementFound == null){
            System.out.println("Value has not been found");
        }
        else if(this.qtd == 1){  //lista com apenas 1 nó
            this.first = null;
            this.last = null;
            this.qtd = 0;
        }
        else if(elementFound == this.first){  //resultado igual a primeiro nó(remove primeiro)
            this.first = this.first.getNext();
            this.first.setPrevious(null);
            this.qtd--;
        }
        else if(elementFound == this.last){  // resultado igual a último nó(remove último)
            this.last = this.last.getPrevious();
            this.last.setNext(null);
            this.qtd--;
        }
        else{  // remover no "meio"
        before = elementFound.getPrevious();
        after = elementFound.getNext();

        before.setNext(after);
        after.setPrevious(before);
        this.qtd--;
        }
    }

    public void removeElementDescendingOrderedListNoRepeat(T value){
        DoublyNode<T> elementFound = this.betterSearchDescendingOrder(value);
        DoublyNode<T> before, after;
        
        if(elementFound == null){
            System.out.println("Value has not been found");
        }
        else if(this.qtd == 1){  //lista com apenas 1 nó
            this.first = null;
            this.last = null;
            this.qtd = 0;
        }
        else if(elementFound == this.first){  //resultado igual a primeiro nó(remove primeiro)
            this.first = this.first.getNext();
            this.first.setPrevious(null);
            this.qtd--;
        }
        else if(elementFound == this.last){  // resultado igual a último nó(remove último)
            this.last = this.last.getPrevious();
            this.last.setNext(null);
            this.qtd--;
        }
        else{  // remover no "meio"
        before = elementFound.getPrevious();
        after = elementFound.getNext();

        before.setNext(after);
        after.setPrevious(before);
        this.qtd--;
        }
    }  
}

