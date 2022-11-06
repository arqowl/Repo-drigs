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

    public DoublyNode<T> verificar(String rg){
        Pessoa pessoaComparar = new Pessoa(rg);

        if(this.isEmpty()){
            return null;
        }
        else if(pessoaComparar.compareTo(this.first.getInfo()) == 0){
            
        }
        
        
    }



    
}
