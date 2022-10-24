package lanchonete;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SistemaLanchonete filaDePedidos = new SistemaLanchonete();
        int escolha, numeroPedido, liberado;
        do{
            exibir();

            escolha = scan.nextInt(); scan.nextLine();

            if(escolha == 1){
                System.out.println("Digite o número do pedido a registrar: ");
                numeroPedido = scan.nextInt(); scan.nextLine();
                filaDePedidos.registrarPedido(numeroPedido); 
            }
            else if(escolha == 2){
                liberado = filaDePedidos.liberarPedido();
                System.out.println("O pedido de número "+liberado+" foi liberado!");
            
            }
        }while(escolha != 0);
    }

    public static void exibir(){
        System.out.println("1 - registrar pedido");
        System.out.println("2 - Liberar primeiro pedido");
        System.out.println("0 - sair");
    }

   
    
}
