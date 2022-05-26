package amigoOculto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sorteio {

	public static void main(String[] args) {

		// Instances
		Random index = new Random();
		
		//Scanner int
		Scanner numPessoas = new Scanner(System.in);
		
		//Scanner String
		Scanner resposta = new Scanner(System.in);

		// Variables
		int valor;
		String respostaSorteio;

		// ------ Program ----------

		System.out.println("Quantas pessoas deseja sortear? ");
		valor = numPessoas.nextInt();
		
		// Array
		List<String> nomes = new ArrayList<String>();

		for (int i = 0; i < valor; i++) {

			System.out.print("Nome da pessoa: " + "\n");

			nomes.add(resposta.next());

		}

		System.out.println("Deseja sortear nome? S/N ");
		respostaSorteio = resposta.next();

		if (respostaSorteio.equals("S")) {

			System.out.println("A pessoa sorteada foi é: " + nomes.get(index.nextInt(nomes.size())));

		} else if (respostaSorteio.equals("N")) {

			System.out.println("Processo finalizado com sucesso");
		} else {
			System.out.println("Resposta inválida");
		}

	}

}
