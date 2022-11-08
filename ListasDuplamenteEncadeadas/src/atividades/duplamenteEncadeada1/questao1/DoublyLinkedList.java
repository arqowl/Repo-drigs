package atividades.duplamenteEncadeada1.questao1;

public class DoublyLinkedList<T extends Comparable<T>> {
    private DoublyNode<T> first;
    private DoublyNode<T> last;
    private int nodeCounter;


    //INÍCIO QUESTÃO 1:
    public boolean isEmpty(){
        if(this.nodeCounter == 0){
            return true;
        }
        return false;
    }

    public DoublyNode<T> search(T value){
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
            while(aux != null){
                if(aux.getInfo().compareTo(value) == 0){
                    return aux;
                }
            }  
        }
        return null;
    }

    public void cadastrar(T value){
        DoublyNode<T> newNode = new DoublyNode<>(value);
        DoublyNode<T> result = this.search(value);

        if(this.isEmpty()){
            this.first = newNode;
            this.last = newNode;
            this.nodeCounter = 1;
        }
        else{
            if(result != null){
                System.out.println("Usuário cadastrado!");
            }
            else if(this.nodeCounter == 1){
                this.first.setNext(newNode);
                newNode.setPrevious();
            }
            else{
                this.last.setNext(newNode);
                this.last.setPrevious(this.last);
                this.last = newNode;
                this.nodeCounter++;
            }
        }
    }

    public void cancelar(){
        if(this.isEmpty()){
            System.out.println("Lista vazia!");
        }

        else if(this.nodeCounter == 1){
            this.first = null;
            this.last = null;
            nodeCounter = 0;
        }
        else{
            this.last = this.last.getPrevious();
            this.last.setNext(null);
            this.nodeCounter--;
        }
    }

    public void exibir(){
        if(this.isEmpty()){
            System.out.println("Vazia!");
        }
        else{
            DoublyNode<T> aux = this.first;
            while(aux != null){
                System.out.println(aux.getInfo());
                aux = aux.getNext();
            }
        }
    }

    public void verificarPresenca(T value){
        DoublyNode<T> aux = this.first;

        if(this.isEmpty()){
            System.out.println("Lista vazia!");
        }
        else if(this.first.getInfo().compareTo(value) == 0){
            System.out.println("Presente!");
        }
        else if(this.last.getInfo().compareTo(value) == 0){
            System.out.println("Presente!");
        }
        else{
            while(aux != null){
                if(aux.getInfo().compareTo(value) == 0) {
					System.out.println("Presente!");
				}
            }
        System.out.println("Não está na lista!");
        }
    }

    

   
     public void remover(T value){
        DoublyNode<T> previous;
        DoublyNode<T> after;

        DoublyNode<T> result = this.search(value);

        if(this.isEmpty()){
            System.out.println("Lista vazia");
        }
        if(result == null){
            System.out.println("Pessoa não encontrada!");
        }
        else{
            if(value.compareTo(this.first.getInfo()) == 0){
                this.first = this.first.getNext();
                this.first.setPrevious(null);
                this.nodeCounter--;

            }else if(value.compareTo(this.last.getInfo()) == 0){
                this.last = this.last.getPrevious();
                this.last.setNext(null);
                this.nodeCounter++;
            }else{
                previous = result.getPrevious();
                after = result.getNext();

                previous.setNext(after);
                after.setPrevious(previous);   
            }    
        }
        
     }
     //FIM QUESTÃO 1---------------------------------------------------------

     //INICIO QUESTÃO 3(inserir em order crescente e aceita valores repetidos)
     public void insertAscendingOrderRepeat(T data) {

        DoublyNode<T> actualNode;
        DoublyNode<T> prevNode = null;

        DoublyNode<T> newNode = new DoublyNode<>(data);

        if (this.isEmpty()) {

            this.first = newNode;
            this.last = newNode;
            this.nodeCounter++;

        } else if (data.compareTo(this.first.getInfo()) < 0) {

            newNode.setNext(this.first);
            this.first.setPrevious(newNode);
            this.first = newNode;
            this.nodeCounter++;

        } else if (data.compareTo(this.last.getInfo()) > 0) {

            this.last.setNext(newNode);
            newNode.setPrevious(this.last);
            this.last = newNode;
            this.nodeCounter++;

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
                    this.nodeCounter++;
                    return;

                } else {
                    
                    actualNode = actualNode.getNext();
                }

            }
        }


    }
    public void insertDescendingOrderNoRepeat(T data){
        DoublyNode<T> result = this.betterSearch(data);
        DoublyNode<T> currentNode;
        
        DoublyNode<T> newNode = new DoublyNode<>(data);
        if (this.isEmpty()) {
            this.first = newNode;
            this.last = newNode;
            this.nodeCounter++;
        }
        else if(result == null){
            if(data.compareTo(this.first.getInfo()) > 0){
                newNode.setNext(newNode);
                this.first.setPrevious(newNode);
                this.first = newNode;
            }
            else if(data.compareTo(this.last.getInfo()) < 0){
                this.last.setNext(newNode);
                newNode.setPrevious(this.last);
                this.last = newNode;
            }
            else{
                currentNode = this.first;
          
                
                if(data.compareTo(currentNode.getInfo()) > 0){
                    
                }
                else{
                     currentNode = currentNode.getNext();
                }
                
            }
        }
        else{
            System.out.println("Valor já existe!");
        }
    }

    public void insertDescendingOrderRepeat(T data){

    }

    public DoublyNode<T> betterSearch (T value){  // busca sequencial melhorada
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






    
}
