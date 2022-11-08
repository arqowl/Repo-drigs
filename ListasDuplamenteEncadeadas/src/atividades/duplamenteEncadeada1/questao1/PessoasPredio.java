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

    public void presencaPredio(String rg){

        Pessoa pessoaComparar = new Pessoa(rg);
        if(filaPessoas.searchList(pessoaComparar) != null){
            System.out.println("Sim, esta pesso se encontra no prédio!");
        }else{
            System.out.println("A pessoa procurada não se encontra no prédio!");
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
