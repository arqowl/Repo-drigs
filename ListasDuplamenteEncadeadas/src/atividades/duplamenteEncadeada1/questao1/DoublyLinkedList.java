package atividades.duplamenteEncadeada1.questao1;

public class DoublyLinkedList<T> {
    private DoublyNode<T> first;
    private DoublyNode<T> last;
    private int nodeCounter;

    public boolean isEmpty(){
        if(this.nodeCounter == 0){
            return true;
        }
        return false;
    }

    
}
