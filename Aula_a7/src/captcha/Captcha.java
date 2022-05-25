package captcha;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Captcha {

	// Só exibe as "telas"
	public static void main(String[] args) {
		// Variables
		String entrada;
		String captcha = "k5PH#2";
		boolean continua = true;

		// Instances
		Captcha app = new Captcha();
		Scanner teclado = new Scanner(System.in);

		while (continua) {
			
			captcha = app.gerarCaptcha();
			System.out.println("------");
			System.out.println(captcha);
			System.out.println("------");
			System.out.println("Digite o código acima: ");
			entrada = teclado.next();

			if (captcha.equals(entrada)) {

				System.out.println("Acesso permitido");
				continua = false;

			} else {
				System.out.println("Acesso negado");

			}

		}
		teclado.close();

	}

	public String gerarCaptcha() {
		
		//Variables
		String captcha = "";
		int valor;
		
		//Instances
		Random sorteio = new Random();
		
		//Matriz
		String urna = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 0; i < 6; i++) {
			
			//length = tamanho do array; substring = o primeiro valor é o caracter que vai começar a ser contado, e o segundo valor é o quanto vai ser exibido
			valor = sorteio.nextInt(urna.length());
			
			captcha += urna.substring(valor, valor+1);	
		}
		
		return captcha;
		

	}

}
