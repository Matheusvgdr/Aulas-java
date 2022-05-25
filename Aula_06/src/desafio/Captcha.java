package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Captcha {

	public static void main(String[] args) {
		
		String resposta; 
		Scanner teclado = new Scanner(System.in);

		for(int i = 0; i < 1; i++ ) {
			System.out.println("Captcha " + createCaptchaValue());
		}
		
		System.out.println("Digite o captcha");
		resposta = teclado.next();
		
		if(resposta.equals(createCaptchaValue())) {
			System.out.println("Acesso permitido");
		} 

	}
	
	public static String createCaptchaValue() {
		
		Random random = new Random();
		int length = 5 + (Math.abs(random.nextInt()) % 3);
		StringBuffer captchaStrBuffer = new StringBuffer();
		
		for (int i = 0; i < length; i++) {
			
			int baseCharacterNumber = Math.abs(random.nextInt() % 62);
			int characterNumber = 0;
			
			if(baseCharacterNumber < 26){
				
				characterNumber = 97 + (baseCharacterNumber - 26);
			} else {
				characterNumber = 48 + (baseCharacterNumber - 52);
			}
			captchaStrBuffer.append((char) characterNumber);
		}
		
		return captchaStrBuffer.toString();
	}
	
	

}
