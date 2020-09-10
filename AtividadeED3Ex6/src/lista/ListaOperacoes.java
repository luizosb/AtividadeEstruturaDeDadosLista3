package lista;

import concretos.Livros;

public class ListaOperacoes {

	static Livros dados[] = new Livros[5];
	int tamanho = 0;
	Object retirado;

	public  Object adicionarElemento(int qtd, String titulo) {
		if(tamanho == 0) {
			dados[0].setQtd(qtd);
			dados[0].setTitulo(titulo);
			tamanho++;
		} else if(tamanho == dados.length) {
			System.out.println("LISTA ESTÁ CHEIA!");
		} else {
			tamanho++;
			dados[tamanho-1].titulo = titulo;
			dados[tamanho-1].qtd = qtd;
		}
		return titulo ;
	}
	
	public Object removerElemento() {
		if(tamanho==0) {
			System.out.println("Há nenhum elemento para ser removido.");
		} else if (tamanho>0) {
			retirado = dados[0];
			dados[0] = null;
			for(int ind = 0; ind<tamanho; ind++) {
				if(ind+1==dados.length) {
					dados[dados.length-1]=null;
				} else {
					dados[ind] = dados[ind + 1];
				}
			}
			tamanho--;
		}
		return retirado;
	}
	
	public void percorrerALista() {
		for(int i=0; i < dados.length; i++ ) {
			System.out.print(dados[i]+"\n" );
		}
		System.out.println("A lista contém " + tamanho + " componentes.");
	}
}
