package App;

import java.util.Scanner;

public class AppScan {

	public static void main(String[] args) {
		int numLido;
		String textLido;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numLido = teclado.nextInt();
		
		System.out.println("O valor digitado foi " + numLido);
		
		
		Scanner texto = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		textLido = texto.next();
		
		System.out.println("Seu nom �: " + textLido);
		

	}

}
