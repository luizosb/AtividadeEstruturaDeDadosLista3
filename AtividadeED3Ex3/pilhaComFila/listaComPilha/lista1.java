package listaComPilha;

public class lista1 {
	
	int[] vetor = new int [5];
	int tamanho = 0;
	int retirado = 0;
	
	public void zerarLista() {
		int[] vetor = new int [5];
		int tamanho = 0;
	}
	
	public int adicionarElemento(int e) {
		if(tamanho == 0) {
			vetor[0] = e;
			tamanho++;
		} else if(tamanho == vetor.length) {
			System.out.println("LISTA ESTÁ CHEIA!");
		} else {
			tamanho++;
			vetor[tamanho-1] = e;
		}
		return e;
	}
	
	public int removerElemento() {
		if(tamanho==0) {
			System.out.println("Há nenhum elemento para ser removido.");
		} else if (tamanho>0) {
			retirado = vetor[0];
			vetor[0] = 0;
			for(int ind = 0; ind<tamanho; ind++) {
				if(ind+1==vetor.length) {
					vetor[vetor.length-1]=0;
				} else {
					vetor[ind] = vetor[ind + 1];
				}
			}
			tamanho--;
		}
		return retirado;
	}
	
	public void percorrerALista() {
		for(int i=0; i < vetor.length; i++ ) {
			System.out.print(vetor[i]+"\n" );
		}
		System.out.println("A lista contém " + tamanho + " componentes.");
	}

}
