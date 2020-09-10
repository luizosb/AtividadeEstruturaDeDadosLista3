package main;

import java.util.Scanner;

import lista.ListaOperacoes;


public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int op = 0;
		int e = 0;
		String livro;
		ListaOperacoes lista = new ListaOperacoes();
		Scanner sc = new Scanner(System.in);
		while(op!=9) {
			System.out.println("====================================================="
							 + "\nDigite a opção desejada"
						     + "\n1 - Percorrer a lista"
						     + "\n2 - Adicionar livro a lista"
						     + "\n3 - Remover o livro da lista"
						     + "\n=====================================================");
			op = sc.nextInt();
			switch (op) {
			case 1:
				lista.percorrerALista();
				break;
			case 2:
				System.out.print("Digite o nome do livro que deseja adicionar: ");
				livro = sc.next();
				System.out.print("Digite a quantidade de livros que deseja adicionar: ");
				e = sc.nextInt();
				lista.adicionarElemento(e, livro);
				break;
			case 3:
				lista.removerElemento();
				break;
			case 9:
				System.out.println("OPERAÇÃO FINALIZADA !");
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA");
				break;
			}
		}

	}

}
