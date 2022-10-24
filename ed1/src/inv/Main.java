package inv;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LSEAlunos listaNormal = new LSEAlunos();
		LSEAlunos listaInvertida = new LSEAlunos();
		
		int escolha;
		do {
			exibir();
			escolha = scan.nextInt(); scan.nextLine();
			if(escolha == 1) {
				System.out.println("Digite o nome do aluno");
				String nome = scan.nextLine();
				System.out.println("Digite a matricula do aluno");
				String matricula = scan.nextLine();
				
				Alunos alunoNovo = new Alunos(nome, matricula);
				listaNormal.inserirPrimeiro(alunoNovo);
			}
			else if(escolha == 2) {
				listaNormal.exibir();
			}
			else if(escolha == 3) {
				listaInvertida = listaNormal.inverter();
				listaInvertida.exibir();
			}
			
			
			
		}while(escolha != 0);

	}
	
	public static void exibir() {
		System.out.println("1 - Inserir novo aluno no início da lista: ");
		System.out.println("2 - Mostrar lista normal");
		System.out.println("3 - Inverter lista e mostrar");
	}

}
