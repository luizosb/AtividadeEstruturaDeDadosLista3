package Main;

import java.util.Scanner;

import lista.lista1;

public class TesteLista {

	public static void main(String[] args) {
		int op=0;
		int e = 0;
		lista1 lista = new lista1();
		Scanner sc = new Scanner(System.in);
		while(op!=9) {
			System.out.println("====================================================="
							 + "\nDigite a opção desejada"
						     + "\n1 - Percorrer a lista"
						     + "\n2 - Adicionar valor a lista"
						     + "\n3 - Remover item da lista"
						     + "\n4 - Zerar lista"
						     + "\n=====================================================");
			op = sc.nextInt();
			switch (op) {
			case 1:
				lista.percorrerALista();
				break;
			case 2:
				System.out.print("Digite o valor que deseja adicionar: ");
				e = sc.nextInt();
				lista.adicionarElemento(e);
				break;
			case 3:
				lista.removerElemento();
				break;
			case 4:
				lista.zerarLista();
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
