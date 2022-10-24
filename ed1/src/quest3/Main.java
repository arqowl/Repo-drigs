package quest3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LSENumero lista1 = new LSENumero();
		LSENumero lista2 = new LSENumero();
		LSENumero lista3 = new LSENumero();
		int escolha;
		do {
			exibir();
			escolha = scan.nextInt(); scan.nextLine();
			
			if(escolha == 1) {
				System.out.println("Digite o número inteiro que quer inserir na lista 1");
				int numero1 = scan.nextInt(); scan.nextLine();
				Numero numero = new Numero(numero1);
				lista1.inserirPrimeiro(numero);
			}
			else if(escolha == 2) {
				System.out.println("Digite o número inteiro que quer inserir na lista 2");
				int numero2 = scan.nextInt(); scan.nextLine();
				Numero numero = new Numero(numero2);
				lista2.inserirPrimeiro(numero);
			}
			else if(escolha == 3) {
				lista1.exibir();
			}
			else if(escolha == 4) {
				lista2.exibir();
			}
			else if(escolha == 5) {
				lista3 = lista1.somarListas(lista2);
			}
			else if(escolha == 6) {
				lista3.exibir();
			}
		}while(escolha != 0);

	}


	public static void exibir() {
		System.out.println("1 - Inserir inteiro em primeiro na lista 1: ");
		System.out.println("2 - Inserir inteiro em primeiro na lista 2: ");
		System.out.println("3 - Exibir lista 1 de inteiros");
		System.out.println("4 - Exibir lista 2 de inteiros");
		System.out.println("5 - Somar listas de inteiros");
		System.out.println("6 - exibir a lista soma das duas");
		
	}
}
