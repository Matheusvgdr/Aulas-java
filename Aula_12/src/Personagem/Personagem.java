package Personagem;

public abstract class Personagem {
	
	private String nome;
	private String altura;
	private int peso;
	private String classe;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public void comer() {
		
	}
	
	public void correr() {
		
	}
	
	public void dormir() {
		
	}
	
}
