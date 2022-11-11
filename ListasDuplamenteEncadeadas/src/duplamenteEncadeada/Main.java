import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoublyLinkedList<Integer> listaInteiros = new DoublyLinkedList<>();

        int escolha;

        do{
            exibir();
            escolha = scan.nextInt(); scan.nextLine();
            if(escolha == 1){
                System.out.println("Digite o inteiro para inserir na lista: ");
                int num = scan.nextInt(); scan.nextLine();
                listaInteiros.insertionSortAscending(num);
            }
            
            else if(escolha == 2){
                System.out.println("Lista abaixo!");
                listaInteiros.showElementsFirstToLast();
                System.out.println();
                System.out.println("Fim da lista!!!");
            }

            
        }while(escolha != 0);
    }

    public static void exibir(){
        System.out.println("1 - inserir valores em ordem crescente com repetido");
        System.out.println("2 - Mostrar a lista");
    }
    
}

