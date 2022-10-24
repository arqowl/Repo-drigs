package duplamenteEncadeada;

public class LDE<T extends Comparable<T>> {  //Tipo genérico T herda comparable

    private LDENode<T> primeiro;
    private LDENode<T> ultimo;
    private int qtd;

    public boolean isEmpty(){
        if(this.qtd == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void inserirInicio(T valor){
        LDENode<T> novo = new LDENode<>(valor);

        if(this.isEmpty()){
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }
        else{
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        }
    }

    public void inserirFinal(T valor){
        LDENode<T> novo = new LDENode<>(valor);

        if(this.primeiro.getProx() == null){
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }
       else{
        this.ultimo.setProx(novo);
        novo.setAnt(this.ultimo);
        this.ultimo = novo;
        this.qtd++;
       }
    }

    public void exibir(){
        LDENode<T> aux;

        if(this.isEmpty()){
            System.out.println("Lista vazia!");
        }
        else{
            aux = this.primeiro;
            while(aux != null){
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void exibirContrario(){
        LDENode<T> aux;

        if(this.isEmpty()){
            System.out.println("Lista vazia!");
        }
        else{
            aux = this.ultimo;
            while(aux != null){
                System.out.println(aux.getInfo());
                aux = aux.getAnt();
            }
        }
    }

    public void removerInicio(){
        if(this.isEmpty()){
            System.out.println("Lista vazia!!!");
        }
        else if(this.qtd == 1){
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
        }
        else{
            this.primeiro = this.primeiro.getProx();
            this.primeiro.setAnt(null);
            this.qtd --;
        }
    }

    public void removerFinal(){  //sem usar comando de repetição
        
    }



    
}
