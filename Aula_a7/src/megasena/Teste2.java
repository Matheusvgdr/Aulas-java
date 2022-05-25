package megasena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste2 {

	public static void main(String[] args) {

		Random mega = new Random();
		List<Integer> valores = new ArrayList<Integer>();
		
		int temp;

		System.out.println("Os n�meros da megasena s�o: ");

		for (int i = 0; i < 6; i++) {
			
			// temp vai receber um numero aleatorio;
			temp = mega.nextInt(60) + 1;
			
			// se o numero no temp estiver contido no array vai dar true; Ent�o vai diminuir um valor do i, e n�o vai entrar no array;

			if(valores.contains(temp)) {
				
				i--;
				
			} else {
				
				valores.add(temp);
			}			

		}
		
		
		for (int valor : valores) {

			System.out.println(valor);

		}

	}

}
