package AppBanco;

import java.util.Scanner;



public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha, password, called;

        queueClientes listaSenhas = new queueClientes();
        
        do{
            exibir();
            escolha = scan.nextInt(); scan.nextLine();

            if(escolha == 1){
                if(!listaSenhas.listFull()){
                    System.out.println("Digite uma senha de atendimento para o cliente: ");
                    password = scan.nextInt(); scan.nextLine();
                    listaSenhas.addPasswordToQueue(password);
                }
                else{
                    System.out.println("Lista está cheia!");
                }
            }
            if(escolha == 2){
                if(listaSenhas.listEmpty()){
                    System.out.println("Todos os clientes foram atendidos!");
                }
                else{
                    called = listaSenhas.callPassword();
                    System.out.println("Cliente de senha "+called+" chamado para atendimento!");

                } 
            }
            

        }while(escolha != 0);
        
    }

    public static void exibir(){
        System.out.println("1 - Gerar senha para cliente e colocar na fila");
        System.out.println("2 - Liberar atendimento para próximo cliente");
    }

    
    
}
