package atividades.duplamenteEncadeada1.questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PessoasPredio listaPessoasPredio = new PessoasPredio();
        Scanner scan = new Scanner(System.in);
        int choice;

        do{
            show();
            choice = scan.nextInt(); scan.nextLine();

            if(choice == 1){
                System.out.println("Digite o nome da pessoa: ");
                String nome = scan.nextLine();
                System.out.println("Digite o RG da pessoa: ");
                String rg = scan.nextLine();
                Pessoa pessoaCadastrar = new Pessoa(nome, rg);
                listaPessoasPredio.adicionarCadastro(pessoaCadastrar);
            }else if(choice == 2){
                listaPessoasPredio.removerImediato();
            }else if(choice == 3){
                listaPessoasPredio.exibirInverso();
            }else if(choice == 4){
                System.out.println("Digite o RG da pessoa: ");
                String rg = scan.nextLine();
                listaPessoasPredio.presencaPredio(rg);
            }else if(choice == 5){
                listaPessoasPredio.quantidadePessoas();
            }else if(choice == 6){
                System.out.println("Digite o RG da pessoa: ");
                String rg = scan.nextLine();
                listaPessoasPredio.removerDaLista(rg);
            }
            

        }while(choice != 0);

    }

    public static void show(){
        System.out.println("1 - Cadastrar pessoa no prédio");
        System.out.println("2 - Remover cadastro da última pessoa");
        System.out.println("3 - Exibir pessoas no prédio na ordem inversa");
        System.out.println("4 - Verificar se pessoa se encontra no prédio");
        System.out.println("5 - Numero de pessoas no prédio");
        System.out.println("6 - Remover pessoa do prédio");
        System.out.println("0 - Encerrar programa");


    }
}
