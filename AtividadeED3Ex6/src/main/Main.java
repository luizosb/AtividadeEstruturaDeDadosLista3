package main;

import java.util.Scanner;

import lista.ListaOperacoes;
import lista.PilhaOperacoes;
import listaComPilha.lista1;
import listaComPilha.pilha1;


public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int op = 0;
		int e = 0;
		String livros;
		Object retirado = null;
		ListaOperacoes lista = new ListaOperacoes();
		PilhaOperacoes pilha = new PilhaOperacoes();
		Scanner sc = new Scanner(System.in);
		while (op != 9) {
			System.out.println("=====================================================" 
					+ "\nDigite a opção desejada"
					+ "\n1 - Percorrer a lista" 
					+ "\n2 - Remover item da pilha para a lista" 
					+ "\n3 - Remover item da lista para a pilha"
					+ "\n4 - Zerar lista"
					+ "\n5 - Adicionar a lista"
					+ "\n6 - Adicionar a pilha"
					+ "\n7 - Percorrer a pilha"
					+ "\n8 - Ordenar a pilha"
					+ "\n9 - Sair da aplicação"
					+ "\n=====================================================");
			op = sc.nextInt();
			switch (op) {
			case 1:
				lista.percorrerALista();
				break;
			case 2:
				retirado = pilha.removerElemento();
				lista.adicionarElemento(retirado);
				break;
			case 3:
				retirado = lista.removerElemento();
				pilha.adicionarElemento(retirado);
				break;
			case 4:
				lista.zerarLista();
				break;
			case 5:
				System.out.print("Digite o livro que deseja incluir na lista: ");
				e = sc.nextInt();
				livros = sc.next();
				lista.adicionarElemento(e, livros);
				break;
			case 6:
				System.out.print("Digite o livros que deseja incluir na pilha: ");
				e = sc.nextInt();
				pilha.adicionarElemento(e, livros);
				break;
			case 7:
				pilha.percorrerALista();
				break;
			case 8:
				pilha.ordenarPilha();
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
