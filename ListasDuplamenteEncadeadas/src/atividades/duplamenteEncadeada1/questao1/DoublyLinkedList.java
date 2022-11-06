package atividades.duplamenteEncadeada1.questao1;

public class DoublyLinkedList<T extends Comparable<T>> {
    private DoublyNode<T> first;
    private DoublyNode<T> last;
    private int nodeCounter;

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

    public boolean verificarPresenca(T value){
        DoublyNode<T> aux = this.first;

        if(this.isEmpty()){
            return false;
        }
        else if(this.first.getInfo().compareTo(value) == 0){
            return true;
        }
        else if(this.last.getInfo().compareTo(value) == 0){
            return true;
        }
        else{
            while(aux != null){
                if(aux.getInfo().compareTo(value) == 0) {
					return true;
				}
            }
        return false;
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





    
}
