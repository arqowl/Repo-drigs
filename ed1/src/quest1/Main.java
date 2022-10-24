package quest1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LSEProdutos lista = new LSEProdutos();
		int escolha;
		
		do {
			exibir();
			escolha = scan.nextInt(); scan.nextLine();
			
			if(escolha == 1) {
				System.out.println("Digite o código do produto");
				String codigo = scan.nextLine();
				System.out.println("Digite a descrição do produto");
				String descricao = scan.nextLine();
				Produtos primeiroInserido = new Produtos(codigo, descricao);
				lista.inserirPrimeiro(primeiroInserido);
			}
			else if(escolha == 2) {
				System.out.println("Digite o código do produto");
				String codigo = scan.nextLine();
				System.out.println("Digite a descrição do produto");
				String descricao = scan.nextLine();
				Produtos ultimoInserido = new Produtos(codigo, descricao);
				lista.inserirFinal(ultimoInserido);	
			}
			else if(escolha == 3) {
				lista.removerPrimeiro();
			}
			else if(escolha == 4) {
				lista.removerUltimo();
			}
			else if(escolha == 5) {
				lista.exibirProdutos();
			}
			else if(escolha == 6) {
				System.out.println("Digite o código do produto que quer exibir informações");
				String codExibir = scan.nextLine();
				lista.exibirDados(codExibir);
			}
			else if(escolha == 7) {
				System.out.println("Digite o código do produto que quer alterar os dados");
				String codAlterarDados = scan.nextLine();
				lista.alterarDados(codAlterarDados);
			}
			else if(escolha == 8) {
				System.out.println("Digite o código do produto que quer remover da lista");
				String codRemover = scan.nextLine();
				lista.removerProduto(codRemover);
			}
			
		}while(escolha != 0);
	}
	
	public static void exibir() {
		System.out.println("1 - Inserir novo produto no início da lista: ");
		System.out.println("2 - Inserir novo produto no fim da lista: ");
		System.out.println("3 - Remover o primeiro produto da lista: ");
		System.out.println("4 - Remover o último produto da lista: ");
		System.out.println("5 - Exibir todos os produtos da lista: ");
		System.out.println("6 - Exibir os dados de um produto da lista: ");
		System.out.println("7 - Alterar os dados de um produto da lista: ");
		System.out.println("8 - Remover um dado produto: ");
		System.out.println("0 - Sair do programa: ");
	}
}


	
