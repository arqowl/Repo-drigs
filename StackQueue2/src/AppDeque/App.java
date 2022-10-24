package AppDeque;

import br.unicap.ed1.TAD.Deque;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> deque = new Deque();

        int choice, numInsert, popped, ejected;

        do{
            exibir();
            choice = scan.nextInt(); scan.nextLine();

            if(choice == 1){
                System.out.println("Digite um valor inteiro para inserir no deque: ");
                numInsert = scan.nextInt(); scan.nextLine();
                deque.push(numInsert);
            } 
            else if(choice == 2){
                popped = deque.pop();
                System.out.println("O valor removido foi "+popped);
            }
            else if(choice == 3){
                System.out.println("Digite um valor inteiro para inserir da última posição :");
                numInsert = scan.nextInt(); scan.nextLine();
                deque.inject(numInsert);
            }
            else if(choice == 4){
               ejected =  deque.eject();
               System.out.println("O valor removido foi "+ejected);
            }  

        }while(choice != 0);
        
    }

    public static void exibir(){
        System.out.println("1 - Inserir inteiro no deque");
        System.out.println("2 - Remover e retornar inteiro do deque");
        System.out.println("3 - Inserir inteiro na última posição do deque");
        System.out.println("4 - Remover e retornar último inteiro do deque");
    }
}
