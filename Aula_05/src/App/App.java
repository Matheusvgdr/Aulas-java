package App;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//Tipo; var; instanc; Objet; Tipo do array; par�metro;
		List<String> lista = new ArrayList<String>();
		
		//Como o array vai ser String o Tipo da vari�vel tamb�m tem que ter string;
		//List<String> = Variavel vai guardar lista de strings;
		
		lista.add("Matheus");
		lista.add("Jo�o");
		lista.add("Beatriz");
		lista.add("Vin�cius");
		

			for(String temp: lista) {
				System.out.println(temp);
			}
			
			System.out.println("O Array tem " + lista.size() + " elementos" );
			
			System.out.println(lista.contains("Matheus"));
			System.out.println("O valor est� no �ndice " + lista.indexOf("Beatriz"));
			System.out.println("O valor do �ndice 3 " + lista.get(3));
	}

}
