import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoublyLinkedList<Integer> listaInteger = new DoublyLinkedList<>();
        int escolha;

        do{
            exibir();
            escolha = scan.nextInt(); scan.nextLine();

            if(escolha == 1){
                System.out.println("Digite um inteiro para inserir na lista");
                int num = scan.nextInt(); scan.nextLine();
                listaInteger.insertAscendingOrderRepeat(num);
            }
            else if(escolha == 2){
                listaInteger.showElementsFirstToLast();
            }

        }while(escolha != 0);

        

    }
    
    public static void exibir(){
        System.out.println("1 - Inserir ordenado com repetido(inteiros)");
        System.out.println("2 - mostrar lista");
    }
}
