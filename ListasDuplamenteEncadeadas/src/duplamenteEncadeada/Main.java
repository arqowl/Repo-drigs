import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;
        DoublyLinkedList<Integer> lista = new DoublyLinkedList<>();
        

        do{
            exibir();
            escolha = scan.nextInt(); scan.nextLine();

            if(escolha == 1){
                System.out.println("Digite um inteiro");
                int valor = scan.nextInt(); scan.nextLine();
                lista.insertLast(valor);

            }else if(escolha ==2){
                System.out.println("Digite um inteiro");
                int valor = scan.nextInt(); scan.nextLine();
                if(lista.simpleSearch(valor) != null){
                    System.out.println("Está na lista!");
                }
                else{
                    System.out.println("Não se encontra na lista!");
                }
            }   

        }while(escolha != 0);
        
    }

    public static void exibir(){
        System.out.println("1 - inserir valor: ");
        System.out.println("2 - verificar se valor está na lista");
    }
    
}
