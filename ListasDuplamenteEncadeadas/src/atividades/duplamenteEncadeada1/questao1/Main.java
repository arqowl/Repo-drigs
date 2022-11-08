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

            }

        }while(choice != 0);

    }

    public static void show(){
        System.out.println("1 - Cadastrar pessoa no prédio");
        System.out.println("2 - Remover cadastro da última pessoa");
        System.out.println("3 - Exibir pessoas no prédio");
        System.out.println("4 - Verificar se pessoa se encontra no prédio");
        System.out.println("5 - Numero de pessoas no prédio");
        System.out.println("6 - Remover pessoa do prédio");
        System.out.println("0 - Encerrar programa");
    }
}
