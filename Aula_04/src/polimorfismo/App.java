package polimorfismo;

public class App {

	public static void main(String[] args) {

		Gato g1 = new Gato();
		Leao l1 = new Leao();
		Tatu t1 = new Tatu();
		Cachorro c1 = new Cachorro();

	
			g1.setHora(7);
			g1.setCor("malhado");
			g1.setPeso(50);
			g1.setTamanho(30);

			System.out.print("O gato " + g1.getCor());
			g1.dormir();
			g1.comer();

					
			t1.emitirSom();

			// Polimorfismo
			Animal[] animais = new Animal[3];

			animais[0] = new Gato();
			animais[1] = new Leao();
			animais[2] = new Tatu();

			for (Animal a : animais) {
				// Sobreposição
				a.emitirSom();
			}
			
			g1.brincar();
			c1.brincar();

		}

	}

