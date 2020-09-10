package lista;

import concretos.Livros;

public class PilhaOperacoes {

	public Livros dados[] = new Livros[0];
	int tamanho = 0;

	public Object adicionarElemento(int e, String titulo) {
		dados[0] = new Livros(e, titulo);
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
	
	public void removerElemento() {
		if(tamanho==0) {
			System.out.println("Há nenhum elemento para ser removido.");
		} else if (tamanho>0) {
			dados[tamanho-1] = null;
			tamanho--;
		}
	}
	
	public void percorrerALista() {
		for(int i=0; i < dados.length; i++ ) {
			System.out.print(dados[i]+"\n" );
		}
		System.out.println("A lista contém " + tamanho + " componentes.");
	}
}
