package palindromo;
import java.util.Scanner;
import br.unicap.ed1.rod.Stack;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<Character> palindromo = new Stack();
        String palavra, reverse = "";
        
        

        System.out.println("Digite uma palavra para verificar se é palíndromo: ");
        palavra = scan.nextLine();
        
        int tam = palavra.length();

        for(int i = 0; i < tam; i++){
            if(!Character.isWhitespace(palavra.charAt(i))){
                palindromo.push(palavra.charAt(i));
            }
        }

        while(!palindromo.isEmpty()){
            reverse = reverse + palindromo.pop();
        }

        if(palavra.compareToIgnoreCase(reverse) == 0){
            System.out.println("É palíndromo!");
        }
        else{
            System.out.println("Não é palíndromo!");
        }

       

    }

}
