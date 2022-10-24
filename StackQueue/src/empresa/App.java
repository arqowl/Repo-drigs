package empresa;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;
        QueueProjetosPatrocinio fila = new QueueProjetosPatrocinio();
        String empresaPatrocinadora, proposta;

        do{

            exibir();
            escolha = scan.nextInt(); scan.nextLine();

            if(escolha == 1){
                System.out.println("Digite o nome da empresa: ");
                empresaPatrocinadora = scan.nextLine();
                System.out.println("Escreva a proposta da empresa: ");
                proposta = scan.nextLine();
                ProjetosPatrocinio projetoNovo = new ProjetosPatrocinio(empresaPatrocinadora, proposta);
                fila.inserirProjeto(projetoNovo);
            }
            else if(escolha == 2){
                ProjetosPatrocinio projetoAnalisar = fila.analisarProjeto();
                System.out.println(projetoAnalisar);
            }
            else if(escolha == 3){
                fila.liberarProjeto();
            }

        }while(escolha != 0);


    }
    public static void exibir(){
        System.out.println("1 - Registrar um novo projeto");
        System.out.println("2 - Analisar o projeto no começo da fila");
        System.out.println("3 - Liberar projeto para análise do próximo");
        System.out.println("0 - Encerrar");
    }

    
}
