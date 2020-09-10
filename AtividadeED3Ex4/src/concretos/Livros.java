package concretos;

public class Livros {
	
	public String titulo;
	public int qtd;
	
	public Livros(int qtd, String titulo) {
		this.qtd = qtd;
		this.titulo= titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

}
