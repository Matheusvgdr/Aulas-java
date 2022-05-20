package animais;

public class Leao {
	
	//Atributos
	private String cor;
	private int tamanho;
	private int peso;
	private int hora;
		
	//Encapsulamento hora
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	// Encapsulameto cor
	public String getCor() {
		return cor;
	}
		
	public void setCor(String cor) {
		this.cor = cor;
	}
		
		
	//Encapsulamento tamanho
	public int getTamanho() {
		return tamanho;
	}
		
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
		
	//Encapsulamento peso
	public int getPeso() {
		return peso;
	}
		
	public void setPeso(int peso) {
		this.peso = peso;		
	}
	
		
	// Métodos
		
	public void comer() {
		
		if(peso < 90 ) {
			
			System.out.print(" e não come muito");
			
		} else {
			
			System.out.print(" e come muito");
			
		}
			
	}
		
	public void dormir() {
		
		if (hora < 8) {
					
			System.out.print("está a dormindo");
				
		} else {
					
			System.out.print("está acordado");
		}
			
	}
		
	public void emitirSom() {
		
		System.out.println("ROOAAAAR!!!");
			
	}
}
