package App;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//Tipo; var; instanc; Objet; Tipo do array; parâmetro;
		List<String> lista = new ArrayList<String>();
		
		//Como o array vai ser String o Tipo da variável também tem que ter string;
		//List<String> = Variavel vai guardar lista de strings;
		
		lista.add("Matheus");
		lista.add("João");
		lista.add("Beatriz");
		lista.add("Vinícius");
		

			for(String temp: lista) {
				System.out.println(temp);
			}
			
			System.out.println("O Array tem " + lista.size() + " elementos" );
			
			System.out.println(lista.contains("Matheus"));
			System.out.println("O valor está no índice " + lista.indexOf("Beatriz"));
			System.out.println("O valor do índice 3 " + lista.get(3));
	}

}
