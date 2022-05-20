package matrizes;

public class Pelicano {

	private boolean bico;
	private String cor;
	private int peso;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void voar() {

		if (peso > 30) {
			
			System.out.println("O pelicano não consegue voar");
			
		} else {
			
			System.out.println("O pelicano está voando");

		}
		
	}
	
	public void comer() {
		System.out.println("O pelicano está comendo");
	}
	
	public void definirNome(String nome) {
		System.out.println("O nome do Pelicano é " + nome);
	}
	
	public String retornaCor() {
		return cor;
	}
}
