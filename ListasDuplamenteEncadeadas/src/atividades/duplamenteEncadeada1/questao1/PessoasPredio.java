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

    public void quantidadePessoas(){
        int num = filaPessoas.getNodeCount();
        System.out.println("O número de pessoas no prédio é "+num);
    }

    public void removerDaLista(String rg){
        Pessoa pessoaRemover = new Pessoa(rg);
        filaPessoas.remove(pessoaRemover);  
    }



    
    
}
