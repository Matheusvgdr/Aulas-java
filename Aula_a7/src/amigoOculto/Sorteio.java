package amigoOculto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio {

	public static void main(String[] args) {
		
		Random index = new Random();
		int valor;
		String visua = "";
		
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Matheus");
		nomes.add("Nicolas");
		nomes.add("Marcos");
		nomes.add("Arian");
		nomes.add("Felipe");
		nomes.add("Beatriz");
		
		System.out.println("O nome é: " + nomes.get(index.nextInt(nomes.size())));
		
			for(int i = 0; i <1; i++) {
				
				valor = index.nextInt(nomes.size());
				
				System.out.println(nomes.get(valor)); 
				
				
				
			}
			

	}

}
