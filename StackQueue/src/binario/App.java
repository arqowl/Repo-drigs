package binario;
import java.util.Scanner;
import br.unicap.ed1.rod.Stack;


public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> binaryNumber = new Stack();
        int numero, quociente = 1, resto = 0, binario;

        System.out.println("Digite um número para converter em binário: ");
        numero = scan.nextInt(); scan.nextLine();

        while(quociente != 0){
        quociente = numero / 2;
        resto = numero % 2;
        binaryNumber.push(resto);
        numero = quociente;
        }

        while(!binaryNumber.isEmpty()){
            binario = binaryNumber.pop();
            System.out.print(binario);
        }

         
    }
}
