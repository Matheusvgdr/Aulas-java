package polimorfismo;

public class Animal {

	// Atributos
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

	// Encapsulamento tamanho
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	// Encapsulamento peso
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	// Métodos

	public void comer() { 
		
if (hora < 8) {
			
			System.out.print(" e não está com fome.");
			
		} else {
			
			System.out.print(" Em breve irá procurar comida");
		}

		//Outra forma de fazer o método, dando mais liberdade, tirando o syso do método;
		
		/* public String comer(){
				return "O gato está comendo...";
			}
		*/

	}

	public void dormir() {

		if (hora < 8) {
			
			System.out.print(" está a dormindo,");
			
		} else {
			
			System.out.print(" está acordado");
		}

	}

	public void emitirSom() {
		
		System.out.println("Miaaaaaauuu!!");

	}
		

}
