package atividades.duplamenteEncadeada1.questao1;

public class PessoasPredio {
    private DoublyLinkedList<Pessoa> filaPessoas;


    public PessoasPredio() {
        this.filaPessoas = new DoublyLinkedList<>();
    }

    public void adicionarCadastro(Pessoa pessoa){
        filaPessoas.insertLast(pessoa);
    }

    public void removerImediato(){
        filaPessoas.removeLast();
    }

    public void exibirInverso(){
        filaPessoas.showDataInverse();
    }

    public boolean presencaPredio(String rg){

        Pessoa pessoaComparar = new Pessoa(rg);
        if(filaPessoas.searchList(pessoaComparar) != null){
            return true;
        }else{
            return false;
        } 
    }

    public int quantidadePessoas(){
        return filaPessoas.getNodeCount();
    }

    public void removerDaLista(String rg){
        Pessoa pessoaRemover = new Pessoa(rg);
        filaPessoas.remove(pessoaRemover);  
    }



    
    
}
