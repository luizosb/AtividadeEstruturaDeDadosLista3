package lista;

import concretos.Livros;

public class PilhaOperacoes {
	static Livros dados[] = new Livros[5];
	int tamanho = 0;
	Object retirado = null;

	public Object adicionarElemento(int e, String titulo) {
		if(tamanho == 0) {
			dados[0].setQtd(e);
			dados[0].setTitulo(titulo);
			tamanho++;
		} else if(tamanho == dados.length) {
			System.out.println("LISTA ESTÁ CHEIA!");
		} else {
			tamanho++;
			dados[tamanho-1].setQtd(e);
			dados[tamanho-1].setTitulo(titulo);
		}
		return titulo;
	}
	
	public Object removerElemento() {
		if(tamanho==0) {
			System.out.println("Há nenhum elemento para ser removido.");
		} else if (tamanho>0) {
			retirado = dados[tamanho-1];
			dados[tamanho-1] = null;
			tamanho--;
		}
		return retirado;
	}

	public void ordenarPilha() {
		
		
	}
	
}
