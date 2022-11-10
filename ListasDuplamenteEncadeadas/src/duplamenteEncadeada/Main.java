import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int escolha;

        do{
            exibir();
            escolha = scan.nextInt(); scan.nextLine();
        }while(escolha != 0);
    }

    public static void exibir(){
        System.out.println("1 - inserir valores em ordem crescente com repetido");
        System.out.println("2 - Mostrar a lista");
    }
    
}
