package atividades.duplamenteEncadeada1.questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoublyLinkedList<Pessoa> listaPessoas = new DoublyLinkedList();
        int escolha;

        do{
            exibir();
            escolha = scan.nextInt(); scan.nextLine();
            if(escolha == 1){
                System.out.println("Digite o nome da pessoa");
                String nome = scan.nextLine();
                System.out.println("Digite o RG da pessoa: ");
                String rg = scan.nextLine();

                Pessoa pessoaCadastrar = new Pessoa(nome, rg);

            }

        }while(escolha != 0);
    }

    public static void exibir(){
        System.out.println("1 - Cadastrar pessoa na lista de presença do prédio");
        System.out.println("2- remover imediatamente a presença da última pessoa cadastrada");
        System.out.println("3 - Exibir lista de pessoas");
        System.out.println("4 - Verificar se pessoa se encontra em prédio");
        System.out.println("5 - Remover pessoa por RG");
        System.out.println("0 - Encerrar programa");
    }
}
