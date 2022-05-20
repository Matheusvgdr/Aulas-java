package heranca;

public class App {

	public static void main(String[] args) {

		String animal = "gato";

		Gato g1 = new Gato();
		Leao l1 = new Leao();
		Tatu t1 = new Tatu();	

		if (animal == "gato" && g1.getHora() < 8) {

			g1.setHora(7);
			g1.setCor("malhado");
			g1.setPeso(50);
			g1.setTamanho(30);

			g1.emitirSom();
			System.out.print("O gato " + g1.getCor());
			g1.dormir();
			g1.brincar();
			g1.comer();

		}

		if (animal == "leao" && g1.getHora() < 8) {

			l1.setCor("albino");
			l1.setPeso(70);
			l1.setTamanho(50);
			l1.setHora(8);

			l1.emitirSom();
			System.out.print("O leão " + l1.getCor() + " que pesa " + l1.getPeso() + "kg ");
			l1.dormir();
			l1.comer();


		}
		
		// Sobreposição
			t1.emitirSom(); 
				
		//Polimorfismo
			Animal[] animais = new Animal[3];
				
			animais[0] = new Gato();
			animais[1] = new Leao();
			animais[2] = new Tatu();
						
			for(Animal a: animais) {
				a.emitirSom();
			}


	}

}
